package bys.trep.wallowa.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import bys.trep.wallowa.R

@SuppressLint("CustomSplashScreen")
class fdfgdgfvbdfg : Fragment(R.layout.gfhghghgfh) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch(Dispatchers.Main) {
            delay(1_000L)
            findNavController().navigate(
                R.id.startingFragment, null,
                navOptions {
                    popUpTo(R.id.nav_graph) {
                        inclusive = true
                    }
                }
            )
        }
    }
}
