package br.edu.utfpr.trocatelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LancamentoActivity : AppCompatActivity() {
    private lateinit var etCodigo : EditText
    private lateinit var etQtd : EditText
    private lateinit var etValor : EditText

    private lateinit var btConfirmar : Button
    private lateinit var btListar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lancamento)

        etValor = findViewById(R.id.etValor)
        etQtd = findViewById(R.id.etQtd)
        etCodigo = findViewById(R.id.etCod)

        btListar = findViewById(R.id.btListar)
        btConfirmar = findViewById(R.id.btConfirmar)

        btConfirmar.setOnClickListener{
            btConfirmarOnClick()
        }

        btListar.setOnClickListener{
            btListarOnClick()
        }
    }

    private fun btListarOnClick() {
        TODO("Not yet implemented")
    }

    private fun btConfirmarOnClick() {
        val intent = Intent(this, ConfirmarActivity::class.java)
        intent.putExtra("cod", etCodigo.text.toString())
        intent.putExtra("qtd", etQtd.text.toString())
        intent.putExtra("valor", etValor.text.toString())
        startActivity(intent)
    }
}