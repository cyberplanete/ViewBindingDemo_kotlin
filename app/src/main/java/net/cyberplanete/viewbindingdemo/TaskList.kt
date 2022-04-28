package net.cyberplanete.viewbindingdemo

object TaskList {
    val taskList = listOf<Task>(
        Task("Petit déjeuner", timestamp = "7:00 am"),
        Task("Entrainement dénivelé", timestamp = "11:00 am"),
        Task("Rdv avocat", timestamp = "9:00 am"),
        Task("Video youtube", timestamp = "13:00 pm"),
        Task("Faire course", timestamp = "14:00 pm"),
        Task("Préparation dinner", timestamp = "19:00 pm")
    )
}