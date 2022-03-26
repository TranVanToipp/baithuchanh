package com.example.bai52giangbai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvSanpham;
    ArrayList<Sanpham> arraySanpham;
    SanphamAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

        adapter = new SanphamAdapter(this,R.layout.sanpham_iterm,arraySanpham);
        lvSanpham.setAdapter(adapter);
    }

    private void Anhxa() {
        lvSanpham = (ListView) findViewById(R.id.listviewSanpham);
        arraySanpham = new ArrayList<>();
        arraySanpham.add(new Sanpham("Iphone 24","31 000 000", R.drawable.iphone22));
        arraySanpham.add(new Sanpham("Iphone 30 ", "32 000 000", R.drawable.iphone30));
        arraySanpham.add(new Sanpham("Iphone 32  ", "53 000 000", R.drawable.iphone32));
        arraySanpham.add(new Sanpham("Iphone 22", "100 000 000", R.drawable.maycu14));
    }
}