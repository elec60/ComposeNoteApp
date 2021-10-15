package com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.components

import androidx.compose.animation.Animatable
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Save
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mousavi.noteappwithcompose.feature_note.domain.model.Note
import com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.AddEditEvent
import com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.AddEditViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@Composable
fun AddEditNoteScreen(
    navController: NavController,
    viewModel: AddEditViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    val sharedFlow = viewModel.flowEvent

    LaunchedEffect(true) {
        sharedFlow.collect {
            if (it) {
                navController.navigateUp()
            }
        }
    }
    val scaffoldState = rememberScaffoldState()

    val colorAnim = remember {
        Animatable(initialValue = state.color)
    }

    var titleState by remember {
        mutableStateOf(state.title)
    }

    var contentState by remember {
        mutableStateOf(state.content)
    }

    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    viewModel.onEvent(
                        AddEditEvent.Save(
                            Note(
                                title = titleState,
                                content = contentState,
                                timestamp = System.currentTimeMillis(),
                                color = Note.noteColors.random().toArgb()
                            )
                        )
                    )
                },
                backgroundColor = MaterialTheme.colors.primary,
            ) {
                Icon(
                    imageVector = Icons.Default.Save,
                    contentDescription = "",
                    tint = Color.Black
                )
            }
        }
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(colorAnim.value)

        ) {
            Row(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Note.noteColors.forEach { color ->
                    Box(modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape)
                        .background(color)
                        .clickable {
                            scope.launch {
                                colorAnim.animateTo(
                                    color,
                                    animationSpec = tween(durationMillis = 500)
                                )
                            }
                        }
                    )
                }
            }

            TransparentTextField(
                text = titleState,
                maxLines = 1,
                isHintVisible = titleState.isBlank(),
                hint = "Enter title...",
                onValueChange = {
                    titleState = it
                }
            )

            Spacer(modifier = Modifier.height(20.dp))

            TransparentTextField(
                text = contentState,
                maxLines = 1,
                isHintVisible = contentState.isBlank(),
                hint = "Enter some content...",
                onValueChange = {
                    contentState = it
                }
            )
        }

    }
}