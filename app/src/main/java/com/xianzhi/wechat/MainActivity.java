package com.xianzhi.wechat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // private String[] name={"赵","钱","孙","李","周","吴"};
    private List<Person> personList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPersons();
        PersonAdapter adapter = new PersonAdapter(personList, MainActivity.this);
        ListView listView = (ListView) findViewById(R.id.person_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Person person=personList.get(position);
                Toast.makeText(MainActivity.this,person.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void initPersons() {
        for (int i = 0; i < 6; i++) {
            Person name1 = new Person("zhao", R.drawable.one, "asd");
            personList.add(name1);
            Person name2 = new Person("qian", R.drawable.two, "sdf");
            personList.add(name2);
            Person name3 = new Person("sun", R.drawable.three, "dfg");
            personList.add(name3);
            Person name4 = new Person("li", R.drawable.four, "fgh");
            personList.add(name4);
            Person name5 = new Person("zhou", R.drawable.five, "ghj");
            personList.add(name5);
            Person name6 = new Person("wu", R.drawable.six, "hjk");
            personList.add(name6);

        }
    }
}
