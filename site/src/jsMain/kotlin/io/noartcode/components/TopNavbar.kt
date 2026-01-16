package io.noartcode.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.FaXmark
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.styles.Theme
import io.noartcode.styles.TopNavbarLinkStyle
import io.noartcode.styles.TopNavbarStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun TopNavbar() {
    var isMenuOpen by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopEnd
    ) {
        Row(
            modifier = TopNavbarStyle.toModifier(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Logo
            P(
                attrs = Modifier
                    .margin(0.px)
                    .fontSize(2.cssRem).toAttrs()
            ) {
                Text("NoArtCode")
            }

            Row(
                Modifier
                    .gap(2.cssRem) // 32px — scale with user font size preferences (just like Android `sp`)
                    .displayIfAtLeast(Breakpoint.LG) // hidden on mobile
            ) {
                NavigationLinks()
            }
            HamburgerMenuIcon(
                modifier = Modifier.displayUntil(Breakpoint.LG),
                isOpen = isMenuOpen,
                onClick = { isMenuOpen = !isMenuOpen }
            )
        }
        if (isMenuOpen) {
            Column(
                modifier = Modifier
                    .displayUntil(Breakpoint.LG)
                    .margin(top = 10.vh, right = 2.vh)
                    .backgroundColor(Theme.BackgroundPrimary)
                    .padding(2.cssRem)
                    .gap(1.5.cssRem)
                    .boxShadow(
                        offsetX = 0.px,
                        offsetY = 4.px,
                        blurRadius = 6.px,
                        color = Theme.ShadowDefault
                    )
                    .zIndex(100), // Ensure it overlays content
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                NavigationLinks()
            }
        }
    }
}

@Composable
fun NavigationLinks(
    linksModifier: Modifier = TopNavbarLinkStyle.toModifier()
) {
    Link(
        modifier = linksModifier,
        path = "#about",
        text = "About"
    )
    Link(
        modifier = linksModifier,
        path = "#experience",
        text = "Experience"
    )
    Link(
        modifier = linksModifier,
        path = "#projects",
        text = "Projects"
    )
    Link(
        modifier = linksModifier,
        path = "#contact",
        text = "Contact"
    )
}

@Composable
private fun HamburgerMenuIcon(
    modifier: Modifier = Modifier,
    isOpen: Boolean,
    onClick: () -> Unit,
) {
    if (isOpen) {
        FaXmark(
            modifier = modifier.onClick { onClick() },
            size = IconSize.XXL
        )
    } else {
        FaBars(
            modifier = modifier.onClick { onClick() },
            size = IconSize.XXL
        )
    }
}



