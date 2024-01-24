package com.example.assignmentjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentjetpackcompose.ui.theme.AssignmentJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignmentJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(id = R.string.title_1),
                desc = stringResource(id = R.string.desc_1),
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f))
            ComposableInfoCard(
                title = stringResource(id = R.string.title_2),
                desc = stringResource(id = R.string.desc_2),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(id = R.string.title_3),
                desc = stringResource(id = R.string.desc_3),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f))
            ComposableInfoCard(
                title = stringResource(id = R.string.title_4),
                desc = stringResource(id = R.string.desc_4),
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun ComposableInfoCard(
    title: String,
    desc: String,
    color: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = desc,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    AssignmentJetpackComposeTheme {
        ComposeQuadrantApp()
    }
}