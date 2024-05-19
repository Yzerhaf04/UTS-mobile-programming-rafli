package pnj.uts.ti.teuku_rafli_fahrezy.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pnj.uts.ti.teuku_rafli_fahrezy.R

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for the fragment
        return inflater.inflate(R.layout.activity_fragment_one, container, false)
    }
}