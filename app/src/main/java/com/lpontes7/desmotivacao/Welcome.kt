package com.lpontes7.desmotivacao
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lpontes7.desmotivacao.util.Constants
import com.lpontes7.desmotivacao.util.Preferences
import kotlinx.android.synthetic.main.activity_welcome.*

class Welcome : AppCompatActivity(), View.OnClickListener {

    private lateinit var mPreferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        mPreferences = Preferences(this)
        buttonSave.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val id = view.id
        if (id==R.id.buttonSave){
            save()
        }
    }


    private fun save (){
        val name: String = editText.text.toString()
        mPreferences.storeString(Constants.Key.Name, name)
    }

}
