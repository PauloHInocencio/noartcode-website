package io.noartcode.styles

import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.cssRem

val TopNavbarStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth() // Default for mobile/tablet (<= MD)
            .margin(bottom = 4.cssRem)

    }
    Breakpoint.LG {
        Modifier
            .margin(bottom = 8.cssRem)
    }
}

val TopNavbarLinkStyle = CssStyle {
    base {
        Modifier
            .fontSize(1.5.cssRem) // 24px
            .color(Theme.Link.Default)
            .textDecorationLine(TextDecorationLine.None)
    }
    hover {
        Modifier
            .color(Theme.Link.Hover)
            .textDecorationLine(TextDecorationLine.Underline)
            .textUnderlineOffset(1.cssRem)
            .styleModifier {
                property("text-decoration-color", Theme.Link.UnderlineHover.toString())
            }
    }
}

val BottomNavbarLinkStyle = CssStyle {
    base {
        Modifier
            .fontSize(1.cssRem) // 24px
            .color(Theme.Link.Default)
            .textDecorationLine(TextDecorationLine.None)
    }
    hover {
        Modifier
            .color(Theme.Link.Hover)
            //.textDecorationLine(TextDecorationLine.Underline)
            //.textUnderlineOffset(1.cssRem)
            .styleModifier {
                property("text-decoration-color", Theme.Link.UnderlineHover.toString())
            }
    }
}


// Note: Use rem for most things, especially typography and spacing.
// It makes your site more accessible and easier to maintain!