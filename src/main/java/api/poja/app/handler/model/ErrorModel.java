package api.poja.app.handler.model;

import api.poja.app.PojaGenerated;
import com.fasterxml.jackson.annotation.JsonProperty;

@PojaGenerated
public record ErrorModel(@JsonProperty("message") String message) {}
