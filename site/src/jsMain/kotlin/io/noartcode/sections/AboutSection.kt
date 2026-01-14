package io.noartcode.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.components.SectionHeader
import io.noartcode.styles.AboutMeImageStyle
import io.noartcode.styles.Theme
import io.noartcode.util.Constants
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutContent() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        SectionHeader(
            title = "About Me",
            subTitle = "Get To Know Me"
        )
        Row( // In Kobweb (and CSS), when you use a Row, it creates a flex container with display: flex and flex-direction: row.
            modifier = Modifier
                .gap(4.cssRem)
                .displayIfAtLeast(Breakpoint.XL)
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            AboutMeImageContainer()
            AboutMeContentContainer()
        }

        Column (
            modifier = Modifier
                .gap(1.cssRem)
                .displayUntil(Breakpoint.XL)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            AboutMeImageContainer()
            AboutMeContentContainer()
        }
    }
}

@Composable
private fun AboutMeImageContainer() {
    Box(
        modifier = Modifier
            .flexShrink(0) // Prevents the box from shrinking in the flex layout
    ) {
        AboutMeImage()
    }
}

@Composable
private fun AboutMeContentContainer(){
    Column(modifier = Modifier
        .gap(1.cssRem)
        .fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth().gap(2.cssRem),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            AboutMeContainer(
                imageSrc = "experience.png",
                title = "Experience",
                description1 = "10+ years",
                description2 = "Android Development",
            )
            AboutMeContainer(
                imageSrc = "education.png",
                title = "Experience",
                description1 = "B.Sc. Bachelors Degree",
                description2 = "M.Sc. Masters Degree",
            )
        }
        P(attrs = Modifier
            .color(Theme.TextSecondary)
            .toAttrs()) {
            Text(Constants.LOREM_IPSUM_LONG)
        }
    }
}

@OptIn(ExperimentalComposeWebApi::class)
@Composable
private fun AboutMeImage() {
    Image(
        modifier = AboutMeImageStyle.toModifier(),
        src = "paulo_avatar.png",
        alt = "Paulo Inocencio",
    )
}


@Composable
private fun AboutMeContainer(
    imageSrc:String,
    title:String,
    description1:String,
    description2:String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(1.5.cssRem)
            .borderRadius(2.cssRem)
            .border(
                width = 1.px,
                style = LineStyle.Solid,
                color = Theme.BorderPrimary
            )
    ) {
        Image(
            modifier = Modifier.size(32.px),
            src = imageSrc,
        )
        H3(
            attrs = Modifier
                .margin(0.px)
                .toAttrs()
        ){
            Text(title)
        }
        P(attrs = Modifier
            .margin(0.px)
            .color(Theme.TextSecondary)
            .toAttrs()
        ) {
            Text(description1)
        }
        P(attrs = Modifier
            .margin(0.px)
            .color(Theme.TextSecondary)
            .toAttrs()
        ) {
            Text(description2)
        }
    }
}