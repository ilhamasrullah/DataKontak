package android.example.com.datakontak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {


    private TextView tv_welcome;
    private String namaUser;
    private ListView tv_kontak;

    ArrayList<String> people = new ArrayList<String>();
    private ListView lv_kontak;
    private ListPeopleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();
        takeIntentExtra();
        dummyData();
        setAdapter();
    }
    private void setAdapter(){
        lv_kontak = (ListView) findViewById(R.id.lv_kontak);
        adapter = new ListPeopleAdapter(HomeActivity.this,people);
        lv_kontak.setAdapter(adapter);
    }
    private void dummyData(){
        people.add("nobita");
        people.add("sizuka");
        people.add("giant");
        people.add("doraemon");
    }

    private void takeIntentExtra() {
        namaUser = getIntent().getExtras().getString("Username");
        tv_welcome.setText("Selamat Datang " + namaUser);
    }


    private void initView() {
    tv_welcome = (TextView) findViewById(R.id.tv_welcome);
    tv_kontak = (ListView) findViewById(R.id.lv_kontak);
    }
}
