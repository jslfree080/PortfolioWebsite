package com.jslfree080.sections

import androidx.compose.runtime.*
import com.jslfree080.components.experienceCard
import com.jslfree080.components.sectionTitle
import com.jslfree080.models.Experience
import com.jslfree080.models.Section
import com.jslfree080.util.Constants.SECTION_WIDTH
import com.jslfree080.util.observeViewportEntered
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun experienceSection() {
    Box(
        modifier = Modifier
            .id(Section.Experience.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        experienceContent()
    }
}

@Composable
fun experienceContent() {
    val breakpoint = rememberBreakpoint()
    var animatedMargin by remember { mutableStateOf(200.px) }

    observeViewportEntered(
        sectionId = Section.Experience.id,
        distanceFromTop = 500.0,
        onViewportEntered = {
            animatedMargin = 50.px
        }
    )

    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        sectionTitle(
            modifier = Modifier
                .fillMaxWidth()
                .margin(top = 160.px, bottom = 25.px),
            section = Section.Experience,
            alignment = Alignment.CenterHorizontally
        )
        Experience.values().forEach { experience ->
            experienceCard(
                breakpoint = breakpoint,
                active = experience == Experience.First,
                experience = experience,
                animatedMargin = animatedMargin
            )
            if (breakpoint <= Breakpoint.SM && (experience != Experience.values()[Experience.values().size - 1])) {
                Box(modifier = Modifier.margin(40.px))
            }
        }
    }
}