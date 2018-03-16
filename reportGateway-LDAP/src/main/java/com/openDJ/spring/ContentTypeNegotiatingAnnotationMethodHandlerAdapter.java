package com.openDJ.spring;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

public class ContentTypeNegotiatingAnnotationMethodHandlerAdapter extends AnnotationMethodHandlerAdapter {

	private Logger logger = LoggerFactory.getLogger(ContentTypeNegotiatingAnnotationMethodHandlerAdapter.class);
	private String mediaTypeParam = "alt";
	private Map<String, MediaType> mediaTypesMap;

	@Override
	protected HttpInputMessage createHttpInputMessage(HttpServletRequest request) throws Exception {
		HttpInputMessage message = super.createHttpInputMessage(request);
		String accept = request.getParameter(mediaTypeParam);
		if (accept == null || accept.isEmpty()) {
			logger.info(String.format("Request parameter [%s] not found. Using standard HttpInputMessage",
					mediaTypeParam));
			return message;
		} else {
			logger.info(String.format("Request parameter [%s] was [%s]", mediaTypeParam, accept));
			MediaType mediaType = mediaTypesMap.get(accept);
			if (mediaType == null) {
				logger.info(String.format("Suitable MediaType not found. Using standard HttpInputMessage"));
				return message;
			} else {
				logger.info(String.format("Suitable MediaType [%s] found. Using custom HttpInputMessage", mediaType));
				return new ContentTypeOverridenHttpInputMessage(message, mediaTypesMap.get(accept));
			}
		}
	}

	public void setMediaTypesMap(Map<String, MediaType> mediaTypesMap) {
		this.mediaTypesMap = mediaTypesMap;
	}

	public void setMediaTypeParam(String mediaTypeParam) {
		this.mediaTypeParam = mediaTypeParam;
	}
}