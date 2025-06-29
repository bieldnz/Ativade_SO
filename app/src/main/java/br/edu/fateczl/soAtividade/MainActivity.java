package br.edu.fateczl.soAtividade;

import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import br.edu.fateczl.soAtividade.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivityMainBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

    }

    public void calcular(View view){
        EditText editValorA = findViewById(R.id.editValorA);
        double valorA = Double.parseDouble(editValorA.getText().toString());

        EditText editValorB = findViewById(R.id.editValorB);
        double valorB = Double.parseDouble(editValorB.getText().toString());

        EditText editValorC = findViewById(R.id.editValorC);
        double valorC = Double.parseDouble(editValorC.getText().toString());

        double delta = (valorB * valorB) - 4*valorA*valorC;
        
        double raiz1 = (-valorB + Math.sqrt(delta))/(2*valorA);
        double raiz2 = (-valorB - Math.sqrt(delta))/(2*valorA);

        TextView textRaiz1 = findViewById(R.id.raiz1);
        textRaiz1.setText(String.valueOf(raiz1));

        TextView textRaiz2 = findViewById(R.id.raiz2);
        textRaiz2.setText(String.valueOf(raiz2));
    }

}