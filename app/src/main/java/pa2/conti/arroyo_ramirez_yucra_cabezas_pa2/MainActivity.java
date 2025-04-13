package pa2.conti.arroyo_ramirez_yucra_cabezas_pa2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gestionpa, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_RegistrarProducto) {
            Intent intent = new Intent(this, RegistrarProducto.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.menu_BuscarProducto) {
            Intent intent = new Intent(this, BuscarProducto.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.menu_ListaProductos) {
            Intent intent = new Intent(this, ListaProductos.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.menu_SalirInicio) {
            Intent intent = new Intent(this, InterfazLogin.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}