package dsm.pick2024.domain.earlyreturn.port.out

import dsm.pick2024.domain.earlyreturn.domain.EarlyReturn
import java.util.UUID

interface QueryOKMyEarlyReturn {
    fun findByOKEarlyReturn(userId: UUID): EarlyReturn?
}
