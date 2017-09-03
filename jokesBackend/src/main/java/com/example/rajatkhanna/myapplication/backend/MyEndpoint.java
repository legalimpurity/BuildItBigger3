/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.rajatkhanna.myapplication.backend;

import com.example.jokeProvider;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.rajatkhanna.example.com",
                ownerName = "backend.myapplication.rajatkhanna.example.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "returnAJoke")
    public MyBean returnAJoke() {
        MyBean response = new MyBean();
        response.setData(jokeProvider.getJoke());
        return response;
    }

}
