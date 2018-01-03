package com.emrealtunbilek.candostlarapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var tumDostlar=ArrayList<Dost>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        veriKaynaginiDoldur()

        var myAdapter=DostlarRecyclerViewAdapter(tumDostlar)
        recyclerviewDostlar.adapter = myAdapter

        var myLayoutManager=StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerviewDostlar.layoutManager = myLayoutManager


    }

    private fun veriKaynaginiDoldur() {

        var resimler= arrayOf( R.drawable.ani_cat_one,
                R.drawable.ani_cat_two,
                R.drawable.ani_cat_three,
                R.drawable.ani_cat_four,
                R.drawable.ani_cat_five,
                R.drawable.ani_cat_six,
                R.drawable.ani_cat_seven,

                R.drawable.ani_dog_one,
                R.drawable.ani_dog_two,
                R.drawable.ani_dog_three,
                R.drawable.ani_dog_four,
                R.drawable.ani_dog_five,

                R.drawable.ani_deer_one,
                R.drawable.ani_deer_two,
                R.drawable.ani_deer_three,
                R.drawable.ani_deer_four,

                R.drawable.bird_parrot_one,
                R.drawable.bird_parrot_two,
                R.drawable.bird_parrot_three,
                R.drawable.bird_parrot_four,
                R.drawable.bird_parrot_five,
                R.drawable.bird_parrot_six,
                R.drawable.bird_parrot_seven,
                R.drawable.bird_parrot_eight)

        var isimler= arrayOf("Kedi 1", "Kedi 2", "Kedi 3", "Kedi 4" ,"Kedi 5" ,"Kedi 6","Kedi 7",
                "Köpek 1","Köpek 2","Köpek 3","Köpek 4","Köpek 5",
                "Geyik 1","Geyik 2","Geyik 3","Geyik 4",
                " Papağan 1"," Papağan 2"," Papağan 3"," Papağan 4"," Papağan 5"," Papağan 6"," Papağan 7"," Papağan 8")

        for (i in 0..resimler.size-1){

            var eklenecekDost=Dost(isimler[i], resimler[i])
            tumDostlar.add(eklenecekDost)

        }


    }


}
