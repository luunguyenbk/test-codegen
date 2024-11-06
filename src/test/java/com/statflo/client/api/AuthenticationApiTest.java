/*
 * Statflo API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.statflo.client.api;

import com.statflo.client.ApiException;
import com.statflo.client.model.AuthLoginBody;
import com.statflo.client.model.InlineResponse200;
import com.statflo.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Ignore
public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    /**
     * 
     *
     * Get currently logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authMeTest() throws ApiException {
        User response = api.authMe();

        // TODO: test validations
    }
    /**
     * 
     *
     * Log in.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        AuthLoginBody body = null;
        InlineResponse200 response = api.login(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Log out.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logoutTest() throws ApiException {
        api.logout();

        // TODO: test validations
    }
    /**
     * 
     *
     * Switch active dealer.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void switchDealerTest() throws ApiException {
        Integer dealerId = null;
        Integer roleId = null;
        api.switchDealer(dealerId, roleId);

        // TODO: test validations
    }
}
