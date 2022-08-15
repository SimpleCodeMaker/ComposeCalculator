package com.casual.composecalculator.portrait

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

@Composable
fun PortraitMain() {

    ConstraintLayout() {
        val (display_panel, control_panel) = createRefs()
        var displayContent by remember(){
            mutableStateOf("")
        }
        val click :(String)->Unit = {
            displayContent = it
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .constrainAs(display_panel) {

                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(control_panel.top)
                    verticalChainWeight = 1f
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
                .background(Color(0xff425560))) {
            Text(
                text = displayContent,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = TextStyle(color = Color.White),
                fontSize = 150.sp
            )
        }
        ConstraintLayout(portraitConstraintSet,
            modifier = Modifier
                .constrainAs(control_panel) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
                .background(Color.Blue)
                .fillMaxWidth()
        ) {
            Button(
                onClick = {click.invoke("0") },
                modifier = Modifier
                    .layoutId("num0"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "0", fontSize = 50.sp)
            }

            Button(
                onClick = { click.invoke(".")},
                modifier = Modifier
                    .layoutId("dot"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = ".", fontSize = 50.sp)
            }
            Button(
                onClick = { click.invoke("=")},
                modifier = Modifier
                    .layoutId("equal"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffffb44e))
            ) {
                Text(text = "=", fontSize = 50.sp)
            }
            Button(
                onClick = {click.invoke("1") },
                modifier = Modifier
                    .layoutId("num1"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "1", fontSize = 50.sp)
            }
            Button(
                onClick = { click.invoke("2")},
                modifier = Modifier
                    .layoutId("num2"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "2", fontSize = 50.sp)
            }
            Button(
                onClick = { click.invoke("3")},
                modifier = Modifier
                    .layoutId("num3"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "3", fontSize = 50.sp)
            }
            Button(
                onClick = {click.invoke("+") },
                modifier = Modifier
                    .layoutId("add"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff5930b))
            ) {
                Text(text = "+", fontSize = 50.sp)
            }

            Button(
                onClick = {click.invoke("4") },
                modifier = Modifier
                    .layoutId("num4"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "4", fontSize = 50.sp)
            }
            Button(
                onClick = {click.invoke("5") },
                modifier = Modifier
                    .layoutId("num5"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "5", fontSize = 50.sp)
            }
            Button(
                onClick = {click.invoke("6") },
                modifier = Modifier
                    .layoutId("num6"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "6", fontSize = 50.sp)
            }
            Button(
                onClick = {click.invoke("-") },
                modifier = Modifier
                    .layoutId("sub"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff5930b))
            ) {
                Text(text = "-", fontSize = 50.sp)
            }

            Button(
                onClick = { click.invoke("7")},
                modifier = Modifier
                    .layoutId("num7"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "7", fontSize = 50.sp)
            }
            Button(
                onClick = {click.invoke("8") },
                modifier = Modifier
                    .layoutId("num8"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "8", fontSize = 50.sp)
            }
            Button(
                onClick = { click.invoke("9")},
                modifier = Modifier
                    .layoutId("num9"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "9", fontSize = 50.sp)
            }
            Button(
                onClick = {click.invoke("*") },
                modifier = Modifier
                    .layoutId("mult"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff5930b))
            ) {
                Text(text = "*", fontSize = 50.sp)
            }

            Button(
                onClick = {click.invoke("C") },
                modifier = Modifier
                    .layoutId("clean"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "C", fontSize = 50.sp)
            }
            Button(
                onClick = {click.invoke("+/-") },
                modifier = Modifier
                    .layoutId("plus_munus_sign"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "+/-", fontSize = 50.sp)
            }
            Button(
                onClick = { click.invoke("%")},
                modifier = Modifier
                    .layoutId("percent"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff2e3840))
            ) {
                Text(text = "%", fontSize = 50.sp)
            }
            Button(
                onClick = {click.invoke("/") },
                modifier = Modifier
                    .layoutId("div"),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff5930b))
            ) {
                Text(text = "/", fontSize = 50.sp)
            }

        }
    }


}

val portraitConstraintSet by lazy {
    ConstraintSet {

        val num0 = createRefFor("num0")
        val num1 = createRefFor("num1")
        val num2 = createRefFor("num2")
        val num3 = createRefFor("num3")
        val num4 = createRefFor("num4")
        val num5 = createRefFor("num5")
        val num6 = createRefFor("num6")
        val num7 = createRefFor("num7")
        val num8 = createRefFor("num8")
        val num9 = createRefFor("num9")
        //clean,add,sub,mult,div,equal,plus_munus_sign,percent,dot
        val clean = createRefFor("clean")
        val add = createRefFor("add")
        val sub = createRefFor("sub")
        val mult = createRefFor("mult")
        val div = createRefFor("div")
        val equal = createRefFor("equal")
        val plus_munus_sign = createRefFor("plus_munus_sign")
        val percent = createRefFor("percent")
        val dot = createRefFor("dot")

        constrain(num0) {
            start.linkTo(parent.start)
            end.linkTo(num2.start)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
            this.horizontalChainWeight = 1f
        }

        constrain(dot) {
            start.linkTo(num0.end)
            end.linkTo(equal.start)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
            this.horizontalChainWeight = 1f
        }

        constrain(equal) {
            start.linkTo(dot.end)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("2:1")
            this.horizontalChainWeight = 2f
        }

        constrain(num1) {
            start.linkTo(parent.start)
            end.linkTo(num2.start)
            bottom.linkTo(num0.top)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(num2) {
            start.linkTo(num1.end)
            end.linkTo(num3.start)
            bottom.linkTo(num1.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(num3) {
            start.linkTo(num2.end)
            end.linkTo(add.end)
            bottom.linkTo(num1.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(add) {
            start.linkTo(num3.end)
            end.linkTo(parent.end)
            bottom.linkTo(num1.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        //----------------------
        constrain(num4) {
            start.linkTo(parent.start)
            end.linkTo(num5.start)
            bottom.linkTo(num1.top)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(num5) {
            start.linkTo(num4.end)
            end.linkTo(num6.start)
            bottom.linkTo(num4.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(num6) {
            start.linkTo(num5.end)
            end.linkTo(sub.end)
            bottom.linkTo(num4.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(sub) {
            start.linkTo(num6.end)
            end.linkTo(parent.end)
            bottom.linkTo(num4.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }
        //----------------------
        constrain(num7) {
            start.linkTo(parent.start)
            end.linkTo(num8.start)
            bottom.linkTo(num4.top)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(num8) {
            start.linkTo(num7.end)
            end.linkTo(num9.start)
            bottom.linkTo(num7.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(num9) {
            start.linkTo(num8.end)
            end.linkTo(mult.end)
            bottom.linkTo(num7.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(mult) {
            start.linkTo(num9.end)
            end.linkTo(parent.end)
            bottom.linkTo(num7.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }
        //----------------------
        constrain(clean) {
            start.linkTo(parent.start)
            end.linkTo(plus_munus_sign.start)
            bottom.linkTo(num7.top)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(plus_munus_sign) {
            start.linkTo(clean.end)
            end.linkTo(percent.start)
            bottom.linkTo(clean.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(percent) {
            start.linkTo(plus_munus_sign.end)
            end.linkTo(div.end)
            bottom.linkTo(clean.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

        constrain(div) {
            start.linkTo(percent.end)
            end.linkTo(parent.end)
            bottom.linkTo(clean.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.ratio("1:1")
        }

    }

}


@Preview(widthDp = 1080, heightDp = 1920)
@Composable
private fun PreviewPortraitMain() {
    PortraitMain()
}