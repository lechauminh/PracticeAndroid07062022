package com.example.calculator07062022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText eTxtInPut1;
EditText eTxtInPut2;
TextView txtHienThi;
Button btnToanCong;
Button btnToanTru;
Button btnToanNhan;
Button btnToanChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTxtInPut1=(EditText) findViewById(R.id.eTxtSo1);
        eTxtInPut2=(EditText) findViewById(R.id.eTxtSo2);
        txtHienThi= (TextView) findViewById(R.id.txtKetQua);
        btnToanCong=(Button) findViewById(R.id.btnCong);
        btnToanTru=(Button) findViewById(R.id.btnTru);
        btnToanNhan=(Button) findViewById(R.id.btnNhan);
        btnToanChia=(Button) findViewById(R.id.btnChia);

        btnToanCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = eTxtInPut1.getText().toString();
                int a = Integer.parseInt(n1);
                String n2 = eTxtInPut2.getText().toString();
                int b = Integer.parseInt(n2);
                int tong = a + b;
                String chuoiTong = String.valueOf(tong);
                txtHienThi.setText("Kết quả "+n1+ " + " +n2+" = "+ chuoiTong);
                if (eTxtInPut1==null|| eTxtInPut2==null)
            {
                Toast.makeText(MainActivity.this, "Bạn chưa truyền đủ thông tin", Toast.LENGTH_SHORT).show();
                return;
            }
            }
        });
        btnToanTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = eTxtInPut1.getText().toString();
                int a = Integer.parseInt(n1);
                String n2 = eTxtInPut2.getText().toString();
                int b = Integer.parseInt(n2);
                int tru = a - b;
                String chuoiTru = String.valueOf(tru);
                txtHienThi.setText("Kết quả "+n1+ " - " +n2+" = "+ chuoiTru);;
            }
        });
        btnToanNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = eTxtInPut1.getText().toString();
                int a = Integer.parseInt(n1);
                String n2 = eTxtInPut2.getText().toString();
                int b = Integer.parseInt(n2);
                double nhan = a * b;
                String chuoiNhan = String.valueOf(nhan);
                txtHienThi.setText("Kết quả "+n1+ " x " +n2+" = "+ chuoiNhan);
            }
        });
        btnToanChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = eTxtInPut1.getText().toString();
                int a = Integer.parseInt(n1);
                String n2 = eTxtInPut2.getText().toString();
                int b = Integer.parseInt(n2);
                if (n1.trim().isEmpty()|n2.trim().isEmpty()|b==0){
                    Toast.makeText(MainActivity.this, "Biểu thức vô tỉ. Bạn nên nhập lại số thứ 2 khác 0.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                float chia = a / b;
                String chuoiChia = String.valueOf(chia);
                txtHienThi.setText("Kết quả "+n1+ " : " +n2+" = "+ chuoiChia);
                }
            }
        });
    }
}