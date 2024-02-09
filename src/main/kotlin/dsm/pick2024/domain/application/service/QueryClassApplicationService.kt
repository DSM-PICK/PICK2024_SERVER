package dsm.pick2024.domain.application.service

import dsm.pick2024.domain.application.port.`in`.QueryClassApplicationUseCase
import dsm.pick2024.domain.application.port.out.QueryClassApplicationPort
import dsm.pick2024.domain.application.presentation.dto.response.QueryApplicationResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class QueryClassApplicationService(
    private val queryClassApplicationPort: QueryClassApplicationPort
) : QueryClassApplicationUseCase {

    @Transactional(readOnly = true)
    override fun queryClassApplication(grade: Int, classNum: Int) =
        queryClassApplicationPort.findByGradeAndClassNum(grade, classNum)
            .map {
                    it ->
                QueryApplicationResponse(
                    it.id!!,
                    it.username,
                    it.startTime,
                    it.endTime,
                    it.grade,
                    it.classNum,
                    it.num
                )
            }
}