package io.noartcode.styles

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

val HeroSectionStyle = CssStyle {
    base {
        Modifier
            .fillMaxSize()
            .minHeight(83.vh) // Full viewport minus navbar (17vh)
            .padding(2.cssRem)
    }
    Breakpoint.LG {
        Modifier
            .padding(4.cssRem)
    }
}

val HeroContentStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .gap(2.cssRem)
    }
    Breakpoint.LG {
        Modifier
            .gap(4.cssRem)
    }
}

/*val HeroImageContainerStyle = CssStyle {
    base {
        Modifier.fillMaxWidth()
    }

    Breakpoint.LG {
        Modifier.fillMaxWidth(40.percent)
    }
}*/

/*val HeroTextContainerStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
    }

    Breakpoint.LG {
        Modifier.fillMaxWidth(60.percent)
    }
}*/

val HeroImageStyle = CssStyle {
    base {
        Modifier
            .width(200.px)
            .height(200.px)
            .borderRadius(50.percent)
            .objectFit(ObjectFit.Cover)
            .styleModifier {
                property("object-position", "50% 30%")  // X : middle, Y: 30% to the top

            }

    }
    Breakpoint.LG {
        Modifier
            .width(400.px)
            .height(400.px)
    }
}

val GreetingTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(1.cssRem)
            .margin(0.px)
            .fontWeight(FontWeight.SemiBold)
            .color(Theme.TextSecondary)
    }
}

val HeroNameTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(3.cssRem)
            .margin(0.px)
            .fontWeight(FontWeight.SemiBold)
            .color(Theme.TextPrimary)
    }
    Breakpoint.LG {
        Modifier
            .fontSize(3.cssRem)
    }
}

val RoleTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(1.2.cssRem)
            .margin(0.px)
            .fontWeight(FontWeight.SemiBold)
            .color(Theme.TextSecondary)
    }
    Breakpoint.LG {
        Modifier
            .fontSize(1.75.cssRem)
    }
}