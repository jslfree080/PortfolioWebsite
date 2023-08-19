package com.jslfree080.sections

import androidx.compose.runtime.Composable
import com.jslfree080.components.socialBar
import com.jslfree080.models.Section
import com.jslfree080.models.Theme
import com.jslfree080.styles.LogoStyle
import com.jslfree080.styles.NavigationItemStyle
import com.jslfree080.util.Constants.FONT_FAMILY
import com.jslfree080.util.Constants.SECTION_WIDTH
import com.jslfree080.util.Res
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun footerSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 25.px)
            .backgroundColor(Theme.LighterGray.rgb),
        contentAlignment = Alignment.Center
    ) {
        footerContent()
    }
}

@Composable
fun footerContent() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = LogoStyle
                .toModifier()
                .cursor(Cursor.Pointer)
                .margin(left = 40.px, bottom = 25.px),
            src = Res.Image.logo,
            desc = "Logo Image"
        )
        if (breakpoint > Breakpoint.SM) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(left = 35.px),
                horizontalArrangement = Arrangement.Center
            ) {
                footerMenu()
            }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                footerMenu(row = false)
            }
        }
        socialBar(row = true)
        P {
            Text("")
        }
        Text("© Jungsoo Lee 2022-current. All rights reserved.")
    }
}

@Composable
fun footerMenu(row: Boolean = true) {
    Section.values().take(6).forEach { section ->
        Link(
            modifier = NavigationItemStyle.toModifier()
                .fontFamily(FONT_FAMILY)
                .padding(
                    right = if (row) 20.px else 0.px,
                    bottom = if (row) 0.px else 20.px
                )
                .fontSize(15.px)
                .fontWeight(FontWeight.Normal)
                .textDecorationLine(TextDecorationLine.None),
            path = section.path,
            text = section.title
        )
    }
}