package com.xperts.glitenetwork.settings

import android.content.Context
import com.akexorcist.localizationactivity.ui.LocalizationActivity
import com.xperts.glitenetwork.utils.SharedPrefObj
import com.xperts.glitenetwork.utils.ConstantVariables

class AppLanguageObj:LocalizationActivity() {

    fun checkApp(context: Context){
        fun checkLang(context: Context){
            if (SharedPrefObj.getString(this, ConstantVariables.LANG_KEY)== ConstantVariables.ENGLISH){
                setLanguage("en")
            }else if (SharedPrefObj.getString(this, ConstantVariables.LANG_KEY)== ConstantVariables.HINDI){
                setLanguage("hi")
            }else{
                setLanguage("cop")
            }
        }
    }
}