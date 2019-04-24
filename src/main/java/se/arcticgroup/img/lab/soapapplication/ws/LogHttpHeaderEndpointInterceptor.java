package se.arcticgroup.img.lab.soapapplication.ws;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;

public class LogHttpHeaderEndpointInterceptor implements EndpointInterceptor {

    @Override
    public void afterCompletion(MessageContext arg0, Object arg1, Exception arg2) throws Exception {
        //HttpLoggingUtils.logMessage("Handling fault", arg0.getRequest());
    }

    @Override
    public boolean handleFault(MessageContext messageContext, Object arg1) throws Exception {
        //HttpLoggingUtils.logMessage("Handling fault", messageContext.getRequest());
        return true;
    }

    @Override
    public boolean handleRequest(MessageContext messageContext, Object arg1) throws Exception {
        HttpLoggingUtils.logMessage("Server Request Message", messageContext.getRequest());

        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext, Object arg1) throws Exception {
        HttpLoggingUtils.logMessage("Server Response Message", messageContext.getResponse());

        return true;
    }

}
