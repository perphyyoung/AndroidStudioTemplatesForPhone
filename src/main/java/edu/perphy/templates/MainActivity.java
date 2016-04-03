package edu.perphy.templates;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Context mContext;
    private Button btnBasicActivity, btnFullscreenActivity, btnLoginActivity,
            btnMasterDetailFlowActivity, btnNavigationDrawerActivity, btnScrollingActivity,
            btnSettingsActivity, btnTabbedActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        btnBasicActivity = (Button) findViewById(R.id.btnBasicActivity);
        assert btnBasicActivity != null;
        btnBasicActivity.setOnClickListener(this);

        btnFullscreenActivity = (Button) findViewById(R.id.btnFullscreenActivity);
        assert btnFullscreenActivity != null;
        btnFullscreenActivity.setOnClickListener(this);

        btnLoginActivity = (Button) findViewById(R.id.btnLoginActivity);
        assert btnLoginActivity != null;
        btnLoginActivity.setOnClickListener(this);

        btnMasterDetailFlowActivity = (Button) findViewById(R.id.btnMasterDetailFlowActivity);
        assert btnMasterDetailFlowActivity != null;
        btnMasterDetailFlowActivity.setOnClickListener(this);

        btnNavigationDrawerActivity = (Button) findViewById(R.id.btnNavigationDrawerActivity);
        assert btnNavigationDrawerActivity != null;
        btnNavigationDrawerActivity.setOnClickListener(this);

        btnScrollingActivity = (Button) findViewById(R.id.btnScrollingActivity);
        assert btnScrollingActivity != null;
        btnScrollingActivity.setOnClickListener(this);

        btnSettingsActivity = (Button) findViewById(R.id.btnSettingsActivity);
        assert btnSettingsActivity != null;
        btnSettingsActivity.setOnClickListener(this);

        btnTabbedActivity= (Button) findViewById(R.id.btnTabbedActivity);
        assert btnTabbedActivity != null;
        btnTabbedActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBasicActivity:
                startActivity(new Intent(mContext, BasicActivity.class));
                break;
            case R.id.btnFullscreenActivity:
                startActivity(new Intent(mContext, FullscreenActivity.class));
                break;
            case R.id.btnLoginActivity:
                startActivity(new Intent(mContext, LoginActivity.class));
                break;
            case R.id.btnMasterDetailFlowActivity:
                startActivity(new Intent(mContext, ItemListActivity.class));
                break;
            case R.id.btnNavigationDrawerActivity:
                startActivity(new Intent(mContext, NavigationDrawerActivity.class));
                break;
            case R.id.btnScrollingActivity:
                startActivity(new Intent(mContext, ScrollingActivity.class));
                break;
            case R.id.btnSettingsActivity:
                startActivity(new Intent(mContext, SettingsActivity.class));
                break;
            case R.id.btnTabbedActivity:
                startActivity(new Intent(mContext, TabbedActivity.class));
                break;
        }
    }
}
