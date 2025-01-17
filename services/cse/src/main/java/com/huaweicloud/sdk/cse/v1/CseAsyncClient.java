package com.huaweicloud.sdk.cse.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cse.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class CseAsyncClient {

    protected HcClient hcClient;

    public CseAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CseAsyncClient> newBuilder() {
        return new ClientBuilder<>(CseAsyncClient::new);
    }

    /**
     * 创建微服务引擎专享版
     *
     * 创建微服务引擎专享版。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEngineRequest 请求对象
     * @return CompletableFuture<CreateEngineResponse>
     */
    public CompletableFuture<CreateEngineResponse> createEngineAsync(CreateEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.createEngine);
    }

    /**
     * 创建微服务引擎专享版
     *
     * 创建微服务引擎专享版。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEngineRequest 请求对象
     * @return AsyncInvoker<CreateEngineRequest, CreateEngineResponse>
     */
    public AsyncInvoker<CreateEngineRequest, CreateEngineResponse> createEngineAsyncInvoker(
        CreateEngineRequest request) {
        return new AsyncInvoker<CreateEngineRequest, CreateEngineResponse>(request, CseMeta.createEngine, hcClient);
    }

    /**
     * 删除微服务引擎专享版
     *
     * 删除微服务引擎专享版。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEngineRequest 请求对象
     * @return CompletableFuture<DeleteEngineResponse>
     */
    public CompletableFuture<DeleteEngineResponse> deleteEngineAsync(DeleteEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.deleteEngine);
    }

    /**
     * 删除微服务引擎专享版
     *
     * 删除微服务引擎专享版。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEngineRequest 请求对象
     * @return AsyncInvoker<DeleteEngineRequest, DeleteEngineResponse>
     */
    public AsyncInvoker<DeleteEngineRequest, DeleteEngineResponse> deleteEngineAsyncInvoker(
        DeleteEngineRequest request) {
        return new AsyncInvoker<DeleteEngineRequest, DeleteEngineResponse>(request, CseMeta.deleteEngine, hcClient);
    }

    /**
     * 导出kie配置
     *
     * 导出kie配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadKieRequest 请求对象
     * @return CompletableFuture<DownloadKieResponse>
     */
    public CompletableFuture<DownloadKieResponse> downloadKieAsync(DownloadKieRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.downloadKie);
    }

    /**
     * 导出kie配置
     *
     * 导出kie配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadKieRequest 请求对象
     * @return AsyncInvoker<DownloadKieRequest, DownloadKieResponse>
     */
    public AsyncInvoker<DownloadKieRequest, DownloadKieResponse> downloadKieAsyncInvoker(DownloadKieRequest request) {
        return new AsyncInvoker<DownloadKieRequest, DownloadKieResponse>(request, CseMeta.downloadKie, hcClient);
    }

    /**
     * 查询微服务引擎列表
     *
     * 查询微服务引擎列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnginesRequest 请求对象
     * @return CompletableFuture<ListEnginesResponse>
     */
    public CompletableFuture<ListEnginesResponse> listEnginesAsync(ListEnginesRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.listEngines);
    }

    /**
     * 查询微服务引擎列表
     *
     * 查询微服务引擎列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnginesRequest 请求对象
     * @return AsyncInvoker<ListEnginesRequest, ListEnginesResponse>
     */
    public AsyncInvoker<ListEnginesRequest, ListEnginesResponse> listEnginesAsyncInvoker(ListEnginesRequest request) {
        return new AsyncInvoker<ListEnginesRequest, ListEnginesResponse>(request, CseMeta.listEngines, hcClient);
    }

    /**
     * 查询微服务引擎专享版的规格列表
     *
     * 查询微服务引擎专享版的规格列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.listFlavors);
    }

    /**
     * 查询微服务引擎专享版的规格列表
     *
     * 查询微服务引擎专享版的规格列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, CseMeta.listFlavors, hcClient);
    }

    /**
     * 查询微服务引擎专享版详情
     *
     * 查询微服务引擎专享版详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEngineRequest 请求对象
     * @return CompletableFuture<ShowEngineResponse>
     */
    public CompletableFuture<ShowEngineResponse> showEngineAsync(ShowEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.showEngine);
    }

    /**
     * 查询微服务引擎专享版详情
     *
     * 查询微服务引擎专享版详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEngineRequest 请求对象
     * @return AsyncInvoker<ShowEngineRequest, ShowEngineResponse>
     */
    public AsyncInvoker<ShowEngineRequest, ShowEngineResponse> showEngineAsyncInvoker(ShowEngineRequest request) {
        return new AsyncInvoker<ShowEngineRequest, ShowEngineResponse>(request, CseMeta.showEngine, hcClient);
    }

    /**
     * 查询微服务引擎任务详情
     *
     * 查询微服务引擎任务详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEngineJobRequest 请求对象
     * @return CompletableFuture<ShowEngineJobResponse>
     */
    public CompletableFuture<ShowEngineJobResponse> showEngineJobAsync(ShowEngineJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.showEngineJob);
    }

    /**
     * 查询微服务引擎任务详情
     *
     * 查询微服务引擎任务详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEngineJobRequest 请求对象
     * @return AsyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse>
     */
    public AsyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse> showEngineJobAsyncInvoker(
        ShowEngineJobRequest request) {
        return new AsyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse>(request, CseMeta.showEngineJob, hcClient);
    }

    /**
     * 导入kie配置
     *
     * 导入kie配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadKieRequest 请求对象
     * @return CompletableFuture<UploadKieResponse>
     */
    public CompletableFuture<UploadKieResponse> uploadKieAsync(UploadKieRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.uploadKie);
    }

    /**
     * 导入kie配置
     *
     * 导入kie配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadKieRequest 请求对象
     * @return AsyncInvoker<UploadKieRequest, UploadKieResponse>
     */
    public AsyncInvoker<UploadKieRequest, UploadKieResponse> uploadKieAsyncInvoker(UploadKieRequest request) {
        return new AsyncInvoker<UploadKieRequest, UploadKieResponse>(request, CseMeta.uploadKie, hcClient);
    }

}
