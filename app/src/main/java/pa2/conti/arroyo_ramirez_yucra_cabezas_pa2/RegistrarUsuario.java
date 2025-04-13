package pa2.conti.arroyo_ramirez_yucra_cabezas_pa2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Toast;


public class RegistrarUsuario extends AppCompatActivity {

    private Button buttCancelarRegistrarUsuario;
    private Button buttRegistrarNuevoUsuario;
    private EditText editTextUsuario, editTextTelefono, editTextCorreo;
    private EditText editTextPassword, editTextPasswordConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        buttCancelarRegistrarUsuario = findViewById(R.id.buttCancelarRegistrarUsuario);
        buttRegistrarNuevoUsuario = findViewById(R.id.buttRegistrarNuevoUsuario);
        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextTelefono = findViewById(R.id.editTextTelefono);
        editTextCorreo = findViewById(R.id.editTextCorreo);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextPasswordConfirm = findViewById(R.id.editTextPasswordConfirm);


        buttRegistrarNuevoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editTextUsuario.getText().toString().trim();
                String telefono = editTextTelefono.getText().toString().trim();
                String correo = editTextCorreo.getText().toString().trim();
                String password = editTextPassword.getText().toString();
                String passwordConfirm = editTextPasswordConfirm.getText().toString();

                if (usuario.isEmpty() || telefono.isEmpty() || correo.isEmpty()
                        || password.isEmpty() || passwordConfirm.isEmpty()) {
                    Toast.makeText(RegistrarUsuario.this, "Por favor completa todos los campos.", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!password.equals(passwordConfirm)) {
                    Toast.makeText(RegistrarUsuario.this, "Las contraseñas no coinciden.", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(RegistrarUsuario.this, "¡Usuario registrado con éxito!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(RegistrarUsuario.this, InterfazLogin.class);
                startActivity(intent);
                finish();
            }
        });

        buttCancelarRegistrarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrarUsuario.this, InterfazLogin.class);
                startActivity(intent);
                finish();
            }
        });

    }
}