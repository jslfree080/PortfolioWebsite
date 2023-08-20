package com.jslfree080.models

import com.jslfree080.util.Constants.THIS_SITE

enum class Experience(
    val number: String,
    val topic: String,
    val description: String,
    val explanation: List<String> = listOf(""),
    val affiliation: String,
    val dateFrom: String,
    val dateTo: String,
    val siteText: String = "",
    val siteLink: String = ""
) {
    First(
        number = "01",
        topic = "Open Source Project",
        description = "After graduating with a Master of Science degree, I personally participated in an open-source project on GitHub, where I took the initiative to explore new programming languages and attempt the creation of genomic tools. Despite encountering some obstacles, I am certain that this experience has greatly contributed to my personal and professional growth.",
        affiliation = "",
        dateFrom = "January 2023",
        dateTo = "NOW"
    ),
    Second(
        number = "02",
        topic = "Cancer Genomics",
        description = "I have analyzed uterine sarcoma samples using comprehensive NGS platforms, including WES, RNA-Seq, and WGS. The various data analyses I have conducted are as follows:",
        explanation = listOf(
            "Investigating the somatic mutation landscape",
            "Detecting cancer driver genes",
            "Analyzing copy number variations",
            "Inferring transcription factor activity",
            "Detecting recurrent gene fusions and structural variations"
        ),
        affiliation = "Choi Laboratory | Korea University College of Medicine",
        dateFrom = "November 2021",
        dateTo = "August 2022",
        siteText = "→ Have a look at my open seminar poster",
        siteLink = THIS_SITE + "ess-poster.pdf"
    ),
    Third(
        number = "03",
        topic = "Single-cell/nucleus and Spatial Transcriptomics",
        description = "I had the opportunity to participate in the analysis of ESCC samples using three transcriptomic platforms. Some of the analyses I've been involved in include:",
        explanation = listOf(
            "Detecting doublets and multiplets",
            "Correcting batch effects between scRNA-seq and snRNA-seq",
            "Annotating cell types with DEGs and unsupervised clustering",
            "Conducting pseudotime trajectory analysis",
            "Decomposing spatial transcriptomics using single-cell/nucleus data"
        ),
        affiliation = "Choi Laboratory | Korea University College of Medicine",
        dateFrom = "November 2020",
        dateTo = "October 2021"
    )
}