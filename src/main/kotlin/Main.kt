fun main(args: Array<String>) {

    formatAddressToString(AddressProvider().ADDRESS_1)
    showAddressDepartment(
        arrayOf(
            AddressProvider().ADDRESS_1,
            AddressProvider().ADDRESS_2,
            AddressProvider().ADDRESS_3
        )
    )
}

fun showAddressDepartment(addressList: Array<Address>) {
    for (address in addressList) {
        if (address.floor.isNotBlank() && address.department.isNotBlank()) {
            println(
                "Calle ${address.streetMap["streetName"]} ${address.streetMap["number"]}" +
                        " departamento ${address.floor}${address.department}"
            )
        }
    }
}

fun formatAddressToString(address: Address) {
    if (address.floor.isNullOrBlank() && address.department.isNullOrBlank()) {
        println(
            "La dirección es calle ${address.streetMap["streetName"]} ${address.streetMap["number"]} entre calles " +
                    "${address.streetMap["betweenStreet1"]} y ${address.streetMap["betweenStreet2"]}, localizado en la ciudad de " +
                    "${address.city} del partido de ${address.partido} de la provincia de ${address.state} " +
                    "en ${address.country}. Su código postal es ${address.zipCode}."
        )
    } else {
        println(
            "La dirección es calle ${address.streetMap["streetName"]} ${address.streetMap["number"]} entre calles " +
                    "${address.streetMap["betweenStreet1"]} y ${address.streetMap["betweenStreet2"]}, departamento ${address.floor}" +
                    "${address.department} localizado en la ciudad de " + "${address.city} del partido de " +
                    "${address.partido} de la provincia de ${address.state} " +
                    "en ${address.country}. Su código postal es ${address.zipCode}."
        )
    }
}






