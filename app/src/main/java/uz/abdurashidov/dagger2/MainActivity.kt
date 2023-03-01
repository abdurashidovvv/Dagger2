package uz.abdurashidov.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var wheels=Wheels()
        var engine=Engine()

        var car=Car(wheels, engine)


    }
}

//this is injection