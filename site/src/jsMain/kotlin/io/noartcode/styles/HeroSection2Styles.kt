package io.noartcode.styles

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px


/**
 * Main container style for HeroSection2
 * Mobile: Column layout (stacked)
 * Desktop: Row layout (side by side)
 */
val HeroSection2ContainerStyle = CssStyle {
    base {
        Modifier
            .fillMaxSize()
            //.flexDirection(FlexDirection.Row)
            //.alignItems(AlignItems.Center)
    }


/*    Breakpoint.MD {
        Modifier
            .flexDirection(FlexDirection.Column)
            .alignItems(AlignItems.Center)
    }*/
}







/**
 * Base style for role title text
 * Large, bold typography
 */
val HeroSectionHeadlineStyle = CssStyle {
    base {
        Modifier
            .fontSize(3.cssRem)
            .margin(0.px)
            .textAlign(TextAlign.Start)
            .fontWeight(FontWeight.Bold)
            .lineHeight(1.2)
    }


    Breakpoint.MD {
        Modifier
            .fontSize(5.cssRem)
    }
}

/**
 * Subtitle text style
 * Medium gray text below role titles
 */
val HeroSection2SubtitleStyle = CssStyle {
    base {
        Modifier
            .fontSize(1.5.cssRem)
            .margin(0.px)
            .color(Theme.TextSecondary)
            .lineHeight(1.5)
    }
}

val HeroSection2ProfileImageStyle = CssStyle{
    base {
        Modifier
            .size(350.px)
            .objectFit(ObjectFit.ScaleDown)
    }

    Breakpoint.XL {
        Modifier
            .size(450.px)
    }
}


