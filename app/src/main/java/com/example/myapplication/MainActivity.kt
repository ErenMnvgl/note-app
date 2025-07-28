package com.example.myapplication
package com.example.myapplication


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
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

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Root layout
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(40, 40, 40, 40)

        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        // 2. Title
        val title = TextView(this)
        title.text = "📝 Eren's Notes"
        title.textSize = 24f
        layout.addView(title, params)

        // 3. Note input
        val noteInput = EditText(this)
        noteInput.hint = "Type your note here..."
        layout.addView(noteInput, params)

        // 4. Add button
        val addButton = Button(this)
        addButton.text = "Add Note"
        layout.addView(addButton, params)

        // 5. Status text
        val statusText = TextView(this)
        layout.addView(statusText, params)

        // 6. Notes area (for now just shows latest note)
        val notesView = TextView(this)
        notesView.text = "🗒️ Your notes will appear here."
        layout.addView(notesView, params)

        // 7. Button action
        addButton.setOnClickListener {
            val note = noteInput.text.toString()
            if (note.isNotBlank()) {
                statusText.text = "✅ Note saved!"
                notesView.text = "🗒️ $note"
                noteInput.setText("")
            } else {
                statusText.text = "❌ Please type something!"
            }
        }

        setContentView(layout)
    }
}
