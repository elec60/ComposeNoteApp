package com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.components

import androidx.compose.animation.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Save
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mousavi.noteappwithcompose.feature_note.domain.model.Note
import com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.util.AddEditEvent
import com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.AddEditViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@Composable
fun AddEditNoteScreen(
    navController: NavController,
    viewModel: AddEditViewModel = hiltViewModel(),
    color: Color
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
        Animatable(initialValue = color)
    }

    var newColor by remember {
        mutableStateOf(color)
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
                                title = state.title,
                                content = state.content,
                                timestamp = System.currentTimeMillis(),
                                color = newColor.toArgb()
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
                .padding(horizontal = 16.dp)

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
                        .border(
                            width = 2.dp,
                            color = if (newColor == color) Color.Black else Color.Transparent,
                            shape = CircleShape
                        )
                        .clip(shape = CircleShape)
                        .shadow(10.dp, CircleShape)
                        .background(color)
                        .clickable {
                            scope.launch {
                                colorAnim.animateTo(
                                    color,
                                    animationSpec = tween(durationMillis = 500)
                                )
                                newColor = color
                            }
                        }
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            TransparentTextField(
                text = state.title,
                maxLines = 1,
                isHintVisible = state.title.isBlank(),
                hint = "Enter title...",
                onValueChange = {
                    viewModel.onEvent(AddEditEvent.Title(it))
                }
            )

            Spacer(modifier = Modifier.height(20.dp))

            TransparentTextField(
                text = state.content,
                maxLines = 1,
                isHintVisible = state.content.isBlank(),
                hint = "Enter some content...",
                onValueChange = {
                    viewModel.onEvent(AddEditEvent.Content(it))
                }
            )
        }

    }
}