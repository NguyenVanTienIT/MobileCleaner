package com.example.asus.mobilecleaner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class ActivityContactsScan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts_scan)
    }



    inner class ContactHolder(itemView: View?) : RecyclerView.ViewHolder(itemView), View.OnClickListener{


        override fun onClick(v: View?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

    inner class ContactAdapter(listContacts : ArrayList<Contacts>) : RecyclerView.Adapter<ContactHolder>(){

        override fun getItemCount(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onBindViewHolder(holder: ContactHolder, position: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}
