package io.noartcode.styles

import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

val PrimaryButtonStyle = CssStyle {
    base {
        Modifier
            .padding(topBottom = 1.cssRem, leftRight = 1.7.cssRem)
            .backgroundColor(Theme.Button.PrimaryBackground)
            .color(Theme.Button.PrimaryText)
            .border(1.px)
            .border(1.px, LineStyle.Solid, Theme.Button.PrimaryBorder)
            .borderRadius(50.px)
            .fontSize(0.7.cssRem)
            .fontWeight(FontWeight.SemiBold)
            .cursor(Cursor.Pointer)
    }

    hover {
        Modifier
            .backgroundColor(Theme.Button.PrimaryBackgroundHover)
    }
}

val SecondaryButtonStyle = CssStyle {
    base {
        Modifier
            .padding(1.cssRem)
            .width(8.cssRem)
            .backgroundColor(Theme.Button.SecondaryBackground)
            .color(Theme.Button.SecondaryText)
            .border(1.px, LineStyle.Solid, color = Theme.Button.SecondaryBorder)
            .borderRadius(50.px)
            .fontSize(0.7.cssRem)
            .fontWeight(FontWeight.SemiBold)
            .cursor(Cursor.Pointer)
    }
    hover {
        Modifier
            .backgroundColor(Theme.Button.SecondaryBackgroundHover)
            .color(Theme.Button.SecondaryTextHover)
    }
}