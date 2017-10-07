package cn.fayne.project.learncontext;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

/**
 * Created by fan on 2017/10/6.
 */

public class App extends Application{
    private String textData = "dafault";

    public void setTextData(String textData) {
        this.textData = textData;
    }

    public String getTextData() {
        return textData;
    }

    @Override
    public void onCreate() {
        Log.d("Create", "App");
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
