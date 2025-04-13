package pa2.conti.arroyo_ramirez_yucra_cabezas_pa2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BuscarProducto extends AppCompatActivity {

    private EditText editTextAsignatura;
    private Button buttBuscarAsignatura, buttSalirAsignatura;
    private ListView listViewResultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_producto);

        editTextAsignatura = findViewById(R.id.editTextAsignatura);
        buttBuscarAsignatura = findViewById(R.id.buttBuscarAsignatura);
        buttSalirAsignatura = findViewById(R.id.buttSalirAsignatura);
        listViewResultados = findViewById(R.id.listViewResultados);

        buttBuscarAsignatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String asignatura = editTextAsignatura.getText().toString().trim();

                if (asignatura.isEmpty()){
                    Toast.makeText(BuscarProducto.this, "Por favor ingrese asignatura a buscar", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });

        buttSalirAsignatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuscarProducto.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}