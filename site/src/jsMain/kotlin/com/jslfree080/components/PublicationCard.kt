package com.jslfree080.components

import androidx.compose.runtime.Composable
import com.jslfree080.models.Publication
import com.jslfree080.styles.NavigationJournalStyle
import com.jslfree080.styles.PublicationCardStyle
import com.jslfree080.util.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun publicationCard(
    modifier: Modifier,
    publication: Publication
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .maxWidth(300.px)
    ) {
        Box(
            modifier = PublicationCardStyle.toModifier()
                .padding(all = 14.px)
                .margin(topBottom = 0.px)
                .width(300.px)
        ) {
            P(
                attrs = modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(14.px)
                    .lineHeight(1.6)
                    .fontWeight(FontWeight.Normal)
                    .width(272.px)
                    .objectFit(ObjectFit.Cover)
                    .toAttrs()
            ) {
                val authors: List<String> = publication.authors.split(publication.me)
                Text(authors[0])
                Link(
                    modifier = NavigationJournalStyle.toModifier()
                        .fontWeight(FontWeight.Bold)
                        .textDecorationLine(TextDecorationLine.Underline),
                    text = publication.me,
                    path = publication.link
                )
                Text(authors[1])
                Text(" ")
                Link(
                    modifier = NavigationJournalStyle.toModifier()
                        .fontWeight(FontWeight.Bold)
                        .textDecorationLine(TextDecorationLine.None), // remove underline whenever we hover over one of those links,
                    text = publication.title,
                    path = publication.link
                )
                Text(" " + publication.journal)
            }
        }
    }
}