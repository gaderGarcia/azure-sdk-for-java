/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network.models;

import com.microsoft.rest.BaseResource;

/**
 * The response body contains the status of the specified asynchronous
 * operation, indicating whether it has succeeded, is inprogress, or has
 * failed. Note that this status is distinct from the HTTP status code
 * returned for the Get Operation Status operation itself. If the
 * asynchronous operation succeeded, the response body includes the HTTP
 * status code for the successful request. If the asynchronous operation
 * failed, the response body includes the HTTP status code for the failed
 * request and error information regarding the failure.
 */
public class AzureAsyncOperationResult {
    /**
     * Status of the AzureAsuncOperation. Possible values for this property
     * include: 'InProgress', 'Succeeded', 'Failed'.
     */
    private String status;

    /**
     * The error property.
     */
    private Error error;

    /**
     * Get the status value.
     *
     * @return the status value
     */ 
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */ 
    public Error getError() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     */
    public void setError(Error error) {
        this.error = error;
    }

}
