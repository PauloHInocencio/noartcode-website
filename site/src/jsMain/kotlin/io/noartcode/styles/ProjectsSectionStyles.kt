package io.noartcode.styles

import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val ProjectSectionContentStyle = CssStyle {
    base {
        Modifier
            .margin(topBottom = 2.cssRem)
            .display(DisplayStyle.Grid)
            .gridTemplateColumns {
                size(1.fr)  // 1 column for mobile
            }
            .gap(1.cssRem)
    }

    Breakpoint.LG {
        Modifier
            .gridTemplateColumns {
                repeat(2) { size(1.fr) }  // 2 columns for tablets
            }
    }

    Breakpoint.XL {
        Modifier
            .gridTemplateColumns {
                repeat(3) { size(1.fr) }  // 3 columns for desktop
            }
            .gap(2.cssRem)
    }
}



val ProjectPageSectionStyle = CssStyle {
    base {
        Modifier
            .padding(top = 4.vh, leftRight = 2.cssRem)
            .margin(topBottom = 0.px)
            .fillMaxWidth()
            .boxSizing(BoxSizing.BorderBox)
    }

    Breakpoint.XL {
        Modifier
            .padding(top = 4.vh, leftRight = 10.cssRem)
            .height(100.vh)
    }

}












