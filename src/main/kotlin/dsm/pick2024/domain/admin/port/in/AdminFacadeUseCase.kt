package dsm.pick2024.domain.admin.port.`in`

import dsm.pick2024.domain.admin.domain.Admin

interface AdminFacadeUseCase {
    fun currentUser(): Admin

    fun getAdminByAdminId(adminId: String): Admin?
}
