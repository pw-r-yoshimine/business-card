package jp.co.pworld.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import androidx.compose.ui.tooling.preview.Preview
import jp.co.pworld.businesscard.ui.theme.BusinessCardTheme

/**
 * アプリの起動時に最初に呼ばれる画面（Activity）。
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** UIがステータスバーやナビゲーションバーの下まで広がる設定 */
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    contentWindowInsets = WindowInsets.safeDrawing,
                ) { innerPadding ->
                    BusinessCard(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/**
 * 名刺カードパーツ
 *
 * @param modifier
 **/
@Composable
fun BusinessCard(
    modifier: Modifier = Modifier,
    name: String,
) {
    Text(
        modifier = modifier,
        text = "Hello $name!!",
    )
}

@Preview(
    showBackground = true,
    widthDp = 640,
    heightDp = 360,
)
@Composable
fun BusinessCardPreview() {
    BusinessCard(
        modifier = Modifier.fillMaxSize(),
        name = "Android",
    )
}