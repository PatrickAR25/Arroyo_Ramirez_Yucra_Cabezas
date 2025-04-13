package pa2.conti.arroyo_ramirez_yucra_cabezas_pa2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListaProductos extends AppCompatActivity {

    private Button buttSalirLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);

        buttSalirLista = findViewById(R.id.buttSalirLista);

        buttSalirLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaProductos.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}