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
import com.statflo.client.model.Contact;
import com.statflo.client.model.ContactCreate;
import com.statflo.client.model.ContactPaginationResponse;
import com.statflo.client.model.ContactUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
@Ignore
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    /**
     * 
     *
     * Create a contact.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contactCreateTest() throws ApiException {
        Contact body = null;
        ContactCreate response = api.contactCreate(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove a contact.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contactDeleteTest() throws ApiException {
        String id = null;
        api.contactDelete(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve a contact.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contactGetTest() throws ApiException {
        String id = null;
        Contact response = api.contactGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrieve a contact.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contactGet_0Test() throws ApiException {
        String id = null;
        Contact response = api.contactGet_0(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search contacts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contactSearchTest() throws ApiException {
        HashMap filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        ContactPaginationResponse response = api.contactSearch(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search contacts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contactSearch_0Test() throws ApiException {
        HashMap filter = null;
        String query = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        ContactPaginationResponse response = api.contactSearch_0(filter, query, page, perPage, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a contact.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contactUpdateTest() throws ApiException {
        String id = null;
        ContactUpdate body = null;
        Contact response = api.contactUpdate(id, body);

        // TODO: test validations
    }
}