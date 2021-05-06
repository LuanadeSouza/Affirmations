package br.com.luanadev.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import br.com.luanadev.affirmations.R

data class Affirmation(
    val title: String,
    @DrawableRes val logo: Int
)
val loadAffirmations = listOf(
    Affirmation("Eu sou Forte.", R.drawable.image1),
    Affirmation("Eu acredito em mim.", R.drawable.image2),
    Affirmation("Cada dia é uma nova oportunidade de crescer e ser uma versão melhor de mim mesmo.", R.drawable.image3),
    Affirmation("Cada desafio na minha vida é uma oportunidade de aprender.", R.drawable.image4),
    Affirmation("Tenho muito a agradecer.", R.drawable.image5),
    Affirmation("Coisas boas sempre acontecem em minha vida.", R.drawable.image6),
    Affirmation("Novas oportunidades me aguardam a cada passo.", R.drawable.image7),
    Affirmation("Tenho coragem de seguir meu coração.", R.drawable.image8),
    Affirmation("As coisas acontecerão precisamente no momento certo.", R.drawable.image9),
    Affirmation("Estarei presente em todos os momentos que este dia trouxer.", R.drawable.image10)
)
