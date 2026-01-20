package io.noartcode.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
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
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.components.SectionHeader
import io.noartcode.models.ExperienceItem
import io.noartcode.styles.ExperienceCardStyle
import io.noartcode.styles.ExperienceCardsContainerStyle
import io.noartcode.styles.Theme
import io.noartcode.util.Constants
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

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
private fun ExperienceCardsContainer() {
    // Desktop: Full cards with descriptions
    Div(
        attrs = ExperienceCardsContainerStyle
            .toModifier()
            .displayIfAtLeast(Breakpoint.LG)
            .toAttrs()
    ) {
        Constants.EXPERIENCE_ITEMS.forEach { item ->
            ExperienceCard(
                icon = { ExperienceIcon(item) },
                title = item.title,
                subTitle = item.subTitle,
                description = item.description
            )
        }
    }

    // Mobile/Tablet: Compact cards without descriptions
    Div(
        attrs = ExperienceCardsContainerStyle
            .toModifier()
            .displayUntil(Breakpoint.LG)
            .toAttrs()
    ) {
        Constants.EXPERIENCE_ITEMS.forEach { item ->
            SmallExperienceCard(
                icon = { ExperienceIcon(item) },
                title = item.title,
                subTitle = item.subTitle
            )
        }
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
        attrs = ExperienceCardStyle.toAttrs()
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

@Composable
private fun SmallExperienceCard(
    icon: @Composable () -> Unit,
    title:String,
    subTitle:String,
) {
    Div(
        attrs = ExperienceCardStyle.toAttrs()
    ) {
        Column {
            Div {
                icon()
            }
            H4(attrs = Modifier
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
        }

    }
}

@Composable
private fun ExperienceIcon(item: ExperienceItem) {
    val modifier = if (item.useScaleDown) {
        Modifier
            .objectFit(ObjectFit.ScaleDown)
            .size(
                width = item.iconWidth?.px ?: item.iconHeight.px,
                height = item.iconHeight.px
            )
    } else {
        Modifier.size(
            width = item.iconWidth?.px ?: item.iconHeight.px,
            height = item.iconHeight.px
        )
    }

    Image(src = item.iconPath, modifier = modifier)
}