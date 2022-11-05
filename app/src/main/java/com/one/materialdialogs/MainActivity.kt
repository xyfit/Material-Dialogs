package com.one.materialdialogs

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    lateinit var dialog: MaterialAlertDialogBuilder

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        findViewById<Button>(R.id.button).setOnClickListener {
            val view = layoutInflater.inflate(R.layout.dialog_ly, null)

            view.findViewById<Button>(R.id.button4).setOnClickListener {
                Toast.makeText(this, "OnClick", Toast.LENGTH_SHORT).show()
            }
            view.findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ic_launcher_foreground)


            dialog = MaterialAlertDialogBuilder(this, R.style.MayCustomDialogStyle)
                .setTitle("Dialog 1 title")
                .setMessage("Message bla bla bla")
                .setView(view)


                .setNeutralButton("Ok") { dialog, which ->
                    // Respond to neutral button press
                }
                .setNegativeButton("Decline") { dialog, which ->
                    dialog.dismiss()
                    // Respond to negative button press
                }
                .setPositiveButton("Cancel") { dialog, which ->
                    findViewById<TextView>(R.id.textView3).text = view.findViewById<EditText>(R.id.editId).text.toString()
                    // Respond to positive button press
                    dialog.dismiss()
                }
            dialog.show()
        }



        findViewById<Button>(R.id.button2).setOnClickListener {

        }
        findViewById<Button>(R.id.button3).setOnClickListener {

        }
    }

}

private fun dialog1(context: Context) {

}