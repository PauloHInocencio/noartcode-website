package io.noartcode.styles

import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

val PageSectionStyle = CssStyle {
    base {
        Modifier
            .padding(top = 0.vh, leftRight = 1.cssRem)
            .margin(topBottom = 0.px)
            .height(96.vh)
            .fillMaxWidth()
            .boxSizing(BoxSizing.BorderBox)
    }

    Breakpoint.XL {
        Modifier
            .padding(top = 4.vh, leftRight = 10.cssRem)
    }

}