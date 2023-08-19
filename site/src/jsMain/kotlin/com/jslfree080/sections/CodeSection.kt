package com.jslfree080.sections

import androidx.compose.runtime.Composable
import com.jslfree080.components.codingCard
import com.jslfree080.components.sectionTitle
import com.jslfree080.models.Coding
import com.jslfree080.models.Section
import com.jslfree080.util.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun codeSection() {
    Box(
        modifier = Modifier
            .id(Section.Code.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        codeContent()
    }
}

@Composable
fun codeContent() {
    val breakpoint = rememberBreakpoint()
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
                .margin(top = 66.px, bottom = 25.px),
            section = Section.Code,
            alignment = Alignment.CenterHorizontally
        )
        SimpleGrid(numColumns = numColumns(base = 1, sm = 2, md = 3)) {
            Coding.values().forEach { coding ->
                codingCard(coding = coding)
            }
        }
    }
}