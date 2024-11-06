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
import com.statflo.client.model.Dealer;
import com.statflo.client.model.DealerPaginationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DealersApi
 */
@Ignore
public class DealersApiTest {

    private final DealersApi api = new DealersApi();

    /**
     * 
     *
     * Retrieve a dealer.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealerGetTest() throws ApiException {
        String id = null;
        Dealer response = api.dealerGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search dealers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dealerSearchTest() throws ApiException {
        HashMap filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        DealerPaginationResponse response = api.dealerSearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
}
