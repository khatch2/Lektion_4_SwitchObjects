package com.example.lektion_4_switchobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.core.view.isVisible
import com.example.lektion_4_switchobjects.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding   // Initialize Binding
    /* TODO - Fetch from OTHER activities? */
    /* Expecting binder but got null! */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Finalize ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater) // Setup View
        setContentView(binding.root)

        // Initialize Components
        val swRememberMe = binding.switchRememberMe           // Switch
        val tvRememberMeGreeting = binding.textViewGreeting  // Textview
        val tvRememberMeState = binding.textViewState       // TextView

        // Initialize Student Objects
        val benny = Student("Benny", 15, true).apply {
            name = "Anton"
            age = 25
            isLate = false
        }

        val anton = Student()
        val frida = Student("Frida", 14, true)

        benny.sayHello()
        anton.sayHello()
        frida.sayHello()

        Student().sayHello()

        Student.grade = 'A'
        println()

        println(benny)

        val studentList = ArrayList<Student>(arrayListOf(
            Student("Example1 ", 15, true),
            Student("Example2 ", 35, true),
            Student("Example3 ", 45, true),
            Student("Example4 ", 55, true),
            Student("Example5 ", 65, true),
        ))

        var studentArray = arrayOf(
            Student("Ex1", 0, true)
        )
        println(studentArray[0])

        studentArray = arrayOf(Student("Ex2", 15, false), *studentArray)     // Spread Operator

        println(studentArray[0])
        println(studentArray[1])









        tvRememberMeState.isVisible = false                 // Hide Component

        swRememberMe.setOnClickListener() {

            tvRememberMeState.isVisible = swRememberMe.isChecked            // Set Visibility
            tvRememberMeGreeting.text = swRememberMe.isChecked.toString()   // Set Text
            // tvRememberMeGreeting.visibility = View.INVISIBLE             // Does NOT collapse components
        }

    }
}