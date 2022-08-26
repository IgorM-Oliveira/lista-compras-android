package com.software.listadecompra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textProduto = findViewById(R.id.textProduto);
        EditText textMarca = findViewById(R.id.textMarca);
        EditText textQuantidade = findViewById(R.id.textQuantidade);
        Button botaoSalvar = findViewById(R.id.btnSalvar);
        ListView listaProdutos = findViewById(R.id.listaProdutos);
        List<Produto> dadosProdutos = new ArrayList<>();

        ArrayAdapter adapter;
        adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, dadosProdutos);

        listaProdutos.setAdapter(adapter);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Produto produto = new Produto();

                produto.setNome(textProduto.getText().toString());
                produto.setMarca(textMarca.getText().toString());
                produto.setQuantidade(Integer.parseInt(textQuantidade.getText().toString()));

                dadosProdutos.add(produto);
                adapter.notifyDataSetChanged();

                Toast.makeText(MainActivity.this, "Salvo com Sucesso!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}