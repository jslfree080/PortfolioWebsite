package com.jslfree080.styles

import com.jslfree080.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.anyLink
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val CircleStyle by ComponentStyle {
    base { Modifier
        .size(4.px)
        .borderRadius(r = 20.px)
        .margin(top = 7.5.px, right = 5.px)
    }
}

val NavigationExperience by ComponentStyle {
    base {
        Modifier
            .color(Theme.Primary.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(Theme.Primary.rgb)
    }
    hover {
        Modifier
            .color(Theme.Secondary.rgb)
    }
}