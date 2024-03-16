package robinthairu.me.geoquiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    private val QuestionBank = listOf(
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia,true),
        Question(R.string.question_australia, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_oceans, true),
        Question(R.string.question_nairobi, false))

    private var currentIndex = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view: View ->
            val snackBar = Snackbar.make(
                view ,
                R.string.correct_toast,
                Snackbar.LENGTH_SHORT
            )
            snackBar.setAction(R.string.snackBar_dismiss)  {
                snackBar.dismiss()
            }

            snackBar.show()
        }

        falseButton.setOnClickListener { view: View ->
            val snackBar = Snackbar.make(
                view,
                R.string.incorrect_toast,
                Snackbar.LENGTH_SHORT
            )
            snackBar.setAction(R.string.snackBar_dismiss){
                snackBar.dismiss()
            }
            snackBar.show()
        }
    }
}