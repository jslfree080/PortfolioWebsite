package com.jslfree080.sections

import androidx.compose.runtime.*
import com.jslfree080.components.achievementCard
import com.jslfree080.models.Achievement
import com.jslfree080.models.Section
import com.jslfree080.models.Theme
import com.jslfree080.util.Constants.SECTION_WIDTH
import com.jslfree080.util.animatedNumbers
import com.jslfree080.util.observeViewportEntered
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.px

@Composable
fun achievementsSection() {
    val breakpoint = rememberBreakpoint()
    Box(
        modifier = Modifier
            .id(Section.Achievements.id)
            .fillMaxWidth()
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 100.px)
            .backgroundColor(Theme.LighterGray.rgb),
        contentAlignment = Alignment.Center
    ) {
        achievementsContent(breakpoint = breakpoint)
    }
}

@Composable
fun achievementsContent(breakpoint: Breakpoint) {
    val scope = rememberCoroutineScope()
    var viewportEntered by remember { mutableStateOf(false) }
    val animatedNumbers = remember { mutableStateListOf(0, 0, 0, 0) }
    observeViewportEntered(
        sectionId = Section.Achievements.id,
        distanceFromTop = 700.0,
        onViewportEntered = {
            viewportEntered = true
            Achievement.values().forEach { achievement ->
                scope.launch {
                    animatedNumbers(
                        number = achievement.number,
                        onUpdate = {
                            animatedNumbers[achievement.ordinal] = it
                        }
                    )
                }
            }
        }
    )

    SimpleGrid(numColumns = numColumns(base = 1, md = 2, lg = 4)) {
        Achievement.values().forEach { achievement ->
            achievementCard(
                modifier = Modifier.margin(
                    right = if (achievement == Achievement.Team) 0.px
                    else {
                        if (breakpoint > Breakpoint.SM) 40.px else 0.px
                    },
                    bottom = if (breakpoint > Breakpoint.MD) 0.px else 40.px
                ),
                animatedNumber = if (viewportEntered) animatedNumbers[achievement.ordinal] else 0,
                achievement = achievement
            )
        }
    }
}