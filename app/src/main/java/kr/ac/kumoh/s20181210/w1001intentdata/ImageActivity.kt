package kr.ac.kumoh.s20181210.w1001intentdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20181210.w1001intentdata.databinding.ActivityMainBinding

class ImageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val res = when (intent.getStringExtra("image")) {
            "gundam" -> R.drawable.gundam
            "zaku" -> R.drawable.zaku
            else -> R.drawable.ic_launcher_foreground
        }
        binding.imgGundam.setImageResource(res)
    }

}