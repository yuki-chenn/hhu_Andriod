package com.habitrpg.android.habitica.models.inventory

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Egg : RealmObject(), Item {
    @PrimaryKey
    override var key: String = ""
    override var text: String = ""
    var notes: String? = null
    override var value: Int = 0
    var adjective: String? = null
    var mountText: String? = null
    override var event: ItemEvent? = null

    override val type: String
        get() = "eggs"
}