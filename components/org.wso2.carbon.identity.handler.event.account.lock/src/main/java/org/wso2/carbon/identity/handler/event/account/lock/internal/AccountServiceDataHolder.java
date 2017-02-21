/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations und
 */

package org.wso2.carbon.identity.handler.event.account.lock.internal;

import org.osgi.framework.BundleContext;
import org.wso2.carbon.identity.event.EventService;
import org.wso2.carbon.identity.mgt.RealmService;

/**
 * AccountServiceDataHolder class
 */
public class AccountServiceDataHolder {

    private static volatile AccountServiceDataHolder accountServiceDataHolder = new AccountServiceDataHolder();

    private BundleContext bundleContext;
    private EventService identityEventService;
    private RealmService realmService;

    private AccountServiceDataHolder(){

    }

    /**
     * Get AccountServiceDataHolder instance
     * @return : AccountServiceDataHolder
     */
    public static AccountServiceDataHolder getInstance() {
        return accountServiceDataHolder;
    }


    /**
     * get Bundle context
     * @return : BundleContext
     */
    public BundleContext getBundleContext() {
        return bundleContext;
    }

    public void setBundleContext(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }

    /**
     * Get Identity Event Service
     * @return : EventService
     */
    public EventService getIdentityEventService() {
        return identityEventService;
    }

    /**
     * Set Identity Event Service
     * @param identityEventService : EventService
     */
    public void setIdentityEventService(EventService identityEventService) {
        this.identityEventService = identityEventService;
    }

    /**
     * Get Realm Service
     * @return RealmService
     */
    public RealmService getRealmService() {
        return realmService;
    }

    /**
     * Set Realm Service
     * @param realmService :realmService
     */
    public void setRealmService(RealmService realmService) {
        this.realmService = realmService;
    }
}
