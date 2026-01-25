package io.noartcode.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.styles.HeroSection2ProfileImageStyle
import io.noartcode.styles.HeroSection2SubtitleStyle
import io.noartcode.styles.HeroSectionHeadlineStyle
import io.noartcode.styles.Theme
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun HeroSection2Content() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
                //.displayIfAtLeast(Breakpoint.LG),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start

        ) {
            HeroSection2TextContainer()
            //HeroSection2IllustrationContainer()
        }

/*        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 0.5.cssRem)
                .displayUntil(Breakpoint.LG),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            HeroSection2IllustrationContainer()
            HeroSection2TextContainer()

        }*/

    }
}

@Composable
private fun HeroSection2TextContainer() {
    Column(

    ) {
        H1(
            attrs = HeroSectionHeadlineStyle
                .toModifier()
                .color(Theme.TextPrimary)
                .toAttrs()
        ) {
            Text("Hi, I'm")
        }

        H1(
            attrs = HeroSectionHeadlineStyle
                .toModifier()
                .color(Theme.TextPrimary)
                .toAttrs()
        ) {
            Text("The NoArtCoder")
        }
        // Subtitle
        P(attrs = HeroSection2SubtitleStyle.toAttrs()) {
            Text("Nice to meet you.")
        }
    }
}

@Composable
private fun HeroSection2IllustrationContainer() {
    Div {
        Image(
            modifier =HeroSection2ProfileImageStyle.toModifier(),
            src = "silly_sketch.png",
        )
    }
}
