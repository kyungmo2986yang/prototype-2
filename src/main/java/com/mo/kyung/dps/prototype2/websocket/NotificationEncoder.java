package com.mo.kyung.dps.prototype2.websocket;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mo.kyung.dps.prototype2.data.representations.ReceivedMessageRepresentation;

public class NotificationEncoder implements Encoder.Text<ReceivedMessageRepresentation> {

	@Override
	public void init(EndpointConfig config) {
	}

	@Override
	public void destroy() {
	}

	@Override
	public String encode(ReceivedMessageRepresentation message) throws EncodeException {
		try {
            return Constants.getMapper().writeValueAsString(message);
        } catch (JsonProcessingException e) {
            throw new EncodeException(message, "Unable to encode message", e);
        }
	}

}
