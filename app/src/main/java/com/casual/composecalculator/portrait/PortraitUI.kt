package com.casual.composecalculator.portrait

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun PortraitMain() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Text(
            text = "11111", modifier = Modifier
                .wrapContentHeight()
                .weight(0.382f)
                .background(Color.Yellow)
        )
        Spacer(modifier = Modifier.height(20.dp))

        ConstraintLayout(
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .weight(0.618f)
        ) {

            val (num1, num2, num3) = createRefs()
//            createHorizontalChain(num1, num2, num3, chainStyle = ChainStyle.SpreadInside)
            Button(onClick = { }, modifier = Modifier
                .constrainAs(num1) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(num2.start)
                    width = Dimension.fillToConstraints
                    height = Dimension.ratio("1:1")
                }
                .clip(CircleShape)
                .background(Color.Yellow)) {
                Text(text = "1", fontSize = 24.sp)
            }

            Button(onClick = { }, modifier = Modifier
                .constrainAs(num2) {
                    top.linkTo(parent.top)
                    start.linkTo(num1.end)
                    end.linkTo(num3.start)
                    width = Dimension.fillToConstraints
                    height = Dimension.ratio("1:1")

                }
                .clip(CircleShape)
                .background(Color.Yellow)) {
                Text(text = "2", fontSize = 50.sp)
            }

            Button(onClick = { }, modifier = Modifier
                .constrainAs(num3) {
                    top.linkTo(parent.top)
                    start.linkTo(num2.end)
                    end.linkTo(parent.end,100.dp)
                    width = Dimension.fillToConstraints
                    height = Dimension.ratio("1:1")
                }
                .clip(CircleShape)
                .background(Color.Yellow)) {
                Text(text = "3", fontSize = 24.sp)
            }
        }
    }
}


@Preview(widthDp = 1080, heightDp = 1920)
@Composable
private fun PreviewPortraitMain() {
    PortraitMain()
}