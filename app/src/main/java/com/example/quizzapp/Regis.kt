package com.example.quizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import com.example.quizzapp.databinding.ActivityRegisBinding




class Regis : AppCompatActivity(), View.OnClickListener, View.OnFocusChangeListener, View.OnKeyListener{
    private lateinit var  mBinding: ActivityRegisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityRegisBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)
        mBinding .fullNameEt.onFocusChangeListener = this
        mBinding.emailEt.onFocusChangeListener = this
        mBinding.passwordEt.onFocusChangeListener = this
        mBinding.cPasswordEt.onFocusChangeListener =this

    }
    private fun validateName (): Boolean{
        var errorMessage: String? = null
        val value: String = mBinding.fullNameEt.text.toString()
        if (value.isEmpty()){
            errorMessage = "Full Name is required"
        }
        if(errorMessage !=null){
            mBinding.fullNameTil.apply {
                isErrorEnabled = true
                errorMessage= errorMessage
            }

        }
        return errorMessage == null

    }
    private fun validateEmail (): Boolean {
        var errorMessage: String? = null
        val value: String = mBinding.emailEt.text.toString()
        if (value.isEmpty()) {
            errorMessage = "Email is required"
        } else if (Patterns.EMAIL_ADDRESS.matcher(value).matches()){
            errorMessage = "Email adrres is invalid"
        }
        if(errorMessage !=null){
            mBinding.emailTil.apply {
                isErrorEnabled = true
                errorMessage= errorMessage
            }

        }
        return errorMessage == null

    }

    private fun validatePassword (): Boolean {
        var errorMessage: String? = null
        val value: String = mBinding.passwordEt.text.toString()
        if (value.isEmpty()) {
            errorMessage = "Password is required"
        } else if (value.length <6 ){
            errorMessage = "Password must be 6 characters long"
        }
        if(errorMessage !=null){
            mBinding.passwordTil.apply {
                isErrorEnabled = true
                errorMessage = errorMessage
            }
        }
        return errorMessage == null

    }
    private fun validateConfirmPassword (): Boolean {
        var errorMessage: String? = null
        val value: String = mBinding.cPasswordEt.text.toString()
        if (value.isEmpty()) {
            errorMessage = "Confirm password is required"
        } else if (value.length <6 ){
            errorMessage = "Confirm Password must be 6 characters long"
        }
        if(errorMessage !=null) {
            mBinding.cPasswordTil.apply {
                isErrorEnabled = true
                errorMessage = errorMessage
            }
        }
        return errorMessage == null

    }
    private fun validatePasswordAndConfirmPassword(): Boolean{
        var errorMessage: String?= null
        val password: String = mBinding.passwordEt.text.toString()
        val confirmPassword = mBinding.cPasswordEt.text.toString()
        if(password != confirmPassword){
            errorMessage =" Confirm password doesn´t match with password"

        }
        if(errorMessage !=null) {
            mBinding.cPasswordTil.apply {
                isErrorEnabled = true
                errorMessage = errorMessage
            }
        }
        return errorMessage == null

    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

    override fun onFocusChange(view:View?, hasFocus: Boolean) {
       if(view !=null){
           when(view.id){
               R.id.fullNameEt ->{
                   if (hasFocus){
                       if(mBinding.fullNameTil.isCounterEnabled){
                           mBinding.fullNameTil.isCounterEnabled = false
                       }

                   }else{
                       validateName()
                   }
               }
               R.id.emailEt ->{
                   if (hasFocus){
                       if(mBinding.emailTil.isCounterEnabled){
                           mBinding.emailTil.isCounterEnabled = false
                       }
                   }else{
                       validateEmail()
                   }
               }
               R.id.passwordEt ->{
                   if (hasFocus){
                       if(mBinding.passwordTil.isCounterEnabled){
                           mBinding.passwordTil.isCounterEnabled = false
                       }

                   }else{
                       validatePassword()
                   }
               }
               R.id.cPasswordEt ->{
                   if (hasFocus){
                       if(mBinding.cPasswordTil.isCounterEnabled){
                           mBinding.cPasswordTil.isCounterEnabled = false
                       }

                   }else{
                       validateConfirmPassword()
                   }
               }
           }

       }
    }

    override fun onKey(view: View?, event: Int, keyEvent: KeyEvent?): Boolean {
        return false
    }
}
