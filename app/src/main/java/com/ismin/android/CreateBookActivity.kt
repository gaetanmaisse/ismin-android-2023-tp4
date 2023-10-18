package com.ismin.android

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

val CREATED_BOOK = "CREATED_BOOK"

class CreateBookActivity : AppCompatActivity() {


    private lateinit var edtIsbn: EditText;
    private lateinit var edtTitle: EditText;
    private lateinit var edtAuthor: EditText;
    private lateinit var edtDate: EditText;

    private lateinit var btnSave: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_book)

        edtIsbn = findViewById(R.id.a_create_book_edt_isbn)
        edtTitle = findViewById(R.id.a_create_book_edt_title)
        edtAuthor = findViewById(R.id.a_create_book_edt_author)
        edtDate = findViewById(R.id.a_create_book_edt_date)

        btnSave = findViewById(R.id.a_create_book_btn_save)
        btnSave.setOnClickListener {
            val isbn = edtIsbn.text.toString()
            val title = edtTitle.text.toString()
            val author = edtAuthor.text.toString()
            val date = edtDate.text.toString()

            val book = Book(isbn, title, author, date)
            val intent = intent
            intent.putExtra(CREATED_BOOK, book)
            setResult(RESULT_OK, intent)
            finish()
        }

    }
}