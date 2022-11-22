package com.example.loginmvvm.Model

class QuoteProvider {
    companion object {


        fun random(i:Int):UoteModel{
            val position=i

            return quote[position]
        }


        private val quote = listOf<UoteModel>(

            UoteModel(
                email = "elv20725@uvg.edu.gt",
                contrasena = "12345"
            ),
            UoteModel(
                email = "cru20673@uvg.edu.gt",
                contrasena = "87654321"
            )
        )
    }
}