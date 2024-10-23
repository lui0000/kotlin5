package com.example.kotlin5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CommentAdapter(private var comments: List<Comment>) : RecyclerView.Adapter<CommentAdapter.CommentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comment, parent, false)
        return CommentViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        val comment = comments[position]
        holder.bind(comment)
    }

    override fun getItemCount(): Int {
        return comments.size
    }

    // Добавляем метод для обновления комментариев
    fun updateComments(newComments: List<Comment>) {
        comments = newComments
        notifyDataSetChanged() // Сообщаем адаптеру, что данные изменились
    }

    class CommentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val commentBody: TextView = itemView.findViewById(R.id.commentBody)
        private val commentUser: TextView = itemView.findViewById(R.id.commentUser)
        private val commentLikes: TextView = itemView.findViewById(R.id.commentLikes)

        fun bind(comment: Comment) {
            commentBody.text = comment.body
            commentUser.text = "${comment.user.fullName} (@${comment.user.username})"
            commentLikes.text = "Likes: ${comment.likes}"
        }
    }
}

