/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.mysql.v2020_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mysql.v2020_01_01.LocationBasedRecommendedActionSessionsResults;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mysql.v2020_01_01.RecommendationAction;

class LocationBasedRecommendedActionSessionsResultsImpl extends WrapperImpl<LocationBasedRecommendedActionSessionsResultsInner> implements LocationBasedRecommendedActionSessionsResults {
    private final MySQLManager manager;

    LocationBasedRecommendedActionSessionsResultsImpl(MySQLManager manager) {
        super(manager.inner().locationBasedRecommendedActionSessionsResults());
        this.manager = manager;
    }

    public MySQLManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RecommendationAction> listAsync(final String locationName, final String operationId) {
        LocationBasedRecommendedActionSessionsResultsInner client = this.inner();
        return client.listAsync(locationName, operationId)
        .flatMapIterable(new Func1<Page<RecommendationActionInner>, Iterable<RecommendationActionInner>>() {
            @Override
            public Iterable<RecommendationActionInner> call(Page<RecommendationActionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RecommendationActionInner, RecommendationAction>() {
            @Override
            public RecommendationAction call(RecommendationActionInner inner) {
                return new RecommendationActionImpl(inner, manager());
            }
        });
    }

}
