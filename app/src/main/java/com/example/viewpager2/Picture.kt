package com.example.viewpager2

import java.io.Serializable

class Picture(val namePicture: String, val authorPicture: String, val picture: Int) : Serializable {
    companion object {
        val paintings = mutableListOf(
            Picture("Мальчишник", "Луис Уэйн", R.drawable.pic1),
            Picture("Белый кот", "Марк Франц", R.drawable.pic2),
            Picture("Белый кот, играющий со шнурком", "Хиросигэ II", R.drawable.pic3),
            Picture("Рамину", "Сюзанна Валадон", R.drawable.pic4),
            Picture("Поэт", "Марк Шагал", R.drawable.pic5),
            Picture("Кошка, поймавшая птицу", " Пабло Пикассо", R.drawable.pic6),
            Picture("Чёрный кот", "Минь Чжэнь", R.drawable.pic7),
            Picture("Игра котёнка", "Генриетта Роннер-Книп", R.drawable.pic8),
            Picture("Кошка", "Барт ван дер Лек", R.drawable.pic9),
            Picture("Жюли Мане (Девочка с кошкой)", "Пьер Огюст Ренуар", R.drawable.pic10),
            Picture("Обед кошки", "Маргерит Жерар", R.drawable.pic11),
            Picture("Белый кот", "Пьер Боннар", R.drawable.pic12),
            Picture("Коты, представляющие 53 станции Токайдо", "Утагава Куниёси", R.drawable.pic13),
            Picture("Чёрный кот", "Теофиль-Александр Стейнлен", R.drawable.pic14)
        )
    }
}