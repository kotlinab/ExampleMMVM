package es.ipow.examplemmvm.model

class QuoteProvider {
    companion object {
        fun random():QuoteModel {
            val postition:Int = (0..10).random()
            return quote[postition]
        }                
    
        val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "Todo es divertido, con tal de que le suceda a otra persona.",
                author =  "Will Rogers"),
            QuoteModel(
                quote = "No te tomes la vida demasiado en serio. Nunca saldrás vivo de ella.",
                author =  "Elbert Hubbard"),
            QuoteModel(
                quote = "Estoy seguro de que el universo está lleno de vida inteligente. Simplemente ha sido demasiado inteligente como para venir aquí.",
                author = "Arthur C. Clarke"),
            QuoteModel(
                quote = "La vida en una caja es mejor que no tener vida, espero. Al menos tendrías una oportunidad. Podrías quedarte allí pensando: bueno, al menos no estoy muerto.",
                author = "Tom Stoppard"),
            QuoteModel(
                quote = "La vida sería trágica si no fuera graciosa.",
                author = "Stephen Hawking"),
            QuoteModel(
                quote = "Mi mujer y yo fuimos felices durante 20 años. Luego, nos conocimos.",
                author = "Rodney Dangerfield"),
            QuoteModel(
                quote = "Soy un ama de casa maravillosa. Cada vez que dejo a un hombre me quedo con su casa.",
                author = "Zsa Zsa Gabor"),
            QuoteModel(
                quote = "La vida no imita el arte, imita la mala televisión.",
                author = "Woody Allen"),
            QuoteModel(
                quote = "Si los gatos parecieran ranas, enseguida nos daríamos cuenta de lo desagradables y crueles que son esos pequeños bastardos.",
                author = "Terry Pratchett"),
            QuoteModel(
                quote = "La felicidad es tener una familia grande, amorosa, dedicada, unida y que viva en otra ciudad.",
                author = "George Burns"),
            QuoteModel(
                quote = "Ríe y el mundo ríe contigo, ronca y dormirás solo.",
                author = "Anthony Burgess"),
            QuoteModel(
                quote = "La pereza no es más que el hábito de descansar antes de que te canses.",
                author = "Jules Renard"),
            QuoteModel(
                quote = "Si esto es café por favor tráigame un té; pero si esto es té, por favor tráigame un café.",
                author = "Abraham Lincoln")
            )
    }
}