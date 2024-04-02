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
    Javascript(
        icon = Res.Icon.javascript,
        imageDesc = "",
        title = "Javascript",
        subtitle = listOf(
            "My customized online watch"
        ),
        site = listOf(
            "https://jslfree080.github.io/jslfree080/"
        ),
        description = listOf(
            "A customized online watch inspired by the Rolex watch."
        )
    ),
    Rust(
        icon = Res.Icon.rust,
        imageDesc = "",
        title = "Rust",
        subtitle = listOf(
            "interpack"
        ),
        site = listOf(
            "https://github.com/jslfree080/interpack"
        ),
        description = listOf(
            "Nucleotide Fasta encoder for compressing raw sequences into interpretable binary format (In progress)"
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
            "Built this website using Kobweb framework.",
            "A command line tool that employs samtools to extract reads from a BAM file. It then generates plots displaying stacked bases at a designated position on a chromosome, with each base represented in a distinct color. It is currently unmaintained."
        )
    ),
//    Python(
//        icon = Res.Icon.python,
//        imageDesc = "",
//        title = "Python",
//        subtitle = listOf(
//            "GEOdownload.py",
//            "dataPreProcessing.ipynb"
//        ),
//        site = listOf(
//            "https://github.com/jslfree080/JslCodes/blob/main/GEOdownload.py",
//            "https://github.com/jslfree080/dataPreProcessing/blob/main/src/main/python/dataPreProcessing.ipynb"
//        ),
//        description = listOf(
//            "A simple Python script that automates the process of downloading supplementary files from GEO.",
//            "Notes on the fundamentals of data preprocessing in machine learning."
//        )
//    ),
//    Java(
//        icon = Res.Icon.java,
//        imageDesc = "",
//        title = "Java",
//        subtitle = listOf(
//            "VcfFormatParsedTxt.jar"
//        ),
//        site = listOf(
//            "https://github.com/jslfree080/JslCodes/blob/main/VcfFormatParsedTxt.jar"
//        ),
//        description = listOf(
//            "A command line tool that parses the FORMAT column of a VCF file and converts it into a TXT file."
//        )
//    ),
//        R(
//        icon = Res.Icon.r,
//        imageDesc = "",
//        title = "R",
//        description = listOf("Experience in analyzing high-throughput sequencing data using R.")
//    ),
//        Bash(
//        icon = Res.Icon.bash,
//        imageDesc = "",
//        title = "Bash",
//        description = listOf(
//            "Basic tasks using shell scripting and utilizing Git."
//        )
//    ),
}