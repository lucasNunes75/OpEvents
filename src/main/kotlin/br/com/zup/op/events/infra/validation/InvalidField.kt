package br.com.zup.op.events.infra.validation

import java.lang.RuntimeException

class InvalidField(
    val apiFieldError: ApiFieldError
) : RuntimeException()