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
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.components.SectionHeader
import io.noartcode.models.ExperienceItem
import io.noartcode.styles.ExperienceCardLinkStyle
import io.noartcode.styles.ExperienceCardStyle
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
            title = "Skills",
            subTitle = "My main"
        )
        Row(modifier = Modifier
            .fillMaxSize()
            .gap(5.cssRem),
            verticalAlignment = Alignment.CenterVertically
        ){
            SimpleGrid(
                modifier = Modifier.gap(2.cssRem),
                numColumns = numColumns(1, md = 3)
            ) {
                Constants.EXPERIENCE_ITEMS.take(5).forEach { item ->
                    ExperienceCard(
                        icon = { ExperienceIcon(item) },
                        title = item.title,
                        subTitle = item.subTitle,
                        description = item.description
                    )
                }
                val lastItem = Constants.EXPERIENCE_ITEMS.last()
                ExperienceCard(
                    icon = { ExperienceIcon(lastItem)},
                    title = lastItem.title,
                    subTitle = lastItem.subTitle,
                    descriptionComposable = {
                        Span{  // TODO: Fix ExperienceIcon to allow SpanTexts and links
                            SpanText(text = "I built ")
                            Link(path = Constants.WEBSITE_GITHUB_URL, text = "this website ", modifier = ExperienceCardLinkStyle.toModifier())
                            SpanText(text = "using ")
                            Link(path = Constants.KOBWEB_URL, text = "Kobweb, ", modifier = ExperienceCardLinkStyle.toModifier())
                            SpanText(text = "leveraging Kotlin and Compose for Web to create modern, type-safe UIs.")
                        }
                    }
                )
            }
        }
    }
}

@Composable
private fun ExperienceCard(
    icon: @Composable () -> Unit,
    title:String,
    subTitle:String,
    description:String = "",
    descriptionComposable: (@Composable () -> Unit)? = null
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
                if (descriptionComposable  == null) {
                    Text(description)
                }else {
                    descriptionComposable()
                }
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