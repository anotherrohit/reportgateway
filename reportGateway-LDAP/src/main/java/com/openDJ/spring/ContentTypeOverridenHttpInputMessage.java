package com.openDJ.spring;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.MediaType;

public class ContentTypeOverridenHttpInputMessage implements HttpInputMessage {

   private HttpInputMessage delegate;

   public ContentTypeOverridenHttpInputMessage(HttpInputMessage delagate, MediaType mediaType) {
      this.delegate = delagate;
      this.delegate.getHeaders().setAccept(Arrays.asList(mediaType));
   }

   @Override public InputStream getBody() throws IOException {
      return this.delegate.getBody();
   }

   @Override public HttpHeaders getHeaders() {
      return this.delegate.getHeaders();
   }
}