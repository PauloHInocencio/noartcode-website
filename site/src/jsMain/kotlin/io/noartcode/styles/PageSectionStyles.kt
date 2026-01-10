package io.noartcode.styles

import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.boxSizing
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

val PageSectionStyle = CssStyle {
    base {
        Modifier
            .padding(top = 0.px)
            .margin(topBottom = 0.px, leftRight = 1.cssRem)
            .height(96.vh)
            .boxSizing(BoxSizing.BorderBox)
    }

    Breakpoint.XL {
        Modifier
            .padding(top = 2.vh)
            .margin(topBottom = 0.px, leftRight = 10.cssRem)
            .padding(top = 0.px)
            .margin(topBottom = 0.px, leftRight = 5.cssRem)
    }

}