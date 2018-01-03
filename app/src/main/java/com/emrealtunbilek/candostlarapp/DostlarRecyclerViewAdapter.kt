package com.emrealtunbilek.candostlarapp

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.tek_uye.view.*

/**
 * Created by Emre on 3.01.2018.
 */
class DostlarRecyclerViewAdapter(tumDostlar:ArrayList<Dost>) : RecyclerView.Adapter<DostlarRecyclerViewAdapter.DostViewHolder>() {


    var dostlar=tumDostlar


    override fun onBindViewHolder(holder: DostViewHolder?, position: Int) {

        var oanOlusturulanDost=dostlar.get(position)
        holder?.setData(oanOlusturulanDost, position)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DostViewHolder {

        var inflater=LayoutInflater.from(parent?.context)
        var tek_uye= inflater.inflate(R.layout.tek_uye, parent, false)

        return DostViewHolder(tek_uye)

    }

    override fun getItemCount(): Int {

        return dostlar.size
    }


    inner class DostViewHolder(tek_uye: View) : RecyclerView.ViewHolder(tek_uye) {

        var tekDostBilgisi=tek_uye as CardView

        var dostAd=tekDostBilgisi.tvDostAdi
        var dostResim = tekDostBilgisi.imgDost



        fun setData(oanOlusturulanDost: Dost, position: Int) {

            dostAd.text=oanOlusturulanDost.isim
            dostResim.setImageResource(oanOlusturulanDost.resim)

            tekDostBilgisi.setOnClickListener {

                Toast.makeText(tekDostBilgisi.context, "Tıklanılan Öğe : " + position + " Adı:"+oanOlusturulanDost.isim, Toast.LENGTH_SHORT).show()

            }


        }


    }

    fun setFilter(aranilanlar:ArrayList<Dost>){


        dostlar=ArrayList<Dost>()

        dostlar.addAll(aranilanlar)

        notifyDataSetChanged()



    }



}