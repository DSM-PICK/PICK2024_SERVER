package dsm.pick2024.domain.afterschool.port.`in`

import dsm.pick2024.domain.afterschool.presentation.dto.request.DeleteRequest

interface DeleteAfterSchoolStudentUseCase {
    fun deleteAfterSchoolStudent(request: DeleteRequest)
}
