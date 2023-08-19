package com.jslfree080.styles

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import org.jetbrains.compose.web.css.px

val CircleStyle by ComponentStyle {
    base { Modifier
        .size(4.px)
        .borderRadius(r = 20.px)
        .margin(top = 7.5.px, right = 5.px)
    }
}