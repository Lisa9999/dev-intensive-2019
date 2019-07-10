package ru.skillbranch.devintensive.extensions

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView
import java.util.*

fun User.toUserView(): UserView {

    val nickName = ""
    val initials = ""
    val status =
        if (lastVisit == Date(0))
            "Еще ни разу не был"
        else if (isOnline)
            "Онлайн"
        else
            "Последний раз был ${lastVisit.humanizeDiff()}"
    return UserView(
        id,
        fullName = "$firstName $lastName",
        nickName = nickName,
        initials = initials,
        avatar = avatar,
        status = status
    )

}

