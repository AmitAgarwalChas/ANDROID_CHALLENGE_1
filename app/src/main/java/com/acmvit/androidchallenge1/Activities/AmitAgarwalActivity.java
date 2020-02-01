package com.acmvit.androidchallenge1.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.acmvit.androidchallenge1.Adapters.AmitAgarwalAdapter;
import com.acmvit.androidchallenge1.R;

import java.util.ArrayList;

public class AmitAgarwalActivity extends AppCompatActivity {

    ArrayList<String> p_name = new ArrayList<String>();
    ArrayList<String> pict = new ArrayList<String>();
    ArrayList<String> p_place = new ArrayList<String>();
    ArrayList<String> p_url = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amit_agarwal);
        work();
    }

    public void work(){

        pict.add("https://upload.wikimedia.org/wikipedia/commons/7/7a/Chichen-Itza-Castillo-Seen-From-East.JPG");
        pict.add("https://upload.wikimedia.org/wikipedia/commons/b/b7/The_Monastery%2C_Petra%2C_Jordan8.jpg");
        pict.add("https://upload.wikimedia.org/wikipedia/commons/c/c8/Taj_Mahal_in_March_2004.jpg");
        pict.add("https://upload.wikimedia.org/wikipedia/commons/f/f7/KOLOSSEUM_-_panoramio.jpg");
        pict.add("https://travel.home.sndimg.com/content/dam/images/travel/fullset/2015/10/12/new-seven-wonders-great-wall-of-china.jpg.rend.hgtvcom.616.462.suffix/1491581549051.jpeg");
        pict.add("https://media.swncdn.com/cms/RT/25894-jesus-statue-facebook.800w.tn.jpg");
        pict.add("https://upload.wikimedia.org/wikipedia/commons/e/eb/Machu_Picchu%2C_Peru.jpg");

        p_name.add("Chichen Itza");
        p_name.add("Petra");
        p_name.add("Taj Mahal");
        p_name.add("Colosseum");
        p_name.add("Great Wall of China");
        p_name.add("Christ the Redeemer");
        p_name.add("Machu Picchu");

        p_place.add("Yucatan, Mexico");
        p_place.add("Raqmu, Jordan");
        p_place.add("Agra, India");
        p_place.add("Piazza del Colosseo, Rome");
        p_place.add("Beijing, China");
        p_place.add("Rio de Janeiro, Brazil");
        p_place.add("Andes Mountains, Peru");

        p_url.add("https://en.wikipedia.org/wiki/Chichen_Itza");
        p_url.add("https://en.wikipedia.org/wiki/Petra");
        p_url.add("https://en.wikipedia.org/wiki/Taj_Mahal");
        p_url.add("https://en.wikipedia.org/wiki/Colosseum");
        p_url.add("https://en.wikipedia.org/wiki/Great_Wall_of_China");
        p_url.add("https://en.wikipedia.org/wiki/Christ_the_Redeemer_(statue)");
        p_url.add("https://en.wikipedia.org/wiki/Machu_Picchu");

        RecyclerView rv = (RecyclerView)findViewById(R.id.recycler_view);
        AmitAgarwalAdapter adapter = new AmitAgarwalAdapter(this,p_name,pict,p_place,p_url);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));


    }

}
