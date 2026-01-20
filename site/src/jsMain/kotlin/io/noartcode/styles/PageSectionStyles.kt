package io.noartcode.styles

import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

val PageSectionStyle = CssStyle {
    base {
        Modifier
            .padding(top = 4.vh, leftRight = 2.cssRem)
            .margin(topBottom = 0.px)
            .height(100.vh)
            .fillMaxWidth()
            .boxSizing(BoxSizing.BorderBox)
    }

   Breakpoint.XL {
        Modifier
            .padding(top = 4.vh, leftRight = 10.cssRem)
   }

}

val PageSectionArrowLinkStyle = CssStyle {
   base {
       Modifier
           .position(Position.Absolute)
           .right(2.cssRem)
           .bottom(2.cssRem)
           .size(32.px)
   }

    Breakpoint.LG {
        Modifier
            .right(5.cssRem)
            .bottom(2.cssRem)
    }
}