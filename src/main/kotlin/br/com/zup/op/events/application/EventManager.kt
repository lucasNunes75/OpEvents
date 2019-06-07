package br.com.zup.op.events.application

import br.com.zup.op.events.domain.ReasonEntity
import br.com.zup.op.events.domain.TopicEntiy
import br.com.zup.op.events.interfaces.model.RepublishEventRequest
import br.com.zup.op.events.interfaces.model.RepublishEventResponse

interface EventManager {

    fun republish(request: RepublishEventRequest): RepublishEventResponse

    fun reasonList(): ArrayList<ReasonEntity>

    fun listTopics(): ArrayList<TopicEntiy>

}
