package kr.co.tjoeun.a20200317_01_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText inputEdt = null;
    Button okBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        EditText에 타이핑 => 입력버튼 => 텍스트뷰에 출력
//        + 입력버튼 누르면 기존 입력내용삭제""으로 설정
        inputEdt = findViewById(R.id.inputEdt);
        okBtn = findViewById(R.id.okBtn)

        inputEdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
