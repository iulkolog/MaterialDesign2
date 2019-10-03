package yuliya.loginova.ru.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ThemeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppThemePurple);
        setContentView(R.layout.activity_main);

    }
}
