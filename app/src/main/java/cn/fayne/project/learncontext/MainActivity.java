package cn.fayne.project.learncontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("Create", "Main1");
//        tv = new TextView(this);
//        tv.setText("Hello Android");
//        tv.setText(R.string.hello_world);
//        setContentView(tv);
//        System.out.println(getResources().getText(R.string.hello_world));
//
//        ImageView iv = new ImageView(this);
//        iv.setImageResource(R.mipmap.ic_launcher);
//        setContentView(iv);
        setContentView(R.layout.main1);
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