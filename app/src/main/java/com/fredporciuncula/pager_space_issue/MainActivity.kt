package com.fredporciuncula.pager_space_issue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fredporciuncula.pager_space_issue.ui.theme.PagerspaceissueTheme

class MainActivity : ComponentActivity() {
  @OptIn(ExperimentalFoundationApi::class)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      PagerspaceissueTheme {
        HorizontalPager(
          modifier = Modifier.fillMaxSize(),
          state = rememberPagerState { 3 },
          pageSpacing = 24.dp,
        ) { page ->
          Box(
            modifier = Modifier
              .fillMaxSize()
              .background(
                when (page) {
                  0 -> Color.Red
                  1 -> Color.Blue
                  2 -> Color.Green
                  else -> error("Invalid page")
                }
              )
          )
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  PagerspaceissueTheme {
    Greeting("Android")
  }
}