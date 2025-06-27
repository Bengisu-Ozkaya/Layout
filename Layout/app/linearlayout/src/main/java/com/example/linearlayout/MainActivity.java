package com.example.linearlayout;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    /*LINEAR LAYOUT
    * android:orientation="horizontal" bu "yatay" layout ver demek
    * android:orientation="vertical" ise "dikey" layout oluştur demektir
    * imageView altındaki [android:layout_width="match_parent"] kısım fotoğrafın genişlik olarak bütün ekranı kaplamasını söyler
    * Örnekti gibi bir görsel ve metni bu şekilde yerleştirmek için bu daha kullanışlı olabiliyor
    * margin komutu boşluk bırakmadır (Örneğin görsel ve metin arasında 25dp boşluk bırak)
    * metin için textSize da "sp" kullanılır
    * */
}