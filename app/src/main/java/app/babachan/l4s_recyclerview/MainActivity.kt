package app.babachan.l4s_recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.CharacterData

class MainActivity : AppCompatActivity() {

    val characterData: List<app.babachan.l4s_recyclerview.CharacterData> = listOf(
        CharacterData(R.drawable.pascal2, "パスカル", "映画ラプンツェルに登場するよ"),
        CharacterData(R.drawable.mike, "マイクワゾワフスキー", "モンスターズインクに出てくるよ"),
        CharacterData(R.drawable.goofy, "グーフィー", "ミッキー&フレンズの仲間だよ")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(characterData)
    }
}