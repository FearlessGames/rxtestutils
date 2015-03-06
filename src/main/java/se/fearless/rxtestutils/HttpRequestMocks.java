package se.fearless.rxtestutils;

import com.googlecode.gentyref.TypeToken;
import io.netty.buffer.ByteBuf;
import io.reactivex.netty.protocol.http.server.HttpServerRequest;
import io.reactivex.netty.protocol.http.server.HttpServerResponse;
import io.reactivex.netty.protocol.http.server.RequestHandler;

import static se.mockachino.Mockachino.mock;

public class HttpRequestMocks {

	private final static TypeToken<RequestHandler<ByteBuf, ByteBuf>> REQUEST_HANDLER_TYPE_TOKEN = new TypeToken<RequestHandler<ByteBuf, ByteBuf>>() {
	};
	private final static TypeToken<HttpServerRequest<ByteBuf>> REQUEST_TYPE_TOKEN = new TypeToken<HttpServerRequest<ByteBuf>>() {
	};
	private final static TypeToken<HttpServerResponse<ByteBuf>> RESPONSE_TYPE_TOKEN = new TypeToken<HttpServerResponse<ByteBuf>>() {
	};

	public static RequestHandler<ByteBuf, ByteBuf> requestHandler() {
		return mock(REQUEST_HANDLER_TYPE_TOKEN);
	}

	public static HttpServerRequest<ByteBuf> request() {
		return mock(REQUEST_TYPE_TOKEN);
	}

	public static HttpServerResponse<ByteBuf> response() {
		return mock(RESPONSE_TYPE_TOKEN);
	}
}
