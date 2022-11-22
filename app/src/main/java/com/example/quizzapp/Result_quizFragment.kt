package com.example.quizzapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.google.android.youtube.player.YouTubeStandalonePlayer


/**
 * A simple [Fragment] subclass.
 * Use the [Result_quizFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Result_quizFragment : Fragment() {
    lateinit var btGoHome: Button
    lateinit var tvResult: TextView
    lateinit var imagePlay: ImageButton
    val API_KEY="AIzaSyB-cZvbNkaNHbaouMtpgbwomkUimD_5ui8"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result_quiz, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvResult =  view.findViewById(R.id.tvResult)
        tvResult.text = requireArguments().getInt("result").toString()
        btGoHome =  view.findViewById(R.id.btGoHome)
        imagePlay=view.findViewById(R.id.imageButton_play)
        btGoHome.setOnClickListener {
            findNavController().navigate(R.id.action_result_quizFragment_to_menuFragment)
        }
        imagePlay.setOnClickListener {
            val intent = YouTubeStandalonePlayer.createVideoIntent(requireActivity(), API_KEY, "yWr8ZBefKzc")
            startActivity(intent)
        }

    }


}