package com.jslfree080.pages

import androidx.compose.runtime.*
import com.jslfree080.components.backToTopButton
import com.varabyte.kobweb.core.Page
import com.jslfree080.components.layouts.PageLayout
import com.jslfree080.components.overflowMenu
import com.jslfree080.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import kotlinx.browser.document
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun homePage() {
    var menuOpened by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()) {
        Column( // modifier parameter in kobweb are translated into the CSS properties.
            modifier = Modifier.fillMaxSize(), // not same as Android modifier (order is not important here)
            // Stack and have its children sections
            verticalArrangement = Arrangement.Top, // arranged from the top
            horizontalAlignment = Alignment.CenterHorizontally // and in the center.
        ) {
            mainSection(onMenuClicked = { menuOpened = true }) // call the main section from our homepage
            experienceSection()
            codeSection()
            gallerySection()
            //publicationSection()
            contactSection()
            footerSection()
            //achievementsSection()
            //testimonialSection()
            //aboutSection()
        }
        backToTopButton()
        if (menuOpened) {
            overflowMenu(onMenuClosed = { menuOpened = false })
        }
    }
/*
    PageLayout("Welcome to Kobweb!") {
        Text("Please enter your name")
        var name by remember { mutableStateOf("") }
        Input(
            InputType.Text,
            attrs = {
                onInput { e -> name = e.value }
            }
        )
        P()
        Text("Hello ${name.takeIf { it.isNotBlank() } ?: "World"}!")
    }
*/
}
