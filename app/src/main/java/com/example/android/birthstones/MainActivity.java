package com.example.android.birthstones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private MainAdapter myAdapter;
    private RecyclerView RecyclerMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Birthstone> stoneList = new ArrayList<Birthstone>();
        stoneList.add(new Birthstone(R.drawable.january_garnet, "January Garnet", "The word \"garnet\" comes from the 14th century Middle English word gernet, meaning \"dark red.\" The word is derived from Latin granatum, which means \"seed,\" and is called so because of the gemstone's resemblance to the red seeds of the pomegranate."));
        stoneList.add(new Birthstone(R.drawable.february_amethyst, "February Amethyst", "Amethyst is purple quartz and is a beautiful blend of violet and red that can be found in every corner of the world. The name comes from the Ancient Greek, derived from the word methustos, which means “intoxicated.” Ancient wearers believed the gemstone could protect them from drunkenness."));
        stoneList.add(new Birthstone(R.drawable.march_aquamarine, "March Aquamarine", "You probably already know of the diamond’s toughness. In fact, it’s the hardest gemstone and is made of just one element: carbon.\n" +
                "\n" +
                "Its structure makes it 58 times harder than anything in nature and can only be cut with another diamond."));
        stoneList.add(new Birthstone(R.drawable.may_emerald, "May Emerald", "As the birthstone for May, the emerald, a symbol of rebirth, is believed to grant the owner foresight, good fortune, and youth. Emerald, derived from the word “smaragdus,” means, quite literally, “green” in Greek."));
        stoneList.add(new Birthstone(R.drawable.june_pearl, "June Pearl", "Pearls are the only gemstones made by living creatures. Mollusks produce pearls by depositing layers of calcium carbonate around microscopic irritants that get lodged in their shells, usually not a grain of sand, as commonly believed."));
        stoneList.add(new Birthstone(R.drawable.july_ruby, "July Ruby", "Ruby is the red variety of the mineral corundum, colored by the element chromium. All other colors of gem-quality corundum are called sapphire, which means color is key for this royal stone. Accordingly, the name \"ruby\" comes from rubeus,"));
        stoneList.add(new Birthstone(R.drawable.august_peridot, "August Peridot", "Though peridot is widely recognized by its brilliant lime green glow, the origin of this gemstone’s name is unclear."));
        stoneList.add(new Birthstone(R.drawable.september_sapphire, "September Sapphire", "\n" +
                "Although sapphire typically refers to the rich blue gemstone variety of the mineral corundum, this royal gemstone occurs in a rainbow of hues. Sapphires come in every color except red, which earns the classification of rubies instead."));
        stoneList.add(new Birthstone(R.drawable.october_opal, "October Opal", "The name \"opal\" originates from the Greek word opallios, which meant \"to see a change in color.\""));
        stoneList.add(new Birthstone(R.drawable.november_topaz, "November Topaz", "Through much of history, all yellow gemstones were considered topaz and all topaz was thought to be yellow. Topaz is available in many colors, and it's likely not even related to the stones that first donned its name."));
        stoneList.add(new Birthstone(R.drawable.december_tanzanite, "December Tanzanite", "Tanzanite is the exquisite blue-purple variety of the mineral zoisite that is only found in one part of the world. Named for its limited geographic origin in Tanzania, tanzanite has quickly risen to popularity since its relatively recent discovery."));

        RecyclerMain = findViewById(R.id.mainrecycle);
        myAdapter = new MainAdapter(stoneList, this);
        RecyclerMain.setAdapter(myAdapter);
        RecyclerMain.setLayoutManager(new LinearLayoutManager(this));
    }
}
