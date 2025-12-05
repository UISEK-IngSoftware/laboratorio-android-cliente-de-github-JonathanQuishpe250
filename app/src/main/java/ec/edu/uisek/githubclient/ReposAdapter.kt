package ec.edu.uisek.githubclient

import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView

class ReposAdapter(
    private val repos: List<Repo>,
    private val activity: FragmentActivity
) : RecyclerView.Adapter<ReposAdapter.RepoViewHolder>() {

    class RepoViewHolder(val fragment: RepoFragment) :
        RecyclerView.ViewHolder(fragment.requireView())

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoViewHolder {
        val fragment = RepoFragment(repos[viewType])
        activity.supportFragmentManager.beginTransaction()
            .add(fragment, null)
            .commitNow()
        return RepoViewHolder(fragment)
    }

    override fun onBindViewHolder(holder: RepoViewHolder, position: Int) {
        // Nada que actualizar porque el fragment ya tiene el repo cargado
    }

    override fun getItemCount(): Int = repos.size

    override fun getItemViewType(position: Int): Int = position
}
