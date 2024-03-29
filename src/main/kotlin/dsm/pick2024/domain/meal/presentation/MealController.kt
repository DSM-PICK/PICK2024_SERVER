package dsm.pick2024.domain.meal.presentation

import dsm.pick2024.domain.meal.service.QueryDayMealService
import dsm.pick2024.domain.meal.service.SaveMealService
import io.swagger.v3.oas.annotations.Operation
import java.time.LocalDate
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/meal")
class MealController(
    private val saveMealService: SaveMealService,
    private val queryDayMealService: QueryDayMealService
) {
    @Operation(summary = "급식 정보 저장 API")
    @PostMapping
    fun saveMeals() {
        saveMealService.saveNeisInfoToDatabase()
    }

    @Operation(summary = "급식 조회 API")
    @GetMapping("/date")
    fun dateMeal(
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        @RequestParam(name = "date")
        date: LocalDate
    ) =
        queryDayMealService.queryDayMeal(date)
}
