package com.jslfree080.models

import com.jslfree080.util.Constants.THIS_SITE

enum class Section(
    val id: String,
    val title: String,
    val subtitle: String,
    val path: String
) {
    Home(
        id = "home",
        title = "Home",
        subtitle = "",
        path = "#home"
    ),
    Experience(
        id = "experience",
        title = "Experience",
        subtitle = "Work Experience",
        path = "#experience"
    ),
    Code(
        id = "code",
        title = "Code",
        subtitle = "Programming Language",
        path = "#code"
    ),
    Gallery(
        id = "gallery",
        title = "Gallery",
        subtitle = "Figure",
        path = "#gallery"
    ),
    Publication(
        id = "publication",
        title = "Publication",
        subtitle = "Contribution",
        path = "#publication"
    ),
    Contact(
        id = "contact",
        title = "Contact",
        subtitle = "Contact Me",
        path = "#contact"
    ),

    Cv(
        id = "cv",
        title = "CV",
        subtitle = "Check it out",
        path = THIS_SITE + "cv20220929.pdf"
    ),

    // Below sections are unused
    About(
        id = "about",
        title = "About me",
        subtitle = "Why Hire Me?",
        path = "#about"
    ),
    Achievements(
        id = "achievements",
        title = "Achievements",
        subtitle = "Personal Achievements",
        path = "#achievements"
    ),
    Testimonial(
        id = "testimonial",
        title = "Testimonial",
        subtitle = "Happy Customers",
        path = "#testimonial"
    )
}