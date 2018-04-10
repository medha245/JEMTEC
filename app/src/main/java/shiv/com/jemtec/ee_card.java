package shiv.com.jemtec;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by medha singh on 4/11/2016.
 */
public class ee_card extends Activity {
    private static RecyclerView.Adapter adapter;
    private static ArrayList<DataModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ee_card);
        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList3);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);
        recList.setItemAnimator(new DefaultItemAnimator());
        data = new ArrayList<DataModel>();
        for (int i = 0; i < MyData3.nameArray.length; i++) {
            data.add(new DataModel(
                    MyData3.nameArray[i],
                    MyData3.emailArray[i],
                    MyData3.id_[i],
                    MyData3.titleArray[i],
                    MyData3.surnameArray[i]
            ));
        }


        adapter = new ContactAdapter(data);
        recList.setAdapter(adapter);
    }
}
