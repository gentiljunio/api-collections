package one.digitalinnovation.collections

data class Funcionario(
    val nome: String,
    val salario: String,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
        """.trimIndent()
}