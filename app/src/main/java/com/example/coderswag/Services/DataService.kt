package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories =  listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat1"),
        Product("Devslopes Graphic Black","$20","hat2"),
        Product("Devslopes Graphic White","$18","hat3"),
        Product("Devslopes Graphic Snapback","$22","hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28", "hoodie1"),
        Product("Devslopes Hoodie Red","$30", "hoodie2"),
        Product("Devslopes Hoodie Blue","$40", "Hoodie3"),
        Product("Devslopes Hoodie Brown","$35", "Hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt black","$28", "shirt1"),
        Product("Devslopes Shirt Red","$20", "shirt2"),
        Product("Devslopes Shirt Blue","$30", "shirt3"),
        Product("Devslopes Shirt Brown","$35", "shirt4"),
        Product("Kickflip Studios","$18", "shirt5")
    )
}