package dsm.pick2024.domain.selfstudy.presentation.dto.request

import java.time.LocalDate

data class ChangeSelfStudyTeacherRequest (
    val floor: Int,
    val teacher: String,
    val date: LocalDate
)
