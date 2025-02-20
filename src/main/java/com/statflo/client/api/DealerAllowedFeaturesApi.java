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

import com.statflo.client.ApiCallback;
import com.statflo.client.ApiClient;
import com.statflo.client.ApiException;
import com.statflo.client.ApiResponse;
import com.statflo.client.Configuration;
import com.statflo.client.Pair;
import com.statflo.client.ProgressRequestBody;
import com.statflo.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.statflo.client.model.DealerAllowedFeature;
import com.statflo.client.model.DealerAllowedFeatureCreate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DealerAllowedFeaturesApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public DealerAllowedFeaturesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DealerAllowedFeaturesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for dealerAllowedFeatureCreate
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dealerAllowedFeatureCreateCall(DealerAllowedFeatureCreate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v4/api/dealer-allowed-feature";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call dealerAllowedFeatureCreateValidateBeforeCall(DealerAllowedFeatureCreate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = dealerAllowedFeatureCreateCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Create a dealer allowed feature.
     * @param body  (optional)
     * @return DealerAllowedFeature
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DealerAllowedFeature dealerAllowedFeatureCreate(DealerAllowedFeatureCreate body) throws ApiException {
        ApiResponse<DealerAllowedFeature> resp = dealerAllowedFeatureCreateWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 
     * Create a dealer allowed feature.
     * @param body  (optional)
     * @return ApiResponse&lt;DealerAllowedFeature&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DealerAllowedFeature> dealerAllowedFeatureCreateWithHttpInfo(DealerAllowedFeatureCreate body) throws ApiException {
        com.squareup.okhttp.Call call = dealerAllowedFeatureCreateValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<DealerAllowedFeature>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a dealer allowed feature.
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dealerAllowedFeatureCreateAsync(DealerAllowedFeatureCreate body, final ApiCallback<DealerAllowedFeature> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = dealerAllowedFeatureCreateValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DealerAllowedFeature>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dealerAllowedFeatureDelete
     * @param dealer  (required)
     * @param feature  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dealerAllowedFeatureDeleteCall(String dealer, String feature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v4/api/dealer-allowed-feature/{dealer}/{feature}"
            .replaceAll("\\{" + "dealer" + "\\}", apiClient.escapeString(dealer.toString()))
            .replaceAll("\\{" + "feature" + "\\}", apiClient.escapeString(feature.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call dealerAllowedFeatureDeleteValidateBeforeCall(String dealer, String feature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'dealer' is set
        if (dealer == null) {
            throw new ApiException("Missing the required parameter 'dealer' when calling dealerAllowedFeatureDelete(Async)");
        }
        // verify the required parameter 'feature' is set
        if (feature == null) {
            throw new ApiException("Missing the required parameter 'feature' when calling dealerAllowedFeatureDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = dealerAllowedFeatureDeleteCall(dealer, feature, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Remove a dealer allowed feature.
     * @param dealer  (required)
     * @param feature  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void dealerAllowedFeatureDelete(String dealer, String feature) throws ApiException {
        dealerAllowedFeatureDeleteWithHttpInfo(dealer, feature);
    }

    /**
     * 
     * Remove a dealer allowed feature.
     * @param dealer  (required)
     * @param feature  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> dealerAllowedFeatureDeleteWithHttpInfo(String dealer, String feature) throws ApiException {
        com.squareup.okhttp.Call call = dealerAllowedFeatureDeleteValidateBeforeCall(dealer, feature, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Remove a dealer allowed feature.
     * @param dealer  (required)
     * @param feature  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dealerAllowedFeatureDeleteAsync(String dealer, String feature, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = dealerAllowedFeatureDeleteValidateBeforeCall(dealer, feature, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
