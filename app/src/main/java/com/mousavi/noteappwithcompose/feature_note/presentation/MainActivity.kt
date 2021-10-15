package com.mousavi.noteappwithcompose.feature_note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.components.AddEditNoteScreen
import com.mousavi.noteappwithcompose.feature_note.presentation.notes.components.NotesScreen
import com.mousavi.noteappwithcompose.feature_note.presentation.util.Screen
import com.mousavi.noteappwithcompose.ui.theme.NoteAppWithComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteAppWithComposeTheme() {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(navController, startDestination = Screen.NotesScreen().route) {
                        composable(
                            route = Screen.NotesScreen().route,
                        ) {
                            NotesScreen(navController)
                        }
                        composable(
                            route = Screen.AddEditScreen().route + "?noteId={notId}&color={color}",
                            arguments = listOf(
                                navArgument(
                                    name = "noteId"
                                ) {
                                    type = NavType.IntType
                                    defaultValue = -1
                                },
                                navArgument(
                                    name = "color"
                                ) {
                                    type = NavType.IntType
                                    defaultValue = -1
                                }
                            )
                        ) {
                            AddEditNoteScreen(navController)
                        }

                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NoteAppWithComposeTheme() {

    }
}