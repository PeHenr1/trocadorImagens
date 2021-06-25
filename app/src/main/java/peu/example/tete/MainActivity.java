package peu.example.tete;
//FEITO POR BEATRIZ CALDEIRA E PEDRO HENRIQUE AISSA
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button btnKirishima;
    private Button btnOkumura;
    private Button btnSukuna;
    private ImageView imgEscudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // coisas basicas ja colocadas pelo andoid studio
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ligar os atributos com os IDs dos objetos
        // ao gráfico da interface)ome = findViewById(R.id.nome);
        imgEscudo = findViewById(R.id.imgEscudo);
        btnKirishima = findViewById(R.id.btnKirishima);
        btnOkumura = findViewById(R.id.btnOkumura);
        btnSukuna = findViewById(R.id.btnSukuna);

        EscutadorBotao eb = new EscutadorBotao();
        btnKirishima.setOnClickListener(eb);
        btnOkumura.setOnClickListener(eb);
        btnSukuna.setOnClickListener(eb);

    }

    private class EscutadorBotao implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Button b = (Button) view;
            switch (b.getId()){
                case R.id.btnKirishima:
                    imgEscudo.setImageResource(R.drawable.kiri);
                    break;
                case  R.id.btnOkumura:
                    imgEscudo.setImageResource(R.drawable.okumura);
                    break;
                case R.id.btnSukuna:
                    imgEscudo.setImageResource(R.drawable.sukunaicon);
                    break;
            }
        }
    }


}