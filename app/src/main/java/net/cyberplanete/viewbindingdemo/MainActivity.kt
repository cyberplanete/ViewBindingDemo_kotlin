package net.cyberplanete.viewbindingdemo

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import net.cyberplanete.viewbindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var myBinding: ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        myBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(myBinding?.root)
        val adaptateur = AdaptateurPrincipal(TaskList.taskList)
        // Utilisation d'un adaptateur
        myBinding?.taskRv?.adapter = adaptateur
//        var linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        myBinding?.taskRv?.layoutManager = linearLayoutManager

        myBinding?.taskRv?.layoutManager
    }

    override fun onDestroy() {
        super.onDestroy()
        myBinding = null
    }
}