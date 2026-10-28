package com.example.myapp

import android.R
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// Make sure this matches your actual package name

class MainActivity : AppCompatActivity() {
    // Declare UI Elements
    private var etEmail: EditText? = null
    private var etPassword: EditText? = null
    private var btnLogin: Button? = null
    private var tvRegister: TextView? = null
    private var tvForgotPassword: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Connects to the XML layout

        // Initialize UI Elements
        etEmail = findViewById<EditText?>(R.id.etEmail)
        etPassword = findViewById<EditText?>(R.id.etPassword)
        btnLogin = findViewById<Button?>(R.id.btnLogin)
        tvRegister = findViewById<TextView?>(R.id.tvRegister)
        tvForgotPassword = findViewById<TextView?>(R.id.tvForgotPassword)

        // Handle Login Button Click
        btnLogin!!.setOnClickListener(View.OnClickListener { v: View? ->
            val email = etEmail!!.getText().toString().trim { it <= ' ' }
            val password = etPassword!!.getText().toString().trim { it <= ' ' }

            // Input Validation
            if (email.isEmpty()) {
                etEmail!!.setError("Email is required")
                etEmail!!.requestFocus()
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                etEmail!!.setError("Please enter a valid email")
                etEmail!!.requestFocus()
            } else if (password.isEmpty()) {
                etPassword!!.setError("Password is required")
                etPassword!!.requestFocus()
            } else if (password.length < 6) {
                etPassword!!.setError("Password must be at least 6 characters")
                etPassword!!.requestFocus()
            } else {
                // Simulated Authentication Success
                Toast.makeText(this@MainActivity, "Login Successful!", Toast.LENGTH_SHORT).show()


                // Explicit Intent to navigate to Dashboard Activity
                // Note: You must create DashboardActivity.java for this to resolve
                val intent: Intent = Intent(this@MainActivity, DashboardActivity::class.java)
                startActivity(intent)
                finish() // Closes the login screen so user can't go back to it
            }
        })

        // Handle Register Link Click
        tvRegister!!.setOnClickListener(View.OnClickListener { v: View? ->
            // Navigate to Register Screen
            val intent: Intent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(intent)
        })

        // Handle Forgot Password Link Click
        tvForgotPassword!!.setOnClickListener(View.OnClickListener { v: View? ->
            Toast.makeText(
                this@MainActivity,
                "Redirecting to password recovery...",
                Toast.LENGTH_SHORT
            ).show()
        })
    }
}