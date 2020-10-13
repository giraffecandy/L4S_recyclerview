package app.babachan.l4s_recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

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
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter

//        val horizontalLayoutManagaer =
//            LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
//        recyclerView.layoutManager = horizontalLayoutManagaer

//        val manager = LinearLayoutManager(this)
//        manager.orientation = LinearLayoutManager.HORIZONTAL // ここで横方向に設定
//
//        recyclerView.layoutManager = manager

        adapter.addAll(characterData)
    }
}