package com.example.seguimiento_kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vinculamos los elementos de la UI con el código
        val usernameInput = findViewById<EditText>(R.id.username)
        val passwordInput = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.login_button)
        val forgotPassword = findViewById<TextView>(R.id.forgot_password)

        // Evento click para el botón de login
        loginButton.setOnClickListener {
            val username = usernameInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor, completa ambos campos", Toast.LENGTH_SHORT).show()
            } else {
                // Lógica para manejar el inicio de sesión
                Toast.makeText(this, "Iniciando sesión...", Toast.LENGTH_SHORT).show()
            }
        }

        // Evento click para '¿Olvidaste tu contraseña?'
        forgotPassword.setOnClickListener {
            Toast.makeText(this, "Recuperar contraseña", Toast.LENGTH_SHORT).show()
            // Lógica para recuperar contraseña
        }
    }
}
