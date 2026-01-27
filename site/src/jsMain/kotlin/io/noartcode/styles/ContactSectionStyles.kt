package io.noartcode.styles

import com.varabyte.kobweb.compose.css.Resize
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.focus
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val ContactFormStyle = CssStyle {
    base {
        Modifier
            .margin(top = 4.cssRem)
            .padding(1.cssRem)
    }

    Breakpoint.LG {
        Modifier.padding(0.px)
    }

}

val InputStyle = CssStyle {
    base {
        Modifier
            .borderRadius(10.px)
            .height(3.cssRem)
            .margin(bottom = 10.px)
            .width(350.px)
            .padding(leftRight = 10.px)
            .backgroundColor(Theme.Form.Background)
            .fontSize(1.cssRem)
            .boxShadow(0.px, 0.px, 0.px, 0.px, null)
            .border(
                width = 1.px,
                style = LineStyle.Solid,
                color = Theme.Form.Border
            )
            .transition(Transition.of(property = "border", duration = 200.ms))
    }
    focus {
        Modifier.border(
            width = 1.px,
            style = LineStyle.Solid,
            color = Theme.Form.BorderFocus
        )
    }
    hover {
        Modifier.border(
            width = 1.px,
            style = LineStyle.Solid,
            color = Theme.Form.BorderHover
        )
    }

    Breakpoint.MD {
        Modifier
            .width(500.px)
    }
}

val TextAreaStyle =  CssStyle {
    base {
        Modifier
            .height(150.px)
            .margin(bottom = 10.px)
            .width(350.px)
            .backgroundColor(Theme.Form.Background)
            .boxShadow(0.px, 0.px, 0.px, 0.px, null)
            .borderRadius(10.px)
            .fontSize(1.cssRem)
            .padding(topBottom = 10.px, leftRight = 10.px)
            .resize(Resize.Vertical)
            .border(
                width = 1.px,
                style = LineStyle.Solid,
                color = Theme.Form.Border
            )
            .transition(Transition.of(property = "border", duration = 200.ms))
    }
    focus {
        Modifier.border(
            width = 1.px,
            style = LineStyle.Solid,
            color = Theme.Form.BorderFocus
        )
    }
    hover {
        Modifier.border(
            width = 1.px,
            style = LineStyle.Solid,
            color = Theme.Form.BorderHover
        )
    }

    Breakpoint.MD {
        Modifier
            .margin(bottom = 20.px)
            .width(500.px)
    }

}