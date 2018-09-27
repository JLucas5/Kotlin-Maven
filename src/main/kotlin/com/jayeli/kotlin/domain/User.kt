package com.jayeli.kotlin.domain

class User (val name: String){

    var id: Int = 0

    constructor(name: String, id: Int): this(name){
        this.id = id
    }
}


