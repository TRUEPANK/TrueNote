package ru.truepank.truenote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.truepank.truenote.nav.NoteNavHost
import ru.truepank.truenote.ui.theme.TrueNoteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrueNoteTheme {
                Scaffold (
                    topBar = {
                        TopAppBar(title = {
                            Text(text = "TrueNote App")
                        },
                        backgroundColor = Color.Blue,
                        contentColor = Color.LightGray,
                        elevation = 12.dp
                    )
                },
                content = {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        NoteNavHost()
                    }
                }        )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TrueNoteTheme {

    }
}