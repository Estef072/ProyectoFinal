package com.example.quizzapp

object QuizHandler_history {
    fun getQuestionHistory():ArrayList<Question> {
        return arrayListOf(
            Question(
                "¿Quién es considerado el primer presidente de Guatemala?",
                "Mariano Rivera Paz",
                "Rafael Carrera",
                "usto Rufino Barrios",
                "Mariano Rivera Paz",

                ),
            Question(
                "¿En qué fecha fue la revolución del naño de 1944?? ",
                "15 de septiembre",
                "20 de octubre",
                "Héctor Gaitán",
                "20 de octubre"
            ),
            Question(
                "¿Quiénes son la ncivilización prehispánica nque prevaleció en Guate? ",
                "Aztecas",
                "Olmecas",
                "Mayas",
                "Mayas"
            ),
            Question(
                "¿Cuál de estos nombres no pertenece a una de las carabelas de Cristobal Colón?  ",
                "Punta",
                "Santa María",
                "Niña",
                "Punta"
            ),
            Question(
                "¿En qué fecha se realizó la firma de la paz en Guatemala? ",
                " 30 de Junio",
                "29 de Diciembre",
                "20 de octubre",
                "29 de Diciembre"
            ),
        )
    }
    fun getQuestionCiencia():ArrayList<Question> {
        return arrayListOf(
            Question(
                "¿Cómo se llaman las partículas subatómicas que tienen carga en un átomo?",
                "electrón",
                "Proton",
                "Neutron",
                "Neutron",

            ),
            Question(
                "¿Cuál es el nombre del primer elemento de la tabla períódica? ",
                "oxígeno",
                "helio",
                "Hidrógeno",
                "Hidrógeno"
            ),
            Question(
                "¿Cuántas leyes de física propuso Isaac Newton? ",
                "3 leyes",
                "1 ley",
                "10 leyes",
                "3 leyes"
            ),
            Question(
                "¿Cuántas leyes de física propuso Isaac Newton? ",
                "3 leyes",
                "1 ley",
                "10 leyes",
                "3 leyes"
            ),
            Question(
                "¿¿Cuál es el símbolo químico del dióxido de cárbono?? ",
                " CO2",
                "C2O",
                "H2O",
                "CO2"
            ),
        )
    }
    fun getQuestionLiteratura():ArrayList<Question>{
        return arrayListOf(
            Question(
                "¿Quién de estos personajes ha ganado un premio Nobel de Literatura?",
                "Rigoberta Menchú",
                "Miguel Ángel Asturias",
                "Héctor Gaitán",
                "Miguel Ángel Asturias"
            ),
            Question(
                "¿Cuál de estas obras fue fue escrita por Virgilio Rodríguez Macal?",
                "Los arboles Mueren de pie ",
                "Carazamba",
                "x",
                "Hidroeléctrica"
            ),
            Question(
                "¿Cuántos volúmenes hay de la obra La Calle Donde tu vives? ",
                "5",
                "7",
                "18",
                "7"
            ),
            Question(
                "¿Quién es el presidente del cual se basa Miguel Angel Asturias en su obra  Sr Presidente ",
                "Jacobo Arbenz",
                "Manuel Estrada Cabrera",
                "Jorge Ubico",
                "Manuel Estrada Cabrera"
            ),
            Question(
                "¿Cuál es el libro  que describe el origen del nmundo según los mayas? ",
                "La biblia",
                "Códice Maya",
                "Popol Vuh",
                "Popol Vuh"
            ),
        )
    }
}