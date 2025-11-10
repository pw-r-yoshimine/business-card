package jp.co.pworld.businesscard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * 名刺の答え -これを BusinessCard
 *
 * @param modifier
 */
@Composable
fun BusinessCardAnswer(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Red)
                .padding(end = 40.dp),
            contentAlignment = Alignment.CenterEnd,
        ){
            Text(
                modifier = Modifier,
                text = "p-world",
                fontSize = 45.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(5f)
                .background(Color.White)
                .padding(start = 40.dp , end = 40.dp)
        ){
            // 左の名前
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(2f),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    modifier = Modifier,
                    text = "開発部",
                    fontSize = 20.sp,
                    color = Color.Black,

                )
                Text(
                    modifier = Modifier,
                    text = "吉峯 隆晟",
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

            }

            // 真ん中の黒線
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(20.dp)
                    .width(2.dp)
                    .background(Color.Black)
            )

            // 右のメアド
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(3f),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    modifier = Modifier,
                    text = "r-yoshimine@p-world.co.jp",
                    fontSize = 20.sp,
                    color = Color.Black
                )
                Text(
                    modifier = Modifier,
                    text = "株式会社ピーワルド",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 640,
    heightDp = 360,
)
@Composable
private fun BusinessCardAnswerContentPreview(){
    BusinessCardAnswer(
        modifier = Modifier.fillMaxSize(),
    )
}
