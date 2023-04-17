package com.example.projetopager;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentoUm#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class FragmentoUm extends Fragment {
    Button um, dois, tres, quatro, cinco, seis, sete, oito, nove, zero, soma, subtracao, divisao, multiplicacao, igual, rmv, c;
    EditText campo;
    TextView resultado;
    double campoValor, valorAtual;
    double operacaoParteUm = 0.00;
    double operacaoParteDois = 0.00;
    String tipoOperacao = "";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentoUm.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentoUm newInstance(String param1, String param2) {
        FragmentoUm fragment = new FragmentoUm();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentoUm() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragmento_um, container, false);
        um = v.findViewById(R.id.um);
        dois = v.findViewById(R.id.dois);
        tres = v.findViewById(R.id.tres);
        quatro = v.findViewById(R.id.quatro);
        cinco = v.findViewById(R.id.cinco);
        seis = v.findViewById(R.id.seis);
        sete = v.findViewById(R.id.sete);
        oito = v.findViewById(R.id.oito);
        nove = v.findViewById(R.id.nove);
        zero = v.findViewById(R.id.zero);

        subtracao = v.findViewById(R.id.subtracao);
        soma = v.findViewById(R.id.soma);
        divisao = v.findViewById(R.id.divisao);
        sete = v.findViewById(R.id.sete);
        multiplicacao = v.findViewById(R.id.multiplicacao);
        igual = v.findViewById(R.id.igual);
        campo = v.findViewById(R.id.campo);
        resultado = v.findViewById(R.id.resultado);
        c = v.findViewById(R.id.c);
        rmv = v.findViewById(R.id.rmv);

        zero.setOnClickListener(click ->{
            zero();
        });

        um.setOnClickListener(click ->{
            um();
        });

        dois.setOnClickListener(click ->{
            dois();
        });

        tres.setOnClickListener(click ->{
            tres();
        });

        quatro.setOnClickListener(click ->{
            quatro();
        });

        cinco.setOnClickListener(click ->{
            cinco();
        });

        seis.setOnClickListener(click ->{
            seis();
        });

        sete.setOnClickListener(click ->{
            sete();
        });

        oito.setOnClickListener(click ->{
            oito();
        });

        nove.setOnClickListener(click ->{
            nove();
        });
/************************************************************************************************************************************************************************************/

        soma.setOnClickListener(click ->{
            soma();
        });

        subtracao.setOnClickListener(click ->{
            subtracao();
        });

        multiplicacao.setOnClickListener(click ->{
            multiplicacao();
        });

        divisao.setOnClickListener(click ->{
            divisao();
        });

        rmv.setOnClickListener(click ->{
            removecaractere();
        });

        c.setOnClickListener(click ->{
            c();
        });

        igual.setOnClickListener(click ->{
            igual();
        });

        return v;
    }

    public void um(){
        int numero = 1;
        String numeroString = String.valueOf(numero);
        campo.setText(campo.getText().toString() + numeroString);
    }

    public void dois(){
        int numero = 2;
        String numeroString = String.valueOf(numero);
        campo.setText(campo.getText().toString() + numeroString);
    }

    public void tres(){
        int numero = 3;
        String numeroString = String.valueOf(numero);
        campo.setText(campo.getText().toString() + numeroString);
    }

    public void quatro(){
        int numero = 4;
        String numeroString = String.valueOf(numero);
        campo.setText(campo.getText().toString() + numeroString);
    }

    public void cinco(){
        int numero = 5;
        String numeroString = String.valueOf(numero);
        campo.setText(campo.getText().toString() + numeroString);
    }

    public void seis(){
        int numero = 6;
        String numeroString = String.valueOf(numero);
        campo.setText(campo.getText().toString() + numeroString);
    }

    public void sete(){
        int numero = 7;
        String numeroString = String.valueOf(numero);
        campo.setText(campo.getText().toString() + numeroString);
    }

    public void oito(){
        int numero = 8;
        String numeroString = String.valueOf(numero);
        campo.setText(campo.getText().toString() + numeroString);
    }

    public void nove(){
        int numero = 9;
        String numeroString = String.valueOf(numero);
        campo.setText(campo.getText().toString() + numeroString);
    }

    public void zero(){
        int numero = 0;
        String numeroString = String.valueOf(numero);
        campo.setText(campo.getText().toString() + numeroString);
    }

    public void pegaValor(){
        valorAtual = Double.parseDouble(campo.getText().toString());
        campo.setText("");
    }

    public void soma(){
        pegaValor();
        operacaoParteUm = valorAtual;
        tipoOperacao = "soma";
        campo.setText("");
    }

    public void subtracao(){
        pegaValor();
        operacaoParteUm = valorAtual;
        tipoOperacao = "subtracao";
        campo.setText("");
    }

    public void multiplicacao(){
        pegaValor();
        operacaoParteUm = valorAtual;
        tipoOperacao = "multiplicacao";
        campo.setText("");
    }

    public void divisao(){
        pegaValor();
        operacaoParteUm = valorAtual;
        tipoOperacao = "divisao";
        campo.setText("");
    }

    public void c(){
        campo.setText("");
    }

    public void removecaractere(){
        int posicaoFinal = campo.length();
        int posicaoInicial = posicaoFinal - 1;
        if(posicaoInicial >= 0){
            Editable textoEditavel = campo.getText();
            textoEditavel.delete(posicaoInicial, posicaoFinal);
        }
    }

    public void igual(){
        if(operacaoParteUm > 0){
            pegaValor();
            operacaoParteDois = valorAtual;
        }
        double tempResult = 0.00;
        switch (tipoOperacao){
            case "soma":
                tempResult = operacaoParteUm + operacaoParteDois;
                resultado.setText(String.valueOf(tempResult));
                campo.setText(String.valueOf(tempResult));
                valorAtual = tempResult;
                operacaoParteUm = tempResult;
                break;
            case "subtracao":
                tempResult = operacaoParteUm - operacaoParteDois;
                resultado.setText(String.valueOf(tempResult));
                campo.setText(String.valueOf(tempResult));
                valorAtual = tempResult;
                operacaoParteUm = tempResult;
                break;
            case "multiplicacao":
                tempResult = operacaoParteUm * operacaoParteDois;
                resultado.setText(String.valueOf(tempResult));
                campo.setText(String.valueOf(tempResult));
                valorAtual = tempResult;
                operacaoParteUm = tempResult;
                break;
            case "divisao":
                tempResult = operacaoParteUm / operacaoParteDois;
                resultado.setText(String.valueOf(tempResult));
                campo.setText(String.valueOf(tempResult));
                valorAtual = tempResult;
                operacaoParteUm = tempResult;
                break;

            default:
                operacaoParteUm = 0;
                operacaoParteDois = 0;
                valorAtual = 0;
                campo.setText("");
        }

    }
}