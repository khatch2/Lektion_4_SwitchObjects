package com.example.lektion_4_switchobjects

// TODO -  Multiple optional params but with one definitive value
class Student(
     var name: String = "",
     var age: Int = 0,
     var isLate: Boolean = false) {

    // Anonymous Object - Within a class
    companion object Grade {
        var grade = 'B'

        fun printGrades() {
            println(grade)
        }

        override fun toString(): String {
            return "Student(name='$grade')"
        }
    }

    fun sayHello() {
        println("Hello there!")
    }


    override fun toString(): String {
        return "Student(name='$name', age=$age, isLate=$isLate)"
    }
}