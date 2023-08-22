package giovanna2005.ativ_2208;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProdutoActivity extends AppCompatActivity {//Feito por: Giovanna SC3017109
    private TextView txtNome;
    private TextView txtMarca;
    private TextView txtQuantidade;
    private Button btnInserir;
    private Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
        txtNome = findViewById(R.id.txtNome);
        txtMarca = findViewById(R.id.txtMarca);
        txtQuantidade = findViewById(R.id.txtQuantidade);
        btnInserir = findViewById(R.id.btnInserir);
        btnCancelar = findViewById(R.id.btnCancelar);
        btnListener btnListener = new btnListener();
        btnInserir.setOnClickListener(btnListener);
        btnCancelar.setOnClickListener(btnListener);
    }

    private class btnListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Button botao = (Button) view;
            if (botao.getId() == R.id.btnInserir) {
                String nome = txtNome.getText().toString();
                String marca = txtMarca.getText().toString();
                String quantidade = txtQuantidade.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("nome", nome);
                intent.putExtra("marca", marca);
                intent.putExtra("quantidade", quantidade);
                setResult(RESULT_OK, intent);
                finish();
            }else if (botao.getId() == R.id.btnCancelar) {
                setResult(RESULT_CANCELED);
                    finish();
            }
        }
    }
}
