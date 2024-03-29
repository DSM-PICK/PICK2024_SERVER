package dsm.pick2024.domain.notice.presentation.dto.response

import java.time.LocalDate
import java.util.UUID

data class QueryTodayNoticeResponse(
    val id: UUID,
    val title: String,
    val createAt: LocalDate,
    val teacher: String
)
