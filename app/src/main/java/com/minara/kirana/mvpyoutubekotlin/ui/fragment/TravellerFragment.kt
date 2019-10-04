package com.minara.kirana.mvpyoutubekotlin.ui.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.minara.kirana.kumpulanvideokotlin.ui.main.entity.Item
import com.minara.kirana.mvpyoutubekotlin.R
import com.minara.kirana.mvpyoutubekotlin.presenter.YoutubePresenter
import com.minara.kirana.mvpyoutubekotlin.presenter.YoutubeView
import com.minara.kirana.mvpyoutubekotlin.ui.adapter.YoutubeAdapter
import kotlinx.android.synthetic.main.fragment_traveller.*

/**
 * A simple [Fragment] subclass.
 */

// TODO 6 membuat Travell Fragment
class TravellerFragment : Fragment(), YoutubeView {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_traveller, container, false)

        val presenter = YoutubePresenter(this)
            presenter.getData("traveller")
        return view
    }

    override fun onSuccess(items: List<Item>?) {
            showData(items)
    }

    override fun onError(msg: String) {
        // show alert
    }


    private fun showData(items: List<Item>?){
        rvTravellerFragment.adapter = YoutubeAdapter(items)
    }


}
