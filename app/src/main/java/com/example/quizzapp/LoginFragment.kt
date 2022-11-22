package com.example.quizzapp


import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.navigation.Navigation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.loginmvvm.ViewModelLogin.QuoteViewModel

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */


class LoginFragment : Fragment() {
    lateinit var buttonLogin: Button
    private lateinit var EmailText: EditText
    private lateinit var PasswordText: EditText

    private var confirmacion:Boolean=false
    private var emailModel:String=""
    private var passwordModel:String=""
    private var confirmUsuario=false
    private var confirmContra=false

    private val quoteViewModel: QuoteViewModel by viewModels()





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mlog, container, false)
    }

    override fun onViewCreated(view: View,saveInstanceState:Bundle?) {
        super.onViewCreated(view, saveInstanceState)
        buttonLogin = view.findViewById(R.id.button_loginmenu)

        EmailText=view.findViewById(R.id.editText_Login_Email)
        PasswordText=view.findViewById(R.id.editText_Login_Password)



        quoteViewModel.quoteModel.observe(viewLifecycleOwner, Observer{
            emailModel =it.email
            passwordModel=it.contrasena

            var EmailView=EmailText.getText()
            var PasswordView=PasswordText.getText()

            if(emailModel.equals(EmailView.toString())){
                if(passwordModel.equals(PasswordView.toString())){

                    confirmUsuario=true
                    confirmContra=true

                    Navigation.findNavController(view)
                        .navigate(R.id.action_loginFragment_to_menuFragment)


                }else{

                }
            }else{


            }


        })


        buttonLogin.setOnClickListener {
            //for( i in 0..2){
            quoteViewModel.randomQuote(0)
            //}


        }
        if(confirmUsuario==false){
            EmailText.setText("USUARIO INCORRECTO")
        }
        else{
            EmailText.setText("CONTRAEÑA INCORRECTA")
        }
    }



}