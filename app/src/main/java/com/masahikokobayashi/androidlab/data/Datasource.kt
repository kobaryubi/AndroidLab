package com.masahikokobayashi.androidlab.data

import com.masahikokobayashi.androidlab.R
import com.masahikokobayashi.androidlab.model.Affirmation
import com.masahikokobayashi.androidlab.model.Dog
import com.masahikokobayashi.androidlab.model.Topic

object Datasource {
    val topics = listOf(
        Topic(R.string.architecture, 58, R.drawable.architecture),
        Topic(R.string.crafts, 121, R.drawable.crafts),
        Topic(R.string.business, 78, R.drawable.business),
        Topic(R.string.culinary, 118, R.drawable.culinary),
        Topic(R.string.design, 423, R.drawable.design),
        Topic(R.string.fashion, 92, R.drawable.fashion),
        Topic(R.string.film, 165, R.drawable.film),
        Topic(R.string.gaming, 164, R.drawable.gaming),
        Topic(R.string.drawing, 326, R.drawable.drawing),
        Topic(R.string.lifestyle, 305, R.drawable.lifestyle),
        Topic(R.string.music, 212, R.drawable.music),
        Topic(R.string.painting, 172, R.drawable.painting),
        Topic(R.string.photography, 321, R.drawable.photography),
        Topic(R.string.tech, 118, R.drawable.tech)
    )

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10)
        )
    }

    val dogs = listOf(
         Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1),
         Dog(R.drawable.lola, R.string.dog_name_2, 16, R.string.dog_description_2),
         Dog(R.drawable.frankie, R.string.dog_name_3, 2, R.string.dog_description_3),
         Dog(R.drawable.nox, R.string.dog_name_4, 8, R.string.dog_description_4),
         Dog(R.drawable.faye, R.string.dog_name_5, 8, R.string.dog_description_5),
         Dog(R.drawable.bella, R.string.dog_name_6, 14, R.string.dog_description_6),
         Dog(R.drawable.moana, R.string.dog_name_7, 2, R.string.dog_description_7),
         Dog(R.drawable.tzeitel, R.string.dog_name_8, 7, R.string.dog_description_8),
         Dog(R.drawable.leroy, R.string.dog_name_9, 4, R.string.dog_description_9)
    )
}
