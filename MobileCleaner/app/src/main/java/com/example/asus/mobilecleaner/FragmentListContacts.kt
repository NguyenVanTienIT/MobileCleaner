package com.example.asus.mobilecleaner

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class FragmentListContacts : Fragment() {

    var recyclerView :  RecyclerView? = null
    var adapter : FragmentListContacts.ContactAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view : View = inflater!!.inflate(R.layout.fragment_list_contacts, container, false)

        recyclerView = view.findViewById(R.id.list_contacts)

        recyclerView?.layoutManager = LinearLayoutManager(getActivity())

        updateUI()

        return view

    }


    private fun updateUI()
    {

        // tạo dữ liệu giả
        var listContact :  ArrayList<Contacts> = ArrayList()

        for (i in 1..6){
            var contacts : Contacts = Contacts("abc","096893147"+i, i,"nguyenvana@gmail.com")
            listContact.add(contacts)
        }

        // set Adapter cho recyclerview
        if(adapter == null) {
            adapter = ContactAdapter(listContact)
            recyclerView!!.adapter = adapter
        }

        else{
            adapter!!.notifyDataSetChanged()
        }

    }



    inner class ContactHolder(inflater : LayoutInflater, parent : ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.item_contacts,parent,false)),
            View.OnClickListener{


        var imageContact : ImageView?= null
        var sdtContacts : TextView? = null
        var countContact :  TextView? = null


        init {
            imageContact = itemView.findViewById(R.id.img_contacts)
            sdtContacts = itemView.findViewById(R.id.sdt_contacts)
            countContact =  itemView.findViewById(R.id.count_contacts)
        }



        override fun onClick(v: View?) {

        }

        fun bind(contacts : Contacts){
            sdtContacts!!.setText(contacts.numberPhone.toString())
            countContact!!.setText(contacts.numberCount!!.toString())
            imageContact!!.setImageResource(R.drawable.ic_contact)
        }

    }

    inner class ContactAdapter(listContacts : ArrayList<Contacts>) : RecyclerView.Adapter<ContactHolder>(){

        var listContactAdapter : ArrayList<Contacts>? = null

        init {
            listContactAdapter = listContacts
        }

        override fun getItemCount(): Int {
            return listContactAdapter!!.size
        }

        override fun onBindViewHolder(holder: ContactHolder, position: Int) {
            var contacts : Contacts = listContactAdapter!![position]

            holder!!.bind(contacts)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder {
            var layoutInflater : LayoutInflater = LayoutInflater.from(activity)

            return ContactHolder(layoutInflater, parent)
        }

    }





}