package br.com.kotlin.exceptions

import java.lang.RuntimeException

class UnsuportedMathOperationException(exception: String?): RuntimeException(exception)