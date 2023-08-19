package com.jslfree080.models

import com.jslfree080.util.Res

enum class Coding(
    val icon: String,
    val imageDesc: String,
    val title: String,
    val subtitle: List<String> = listOf(""),
    val site: List<String> = listOf(""),
    val description: List<String>
) {
    R(
        icon = Res.Icon.r,
        imageDesc = "",
        title = "R",
        description = listOf("I have experience in analyzing high-throughput sequencing data using R. Additionally, I am passionate about data visualization within the R environment.")
    ),
    Python(
        icon = Res.Icon.python,
        imageDesc = "",
        title = "Python",
        subtitle = listOf(
            "GEOdownload.py"
        ),
        site = listOf(
            "https://github.com/jslfree080/JslCodes/blob/main/GEOdownload.py"
        ),
        description = listOf(
            "I have created a simple Python script that automates the process of downloading supplementary files from GEO."
        )
    ),
    Bash(
        icon = Res.Icon.bash,
        imageDesc = "",
        title = "Bash",
        description = listOf(
            "I am capable of carrying out basic tasks using shell scripting and utilizing Git."
        )
    ),
    Java(
        icon = Res.Icon.java,
        imageDesc = "",
        title = "Java",
        subtitle = listOf(
            "VcfFormatParsedTxt.jar"
        ),
        site = listOf(
            "https://github.com/jslfree080/JslCodes/blob/main/VcfFormatParsedTxt.jar"
        ),
        description = listOf(
            "I have developed a straightforward Java program that parses the FORMAT column of a VCF file and converts it into a TXT file."
        )
    ),
    Kotlin(
        icon = Res.Icon.kotlin,
        imageDesc = "",
        title = "Kotlin",
        subtitle = listOf(
            "PortfolioWebsite",
            "bamscope"
        ),
        site = listOf(
            "https://github.com/jslfree080/PortfolioWebsite",
            "https://github.com/jslfree080/bamscope"
        ),
        description = listOf(
            "I utilized Kotlin to build this website.",
            "I have developed software using Kotlin that employs samtools to extract reads from a BAM file. It then generates plots displaying stacked bases at a designated position on a chromosome, with each base represented in a distinct color. Currently, I am in the process of addressing and fixing bugs in the software."
        )
    ),
    Javascript(
        icon = Res.Icon.javascript,
        imageDesc = "",
        title = "Javascript",
        description = listOf(
            "I am presently in the process of learning D3.js, a skill that will enable me to construct genomic tools featuring interactive data visualization in the future."
        )
    )
}