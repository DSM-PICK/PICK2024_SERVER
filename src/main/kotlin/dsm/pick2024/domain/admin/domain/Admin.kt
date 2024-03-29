package dsm.pick2024.domain.admin.domain

import dsm.pick2024.domain.user.entity.enums.Role
import java.util.*

data class Admin(
    val id: UUID? = null,
    val name: String,
    val grade: Int? = null,
    val classNum: Int? = null,
    val password: String,
    val adminId: String,
    val role: Role
)
