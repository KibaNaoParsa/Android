package com.example.alunos.ex02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alunos.ex02.R;

import java.lang.Object;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Vector;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Deque<String> pilha = new ArrayDeque<String>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void boxStack(View vi) {
        String tela = pilha.toString();
        System.out.println(tela);
    }


    public void empilhar(View vi) {
        EditText txt1 = (EditText) findViewById(R.id.edtNum);
        String valor = txt1.getText().toString();
        pilha.add(valor);
        boxStack(vi);
    }

    public void desempilhar(View vi) {
        pilha.pop();
        boxStack(vi);
    }

    public void somar(View vi) {
        // String v1 = pilha.pop();
        // String v2 = pilha.pop();

        int val1 = Integer.parseInt(pilha.pop());
        int val2 = Integer.parseInt(pilha.pop());

        val1 += val2;

        String valf = String.valueOf(val1);
        pilha.add(valf);
        boxStack(vi);
    }

    public void subtrair(View vi) {

        int val1 = Integer.parseInt(pilha.pop());
        int val2 = Integer.parseInt(pilha.pop());

        val1 -= val2;

        String valf = String.valueOf(val1);
        pilha.add(valf);
        boxStack(vi);
    }

    public void multiplicar(View vi) {

        int val1 = Integer.parseInt(pilha.pop());
        int val2 = Integer.parseInt(pilha.pop());

        val1 *= val2;

        String valf = String.valueOf(val1);
        pilha.add(valf);
        boxStack(vi);
    }

    public void dividir(View vi) {

        int val1 = Integer.parseInt(pilha.pop());
        int val2 = Integer.parseInt(pilha.pop());

        val1 /= val2;

        String valf = String.valueOf(val1);
        pilha.add(valf);
        boxStack(vi);
    }

}