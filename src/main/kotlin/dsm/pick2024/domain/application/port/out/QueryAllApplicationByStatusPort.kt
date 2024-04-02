package dsm.pick2024.domain.application.port.out

import dsm.pick2024.domain.application.domain.Application
import dsm.pick2024.domain.application.enums.Status

interface QueryAllApplicationByStatusPort {
    fun findAllByStatus(status: Status): List<Application>
}
