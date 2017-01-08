package es.vlc_logic.chipremotelcd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pantallaParis(View view){
        Intent intent = new Intent(this, SendMessageActivity.class);
        startActivity(intent);
    }
}
