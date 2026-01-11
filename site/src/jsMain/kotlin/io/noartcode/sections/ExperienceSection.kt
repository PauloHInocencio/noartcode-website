package io.noartcode.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaAndroid
import com.varabyte.kobweb.silk.components.icons.fa.FaApple
import com.varabyte.kobweb.silk.components.icons.fa.FaGolang
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.components.SectionHeader
import io.noartcode.styles.AboutMeImageStyle
import io.noartcode.util.Constants
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ExperienceContent() {
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        SectionHeader(
            title = "Experience",
            subTitle = "Explore My"
        )
        Row(modifier = Modifier
            .fillMaxSize()
            .gap(5.cssRem),
            verticalAlignment = Alignment.CenterVertically
        ){
            ExperienceCardsContainer()
            ExperienceImageContainer()
        }
    }
}

@Composable
private fun ExperienceCardsContainer(){
    Div(
        attrs = Modifier
            .flexGrow(1)
            .display(DisplayStyle.Grid)
            .gap(2.cssRem)
            .gridTemplateColumns{
                repeat(2) {
                    size(1.fr)
                }
            }
            .toAttrs()
    ) {
        ExperienceCard(
            icon = { FaAndroid(size = IconSize.XXL) },
            title = "Android Development",
            subTitle = "12+ years",
            description = Constants.LOREM_IPSUM_SHORTEST
        )
        ExperienceCard(
            icon = { FaApple(size = IconSize.XXL) },
            title = "iOS Development",
            subTitle = "3+ years",
            description = Constants.LOREM_IPSUM_SHORTEST
        )
        ExperienceCard(
            icon = { FaAndroid(size = IconSize.XXL) },
            title = "Kotlin Multiplatform",
            subTitle = "5+ years",
            description = Constants.LOREM_IPSUM_SHORTEST
        )

        ExperienceCard(
            icon = { FaGolang(size = IconSize.XXL) },
            title = "Backend Development",
            subTitle = "2+ years",
            description = Constants.LOREM_IPSUM_SHORTEST
        )
    }
}

@Composable
private fun ExperienceCard(
    icon: @Composable () -> Unit,
    title:String,
    subTitle:String,
    description:String
) {
    Div(
        attrs = Modifier
            .padding(1.5.cssRem)
            .borderRadius(2.cssRem)
            .border(
                width = 1.px,
                style = LineStyle.Solid,
                color = Color.rgb(163, 163, 163)
            )
            .toAttrs()
    ) {
        Column(Modifier.gap(0.5.cssRem)) {
            Div {
                icon()
            }
            H3(attrs = Modifier
                .margin(0.px)
                .toAttrs()) {
                Text(title)
            }
            P(attrs = Modifier
                .margin(0.px)
                .fontWeight(FontWeight.SemiBold)
                .color(Color.rgb(85, 85, 85))
                .toAttrs()
            ) {
                Text(subTitle)
            }
            P(attrs = Modifier
                .margin(0.px)
                .color(Color.rgb(85, 85, 85))
                .toAttrs()) {
                Text(description)
            }
        }
    }
}

@OptIn(ExperimentalComposeWebApi::class)
@Composable
private fun ExperienceImageContainer() {
    Box(
        Modifier.flexShrink(0)
    ) {
        Image(
            modifier = AboutMeImageStyle.toModifier(),
            src = "paulo_avatar.png",
            alt = "Paulo Inocencio",
        )
    }
}