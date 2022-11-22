package com.example.quizzapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.quizzapp.databinding.FragmentInicioBinding


/**
 * A simple [Fragment] subclass.
 * Use the [InicioFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InicioFragment : Fragment() {
    lateinit var btnLogin: Button



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{

        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }
    override fun onViewCreated(view: View,saveInstanceState:Bundle?) {
        super.onViewCreated(view,saveInstanceState)
        btnLogin =view.findViewById(R.id.buttonLogin)


        btnLogin.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_inicioFragment_to_loginFragment)
        }

    }




}