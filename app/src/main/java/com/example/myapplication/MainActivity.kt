package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Layout setup
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        // Title
        val title = TextView(this)
        title.text = "📝 Eren's Note App"
        layout.addView(title, params)

        // Input field
        val inputNote = EditText(this)
        inputNote.hint = "Type your note here"
        layout.addView(inputNote, params)

        // Save button
        val saveButton = Button(this)
        saveButton.text = "Save Note"
        layout.addView(saveButton, params)

        // Response text
        val status = TextView(this)
        layout.addView(status, params)

        // Button action
        saveButton.setOnClickListener {
            val note = inputNote.text.toString()
            if (note.isNotBlank()) {
                status.text = "✅ Note saved: $note"
                inputNote.setText("")
            } else {
                status.text = "❌ Please type something!"
            }
        }

        setContentView(layout)
    }
}
