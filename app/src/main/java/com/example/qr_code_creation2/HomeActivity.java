package com.example.qr_code_creation2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button btn_qrcode, btn_attendance;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_xml);

        btn_qrcode=findViewById(R.id.btn_qrcode);
        btn_attendance=findViewById(R.id.btn_attendance);

        //qr코드 생성화면으로 넘어가는 이벤트
        btn_qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //학생출석관리 화면으로 넘어가는 이벤트
        btn_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,AttendanceActivity.class);
                startActivity(intent);
            }
        });

    }
}
