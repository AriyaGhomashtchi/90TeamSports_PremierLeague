package com.example.a90teamsports_premierleague

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.a90teamsports_premierleague.data.DataSource
import com.example.a90teamsports_premierleague.databinding.ActivityMainBinding
import com.example.recyclerview.adapter.TrikotAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       var binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dataSource = DataSource()
        val escordList = dataSource.getTrikot()

        binding.trikotRecycle.adapter = TrikotAdapter(this, escordList)

        val snapHelper = PagerSnapHelper ()
        snapHelper.attachToRecyclerView(binding.trikotRecycle)

    }


}
