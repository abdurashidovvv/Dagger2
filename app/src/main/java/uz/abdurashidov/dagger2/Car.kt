package uz.abdurashidov.dagger2

import android.util.Log
import javax.inject.Inject

class Car {

    private val TAG = "Car"

    lateinit var wheels: Wheels
    lateinit var engine: Engine

    @Inject
    constructor(wheels: Wheels, engine: Engine){
        this.wheels=wheels
        this.engine=engine
    }

    fun start(){
        Log.d(TAG, "Car is driving.....")
    }

}