package se.arcticgroup.img.lab.soapapplication.ws;

import https.tempuri.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import se.arcticgroup.img.lab.soapapplication.database.*;


@Endpoint
public class PasswordEndpoint {
    private static final String NAMESPACE_URI = "https://tempuri.org/";
    Logger logger = LoggerFactory.getLogger(PasswordEndpoint.class);
    @Autowired
    private PasswordDao passwordDao;

    @Autowired
    public PasswordEndpoint() {

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPassword")
    @ResponsePayload
    public GetPasswordResponse getPassword (@RequestPayload GetPassword request) {
        https.tempuri.PasswordRequest passwordRequest = request.getPasswordWSRequest();

        logger.info("Received request:");
        logger.info("Address:            {}", passwordRequest.getAddress());
        logger.info("AppID:              {}", passwordRequest.getAppID());
        logger.info("Connection Timeout: {}", passwordRequest.getConnectionTimeout());
        logger.info("Database:           {}", passwordRequest.getDatabase());
        logger.info("Folder:             {}", passwordRequest.getFolder());
        logger.info("Object:             {}", passwordRequest.getObject());
        logger.info("PolicyId:           {}", passwordRequest.getPolicyID());
        logger.info("Query:              {}", passwordRequest.getQuery());
        logger.info("QueryFormat:        {}", passwordRequest.getQueryFormat());
        logger.info("Reason:             {}", passwordRequest.getReason());
        logger.info("Safe:               {}", passwordRequest.getSafe());
        logger.info("Username:           {}", passwordRequest.getUserName());


        logger.info("Keyandvalue:");
        if(passwordRequest.getAttributes() != null) {
            for (https.tempuri.Keyandvalue kv : passwordRequest.getAttributes().getKeyAndValue()) {
                logger.info("Key: {}, Value: {}", kv.getKey(), kv.getValue());
            }
        }
        logger.info("End keyandvalue");


        GetPasswordResponse response = new GetPasswordResponse();
        PasswordResponse passwordResponse = new PasswordResponse();

        passwordResponse.setAddress("address");
        passwordResponse.setContent("content");
        passwordResponse.setDatabase("database");
        passwordResponse.setPolicyID("PolicyID");
        passwordResponse.setUserName("username");

        Keyandvalue keyandvalue = new Keyandvalue();
        keyandvalue.setKey("key1");
        keyandvalue.setValue("value1");

        ArrayOfKeyAndValue arrayOfKeyAndValue = new ArrayOfKeyAndValue();
        arrayOfKeyAndValue.getKeyAndValue().add(keyandvalue);

        passwordResponse.setProperties(arrayOfKeyAndValue);

        response.setGetPasswordResult(passwordResponse);

        return response;
    }

}