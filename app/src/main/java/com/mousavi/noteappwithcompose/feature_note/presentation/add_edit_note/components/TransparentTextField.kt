package com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun TransparentTextField(
    text: String,
    maxLines: Int,
    isHintVisible: Boolean,
    hint: String,
    onValueChange: (String) -> Unit
) {
    var state by remember {
        mutableStateOf(text)
    }
    Box(
        contentAlignment = Alignment.CenterStart
    ){
        BasicTextField(
            value = state,
            onValueChange = {
                onValueChange(it)
                state = it
            },
            maxLines = maxLines,
            textStyle = TextStyle(color = Color.Black)
        )
        if (isHintVisible) {
            Text(text = hint,style = TextStyle(color = Color.Black))
        }
    }


}