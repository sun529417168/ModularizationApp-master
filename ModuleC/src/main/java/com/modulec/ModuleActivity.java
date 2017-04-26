package com.modulec;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.mzule.activityrouter.annotation.Router;
import com.linked.erfli.library.base.BaseActivity;

/**
 * Created by Sultan on 2017/4/21.
 */
@Router("module_list")
public class ModuleActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
    }
}
