package com.example.quizzapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.Navigation


/**
 * A simple [Fragment] subclass.
 * Use the [MenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuFragment : Fragment() {
    lateinit var btnhistory: ImageButton
    lateinit var btnciencia: ImageButton
    lateinit var btnliteratura: ImageButton




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }


    override fun onViewCreated(view: View,saveInstanceState:Bundle?) {
        super.onViewCreated(view,saveInstanceState)
        btnhistory =view.findViewById(R.id.image_history)
        btnciencia = view.findViewById(R.id.image_ciencia)
        btnliteratura = view.findViewById(R.id.imageliteratura)

        btnhistory.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_quizFragment)
        }
        btnciencia.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_quiz2Fragment)
        }

        btnliteratura.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_quiz3Fragment)
        }
    }


}