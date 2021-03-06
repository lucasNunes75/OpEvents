package br.com.zup.op.events.interfaces.controller

import br.com.zup.op.events.application.EventManager
import br.com.zup.op.events.interfaces.model.RepublishEventRequest
import br.com.zup.op.events.interfaces.model.RepublishEventResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/events")
class RepublishController(private val eventManager: EventManager) {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    fun republish(@RequestBody request: RepublishEventRequest): RepublishEventResponse {

       return eventManager.republish(request)
    }
}