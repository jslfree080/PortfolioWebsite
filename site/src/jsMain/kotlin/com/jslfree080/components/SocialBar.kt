package com.jslfree080.components

import androidx.compose.runtime.Composable
import com.jslfree080.styles.SocialLinkStyle
import com.jslfree080.util.Res.Website.GITHUB
import com.jslfree080.util.Res.Website.TWITTER
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun socialBar(row: Boolean = false) {
    if (row) {
        Row(
            modifier = Modifier
                .margin(top = 25.px)
                .padding(leftRight = 10.px)
                .minHeight(40.px)
                .borderRadius(r = 20.px)
                .backgroundColor(Colors.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            socialLinks(row = true)
        }
    } else {
        Column(
            modifier = Modifier
                .margin(bottom = 60.px)
                .padding(topBottom = 10.px)
                .minWidth(60.px)
                .borderRadius(r = 20.px)
                .backgroundColor(Colors.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            socialLinks()
        }
    }
}

@Composable
private fun socialLinks(row: Boolean = false) {
    Link(
        path = GITHUB,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaGithub(
            modifier = SocialLinkStyle.toModifier()
                .margin(
                    bottom = if (row) 0.px else 36.px,
                    right = if (row) 36.px else 0.px
                ),
            size = IconSize.LG
        )
    }
    Link(
        path = TWITTER,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaTwitter(
            modifier = SocialLinkStyle.toModifier(),
            size = IconSize.LG
        )
    }
    /*
    Link(
        path = "",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaFacebook(
            modifier = Modifier.margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    Link(
        path = "",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaInstagram(
            modifier = Modifier.margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    Link(
        path = "",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaLinkedin(
            modifier = Modifier.margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    */
}