package dsm.pick2024.domain.classroom.entity

import dsm.pick2024.global.base.BaseUUIDEntity
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity

@Entity(name = "tbl_classroom")
class ClassroomJpaEntity(
    id: UUID?,

    @Column(columnDefinition = "BINARY(16)")
    val userId: UUID,

    @Column(name = "classroom", nullable = false)
    val classroomName: String,

    @Column(name = "floor", nullable = false)
    val floor: Int,

    val username: String,

    val grade: Int,

    @Column(name = "class_num")
    val classNum: Int,

    val num: Int

) : BaseUUIDEntity(id)
