package al.pika.android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PikaMainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pika_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_pika_main, menu);
        return true;
    }
}
