package ec.edu.uisek.githubclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repos = listOf(
            Repo("Proyecto Android", "App de ejemplo", "Kotlin"),
            Repo("Cliente GitHub", "Laboratorio UISek", "Java"),
            Repo("Calculadora", "Proyecto básico", "Kotlin")
        )

        val recycler = findViewById<RecyclerView>(R.id.recyclerRepos)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = ReposAdapter(repos, this)
    }
}
