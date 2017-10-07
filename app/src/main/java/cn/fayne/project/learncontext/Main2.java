package cn.fayne.project.learncontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2 extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Create", "Main2");
        setContentView(R.layout.main2);
        textView = (TextView) findViewById(R.id.tv);
        editText = (EditText) findViewById(R.id.editText);
        textView.setText("共享的数据是" + getApp().getTextData());

        findViewById(R.id.btnSaveData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((App) getApplicationContext()).setTextData(editText.getText().toString());
                textView.setText("共享的数据是" + editText.getText().toString());
            }
        });
    }
    public App getApp() {
        return (App) getApplicationContext();
    }
}
