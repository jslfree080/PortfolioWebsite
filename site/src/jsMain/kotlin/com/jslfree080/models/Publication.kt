package com.jslfree080.models

enum class Publication(
    val authors: String,
    val me: String = "Lee J",
    val title: String,
    val journal: String,
    val link: String
) {
    One(
        authors = "Bellone S, Roque DM, Siegel ER, Buza N, Hui P, Bonazzoli E, Guglielmi A, Zammataro L, Nagarkatti N, Zaidi S, Lee J, Silasi DA, Huang GS, Andikyan V, Damast S, Clark M, Azodi M, Schwartz PE, Tymon-Rosario JR, Harold JA, Mauricio D, Zeybek B, Menderes G, Altwerger G, Ratner E, Alexandrov LB, Iwasaki A, Kong Y, Song E, Dong W, Elvin JA, Choi J, Santin AD.",
        title = "A phase 2 evaluation of pembrolizumab for recurrent Lynch-like versus sporadic endometrial cancers with microsatellite instability.",
        journal = "Cancer. 2022 Mar 15;128(6):1206-1218. doi: 10.1002/cncr.34025. Epub 2021 Dec 7. PMID: 34875107.",
        link = "https://acsjournals.onlinelibrary.wiley.com/doi/10.1002/cncr.34025"
    ),
    Two(
        authors = "Bellone S, Roque DM, Siegel ER, Buza N, Hui P, Bonazzoli E, Guglielmi A, Zammataro L, Nagarkatti N, Zaidi S, Lee J, Silasi DA, Huang GS, Andikyan V, Damast S, Clark M, Azodi M, Schwartz PE, Tymon-Rosario J, Harold J, Mauricio D, Zeybek B, Menderes G, Altwerger G, Ratner E, Alexandrov LB, Iwasaki A, Kong Y, Song E, Dong W, Elvin J, Choi J, Santin AD.",
        title = "A phase II evaluation of pembrolizumab in recurrent microsatellite instability-high (MSI-H) endometrial cancer patients with Lynch-like versus MLH-1 methylated characteristics (NCT02899793).",
        journal = "Ann Oncol. 2021 Aug;32(8):1045-1046. doi: 10.1016/j.annonc.2021.04.013. Epub 2021 Apr 28. PMID: 33932502.",
        link = "https://www.annalsofoncology.org/article/S0923-7534(21)01170-4/fulltext"
    )
}