package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.gaussdb.v3.model.*;

public class GaussDBClient {
    protected HcClient hcClient;

    public GaussDBClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBClient> newBuilder() {
        return new ClientBuilder<>(GaussDBClient::new);
    }


    /**
     * 变更实例规格
     * 变更数据库实例的规格。
     *
     * @param ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return ChangeGaussMySqlInstanceSpecificationResponse
     */
    public ChangeGaussMySqlInstanceSpecificationResponse changeGaussMySqlInstanceSpecification(ChangeGaussMySqlInstanceSpecificationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.changeGaussMySqlInstanceSpecification);
    }

    /**
     * 变更实例规格
     * 变更数据库实例的规格。
     *
     * @param ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return SyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse>
     */
    public SyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecificationInvoker(ChangeGaussMySqlInstanceSpecificationRequest request) {
        return new SyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse>(request, GaussDBMeta.changeGaussMySqlInstanceSpecification, hcClient);
    }

    /**
     * 创建手动备份
     * 创建手动备份
     *
     * @param CreateGaussMySqlBackupRequest 请求对象
     * @return CreateGaussMySqlBackupResponse
     */
    public CreateGaussMySqlBackupResponse createGaussMySqlBackup(CreateGaussMySqlBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlBackup);
    }

    /**
     * 创建手动备份
     * 创建手动备份
     *
     * @param CreateGaussMySqlBackupRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse>
     */
    public SyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> createGaussMySqlBackupInvoker(CreateGaussMySqlBackupRequest request) {
        return new SyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse>(request, GaussDBMeta.createGaussMySqlBackup, hcClient);
    }

    /**
     * 创建数据库实例
     * 创建云数据库 GaussDB(for MySQL)实例。
     *
     * @param CreateGaussMySqlInstanceRequest 请求对象
     * @return CreateGaussMySqlInstanceResponse
     */
    public CreateGaussMySqlInstanceResponse createGaussMySqlInstance(CreateGaussMySqlInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlInstance);
    }

    /**
     * 创建数据库实例
     * 创建云数据库 GaussDB(for MySQL)实例。
     *
     * @param CreateGaussMySqlInstanceRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse>
     */
    public SyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> createGaussMySqlInstanceInvoker(CreateGaussMySqlInstanceRequest request) {
        return new SyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse>(request, GaussDBMeta.createGaussMySqlInstance, hcClient);
    }

    /**
     * 开启数据库代理
     * 开启数据库代理，只支持ELB模式。
     *
     * @param CreateGaussMySqlProxyRequest 请求对象
     * @return CreateGaussMySqlProxyResponse
     */
    public CreateGaussMySqlProxyResponse createGaussMySqlProxy(CreateGaussMySqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlProxy);
    }

    /**
     * 开启数据库代理
     * 开启数据库代理，只支持ELB模式。
     *
     * @param CreateGaussMySqlProxyRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse>
     */
    public SyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> createGaussMySqlProxyInvoker(CreateGaussMySqlProxyRequest request) {
        return new SyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse>(request, GaussDBMeta.createGaussMySqlProxy, hcClient);
    }

    /**
     * 创建只读节点
     * 创建只读节点。
     *
     * @param CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return CreateGaussMySqlReadonlyNodeResponse
     */
    public CreateGaussMySqlReadonlyNodeResponse createGaussMySqlReadonlyNode(CreateGaussMySqlReadonlyNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlReadonlyNode);
    }

    /**
     * 创建只读节点
     * 创建只读节点。
     *
     * @param CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse>
     */
    public SyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNodeInvoker(CreateGaussMySqlReadonlyNodeRequest request) {
        return new SyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse>(request, GaussDBMeta.createGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 删除实例
     * 删除数据库实例，不支持删除包周期实例。
     *
     * @param DeleteGaussMySqlInstanceRequest 请求对象
     * @return DeleteGaussMySqlInstanceResponse
     */
    public DeleteGaussMySqlInstanceResponse deleteGaussMySqlInstance(DeleteGaussMySqlInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlInstance);
    }

    /**
     * 删除实例
     * 删除数据库实例，不支持删除包周期实例。
     *
     * @param DeleteGaussMySqlInstanceRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse>
     */
    public SyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstanceInvoker(DeleteGaussMySqlInstanceRequest request) {
        return new SyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse>(request, GaussDBMeta.deleteGaussMySqlInstance, hcClient);
    }

    /**
     * 关闭数据库代理
     * 关闭数据库代理。
     *
     * @param DeleteGaussMySqlProxyRequest 请求对象
     * @return DeleteGaussMySqlProxyResponse
     */
    public DeleteGaussMySqlProxyResponse deleteGaussMySqlProxy(DeleteGaussMySqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlProxy);
    }

    /**
     * 关闭数据库代理
     * 关闭数据库代理。
     *
     * @param DeleteGaussMySqlProxyRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse>
     */
    public SyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxyInvoker(DeleteGaussMySqlProxyRequest request) {
        return new SyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse>(request, GaussDBMeta.deleteGaussMySqlProxy, hcClient);
    }

    /**
     * 删除只读节点
     * 删除实例的只读节点。多可用区模式删除只读节点时，要保证删除后，剩余的只读节点和主节点在不同的可用区中，否则无法删除该只读节点。
     *
     * @param DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return DeleteGaussMySqlReadonlyNodeResponse
     */
    public DeleteGaussMySqlReadonlyNodeResponse deleteGaussMySqlReadonlyNode(DeleteGaussMySqlReadonlyNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlReadonlyNode);
    }

    /**
     * 删除只读节点
     * 删除实例的只读节点。多可用区模式删除只读节点时，要保证删除后，剩余的只读节点和主节点在不同的可用区中，否则无法删除该只读节点。
     *
     * @param DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse>
     */
    public SyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNodeInvoker(DeleteGaussMySqlReadonlyNodeRequest request) {
        return new SyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse>(request, GaussDBMeta.deleteGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 包周期存储扩容
     * 包周期存储扩容
     *
     * @param ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return ExpandGaussMySqlInstanceVolumeResponse
     */
    public ExpandGaussMySqlInstanceVolumeResponse expandGaussMySqlInstanceVolume(ExpandGaussMySqlInstanceVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.expandGaussMySqlInstanceVolume);
    }

    /**
     * 包周期存储扩容
     * 包周期存储扩容
     *
     * @param ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return SyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse>
     */
    public SyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolumeInvoker(ExpandGaussMySqlInstanceVolumeRequest request) {
        return new SyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse>(request, GaussDBMeta.expandGaussMySqlInstanceVolume, hcClient);
    }

    /**
     * 扩容数据库代理节点的数量
     * 扩容数据库代理节点的数量。 DeC专属云账号暂不支持数据库代理。
     *
     * @param ExpandGaussMySqlProxyRequest 请求对象
     * @return ExpandGaussMySqlProxyResponse
     */
    public ExpandGaussMySqlProxyResponse expandGaussMySqlProxy(ExpandGaussMySqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.expandGaussMySqlProxy);
    }

    /**
     * 扩容数据库代理节点的数量
     * 扩容数据库代理节点的数量。 DeC专属云账号暂不支持数据库代理。
     *
     * @param ExpandGaussMySqlProxyRequest 请求对象
     * @return SyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse>
     */
    public SyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> expandGaussMySqlProxyInvoker(ExpandGaussMySqlProxyRequest request) {
        return new SyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse>(request, GaussDBMeta.expandGaussMySqlProxy, hcClient);
    }

    /**
     * 查询参数模板
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListGaussMySqlConfigurationsRequest 请求对象
     * @return ListGaussMySqlConfigurationsResponse
     */
    public ListGaussMySqlConfigurationsResponse listGaussMySqlConfigurations(ListGaussMySqlConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlConfigurations);
    }

    /**
     * 查询参数模板
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListGaussMySqlConfigurationsRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse>
     */
    public SyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurationsInvoker(ListGaussMySqlConfigurationsRequest request) {
        return new SyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse>(request, GaussDBMeta.listGaussMySqlConfigurations, hcClient);
    }

    /**
     * 查询专属资源池列表
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     *
     * @param ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return ListGaussMySqlDedicatedResourcesResponse
     */
    public ListGaussMySqlDedicatedResourcesResponse listGaussMySqlDedicatedResources(ListGaussMySqlDedicatedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlDedicatedResources);
    }

    /**
     * 查询专属资源池列表
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     *
     * @param ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse>
     */
    public SyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResourcesInvoker(ListGaussMySqlDedicatedResourcesRequest request) {
        return new SyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse>(request, GaussDBMeta.listGaussMySqlDedicatedResources, hcClient);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误日志。
     *
     * @param ListGaussMySqlErrorLogRequest 请求对象
     * @return ListGaussMySqlErrorLogResponse
     */
    public ListGaussMySqlErrorLogResponse listGaussMySqlErrorLog(ListGaussMySqlErrorLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlErrorLog);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误日志。
     *
     * @param ListGaussMySqlErrorLogRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse>
     */
    public SyncInvoker<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse> listGaussMySqlErrorLogInvoker(ListGaussMySqlErrorLogRequest request) {
        return new SyncInvoker<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse>(request, GaussDBMeta.listGaussMySqlErrorLog, hcClient);
    }

    /**
     * 查询实例列表
     * 根据指定条件查询实例列表。
     *
     * @param ListGaussMySqlInstancesRequest 请求对象
     * @return ListGaussMySqlInstancesResponse
     */
    public ListGaussMySqlInstancesResponse listGaussMySqlInstances(ListGaussMySqlInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstances);
    }

    /**
     * 查询实例列表
     * 根据指定条件查询实例列表。
     *
     * @param ListGaussMySqlInstancesRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse>
     */
    public SyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> listGaussMySqlInstancesInvoker(ListGaussMySqlInstancesRequest request) {
        return new SyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse>(request, GaussDBMeta.listGaussMySqlInstances, hcClient);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志
     *
     * @param ListGaussMySqlSlowLogRequest 请求对象
     * @return ListGaussMySqlSlowLogResponse
     */
    public ListGaussMySqlSlowLogResponse listGaussMySqlSlowLog(ListGaussMySqlSlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlSlowLog);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志
     *
     * @param ListGaussMySqlSlowLogRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse>
     */
    public SyncInvoker<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse> listGaussMySqlSlowLogInvoker(ListGaussMySqlSlowLogRequest request) {
        return new SyncInvoker<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse>(request, GaussDBMeta.listGaussMySqlSlowLog, hcClient);
    }

    /**
     * 重置数据库密码
     * 重置数据库密码
     *
     * @param ResetGaussMySqlPasswordRequest 请求对象
     * @return ResetGaussMySqlPasswordResponse
     */
    public ResetGaussMySqlPasswordResponse resetGaussMySqlPassword(ResetGaussMySqlPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.resetGaussMySqlPassword);
    }

    /**
     * 重置数据库密码
     * 重置数据库密码
     *
     * @param ResetGaussMySqlPasswordRequest 请求对象
     * @return SyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse>
     */
    public SyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> resetGaussMySqlPasswordInvoker(ResetGaussMySqlPasswordRequest request) {
        return new SyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse>(request, GaussDBMeta.resetGaussMySqlPassword, hcClient);
    }

    /**
     * 设置租户基于企业项目的资源配额
     * 设置指定企业项目的资源配额。
     *
     * @param SetGaussMySqlQuotasRequest 请求对象
     * @return SetGaussMySqlQuotasResponse
     */
    public SetGaussMySqlQuotasResponse setGaussMySqlQuotas(SetGaussMySqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.setGaussMySqlQuotas);
    }

    /**
     * 设置租户基于企业项目的资源配额
     * 设置指定企业项目的资源配额。
     *
     * @param SetGaussMySqlQuotasRequest 请求对象
     * @return SyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse>
     */
    public SyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> setGaussMySqlQuotasInvoker(SetGaussMySqlQuotasRequest request) {
        return new SyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse>(request, GaussDBMeta.setGaussMySqlQuotas, hcClient);
    }

    /**
     * 查询备份列表
     * 查询备份列表
     *
     * @param ShowGaussMySqlBackupListRequest 请求对象
     * @return ShowGaussMySqlBackupListResponse
     */
    public ShowGaussMySqlBackupListResponse showGaussMySqlBackupList(ShowGaussMySqlBackupListRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupList);
    }

    /**
     * 查询备份列表
     * 查询备份列表
     *
     * @param ShowGaussMySqlBackupListRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse>
     */
    public SyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> showGaussMySqlBackupListInvoker(ShowGaussMySqlBackupListRequest request) {
        return new SyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse>(request, GaussDBMeta.showGaussMySqlBackupList, hcClient);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return ShowGaussMySqlBackupPolicyResponse
     */
    public ShowGaussMySqlBackupPolicyResponse showGaussMySqlBackupPolicy(ShowGaussMySqlBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupPolicy);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse>
     */
    public SyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicyInvoker(ShowGaussMySqlBackupPolicyRequest request) {
        return new SyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse>(request, GaussDBMeta.showGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     * 获取指定数据库引擎对应的数据库版本信息。
     *
     * @param ShowGaussMySqlEngineVersionRequest 请求对象
     * @return ShowGaussMySqlEngineVersionResponse
     */
    public ShowGaussMySqlEngineVersionResponse showGaussMySqlEngineVersion(ShowGaussMySqlEngineVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlEngineVersion);
    }

    /**
     * 查询数据库引擎的版本
     * 获取指定数据库引擎对应的数据库版本信息。
     *
     * @param ShowGaussMySqlEngineVersionRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse>
     */
    public SyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersionInvoker(ShowGaussMySqlEngineVersionRequest request) {
        return new SyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse>(request, GaussDBMeta.showGaussMySqlEngineVersion, hcClient);
    }

    /**
     * 查询数据库规格
     * 获取指定数据库引擎版本对应的规格信息。
     *
     * @param ShowGaussMySqlFlavorsRequest 请求对象
     * @return ShowGaussMySqlFlavorsResponse
     */
    public ShowGaussMySqlFlavorsResponse showGaussMySqlFlavors(ShowGaussMySqlFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlFlavors);
    }

    /**
     * 查询数据库规格
     * 获取指定数据库引擎版本对应的规格信息。
     *
     * @param ShowGaussMySqlFlavorsRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse>
     */
    public SyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavorsInvoker(ShowGaussMySqlFlavorsRequest request) {
        return new SyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse>(request, GaussDBMeta.showGaussMySqlFlavors, hcClient);
    }

    /**
     * 查询实例详情信息
     * 查询实例详情信息
     *
     * @param ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return ShowGaussMySqlInstanceInfoResponse
     */
    public ShowGaussMySqlInstanceInfoResponse showGaussMySqlInstanceInfo(ShowGaussMySqlInstanceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlInstanceInfo);
    }

    /**
     * 查询实例详情信息
     * 查询实例详情信息
     *
     * @param ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse>
     */
    public SyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfoInvoker(ShowGaussMySqlInstanceInfoRequest request) {
        return new SyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse>(request, GaussDBMeta.showGaussMySqlInstanceInfo, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     * 获取指定ID的任务信息。
     *
     * @param ShowGaussMySqlJobInfoRequest 请求对象
     * @return ShowGaussMySqlJobInfoResponse
     */
    public ShowGaussMySqlJobInfoResponse showGaussMySqlJobInfo(ShowGaussMySqlJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     * 获取指定ID的任务信息。
     *
     * @param ShowGaussMySqlJobInfoRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse>
     */
    public SyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfoInvoker(ShowGaussMySqlJobInfoRequest request) {
        return new SyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse>(request, GaussDBMeta.showGaussMySqlJobInfo, hcClient);
    }

    /**
     * 查询租户的实例配额
     * 获取指定租户的资源配额。
     *
     * @param ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return ShowGaussMySqlProjectQuotasResponse
     */
    public ShowGaussMySqlProjectQuotasResponse showGaussMySqlProjectQuotas(ShowGaussMySqlProjectQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     * 获取指定租户的资源配额。
     *
     * @param ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse>
     */
    public SyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotasInvoker(ShowGaussMySqlProjectQuotasRequest request) {
        return new SyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse>(request, GaussDBMeta.showGaussMySqlProjectQuotas, hcClient);
    }

    /**
     * 查询数据库代理信息
     * 查询数据库代理信息。
     *
     * @param ShowGaussMySqlProxyRequest 请求对象
     * @return ShowGaussMySqlProxyResponse
     */
    public ShowGaussMySqlProxyResponse showGaussMySqlProxy(ShowGaussMySqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxy);
    }

    /**
     * 查询数据库代理信息
     * 查询数据库代理信息。
     *
     * @param ShowGaussMySqlProxyRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlProxyRequest, ShowGaussMySqlProxyResponse>
     */
    public SyncInvoker<ShowGaussMySqlProxyRequest, ShowGaussMySqlProxyResponse> showGaussMySqlProxyInvoker(ShowGaussMySqlProxyRequest request) {
        return new SyncInvoker<ShowGaussMySqlProxyRequest, ShowGaussMySqlProxyResponse>(request, GaussDBMeta.showGaussMySqlProxy, hcClient);
    }

    /**
     * 查询数据库代理规格信息
     * 查询数据库代理规格信息。
     *
     * @param ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return ShowGaussMySqlProxyFlavorsResponse
     */
    public ShowGaussMySqlProxyFlavorsResponse showGaussMySqlProxyFlavors(ShowGaussMySqlProxyFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxyFlavors);
    }

    /**
     * 查询数据库代理规格信息
     * 查询数据库代理规格信息。
     *
     * @param ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse>
     */
    public SyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavorsInvoker(ShowGaussMySqlProxyFlavorsRequest request) {
        return new SyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse>(request, GaussDBMeta.showGaussMySqlProxyFlavors, hcClient);
    }

    /**
     * 查询租户基于企业项目的资源配额
     * 获取指定企业项目的资源配额。
     *
     * @param ShowGaussMySqlQuotasRequest 请求对象
     * @return ShowGaussMySqlQuotasResponse
     */
    public ShowGaussMySqlQuotasResponse showGaussMySqlQuotas(ShowGaussMySqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlQuotas);
    }

    /**
     * 查询租户基于企业项目的资源配额
     * 获取指定企业项目的资源配额。
     *
     * @param ShowGaussMySqlQuotasRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse>
     */
    public SyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> showGaussMySqlQuotasInvoker(ShowGaussMySqlQuotasRequest request) {
        return new SyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse>(request, GaussDBMeta.showGaussMySqlQuotas, hcClient);
    }

    /**
     * 修改备份策略
     * 修改备份策略
     *
     * @param UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return UpdateGaussMySqlBackupPolicyResponse
     */
    public UpdateGaussMySqlBackupPolicyResponse updateGaussMySqlBackupPolicy(UpdateGaussMySqlBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlBackupPolicy);
    }

    /**
     * 修改备份策略
     * 修改备份策略
     *
     * @param UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse>
     */
    public SyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicyInvoker(UpdateGaussMySqlBackupPolicyRequest request) {
        return new SyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse>(request, GaussDBMeta.updateGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 修改实例名称
     * 修改实例名称
     *
     * @param UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return UpdateGaussMySqlInstanceNameResponse
     */
    public UpdateGaussMySqlInstanceNameResponse updateGaussMySqlInstanceName(UpdateGaussMySqlInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceName);
    }

    /**
     * 修改实例名称
     * 修改实例名称
     *
     * @param UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceNameInvoker(UpdateGaussMySqlInstanceNameRequest request) {
        return new SyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse>(request, GaussDBMeta.updateGaussMySqlInstanceName, hcClient);
    }

    /**
     * 修改租户基于企业项目的资源配额
     * 修改指定企业项目的资源配额。
     *
     * @param UpdateGaussMySqlQuotasRequest 请求对象
     * @return UpdateGaussMySqlQuotasResponse
     */
    public UpdateGaussMySqlQuotasResponse updateGaussMySqlQuotas(UpdateGaussMySqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlQuotas);
    }

    /**
     * 修改租户基于企业项目的资源配额
     * 修改指定企业项目的资源配额。
     *
     * @param UpdateGaussMySqlQuotasRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse>
     */
    public SyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotasInvoker(UpdateGaussMySqlQuotasRequest request) {
        return new SyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse>(request, GaussDBMeta.updateGaussMySqlQuotas, hcClient);
    }

}