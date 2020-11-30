package com.huaweicloud.sdk.ces.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.ces.v1.model.*;

public class CesClient {
    protected HcClient hcClient;

    public CesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesClient> newBuilder() {
        return new ClientBuilder<>(CesClient::new);
    }


    /**
     * 批量查询监控数据
     * 批量查询指定时间范围内指定指标的指定粒度的监控数据，目前最多支持10指标的批量查询。
     *
     * @param BatchListMetricDataRequest 请求对象
     * @return BatchListMetricDataResponse
     */
    public BatchListMetricDataResponse batchListMetricData(BatchListMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchListMetricData);
    }

    /**
     * 创建告警规则
     * 创建一条告警规则。
     *
     * @param CreateAlarmRequest 请求对象
     * @return CreateAlarmResponse
     */
    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createAlarm);
    }

    /**
     * 创建自定义告警模板
     * 创建自定义告警模板。
     *
     * @param CreateAlarmTemplateRequest 请求对象
     * @return CreateAlarmTemplateResponse
     */
    public CreateAlarmTemplateResponse createAlarmTemplate(CreateAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createAlarmTemplate);
    }

    /**
     * 上报事件
     * 上报自定义事件。
     *
     * @param CreateEventsRequest 请求对象
     * @return CreateEventsResponse
     */
    public CreateEventsResponse createEvents(CreateEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createEvents);
    }

    /**
     * 添加监控数据
     * 添加一条或多条指标监控数据。
     *
     * @param CreateMetricDataRequest 请求对象
     * @return CreateMetricDataResponse
     */
    public CreateMetricDataResponse createMetricData(CreateMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createMetricData);
    }

    /**
     * 创建资源分组
     * 创建资源分组，资源分组支持将各类资源按照业务集中进行分组管理，可以从分组角度查看监控与告警信息，以提升运维效率。
     *
     * @param CreateResourceGroupRequest 请求对象
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createResourceGroup);
    }

    /**
     * 删除告警规则
     * 删除一条告警规则。
     *
     * @param DeleteAlarmRequest 请求对象
     * @return DeleteAlarmResponse
     */
    public DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteAlarm);
    }

    /**
     * 删除自定义告警模板
     * 根据ID删除自定义告警模板。
     *
     * @param DeleteAlarmTemplateRequest 请求对象
     * @return DeleteAlarmTemplateResponse
     */
    public DeleteAlarmTemplateResponse deleteAlarmTemplate(DeleteAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteAlarmTemplate);
    }

    /**
     * 删除资源分组
     * 删除一条资源分组。
     *
     * @param DeleteResourceGroupRequest 请求对象
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroup(DeleteResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteResourceGroup);
    }

    /**
     * 查询告警历史
     * 查询告警历史列表。
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return ListAlarmHistoriesResponse
     */
    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    /**
     * 查询自定义告警模板列表
     * 查询自定义告警模板列表
     *
     * @param ListAlarmTemplatesRequest 请求对象
     * @return ListAlarmTemplatesResponse
     */
    public ListAlarmTemplatesResponse listAlarmTemplates(ListAlarmTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmTemplates);
    }

    /**
     * 查询告警规则列表
     * 查询告警规则列表，可以指定分页条件限制结果数量，可以指定排序规则。
     *
     * @param ListAlarmsRequest 请求对象
     * @return ListAlarmsResponse
     */
    public ListAlarmsResponse listAlarms(ListAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarms);
    }

    /**
     * 查询某一事件监控详情
     * 根据事件监控名称，查询该事件发生的详细信息。
     *
     * @param ListEventDetailRequest 请求对象
     * @return ListEventDetailResponse
     */
    public ListEventDetailResponse listEventDetail(ListEventDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listEventDetail);
    }

    /**
     * 查询事件监控列表
     * 查询事件监控列表，包括系统事件和自定义事件。
     *
     * @param ListEventsRequest 请求对象
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listEvents);
    }

    /**
     * 查询指标列表
     * 查询系统当前可监控指标列表，可以指定指标命名空间、指标名称、维度、排序方式，起始记录和最大记录条数过滤查询结果。
     *
     * @param ListMetricsRequest 请求对象
     * @return ListMetricsResponse
     */
    public ListMetricsResponse listMetrics(ListMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listMetrics);
    }

    /**
     * 查询所有资源分组
     * 查询所创建的所有资源分组。
     *
     * @param ListResourceGroupRequest 请求对象
     * @return ListResourceGroupResponse
     */
    public ListResourceGroupResponse listResourceGroup(ListResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listResourceGroup);
    }

    /**
     * 查询单条告警规则信息
     * 根据告警ID查询告警规则信息。
     *
     * @param ShowAlarmRequest 请求对象
     * @return ShowAlarmResponse
     */
    public ShowAlarmResponse showAlarm(ShowAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showAlarm);
    }

    /**
     * 查询主机配置数据
     * 查询指定时间范围指定事件类型的主机配置数据，可以通过参数指定需要查询的数据维度。注意：该接口提供给HANA场景下SAP Monitor查询主机配置数据，其他场景下查不到主机配置数据。
     *
     * @param ShowEventDataRequest 请求对象
     * @return ShowEventDataResponse
     */
    public ShowEventDataResponse showEventData(ShowEventDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showEventData);
    }

    /**
     * 查询监控数据
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     *
     * @param ShowMetricDataRequest 请求对象
     * @return ShowMetricDataResponse
     */
    public ShowMetricDataResponse showMetricData(ShowMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showMetricData);
    }

    /**
     * 查询配额
     * 查询用户可以创建的资源配额总数及当前使用量，当前仅有告警规则一种资源类型。
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showQuotas);
    }

    /**
     * 查询资源分组下的资源
     * 根据资源分组ID查询资源分组下的资源。
     *
     * @param ShowResourceGroupRequest 请求对象
     * @return ShowResourceGroupResponse
     */
    public ShowResourceGroupResponse showResourceGroup(ShowResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showResourceGroup);
    }

    /**
     * 修改告警规则
     * 修改告警规则。
     *
     * @param UpdateAlarmRequest 请求对象
     * @return UpdateAlarmResponse
     */
    public UpdateAlarmResponse updateAlarm(UpdateAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarm);
    }

    /**
     * 启停告警规则
     * 启动或停止一条告警规则。
     *
     * @param UpdateAlarmActionRequest 请求对象
     * @return UpdateAlarmActionResponse
     */
    public UpdateAlarmActionResponse updateAlarmAction(UpdateAlarmActionRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmAction);
    }

    /**
     * 更新自定义告警模板
     * 更新自定义告警模板。
     *
     * @param UpdateAlarmTemplateRequest 请求对象
     * @return UpdateAlarmTemplateResponse
     */
    public UpdateAlarmTemplateResponse updateAlarmTemplate(UpdateAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmTemplate);
    }

    /**
     * 更新资源分组
     * 更新资源分组，资源分组支持将各类资源按照业务集中进行分组管理，可以从分组角度查看监控与告警信息，以提升运维效率。
     *
     * @param UpdateResourceGroupRequest 请求对象
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroup(UpdateResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateResourceGroup);
    }

}