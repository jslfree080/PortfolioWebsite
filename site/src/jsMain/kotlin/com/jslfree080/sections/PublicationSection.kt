package com.jslfree080.sections

import androidx.compose.runtime.Composable
import com.jslfree080.components.publicationCard
import com.jslfree080.components.sectionTitle
import com.jslfree080.models.Publication
import com.jslfree080.models.Section
import com.jslfree080.styles.PublicationArrowIconStyle
import com.jslfree080.util.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowLeft
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowRight
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun publicationSection() {
    Box(
        modifier = Modifier
            .id(Section.Publication.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        publicationsContent()
    }
}

@Composable
fun publicationsContent() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(100.percent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        sectionTitle(
            modifier = Modifier
                .fillMaxWidth()
                .margin(top = 80.px, bottom = 25.px),
            section = Section.Publication,
            alignment = Alignment.CenterHorizontally
        )
        publicationCards(breakpoint = breakpoint)
        publicationNavigation()
    }
}

@Composable
fun publicationCards(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier
            .id("scrollableContainer2")
            .fillMaxWidth()
            .margin(bottom = 25.px)
            .maxWidth(
                if (breakpoint > Breakpoint.MD) 625.px
                else 300.px
            )
            .overflow(Overflow.Hidden) // this will hide that default horizontal scroll
            .scrollBehavior(ScrollBehavior.Smooth) // row will become scrollable
    ) {
        Publication.values().forEach { publication ->
            publicationCard(
                modifier = Modifier.margin(
                    right = if (publication != Publication.values()[Publication.values().size - 1]) 25.px else 0.px
                ),
                publication = publication
            )
        }
    }
}

@Composable
fun publicationNavigation() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .margin(top = 20.px),
        horizontalArrangement = Arrangement.Center
    ) {
        FaArrowLeft(
            modifier = PublicationArrowIconStyle.toModifier()
                .margin(right = 40.px)
                .cursor(Cursor.Pointer)
                .onClick {
                    document.getElementById("scrollableContainer2")
                        ?.scrollBy(x = (-325.0), y = 0.0)
                },
            size = IconSize.LG
        )
        FaArrowRight(
            modifier = PublicationArrowIconStyle.toModifier()
                .cursor(Cursor.Pointer)
                .onClick {
                    document.getElementById("scrollableContainer2")
                        ?.scrollBy(x = 325.0, y = 0.0)
                },
            size = IconSize.LG
        )
    }
}