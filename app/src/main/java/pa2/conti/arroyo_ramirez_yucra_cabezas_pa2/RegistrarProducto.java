package pa2.conti.arroyo_ramirez_yucra_cabezas_pa2;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrarProducto extends AppCompatActivity {

    private Button buttTipoEvaluacion, buttTipoEntrega;
    private Button buttRegistrarproductoAcademico, buttCancelarRegistroProductoAcademico;
    private EditText editTextAsignatura, editFechaHora, editTextTema, editDetallesImportantes;
    private EditText editCorreoDocente, editNombreDocente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registrar_producto);

        buttTipoEvaluacion = findViewById(R.id.buttTipoEvaluacion);
        buttTipoEntrega = findViewById(R.id.buttTipoEntrega);
        editTextAsignatura = findViewById(R.id.editTextAsignatura);
        editFechaHora = findViewById(R.id.editFechaHora);
        editTextTema = findViewById(R.id.editTextTema);
        editDetallesImportantes = findViewById(R.id.editDetallesImportantes);
        editCorreoDocente = findViewById(R.id.editCorreoDocente);
        editNombreDocente = findViewById(R.id.editNombreDocente);
        buttRegistrarproductoAcademico = findViewById(R.id.buttRegistrarproductoAcademico);
        buttCancelarRegistroProductoAcademico = findViewById(R.id.buttCancelarRegistroProductoAcademico);

        buttRegistrarproductoAcademico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String asignatura = editTextAsignatura.getText().toString().trim();
                String fechahora = editFechaHora.getText().toString().trim();
                String tema = editTextTema.getText().toString().trim();
                String detallesimportantes = editDetallesImportantes.getText().toString().trim();
                String correodocente = editCorreoDocente.getText().toString().trim();
                String nombredocente = editNombreDocente.getText().toString().trim();
                String tipoevaluacion = buttTipoEvaluacion.getText().toString().trim();
                String tipoentrega = buttTipoEntrega.getText().toString().trim();


                if(asignatura.isEmpty() || fechahora.isEmpty() || tema.isEmpty() || detallesimportantes.isEmpty()
                || nombredocente.isEmpty() || correodocente.isEmpty() || tipoevaluacion.equals("Seleccione tipo de evaluacion")
                        || tipoentrega.equals("Selecciona tipo de entrega")){
                    Toast.makeText(RegistrarProducto.this, "Campos vacios, porfavor ingrese los datos correspondientes!!", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(RegistrarProducto.this, "¡Productos academicos registrados con éxito!", Toast.LENGTH_SHORT).show();

                editTextAsignatura.setText("");
                editFechaHora.setText("");
                editTextTema.setText("");
                editDetallesImportantes.setText("");
                editCorreoDocente.setText("");
                editNombreDocente.setText("");
                buttTipoEvaluacion.setText("Seleccione tipo de evaluacion");
                buttTipoEntrega.setText("Selecciona tipo de entrega");

                new AlertDialog.Builder(RegistrarProducto.this)
                        .setTitle("¿Deseas registrar otro producto académico?")
                        .setPositiveButton("Sí", (dialog, which) -> {
                        })
                        .setNegativeButton("No", (dialog, which) -> {
                            Intent intent = new Intent(RegistrarProducto.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        })
                        .show();
            }
        });

        buttCancelarRegistroProductoAcademico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrarProducto.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });



        Button btnTipoEvaluacion = findViewById(R.id.buttTipoEvaluacion);
        btnTipoEvaluacion.setOnClickListener(v -> {
            String[] opciones = {"PA1", "PA2", "PA3", "PA4"};
            new AlertDialog.Builder(this)
                    .setTitle("Selecciona el tipo de evaluación")
                    .setItems(opciones, (dialog, which) -> {
                        btnTipoEvaluacion.setText(opciones[which]);
                    })
                    .show();
        });

        Button btnTipoEntrega = findViewById(R.id.buttTipoEntrega);
        btnTipoEntrega.setOnClickListener(v -> {
            String[] opciones = {"Entrega de Documento", "Evaluación de desarrollo"};
            new AlertDialog.Builder(this)
                    .setTitle("Selecciona el tipo de entrega")
                    .setItems(opciones, (dialog, which) -> {
                        btnTipoEntrega.setText(opciones[which]);
                    })
                    .show();
        });
    }
}
