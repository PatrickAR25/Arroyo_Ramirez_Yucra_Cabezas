package pa2.conti.arroyo_ramirez_yucra_cabezas_pa2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InterfazLogin extends AppCompatActivity {

    private Button buttLoginInicioSesion;
    private Button buttRegistrarNuevoUsuario;
    private EditText editTextUsuario, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_login);

        buttLoginInicioSesion = findViewById(R.id.buttLoginInicioSesion);
        buttRegistrarNuevoUsuario = findViewById(R.id.buttRegistrarNuevoUsuario);
        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextPassword = findViewById(R.id.editTextPassword);

        buttLoginInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editTextUsuario.getText().toString().trim();
                String password = editTextPassword.getText().toString();

                if(usuario.isEmpty() || password.isEmpty()){
                    Toast.makeText(InterfazLogin.this, "Por favor completa todos los campos.", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(InterfazLogin.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        buttRegistrarNuevoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InterfazLogin.this, RegistrarUsuario.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
