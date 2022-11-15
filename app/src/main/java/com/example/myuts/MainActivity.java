package com.example.myuts;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import java.sql.RowIdLifetime;

public class MainActivity extends AppCompatActivity {
    String Username="admin";
    String Password="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText txtUser=findViewById(R.id.txtUser);
        EditText txtPass=findViewById(R.id.txtPass);
        Button login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUser.getText().toString().equalsIgnoreCase(Username)&&txtPass.getText().toString().equalsIgnoreCase(Password)){
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                }else{
                    Toast.makeText(MainActivity.this, " User Name Atau Password Salah",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

