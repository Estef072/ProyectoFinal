package com.example.quizzapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass.
 * Use the [Quiz2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Quiz2Fragment : Fragment(), View.OnClickListener {
    lateinit var tvCount: TextView
    lateinit var tvQuestion: TextView
    lateinit var btoption1: Button
    lateinit var btoption2: Button
    lateinit var btoption3: Button

    var currentQuestionIndex = 0
    val listOfQuestion = QuizHandler_history.getQuestionCiencia()

    lateinit var currentQuestion: Question
    var score = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvQuestion = view.findViewById(R.id.text_preguntas)
        btoption1 = view.findViewById(R.id.button)
        btoption2 = view.findViewById(R.id.button2)
        btoption3 = view.findViewById(R.id.button3)

        btoption1.setOnClickListener(this)
        btoption2.setOnClickListener(this)
        btoption3.setOnClickListener(this)

        displayQuestion()


    }

    fun displayQuestion() {
        if (currentQuestionIndex >= listOfQuestion.size) {
            //navigate to results
            val bundle = Bundle()
            bundle.putInt("result", score)
            findNavController().navigate(R.id.action_quiz2Fragment_to_result_quizFragment, bundle)
            return
        }
        currentQuestion = listOfQuestion[currentQuestionIndex++]
        tvQuestion.text = currentQuestion.question
        btoption1.text = currentQuestion.opcion1
        btoption2.text = currentQuestion.opcion2
        btoption3.text = currentQuestion.opcion3

    }

    override fun onClick(v: View?) {
        //compare results
        val selectedOption = when (v?.id) {
            R.id.button -> currentQuestion.opcion1
            R.id.button2 -> currentQuestion.opcion2
            else -> currentQuestion.opcion3
        }

        if (selectedOption.equals(currentQuestion.answer)) {
            score++
        }
        displayQuestion()
    }
}