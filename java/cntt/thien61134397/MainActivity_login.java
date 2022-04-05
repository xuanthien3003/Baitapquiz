package cntt.thien61134397;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_login extends AppCompatActivity {
    private Button button;
    private EditText editText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // gọi biến vào id btn bên giao diện id =/btnOK
        button = findViewById(R.id.btnOK);
        editText = findViewById(R.id.edtUserName);

        button.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                String data = editText.getText().toString();
                // Chuyen qua activity_login( Giao dien dangnhap)
                Intent intent = new Intent(MainActivity_login.this, MainActivity_home.class);
                intent.putExtra("data",data);
                startActivity(intent);
            }
        });
    }
}