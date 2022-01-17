package bys.trep.wallowa.ui

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import bys.trep.wallowa.R
import bys.trep.wallowa.util.getDrawableId
import bys.trep.wallowa.util.gfggfbghfhdfh
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlin.random.Random
import kotlin.random.nextInt

class sdfdsfdsf : Fragment(R.layout.dasdawrqsdf) {

    private var dfdsfdsfsdfsd: Job? = null
    private var gffdgfdhdfhd = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fdgfdhdfgsdfes(view)
        view.findViewById<Button>(R.id.button).setOnClickListener { fdgfdhdfgsdfes(view) }
    }

    private fun fdgfdhdfgsdfes(view: View) {
        dfdsfdsfsdfsd?.cancel()
        with(view) {
            val ivContainer = findViewById<FrameLayout>(R.id.flImages)
            dfdsfdsfsdfsd = viewLifecycleOwner.lifecycleScope.launch {
                listOf<ImageView>(
                    findViewById(R.id.iv1),
                    findViewById(R.id.iv2),
                    findViewById(R.id.iv3),
                    findViewById(R.id.iv4)
                ).gfggfbghfhdfh { fdhdghdghg(it, ivContainer) }.forEach {
                    it.join()
                }
                Toast.makeText(requireContext(), "You won!", Toast.LENGTH_LONG).show()
            }
        }
    }

    private suspend fun fdhdghdghg(iv: ImageView, container: FrameLayout): Job {
        iv.isVisible = true
        iv.setImageResource(requireContext().getDrawableId("s" + Random.nextInt(1..4)))
        iv.x = container.width * Random.nextInt(20) * 0.04f
        iv.y = container.height * Random.nextInt(20) * 0.04f
        return withContext(Dispatchers.Main) { launch { fdghdghgdf(iv) } }
    }

    private suspend fun fdghdghgdf(iv: ImageView) = suspendCoroutine<Unit> { cont ->
        iv.setOnClickListener {
            gffdgfdhdfhd += 100
            view?.findViewById<TextView>(R.id.tvScore)?.text = "SCORE: $gffdgfdhdfhd"
            iv.isVisible = false
            cont.resume(Unit)
        }
    }
}
