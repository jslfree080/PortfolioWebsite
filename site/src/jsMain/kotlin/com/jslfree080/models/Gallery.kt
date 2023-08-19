package com.jslfree080.models

import com.jslfree080.util.Constants.THIS_SITE
import com.jslfree080.util.Res

enum class Gallery(
    val image: String,
    val title: String,
    val description: String,
    val source: String
) {
    One(
        image = Res.Image.gallery1,
        title = "PI3K-AKT pathway related genes",
        description = "Cancer Genomics",
        source = THIS_SITE + "ess_PI3K_AKT_pathway_v2.pdf"
    ),
    Two(
        image = Res.Image.gallery2,
        title = "Inferred transcription factor activities",
        description = "Cancer Genomics",
        source = THIS_SITE + "dorothea_preview_JSL.pdf"
    ),
    Three(
        image = Res.Image.gallery3,
        title = "Batch correction and clustering",
        description = "Single-cell/nucleus Transcriptomics",
        source = THIS_SITE + "FinalLayeredPlot.png"
    ),
    Four(
        image = Res.Image.gallery4,
        title = "Tumor immune microenvironment",
        description = "Spatial Transcriptomics",
        source = THIS_SITE + "210628_Illumina_Visium_JSL.png"
    ),
    Five(
        image = Res.Image.gallery5,
        title = "BAM alignments visualization",
        description = "Open Source Project (bamscope)",
        source = THIS_SITE + "18-53177740.png"
    )
}