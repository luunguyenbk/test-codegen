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
import com.statflo.client.model.Region;
import com.statflo.client.model.RegionCreate;
import com.statflo.client.model.RegionPaginationResponse;
import com.statflo.client.model.RegionUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RegionsApi
 */
@Ignore
public class RegionsApiTest {

    private final RegionsApi api = new RegionsApi();

    /**
     * 
     *
     * Create a region.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void regionCreateTest() throws ApiException {
        RegionCreate body = null;
        Region response = api.regionCreate(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove a region.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void regionDeleteTest() throws ApiException {
        String id = null;
        api.regionDelete(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve a region.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void regionGetTest() throws ApiException {
        String id = null;
        Region response = api.regionGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search regions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void regionSearchTest() throws ApiException {
        HashMap filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        RegionPaginationResponse response = api.regionSearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a district.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void regionUpdateTest() throws ApiException {
        String id = null;
        RegionUpdate body = null;
        Region response = api.regionUpdate(id, body);

        // TODO: test validations
    }
}
