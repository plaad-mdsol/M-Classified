package com.oracle.loginapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.prop_layout.view.*

class PropAdapter : RecyclerView.Adapter<PropAdapter.ViewHolder>() {

    private val Property = arrayOf("2BHK in Casa Poli Wakad",
        "3 BHK in Life Republic", "2 BHK in Megapolis Phase 3", "1 BHK in Wakad",
        "2 BHK in Rose Livia", "3 BHK in Pristine Prolife")

    private val PropDetails = arrayOf("The house is unfurnished. it's in heart of all CMM Level 5 companies. All modern amenities are there for use." ,
            "Your search for a 3 BHK in Hinjawadi ends here", "This home is conveniently located & comes at just 14,500 rupees. If you are looking for an apartment to rent ideal for families, you need to check out this home.",
        "Nice and cozy, semi furnished, 1 bedroom apartment with a balcony and two bathrooms, one large kitchen with attached dry balcony.", "If you are looking for a home with generator back up, intercom facility & elevator, this home is just right for you",
        "This apartment in Hinjewadi Phase 1 has very few 1 BHK homes available, so don't let this opportunity slip away.", "Looking to rent a house for Rs. 12,000? This home is perfect for families & bachelors, it is loaded with amenities & is in a convenient location. This home is on the 21th floor & brings in light & air to the home")

    private val images = intArrayOf(R.drawable.download11,R.drawable.download12,R.drawable.download13,R.drawable.download16,
        R.drawable.download14,R.drawable.download15)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.prop_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return Property.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.prop_name.text = Property[position]
        holder.itemView.prop_detail.text = PropDetails[position]
        holder.itemView.prop_image.setImageResource(images[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, itemView.prop_name.text,  Toast.LENGTH_SHORT).show()
            }
        }
    }
}