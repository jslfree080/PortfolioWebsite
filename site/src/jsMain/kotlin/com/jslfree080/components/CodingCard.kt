package com.jslfree080.components

import androidx.compose.runtime.Composable
import com.jslfree080.models.Coding
import com.jslfree080.models.Theme
import com.jslfree080.styles.CodingCardStyle
import com.jslfree080.styles.NavigationProjectStyle
import com.jslfree080.util.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun codingCard(
    coding: Coding
) {
    Column(
        modifier = CodingCardStyle.toModifier()
            .maxWidth(300.px)
            .margin(all = 20.px)
            .padding(all = 20.px)
    ) {
        Box(
            modifier = Modifier
                .id("iconBox")
                .padding(all = 10.px)
                .margin(bottom = 20.px)
                .border(
                    width = 2.px,
                    style = LineStyle.Solid,
                    color = Theme.LightGray.rgb
                )
                .borderRadius(
                    topLeft = 20.px,
                    topRight = 20.px,
                    bottomLeft = 20.px,
                    bottomRight = 0.px
                )
        ) {
            Image(
                modifier = Modifier.size(40.px),
                src = coding.icon,
                desc = coding.imageDesc
            )
        }
        P(
            attrs = Modifier
                .fillMaxWidth()
                .margin(top = 0.px, bottom = 10.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(18.px)
                .fontWeight(FontWeight.Bold)
                .toAttrs()
        ) {
            Text(coding.title)
        }
        P(
            attrs = Modifier
                .fillMaxWidth()
                .margin(top = 0.px, bottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .fontWeight(FontWeight.Normal)
                .toAttrs()
        ) {
            (0 until coding.subtitle.size).forEach {
                if (coding.subtitle[it] == "") {
                    Text(coding.description[it])
                }
                else {
                    Link(
                        modifier = NavigationProjectStyle.toModifier()
                            .fontWeight(FontWeight.Bold)
                            .textDecorationLine(TextDecorationLine.None), // remove underline whenever we hover over one of those links,
                        text = coding.subtitle[it],
                        path = coding.site[it],
                        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
                    )
                    Text(": " + coding.description[it])
                }
                if (it < coding.subtitle.size - 1) {
                    P {
                        Text("")
                    }
                }
            }
        }
    }
}