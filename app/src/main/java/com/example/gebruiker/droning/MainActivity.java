package com.example.gebruiker.droning;


        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

// testcomment
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toMaintenanceLog(View view)
    {
        Intent intent = new Intent(MainActivity.this, MaintenanceLog.class);
        startActivity(intent);
    }

}
