package robinthairu.me.geoquiz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import robinthairu.me.geoquiz.databinding.ActivityCheatBinding

class CheatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCheatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCheatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}