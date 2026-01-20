package io.noartcode.styles

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val ExperienceCardsContainerStyle = CssStyle {
    base {
        Modifier
            .flexGrow(1)
            .display(DisplayStyle.Grid)
            .gridTemplateColumns {
               repeat(2) { size(1.fr) }
            }
            .gap(1.cssRem)
    }

    Breakpoint.LG {
        Modifier
            .gridTemplateColumns{
                repeat(3) { size(1.fr) }
            }
            .gap(2.cssRem)
    }
}


val ExperienceCardStyle = CssStyle {
    base {
        Modifier
            .padding(1.cssRem)
            .borderRadius(2.cssRem)
            .border(
                width = 1.px,
                style = LineStyle.Solid,
                color = Theme.BorderPrimary
            )
    }

    Breakpoint.LG {
        Modifier
            .padding(1.5.cssRem)
    }
}