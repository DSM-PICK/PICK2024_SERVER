package dsm.pick2024.domain.selfstudy.presentation.dto.request

import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate

data class RegistrationSelfStudyTeacherRequest(
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    val date: LocalDate,
    val teacher: List<TeacherRequest>
)
