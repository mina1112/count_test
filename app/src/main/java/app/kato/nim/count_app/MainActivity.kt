package app.kato.nim.count_app

import android.graphics.Color.rgb
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tapCount = 0

        tapButton.setOnClickListener {
            tapCount = tapCount ++
            countText.text = tapCount.toString()
        }

        if (tapCount % 3 == 0) {
            countText.setTextColor(color.rgb(255, 90, 25))
        }

    }
}