/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.core.http;

import com.huaweicloud.sdk.core.HttpListener;
import com.huaweicloud.sdk.core.ssl.DefaultSSLSocketFactory;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.internal.Util;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author HuaweiCloud_SDK
 */
public class HttpConfig {
    private static final int DEFAULT_CONNECTION_TIMEOUT = 60;

    private static final int MAXIMUM_POOL_SIZE = 16;

    private static final long KEEP_ALIVE_TIME = 60L;

    private static final ExecutorService DEFAULT_EXECUTOR_SERVICE = new ThreadPoolExecutor(0, MAXIMUM_POOL_SIZE,
            KEEP_ALIVE_TIME, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));

    private int timeout = DEFAULT_CONNECTION_TIMEOUT;

    private boolean ignoreSSLVerification = false;

    private boolean ignoreRequiredValidation = false;

    private String proxyUsername;

    private String proxyPassword;

    private String proxyHost;

    private int proxyPort;

    private SSLSocketFactory sslSocketFactory = DefaultSSLSocketFactory.getDefaultSSLSocketFactory();

    private X509TrustManager trustManager = DefaultSSLSocketFactory.getDefaultX509TrustManager();

    private List<HttpListener> httpListeners = new ArrayList<>();

    private ConnectionPool connectionPool = new ConnectionPool(5, 5L, TimeUnit.MINUTES);

    private Dispatcher dispatcher = new Dispatcher(DEFAULT_EXECUTOR_SERVICE);

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public HttpConfig withTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public boolean isIgnoreSSLVerification() {
        return this.ignoreSSLVerification;
    }

    public void setIgnoreSSLVerification(boolean ignoreSSLVerification) {
        this.ignoreSSLVerification = ignoreSSLVerification;
    }

    public HttpConfig withIgnoreSSLVerification(boolean ignoreSSLVerification) {
        this.ignoreSSLVerification = ignoreSSLVerification;
        return this;
    }

    public boolean isIgnoreRequiredValidation() {
        return ignoreRequiredValidation;
    }

    public void setIgnoreRequiredValidation(boolean ignoreRequiredValidation) {
        this.ignoreRequiredValidation = ignoreRequiredValidation;
    }

    public HttpConfig withIgnoreRequiredValidation(boolean ignoreRequiredValidation) {
        this.ignoreRequiredValidation = ignoreRequiredValidation;
        return this;
    }

    public String getProxyUsername() {
        return proxyUsername;
    }

    public void setProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
    }

    public HttpConfig withProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
        return this;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public HttpConfig withProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
        return this;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public HttpConfig withProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
        return this;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public HttpConfig withProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
        return this;
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return sslSocketFactory;
    }

    public void setSSLSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
    }

    public HttpConfig withSSLSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
        return this;
    }

    public X509TrustManager getX509TrustManager() {
        return trustManager;
    }

    public void setX509TrustManager(X509TrustManager trustManager) {
        this.trustManager = trustManager;
    }

    public HttpConfig withX509TrustManager(X509TrustManager trustManager) {
        this.trustManager = trustManager;
        return this;
    }

    public static HttpConfig getDefaultHttpConfig() {
        return new HttpConfig();
    }

    public List<HttpListener> getHttpListeners() {
        return httpListeners;
    }

    public void setHttpListeners(List<HttpListener> httpListeners) {
        this.httpListeners = httpListeners;
    }

    public HttpConfig withHttpListeners(List<HttpListener> httpListeners) {
        this.httpListeners = httpListeners;
        return this;
    }

    public HttpConfig addHttpListener(HttpListener httpListener) {
        if (Objects.isNull(httpListener)) {
            return this;
        }
        httpListeners.add(httpListener);
        return this;
    }

    public ConnectionPool getConnectionPool() {
        return connectionPool;
    }

    public void setConnectionPool(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public HttpConfig withConnectionPool(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
        return this;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public HttpConfig withDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
        return this;
    }
}
