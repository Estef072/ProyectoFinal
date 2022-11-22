package com.example.loginmvvm.Model

class QuoteProvider {
    companion object {


        fun random(i:Int):UoteModel{
            val position=i

            return quote[position]
        }


        private val quote = listOf<UoteModel>(
            UoteModel(
                email = "jcdurini@gmail.com",
                contrasena = "123456"
            ),
            UoteModel(
                email = "elv12345@uvg.edu.gt",
                contrasena = "holasoyyo"
            ),
            UoteModel(
                email = "cru20673@uvg.edu.gt",
                contrasena = "87654321"
            )
        )
    }
}