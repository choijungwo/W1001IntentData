package kr.ac.kumoh.s20181210.w1001intentdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20181210.w1001intentdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.btnGundam.setOnClickListener{
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("image", "gundam")
            startActivity(intent)
        }
        binding.btnZaku.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("image", "zaku")
            startActivity(intent)
        }
    }
}