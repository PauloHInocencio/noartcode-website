package io.noartcode.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.components.SectionHeader
import io.noartcode.styles.AboutMeImageStyle
import io.noartcode.styles.Theme
import io.noartcode.util.Constants
import io.noartcode.util.Res
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
            //ExperienceImageContainer()
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
                repeat(3) {
                    size(1.fr)
                }
            }
            .toAttrs()
    ) {
        ExperienceCard(
            icon = { Image(src = "android.svg", modifier = Modifier.size(52.px)) },
            title = "Android Development",
            subTitle = "12+ years",
            description = Constants.LOREM_IPSUM_SHORTEST
        )
        ExperienceCard(
            icon = { Image(src = "cmp.svg", modifier = Modifier.size(52.px)) },
            title = "Compose Multiplatform",
            subTitle = "4+ years",
            description = Constants.LOREM_IPSUM_SHORTEST
        )
        ExperienceCard(
            icon = { Image(src = "kmp.svg", modifier = Modifier.size(52.px)) },
            title = "Kotlin Multiplatform",
            subTitle = "4+ years",
            description = Constants.LOREM_IPSUM_SHORTEST
        )

        ExperienceCard(
            icon = { Image(src = "ios.svg", modifier = Modifier.size(52.px)) },
            title = "iOS Development",
            subTitle = "4+ years",
            description = Constants.LOREM_IPSUM_SHORTEST
        )
        ExperienceCard(
            icon = { Image(src = "golang.svg", modifier = Modifier.size(52.px)) },
            title = "Backend Development",
            subTitle = "2+ years",
            description = Constants.LOREM_IPSUM_SHORTEST
        )
        ExperienceCard(
            icon = { Image(src = "html.svg", modifier = Modifier.size(52.px)) },
            title = "Frontend Development",
            subTitle = "1+ years",
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
                color = Theme.BorderPrimary
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
                .color(Theme.TextSecondary)
                .toAttrs()
            ) {
                Text(subTitle)
            }
            P(attrs = Modifier
                .margin(0.px)
                .color(Theme.TextSecondary)
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
            src = Res.Image.PROFILE_IMAGE,
            alt = "Paulo Inocencio",
        )
    }
}