package com.example.visitingcard_adnan;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void openPhone(View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01797104929"));
        startActivity(intent);
    }

    public void openGmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:adnan.imtiaz3334@gmail.com"));
        startActivity(intent);
    }

    public void openFacebook(View view) {
        // Opens Facebook website
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/S.I.M.Adnan29"));
        startActivity(intent);
    }
    public void openGithub(View view) {
        // Opens GitHub website
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://github.com/Adnan-ju"));
        startActivity(intent);
    }

    public void openLinkedin(View view) {
        // Opens LinkedIn profile
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.linkedin.com/in/adnan-ju/"));
        startActivity(intent);
    }

}