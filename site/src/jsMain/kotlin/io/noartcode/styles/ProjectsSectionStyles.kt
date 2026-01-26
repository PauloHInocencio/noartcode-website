package io.noartcode.styles

import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.*

val ProjectSectionContentStyle = CssStyle {
    base {
        Modifier
            .margin(topBottom = 2.cssRem)
            .maxWidth(1028.px)
            .alignContent(AlignContent.Center)
            .gap(2.cssRem)
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
            .padding(top = 4.vh, leftRight = 5.cssRem)
            .margin(topBottom = 1.cssRem)
            .fillMaxWidth()
            .boxSizing(BoxSizing.BorderBox)
    }

    Breakpoint.XL {
        Modifier
            .padding(top = 4.vh, leftRight = 10.cssRem)
            .height(100.vh)
    }

}


val ProjectCard2Style = CssStyle {
   base {
       Modifier
           .padding(
               leftRight = 2.cssRem,
               topBottom = 1.cssRem
           )
           .textDecorationLine(TextDecorationLine.None)
           .backgroundColor(Theme.Button.SecondaryBackground)
           .color(Theme.Button.SecondaryText)
           .border(1.px, LineStyle.Solid, color = Theme.Button.SecondaryBorder)
           .borderRadius(20.px)
           .border(
               width = 1.px,
               style = LineStyle.Solid,
               color = Theme.BorderPrimary
           )
           .fillMaxSize()
           .cursor(Cursor.Pointer)
   }

   hover {
       Modifier
           .backgroundColor(Theme.Button.SecondaryBackgroundHover)
           .color(Theme.Button.SecondaryTextHover)
   }
}











