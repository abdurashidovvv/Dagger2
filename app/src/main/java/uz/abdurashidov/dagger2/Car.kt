package uz.abdurashidov.dagger2

class Car {

    lateinit var wheels: Wheels
    lateinit var engine: Engine

    constructor(wheels: Wheels, engine: Engine){
        this.wheels=wheels
        this.engine=engine
    }

}