package com.example.mygift.giftit;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by Prasanga on 4/23/2015.
 */
public class preferred_activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.preferred_page);
        table_hdr();
    }

    public void table_hdr() {
        TableLayout table = (TableLayout) findViewById(R.id.tbl_hdr);

        for (int i = 0; i < 10; i++) {

            TableRow row = new TableRow(this);

            TextView text = new TextView(this);
            text.setText("Row" + i);
            row.addView(text);

            table.addView(row);
        }
    }
}

