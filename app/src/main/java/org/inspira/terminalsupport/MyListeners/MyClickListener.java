package org.inspira.terminalsupport.MyListeners;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Hector Torres on 27/11/2016.
 */
public class MyClickListener implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        TextView myView = (TextView)v;
        myView.setText("Hola mundo!");
    }
}
