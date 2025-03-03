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
import com.statflo.client.model.Team;
import com.statflo.client.model.TeamCreate;
import com.statflo.client.model.TeamPaginationResponse;
import com.statflo.client.model.TeamUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
@Ignore
public class TeamsApiTest {

    private final TeamsApi api = new TeamsApi();

    /**
     * 
     *
     * Create a team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamCreateTest() throws ApiException {
        TeamCreate body = null;
        Team response = api.teamCreate(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove a team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamDeleteTest() throws ApiException {
        String id = null;
        api.teamDelete(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve a team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamGetTest() throws ApiException {
        String id = null;
        Team response = api.teamGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search teams.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamSearchTest() throws ApiException {
        HashMap filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        TeamPaginationResponse response = api.teamSearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamUpdateTest() throws ApiException {
        String id = null;
        TeamUpdate body = null;
        Team response = api.teamUpdate(id, body);

        // TODO: test validations
    }
}
