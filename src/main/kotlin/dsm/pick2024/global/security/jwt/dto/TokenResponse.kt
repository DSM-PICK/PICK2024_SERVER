package dsm.pick2024.global.security.jwt.dto

data class TokenResponse(
    val accessToken: String,
    val refreshToken: String
)
