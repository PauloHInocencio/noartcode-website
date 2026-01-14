package io.noartcode.styles

import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.silk.style.CssStyle
import org.jetbrains.compose.web.css.cssRem

val SocialLinksStyle = CssStyle {
    base {
        Modifier
            .gap(1.cssRem)
            .color(Theme.Link.Default)
            .cursor(Cursor.Pointer)
    }
}