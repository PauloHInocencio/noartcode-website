package io.noartcode.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import io.noartcode.components.AppButton
import io.noartcode.components.ButtonVariant
import io.noartcode.styles.*
import io.noartcode.util.Constants
import io.noartcode.util.Res
import kotlinx.browser.window
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun HeroSectionContent(){
    Column (
        modifier = HeroSectionStyle.toModifier(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = HeroContentStyle.toModifier(),
                //.displayUntil(Breakpoint.LG),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                HeroImageContainer()
                HeroTextContainer()
            }
        }
    }

}

@Composable
private fun HeroImageContainer() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Img(
            src = Res.Image.PROFILE_IMAGE,
            alt = "The NoArtCoder",
            attrs = HeroImageStyle.toAttrs()
        )
    }
}

@Composable
private fun HeroTextContainer(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
       /* P(attrs = GreetingTextStyle.toAttrs()){
            Text("Hello, I'm")
        }*/

        H1(attrs = HeroNameTextStyle.toAttrs()) {
            Text("About Me")
        }

/*        P(attrs = RoleTextStyle.toAttrs()){
            Text("Software Developer")
        }*/
        P(attrs = Modifier
            .color(Theme.TextSecondary)
            .fillMaxWidth(80.percent)
            .margin(top = 1.cssRem)
            .toAttrs()) {
            Text(Constants.ABOUT_ME_DESCRIPTION)
        }

        P(attrs = Modifier
            .color(Theme.TextSecondary)
            .fillMaxWidth(80.percent)
            .margin(top = 0.5.cssRem, bottom = 1.cssRem)
            .toAttrs()) {
            Text(Constants.ABOUT_ME_DESCRIPTION_2)
        }
        Row(
            modifier = Modifier
                .gap(1.cssRem)
                .margin(top = 1.cssRem),
            horizontalArrangement = Arrangement.Start
        ) {
            AppButton(
                text = "My Resume",
                variant = ButtonVariant.Secondary,
                onClick = { window.open("cv.pdf", "_blank") }
            )

/*            AppButton(
                text = "Contact Info",
                variant = ButtonVariant.Primary,
                onClick = {}
            )*/
        }

        Row(
            modifier = Modifier
                .gap(1.cssRem)
                .margin(top = 2.cssRem),
            horizontalArrangement = Arrangement.Start
        ) {
            Link(
                modifier = SocialLinksStyle.toModifier(),
                path = "https://www.linkedin.com/in/paulo-inocencio-b0b123225/",
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
            ) {
                FaLinkedin(size = IconSize.XXL)
            }
            Link(
                modifier = SocialLinksStyle.toModifier(),
                path = "https://github.com/PauloHInocencio",
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
            ) {
                FaGithub(size = IconSize.XXL)
            }
        }
    }
}