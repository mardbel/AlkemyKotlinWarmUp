data class Address(
    val streetMap: Map<String, String>,
    val city: String,
    val partido: String,
    val state: String,
    val country: String,
    val zipCode: Int,
    val floor: String = "",
    val department: String = "")