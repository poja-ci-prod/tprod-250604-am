package api.poja.app.handler.exceptionHandler;

import api.poja.app.PojaGenerated;

@PojaGenerated
public interface ExceptionHandler<R> {
  R handle(Throwable throwable);
}
