package com.huaweicloud.sdk.meeting.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.meeting.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class MeetingAsyncClient {

    protected HcClient hcClient;

    public MeetingAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MeetingAsyncClient> newBuilder() {
        return new ClientBuilder<>(MeetingAsyncClient::new, "MeetingCredentials");
    }

    /**
     * SP管理员创建企业
     *
     * 创建企业，默认管理员及分配资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddCorpRequest 请求对象
     * @return CompletableFuture<AddCorpResponse>
     */
    public CompletableFuture<AddCorpResponse> addCorpAsync(AddCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addCorp);
    }

    /**
     * SP管理员创建企业
     *
     * 创建企业，默认管理员及分配资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddCorpRequest 请求对象
     * @return AsyncInvoker<AddCorpRequest, AddCorpResponse>
     */
    public AsyncInvoker<AddCorpRequest, AddCorpResponse> addCorpAsyncInvoker(AddCorpRequest request) {
        return new AsyncInvoker<AddCorpRequest, AddCorpResponse>(request, MeetingMeta.addCorp, hcClient);
    }

    /**
     * 添加企业管理员
     *
     * 企业默认管理员添加企业普通管理员
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddCorpAdminRequest 请求对象
     * @return CompletableFuture<AddCorpAdminResponse>
     */
    public CompletableFuture<AddCorpAdminResponse> addCorpAdminAsync(AddCorpAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addCorpAdmin);
    }

    /**
     * 添加企业管理员
     *
     * 企业默认管理员添加企业普通管理员
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddCorpAdminRequest 请求对象
     * @return AsyncInvoker<AddCorpAdminRequest, AddCorpAdminResponse>
     */
    public AsyncInvoker<AddCorpAdminRequest, AddCorpAdminResponse> addCorpAdminAsyncInvoker(
        AddCorpAdminRequest request) {
        return new AsyncInvoker<AddCorpAdminRequest, AddCorpAdminResponse>(request, MeetingMeta.addCorpAdmin, hcClient);
    }

    /**
     * 添加部门
     *
     * 企业管理员通过该接口添加部门，最多支持10级部门，每级子部门最多支持100个，默认企业最大部门数量为3000个。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddDepartmentRequest 请求对象
     * @return CompletableFuture<AddDepartmentResponse>
     */
    public CompletableFuture<AddDepartmentResponse> addDepartmentAsync(AddDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addDepartment);
    }

    /**
     * 添加部门
     *
     * 企业管理员通过该接口添加部门，最多支持10级部门，每级子部门最多支持100个，默认企业最大部门数量为3000个。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddDepartmentRequest 请求对象
     * @return AsyncInvoker<AddDepartmentRequest, AddDepartmentResponse>
     */
    public AsyncInvoker<AddDepartmentRequest, AddDepartmentResponse> addDepartmentAsyncInvoker(
        AddDepartmentRequest request) {
        return new AsyncInvoker<AddDepartmentRequest, AddDepartmentResponse>(request, MeetingMeta.addDepartment,
            hcClient);
    }

    /**
     * 增加终端
     *
     * 企业管理员通过该接口添加硬终端。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddDeviceRequest 请求对象
     * @return CompletableFuture<AddDeviceResponse>
     */
    public CompletableFuture<AddDeviceResponse> addDeviceAsync(AddDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addDevice);
    }

    /**
     * 增加终端
     *
     * 企业管理员通过该接口添加硬终端。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddDeviceRequest 请求对象
     * @return AsyncInvoker<AddDeviceRequest, AddDeviceResponse>
     */
    public AsyncInvoker<AddDeviceRequest, AddDeviceResponse> addDeviceAsyncInvoker(AddDeviceRequest request) {
        return new AsyncInvoker<AddDeviceRequest, AddDeviceResponse>(request, MeetingMeta.addDevice, hcClient);
    }

    /**
     * 新增信息窗素材
     *
     * 新增信息窗素材（上传素材文件）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddMaterialRequest 请求对象
     * @return CompletableFuture<AddMaterialResponse>
     */
    public CompletableFuture<AddMaterialResponse> addMaterialAsync(AddMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addMaterial);
    }

    /**
     * 新增信息窗素材
     *
     * 新增信息窗素材（上传素材文件）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddMaterialRequest 请求对象
     * @return AsyncInvoker<AddMaterialRequest, AddMaterialResponse>
     */
    public AsyncInvoker<AddMaterialRequest, AddMaterialResponse> addMaterialAsyncInvoker(AddMaterialRequest request) {
        return new AsyncInvoker<AddMaterialRequest, AddMaterialResponse>(request, MeetingMeta.addMaterial, hcClient);
    }

    /**
     * 新增信息窗节目
     *
     * 新增信息窗节目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddProgramRequest 请求对象
     * @return CompletableFuture<AddProgramResponse>
     */
    public CompletableFuture<AddProgramResponse> addProgramAsync(AddProgramRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addProgram);
    }

    /**
     * 新增信息窗节目
     *
     * 新增信息窗节目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddProgramRequest 请求对象
     * @return AsyncInvoker<AddProgramRequest, AddProgramResponse>
     */
    public AsyncInvoker<AddProgramRequest, AddProgramResponse> addProgramAsyncInvoker(AddProgramRequest request) {
        return new AsyncInvoker<AddProgramRequest, AddProgramResponse>(request, MeetingMeta.addProgram, hcClient);
    }

    /**
     * 新增信息窗发布
     *
     * 新增信息窗发布
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddPublicationRequest 请求对象
     * @return CompletableFuture<AddPublicationResponse>
     */
    public CompletableFuture<AddPublicationResponse> addPublicationAsync(AddPublicationRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addPublication);
    }

    /**
     * 新增信息窗发布
     *
     * 新增信息窗发布
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddPublicationRequest 请求对象
     * @return AsyncInvoker<AddPublicationRequest, AddPublicationResponse>
     */
    public AsyncInvoker<AddPublicationRequest, AddPublicationResponse> addPublicationAsyncInvoker(
        AddPublicationRequest request) {
        return new AsyncInvoker<AddPublicationRequest, AddPublicationResponse>(request, MeetingMeta.addPublication,
            hcClient);
    }

    /**
     * SP管理员分配企业资源
     *
     * 企业新增资源发放。优化适配，该接口同时支持修改，带resourceId后会判断该资源是否存在，存在即修改（支持修改的参数见修改接口），否则按新增处理
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddResourceRequest 请求对象
     * @return CompletableFuture<AddResourceResponse>
     */
    public CompletableFuture<AddResourceResponse> addResourceAsync(AddResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addResource);
    }

    /**
     * SP管理员分配企业资源
     *
     * 企业新增资源发放。优化适配，该接口同时支持修改，带resourceId后会判断该资源是否存在，存在即修改（支持修改的参数见修改接口），否则按新增处理
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddResourceRequest 请求对象
     * @return AsyncInvoker<AddResourceRequest, AddResourceResponse>
     */
    public AsyncInvoker<AddResourceRequest, AddResourceResponse> addResourceAsyncInvoker(AddResourceRequest request) {
        return new AsyncInvoker<AddResourceRequest, AddResourceResponse>(request, MeetingMeta.addResource, hcClient);
    }

    /**
     * 保存会议纪要到个人云空间
     *
     * 用户使用手机扫码后，手机端请求服务端将当前会议纪要文件保存到个人云空间。二维码内容  cloudlink://cloudlink.huawei.com/h5page?action&#x3D;SAVE_MEETING_FILE&amp;key1&#x3D;value1&amp;key2&#x3D;value2    key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddToPersonalSpaceRequest 请求对象
     * @return CompletableFuture<AddToPersonalSpaceResponse>
     */
    public CompletableFuture<AddToPersonalSpaceResponse> addToPersonalSpaceAsync(AddToPersonalSpaceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addToPersonalSpace);
    }

    /**
     * 保存会议纪要到个人云空间
     *
     * 用户使用手机扫码后，手机端请求服务端将当前会议纪要文件保存到个人云空间。二维码内容  cloudlink://cloudlink.huawei.com/h5page?action&#x3D;SAVE_MEETING_FILE&amp;key1&#x3D;value1&amp;key2&#x3D;value2    key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddToPersonalSpaceRequest 请求对象
     * @return AsyncInvoker<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse>
     */
    public AsyncInvoker<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> addToPersonalSpaceAsyncInvoker(
        AddToPersonalSpaceRequest request) {
        return new AsyncInvoker<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse>(request,
            MeetingMeta.addToPersonalSpace, hcClient);
    }

    /**
     * 添加用户
     *
     * 企业管理员通过该接口添加企业用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddUserRequest 请求对象
     * @return CompletableFuture<AddUserResponse>
     */
    public CompletableFuture<AddUserResponse> addUserAsync(AddUserRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addUser);
    }

    /**
     * 添加用户
     *
     * 企业管理员通过该接口添加企业用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddUserRequest 请求对象
     * @return AsyncInvoker<AddUserRequest, AddUserResponse>
     */
    public AsyncInvoker<AddUserRequest, AddUserResponse> addUserAsyncInvoker(AddUserRequest request) {
        return new AsyncInvoker<AddUserRequest, AddUserResponse>(request, MeetingMeta.addUser, hcClient);
    }

    /**
     * 与会者自己解除静音
     *
     * 决定与会者是否可以自己解除静音。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AllowGuestUnmuteRequest 请求对象
     * @return CompletableFuture<AllowGuestUnmuteResponse>
     */
    public CompletableFuture<AllowGuestUnmuteResponse> allowGuestUnmuteAsync(AllowGuestUnmuteRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.allowGuestUnmute);
    }

    /**
     * 与会者自己解除静音
     *
     * 决定与会者是否可以自己解除静音。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AllowGuestUnmuteRequest 请求对象
     * @return AsyncInvoker<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse>
     */
    public AsyncInvoker<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> allowGuestUnmuteAsyncInvoker(
        AllowGuestUnmuteRequest request) {
        return new AsyncInvoker<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse>(request,
            MeetingMeta.allowGuestUnmute, hcClient);
    }

    /**
     * 分配云会议室
     *
     * 企业管理员通过该接口将云会议室分配给用户、硬终端（当前仅支持分配TE10、TE20、HUAWEI Board、HUAWEI Bar 500及HUAWEI Box系列硬件终端）。云会议室分配给硬件终端后，需要重启或重新激活硬件终端。若需要管理云会议室、预约会议、录制会议或进行完整的会控操作，请同时将该云会议室分配给会议用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateVmrRequest 请求对象
     * @return CompletableFuture<AssociateVmrResponse>
     */
    public CompletableFuture<AssociateVmrResponse> associateVmrAsync(AssociateVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.associateVmr);
    }

    /**
     * 分配云会议室
     *
     * 企业管理员通过该接口将云会议室分配给用户、硬终端（当前仅支持分配TE10、TE20、HUAWEI Board、HUAWEI Bar 500及HUAWEI Box系列硬件终端）。云会议室分配给硬件终端后，需要重启或重新激活硬件终端。若需要管理云会议室、预约会议、录制会议或进行完整的会控操作，请同时将该云会议室分配给会议用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateVmrRequest 请求对象
     * @return AsyncInvoker<AssociateVmrRequest, AssociateVmrResponse>
     */
    public AsyncInvoker<AssociateVmrRequest, AssociateVmrResponse> associateVmrAsyncInvoker(
        AssociateVmrRequest request) {
        return new AsyncInvoker<AssociateVmrRequest, AssociateVmrResponse>(request, MeetingMeta.associateVmr, hcClient);
    }

    /**
     * 批量删除企业管理员
     *
     * 批量删除企业管理员
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteCorpAdminsRequest 请求对象
     * @return CompletableFuture<BatchDeleteCorpAdminsResponse>
     */
    public CompletableFuture<BatchDeleteCorpAdminsResponse> batchDeleteCorpAdminsAsync(
        BatchDeleteCorpAdminsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteCorpAdmins);
    }

    /**
     * 批量删除企业管理员
     *
     * 批量删除企业管理员
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteCorpAdminsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse>
     */
    public AsyncInvoker<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> batchDeleteCorpAdminsAsyncInvoker(
        BatchDeleteCorpAdminsRequest request) {
        return new AsyncInvoker<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse>(request,
            MeetingMeta.batchDeleteCorpAdmins, hcClient);
    }

    /**
     * 批量删除终端
     *
     * 企业管理员通过该接口批量删除终端，返回删除失败的列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteDevicesRequest 请求对象
     * @return CompletableFuture<BatchDeleteDevicesResponse>
     */
    public CompletableFuture<BatchDeleteDevicesResponse> batchDeleteDevicesAsync(BatchDeleteDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteDevices);
    }

    /**
     * 批量删除终端
     *
     * 企业管理员通过该接口批量删除终端，返回删除失败的列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteDevicesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse>
     */
    public AsyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevicesAsyncInvoker(
        BatchDeleteDevicesRequest request) {
        return new AsyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse>(request,
            MeetingMeta.batchDeleteDevices, hcClient);
    }

    /**
     * 删除信息窗素材
     *
     * 删除信息窗素材
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteMaterialsRequest 请求对象
     * @return CompletableFuture<BatchDeleteMaterialsResponse>
     */
    public CompletableFuture<BatchDeleteMaterialsResponse> batchDeleteMaterialsAsync(
        BatchDeleteMaterialsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteMaterials);
    }

    /**
     * 删除信息窗素材
     *
     * 删除信息窗素材
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteMaterialsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse>
     */
    public AsyncInvoker<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> batchDeleteMaterialsAsyncInvoker(
        BatchDeleteMaterialsRequest request) {
        return new AsyncInvoker<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse>(request,
            MeetingMeta.batchDeleteMaterials, hcClient);
    }

    /**
     * 删除信息窗节目
     *
     * 删除信息窗节目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteProgramsRequest 请求对象
     * @return CompletableFuture<BatchDeleteProgramsResponse>
     */
    public CompletableFuture<BatchDeleteProgramsResponse> batchDeleteProgramsAsync(BatchDeleteProgramsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeletePrograms);
    }

    /**
     * 删除信息窗节目
     *
     * 删除信息窗节目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteProgramsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse>
     */
    public AsyncInvoker<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> batchDeleteProgramsAsyncInvoker(
        BatchDeleteProgramsRequest request) {
        return new AsyncInvoker<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse>(request,
            MeetingMeta.batchDeletePrograms, hcClient);
    }

    /**
     * 删除信息窗发布
     *
     * 删除信息窗发布
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeletePublicationsRequest 请求对象
     * @return CompletableFuture<BatchDeletePublicationsResponse>
     */
    public CompletableFuture<BatchDeletePublicationsResponse> batchDeletePublicationsAsync(
        BatchDeletePublicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeletePublications);
    }

    /**
     * 删除信息窗发布
     *
     * 删除信息窗发布
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeletePublicationsRequest 请求对象
     * @return AsyncInvoker<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse>
     */
    public AsyncInvoker<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> batchDeletePublicationsAsyncInvoker(
        BatchDeletePublicationsRequest request) {
        return new AsyncInvoker<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse>(request,
            MeetingMeta.batchDeletePublications, hcClient);
    }

    /**
     * 批量删除用户
     *
     * 企业管理员通过该接口批量删除企业用户，全量成功或全量失败。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteUsersRequest 请求对象
     * @return CompletableFuture<BatchDeleteUsersResponse>
     */
    public CompletableFuture<BatchDeleteUsersResponse> batchDeleteUsersAsync(BatchDeleteUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteUsers);
    }

    /**
     * 批量删除用户
     *
     * 企业管理员通过该接口批量删除企业用户，全量成功或全量失败。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteUsersRequest 请求对象
     * @return AsyncInvoker<BatchDeleteUsersRequest, BatchDeleteUsersResponse>
     */
    public AsyncInvoker<BatchDeleteUsersRequest, BatchDeleteUsersResponse> batchDeleteUsersAsyncInvoker(
        BatchDeleteUsersRequest request) {
        return new AsyncInvoker<BatchDeleteUsersRequest, BatchDeleteUsersResponse>(request,
            MeetingMeta.batchDeleteUsers, hcClient);
    }

    /**
     * 批量修改终端状态
     *
     * 批量修改终端状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchUpdateDevicesStatusRequest 请求对象
     * @return CompletableFuture<BatchUpdateDevicesStatusResponse>
     */
    public CompletableFuture<BatchUpdateDevicesStatusResponse> batchUpdateDevicesStatusAsync(
        BatchUpdateDevicesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchUpdateDevicesStatus);
    }

    /**
     * 批量修改终端状态
     *
     * 批量修改终端状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchUpdateDevicesStatusRequest 请求对象
     * @return AsyncInvoker<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse>
     */
    public AsyncInvoker<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> batchUpdateDevicesStatusAsyncInvoker(
        BatchUpdateDevicesStatusRequest request) {
        return new AsyncInvoker<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse>(request,
            MeetingMeta.batchUpdateDevicesStatus, hcClient);
    }

    /**
     * 批量修改用户状态
     *
     * 企业管理员通过该接口批量修改用户状态，当用户账号数资源或者第三方电子白板资源到期后，若企业内对应资源的用户账号超过数量后会被系统随机自动停用，此时可通过该接口修改用户的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchUpdateUserStatusRequest 请求对象
     * @return CompletableFuture<BatchUpdateUserStatusResponse>
     */
    public CompletableFuture<BatchUpdateUserStatusResponse> batchUpdateUserStatusAsync(
        BatchUpdateUserStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchUpdateUserStatus);
    }

    /**
     * 批量修改用户状态
     *
     * 企业管理员通过该接口批量修改用户状态，当用户账号数资源或者第三方电子白板资源到期后，若企业内对应资源的用户账号超过数量后会被系统随机自动停用，此时可通过该接口修改用户的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchUpdateUserStatusRequest 请求对象
     * @return AsyncInvoker<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse>
     */
    public AsyncInvoker<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> batchUpdateUserStatusAsyncInvoker(
        BatchUpdateUserStatusRequest request) {
        return new AsyncInvoker<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse>(request,
            MeetingMeta.batchUpdateUserStatus, hcClient);
    }

    /**
     * 广播会场
     *
     * 同一时间，只允许一个与会者被广播。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BroadcastParticipantRequest 请求对象
     * @return CompletableFuture<BroadcastParticipantResponse>
     */
    public CompletableFuture<BroadcastParticipantResponse> broadcastParticipantAsync(
        BroadcastParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.broadcastParticipant);
    }

    /**
     * 广播会场
     *
     * 同一时间，只允许一个与会者被广播。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BroadcastParticipantRequest 请求对象
     * @return AsyncInvoker<BroadcastParticipantRequest, BroadcastParticipantResponse>
     */
    public AsyncInvoker<BroadcastParticipantRequest, BroadcastParticipantResponse> broadcastParticipantAsyncInvoker(
        BroadcastParticipantRequest request) {
        return new AsyncInvoker<BroadcastParticipantRequest, BroadcastParticipantResponse>(request,
            MeetingMeta.broadcastParticipant, hcClient);
    }

    /**
     * 取消预约会议
     *
     * 取消预约会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelMeetingRequest 请求对象
     * @return CompletableFuture<CancelMeetingResponse>
     */
    public CompletableFuture<CancelMeetingResponse> cancelMeetingAsync(CancelMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.cancelMeeting);
    }

    /**
     * 取消预约会议
     *
     * 取消预约会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelMeetingRequest 请求对象
     * @return AsyncInvoker<CancelMeetingRequest, CancelMeetingResponse>
     */
    public AsyncInvoker<CancelMeetingRequest, CancelMeetingResponse> cancelMeetingAsyncInvoker(
        CancelMeetingRequest request) {
        return new AsyncInvoker<CancelMeetingRequest, CancelMeetingResponse>(request, MeetingMeta.cancelMeeting,
            hcClient);
    }

    /**
     * 取消周期会议
     *
     * 管理员或UC账号可以通过该接口取消周期会议
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelRecurringMeetingRequest 请求对象
     * @return CompletableFuture<CancelRecurringMeetingResponse>
     */
    public CompletableFuture<CancelRecurringMeetingResponse> cancelRecurringMeetingAsync(
        CancelRecurringMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.cancelRecurringMeeting);
    }

    /**
     * 取消周期会议
     *
     * 管理员或UC账号可以通过该接口取消周期会议
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelRecurringMeetingRequest 请求对象
     * @return AsyncInvoker<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse>
     */
    public AsyncInvoker<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse> cancelRecurringMeetingAsyncInvoker(
        CancelRecurringMeetingRequest request) {
        return new AsyncInvoker<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse>(request,
            MeetingMeta.cancelRecurringMeeting, hcClient);
    }

    /**
     * 取消周期子会议
     *
     * 管理员或UC账号可以通过该接口取消周期会议
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelRecurringSubMeetingRequest 请求对象
     * @return CompletableFuture<CancelRecurringSubMeetingResponse>
     */
    public CompletableFuture<CancelRecurringSubMeetingResponse> cancelRecurringSubMeetingAsync(
        CancelRecurringSubMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.cancelRecurringSubMeeting);
    }

    /**
     * 取消周期子会议
     *
     * 管理员或UC账号可以通过该接口取消周期会议
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelRecurringSubMeetingRequest 请求对象
     * @return AsyncInvoker<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse>
     */
    public AsyncInvoker<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse> cancelRecurringSubMeetingAsyncInvoker(
        CancelRecurringSubMeetingRequest request) {
        return new AsyncInvoker<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse>(request,
            MeetingMeta.cancelRecurringSubMeeting, hcClient);
    }

    /**
     * 校验滑块验证码
     *
     * 该接口提供校验滑块验证码。服务器收到请求，返回校验结果。用户在前台界面通过滑块操作匹配图形，使得抠图和原图吻合。然后服务器进行校验滑块验证码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckSlideVerifyCodeRequest 请求对象
     * @return CompletableFuture<CheckSlideVerifyCodeResponse>
     */
    public CompletableFuture<CheckSlideVerifyCodeResponse> checkSlideVerifyCodeAsync(
        CheckSlideVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkSlideVerifyCode);
    }

    /**
     * 校验滑块验证码
     *
     * 该接口提供校验滑块验证码。服务器收到请求，返回校验结果。用户在前台界面通过滑块操作匹配图形，使得抠图和原图吻合。然后服务器进行校验滑块验证码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckSlideVerifyCodeRequest 请求对象
     * @return AsyncInvoker<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse>
     */
    public AsyncInvoker<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> checkSlideVerifyCodeAsyncInvoker(
        CheckSlideVerifyCodeRequest request) {
        return new AsyncInvoker<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse>(request,
            MeetingMeta.checkSlideVerifyCode, hcClient);
    }

    /**
     * 校验Token
     *
     * 该接口提供校验token合法性功能。服务器收到请求后，验证token合法性并返回结果。如果参数needGenNewToken为true时，生成新的token并返回。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckTokenRequest 请求对象
     * @return CompletableFuture<CheckTokenResponse>
     */
    public CompletableFuture<CheckTokenResponse> checkTokenAsync(CheckTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkToken);
    }

    /**
     * 校验Token
     *
     * 该接口提供校验token合法性功能。服务器收到请求后，验证token合法性并返回结果。如果参数needGenNewToken为true时，生成新的token并返回。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckTokenRequest 请求对象
     * @return AsyncInvoker<CheckTokenRequest, CheckTokenResponse>
     */
    public AsyncInvoker<CheckTokenRequest, CheckTokenResponse> checkTokenAsyncInvoker(CheckTokenRequest request) {
        return new AsyncInvoker<CheckTokenRequest, CheckTokenResponse>(request, MeetingMeta.checkToken, hcClient);
    }

    /**
     * 校验手机和邮箱对应的验证码
     *
     * 企业用户通过该接口校验手机和邮箱对应的验证码，一分钟内记录尝试次数不得超过5次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckVeriCodeForUpdateUserInfoRequest 请求对象
     * @return CompletableFuture<CheckVeriCodeForUpdateUserInfoResponse>
     */
    public CompletableFuture<CheckVeriCodeForUpdateUserInfoResponse> checkVeriCodeForUpdateUserInfoAsync(
        CheckVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkVeriCodeForUpdateUserInfo);
    }

    /**
     * 校验手机和邮箱对应的验证码
     *
     * 企业用户通过该接口校验手机和邮箱对应的验证码，一分钟内记录尝试次数不得超过5次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckVeriCodeForUpdateUserInfoRequest 请求对象
     * @return AsyncInvoker<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse>
     */
    public AsyncInvoker<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> checkVeriCodeForUpdateUserInfoAsyncInvoker(
        CheckVeriCodeForUpdateUserInfoRequest request) {
        return new AsyncInvoker<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse>(request,
            MeetingMeta.checkVeriCodeForUpdateUserInfo, hcClient);
    }

    /**
     * 校验验证码
     *
     * 该接口提供校验验证码，服务器收到请求，返回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckVerifyCodeRequest 请求对象
     * @return CompletableFuture<CheckVerifyCodeResponse>
     */
    public CompletableFuture<CheckVerifyCodeResponse> checkVerifyCodeAsync(CheckVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkVerifyCode);
    }

    /**
     * 校验验证码
     *
     * 该接口提供校验验证码，服务器收到请求，返回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckVerifyCodeRequest 请求对象
     * @return AsyncInvoker<CheckVerifyCodeRequest, CheckVerifyCodeResponse>
     */
    public AsyncInvoker<CheckVerifyCodeRequest, CheckVerifyCodeResponse> checkVerifyCodeAsyncInvoker(
        CheckVerifyCodeRequest request) {
        return new AsyncInvoker<CheckVerifyCodeRequest, CheckVerifyCodeResponse>(request, MeetingMeta.checkVerifyCode,
            hcClient);
    }

    /**
     * 匿名用户会议鉴权
     *
     * 未登陆终端，通过输入会议ID进行会议鉴权，返回鉴权随机数。如果需要密码则返回需要会议密码错误码，然后终端弹出输入会议ID输入框，用户输入密码后，终端再次调用该接口进行鉴权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAnonymousAuthRandomRequest 请求对象
     * @return CompletableFuture<CreateAnonymousAuthRandomResponse>
     */
    public CompletableFuture<CreateAnonymousAuthRandomResponse> createAnonymousAuthRandomAsync(
        CreateAnonymousAuthRandomRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createAnonymousAuthRandom);
    }

    /**
     * 匿名用户会议鉴权
     *
     * 未登陆终端，通过输入会议ID进行会议鉴权，返回鉴权随机数。如果需要密码则返回需要会议密码错误码，然后终端弹出输入会议ID输入框，用户输入密码后，终端再次调用该接口进行鉴权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAnonymousAuthRandomRequest 请求对象
     * @return AsyncInvoker<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse>
     */
    public AsyncInvoker<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> createAnonymousAuthRandomAsyncInvoker(
        CreateAnonymousAuthRandomRequest request) {
        return new AsyncInvoker<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse>(request,
            MeetingMeta.createAnonymousAuthRandom, hcClient);
    }

    /**
     * 获取会控Token
     *
     * 获取会控授权令牌，然后会议会被拉起。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateConfTokenRequest 请求对象
     * @return CompletableFuture<CreateConfTokenResponse>
     */
    public CompletableFuture<CreateConfTokenResponse> createConfTokenAsync(CreateConfTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createConfToken);
    }

    /**
     * 获取会控Token
     *
     * 获取会控授权令牌，然后会议会被拉起。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateConfTokenRequest 请求对象
     * @return AsyncInvoker<CreateConfTokenRequest, CreateConfTokenResponse>
     */
    public AsyncInvoker<CreateConfTokenRequest, CreateConfTokenResponse> createConfTokenAsyncInvoker(
        CreateConfTokenRequest request) {
        return new AsyncInvoker<CreateConfTokenRequest, CreateConfTokenResponse>(request, MeetingMeta.createConfToken,
            hcClient);
    }

    /**
     * 创建会议
     *
     * 您可根据需要创建立即会议和预约会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMeetingRequest 请求对象
     * @return CompletableFuture<CreateMeetingResponse>
     */
    public CompletableFuture<CreateMeetingResponse> createMeetingAsync(CreateMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createMeeting);
    }

    /**
     * 创建会议
     *
     * 您可根据需要创建立即会议和预约会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMeetingRequest 请求对象
     * @return AsyncInvoker<CreateMeetingRequest, CreateMeetingResponse>
     */
    public AsyncInvoker<CreateMeetingRequest, CreateMeetingResponse> createMeetingAsyncInvoker(
        CreateMeetingRequest request) {
        return new AsyncInvoker<CreateMeetingRequest, CreateMeetingResponse>(request, MeetingMeta.createMeeting,
            hcClient);
    }

    /**
     * 获取页面免登陆跳转的nonce信息
     *
     * 通过token生成页面免登陆跳转到华为云会议的Portal的nonce信息。获取到nonce信息后，通过链接https://bmeeting.huaweicloud.com/?lang&#x3D;zh-CN&amp;nonce&#x3D;xxxxxxxxxxxxx#/login进行免登陆跳转。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePortalRefNonceRequest 请求对象
     * @return CompletableFuture<CreatePortalRefNonceResponse>
     */
    public CompletableFuture<CreatePortalRefNonceResponse> createPortalRefNonceAsync(
        CreatePortalRefNonceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createPortalRefNonce);
    }

    /**
     * 获取页面免登陆跳转的nonce信息
     *
     * 通过token生成页面免登陆跳转到华为云会议的Portal的nonce信息。获取到nonce信息后，通过链接https://bmeeting.huaweicloud.com/?lang&#x3D;zh-CN&amp;nonce&#x3D;xxxxxxxxxxxxx#/login进行免登陆跳转。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePortalRefNonceRequest 请求对象
     * @return AsyncInvoker<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse>
     */
    public AsyncInvoker<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> createPortalRefNonceAsyncInvoker(
        CreatePortalRefNonceRequest request) {
        return new AsyncInvoker<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse>(request,
            MeetingMeta.createPortalRefNonce, hcClient);
    }

    /**
     * 创建周期会议
     *
     * 管理员或UC账号可以通过该接口创建周期会议
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRecurringMeetingRequest 请求对象
     * @return CompletableFuture<CreateRecurringMeetingResponse>
     */
    public CompletableFuture<CreateRecurringMeetingResponse> createRecurringMeetingAsync(
        CreateRecurringMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createRecurringMeeting);
    }

    /**
     * 创建周期会议
     *
     * 管理员或UC账号可以通过该接口创建周期会议
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRecurringMeetingRequest 请求对象
     * @return AsyncInvoker<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse>
     */
    public AsyncInvoker<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse> createRecurringMeetingAsyncInvoker(
        CreateRecurringMeetingRequest request) {
        return new AsyncInvoker<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse>(request,
            MeetingMeta.createRecurringMeeting, hcClient);
    }

    /**
     * 企业管理员生成激活码
     *
     * 企业管理员生成智慧屏、电子白板、Ideahub的激活码
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVisionActiveCodeRequest 请求对象
     * @return CompletableFuture<CreateVisionActiveCodeResponse>
     */
    public CompletableFuture<CreateVisionActiveCodeResponse> createVisionActiveCodeAsync(
        CreateVisionActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createVisionActiveCode);
    }

    /**
     * 企业管理员生成激活码
     *
     * 企业管理员生成智慧屏、电子白板、Ideahub的激活码
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVisionActiveCodeRequest 请求对象
     * @return AsyncInvoker<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse>
     */
    public AsyncInvoker<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> createVisionActiveCodeAsyncInvoker(
        CreateVisionActiveCodeRequest request) {
        return new AsyncInvoker<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse>(request,
            MeetingMeta.createVisionActiveCode, hcClient);
    }

    /**
     * 获取websocket鉴权token
     *
     * 获取websocket鉴权token。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWebSocketTokenRequest 请求对象
     * @return CompletableFuture<CreateWebSocketTokenResponse>
     */
    public CompletableFuture<CreateWebSocketTokenResponse> createWebSocketTokenAsync(
        CreateWebSocketTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createWebSocketToken);
    }

    /**
     * 获取websocket鉴权token
     *
     * 获取websocket鉴权token。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWebSocketTokenRequest 请求对象
     * @return AsyncInvoker<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse>
     */
    public AsyncInvoker<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> createWebSocketTokenAsyncInvoker(
        CreateWebSocketTokenRequest request) {
        return new AsyncInvoker<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse>(request,
            MeetingMeta.createWebSocketToken, hcClient);
    }

    /**
     * 预约网络研讨会
     *
     * 您可根据需要预约网络研讨会。注意：暂不支持添加外部联系人作为与会嘉宾
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWebinarRequest 请求对象
     * @return CompletableFuture<CreateWebinarResponse>
     */
    public CompletableFuture<CreateWebinarResponse> createWebinarAsync(CreateWebinarRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createWebinar);
    }

    /**
     * 预约网络研讨会
     *
     * 您可根据需要预约网络研讨会。注意：暂不支持添加外部联系人作为与会嘉宾
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWebinarRequest 请求对象
     * @return AsyncInvoker<CreateWebinarRequest, CreateWebinarResponse>
     */
    public AsyncInvoker<CreateWebinarRequest, CreateWebinarResponse> createWebinarAsyncInvoker(
        CreateWebinarRequest request) {
        return new AsyncInvoker<CreateWebinarRequest, CreateWebinarResponse>(request, MeetingMeta.createWebinar,
            hcClient);
    }

    /**
     * 删除与会者
     *
     * 删除与会者。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAttendeesRequest 请求对象
     * @return CompletableFuture<DeleteAttendeesResponse>
     */
    public CompletableFuture<DeleteAttendeesResponse> deleteAttendeesAsync(DeleteAttendeesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteAttendees);
    }

    /**
     * 删除与会者
     *
     * 删除与会者。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAttendeesRequest 请求对象
     * @return AsyncInvoker<DeleteAttendeesRequest, DeleteAttendeesResponse>
     */
    public AsyncInvoker<DeleteAttendeesRequest, DeleteAttendeesResponse> deleteAttendeesAsyncInvoker(
        DeleteAttendeesRequest request) {
        return new AsyncInvoker<DeleteAttendeesRequest, DeleteAttendeesResponse>(request, MeetingMeta.deleteAttendees,
            hcClient);
    }

    /**
     * SP管理员删除企业
     *
     * 删除企业
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCorpRequest 请求对象
     * @return CompletableFuture<DeleteCorpResponse>
     */
    public CompletableFuture<DeleteCorpResponse> deleteCorpAsync(DeleteCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteCorp);
    }

    /**
     * SP管理员删除企业
     *
     * 删除企业
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCorpRequest 请求对象
     * @return AsyncInvoker<DeleteCorpRequest, DeleteCorpResponse>
     */
    public AsyncInvoker<DeleteCorpRequest, DeleteCorpResponse> deleteCorpAsyncInvoker(DeleteCorpRequest request) {
        return new AsyncInvoker<DeleteCorpRequest, DeleteCorpResponse>(request, MeetingMeta.deleteCorp, hcClient);
    }

    /**
     * 删除云会议室
     *
     * 企业管理员通过该接口删除企业的云会议室
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCorpVmrRequest 请求对象
     * @return CompletableFuture<DeleteCorpVmrResponse>
     */
    public CompletableFuture<DeleteCorpVmrResponse> deleteCorpVmrAsync(DeleteCorpVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteCorpVmr);
    }

    /**
     * 删除云会议室
     *
     * 企业管理员通过该接口删除企业的云会议室
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCorpVmrRequest 请求对象
     * @return AsyncInvoker<DeleteCorpVmrRequest, DeleteCorpVmrResponse>
     */
    public AsyncInvoker<DeleteCorpVmrRequest, DeleteCorpVmrResponse> deleteCorpVmrAsyncInvoker(
        DeleteCorpVmrRequest request) {
        return new AsyncInvoker<DeleteCorpVmrRequest, DeleteCorpVmrResponse>(request, MeetingMeta.deleteCorpVmr,
            hcClient);
    }

    /**
     * 删除部门
     *
     * 企业管理员通过该接口删除部门。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDepartmentRequest 请求对象
     * @return CompletableFuture<DeleteDepartmentResponse>
     */
    public CompletableFuture<DeleteDepartmentResponse> deleteDepartmentAsync(DeleteDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteDepartment);
    }

    /**
     * 删除部门
     *
     * 企业管理员通过该接口删除部门。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDepartmentRequest 请求对象
     * @return AsyncInvoker<DeleteDepartmentRequest, DeleteDepartmentResponse>
     */
    public AsyncInvoker<DeleteDepartmentRequest, DeleteDepartmentResponse> deleteDepartmentAsyncInvoker(
        DeleteDepartmentRequest request) {
        return new AsyncInvoker<DeleteDepartmentRequest, DeleteDepartmentResponse>(request,
            MeetingMeta.deleteDepartment, hcClient);
    }

    /**
     * 批量删除录制
     *
     * 批量删除录制。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRecordingsRequest 请求对象
     * @return CompletableFuture<DeleteRecordingsResponse>
     */
    public CompletableFuture<DeleteRecordingsResponse> deleteRecordingsAsync(DeleteRecordingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteRecordings);
    }

    /**
     * 批量删除录制
     *
     * 批量删除录制。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRecordingsRequest 请求对象
     * @return AsyncInvoker<DeleteRecordingsRequest, DeleteRecordingsResponse>
     */
    public AsyncInvoker<DeleteRecordingsRequest, DeleteRecordingsResponse> deleteRecordingsAsyncInvoker(
        DeleteRecordingsRequest request) {
        return new AsyncInvoker<DeleteRecordingsRequest, DeleteRecordingsResponse>(request,
            MeetingMeta.deleteRecordings, hcClient);
    }

    /**
     * SP管理员根据删除企业资源
     *
     * 企业删除资源项，删除资源项后，企业资源总数会自动减少
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return CompletableFuture<DeleteResourceResponse>
     */
    public CompletableFuture<DeleteResourceResponse> deleteResourceAsync(DeleteResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteResource);
    }

    /**
     * SP管理员根据删除企业资源
     *
     * 企业删除资源项，删除资源项后，企业资源总数会自动减少
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceAsyncInvoker(
        DeleteResourceRequest request) {
        return new AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse>(request, MeetingMeta.deleteResource,
            hcClient);
    }

    /**
     * 企业管理员删除激活码
     *
     * 企业管理员批量删除激活码
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVisionActiveCodeRequest 请求对象
     * @return CompletableFuture<DeleteVisionActiveCodeResponse>
     */
    public CompletableFuture<DeleteVisionActiveCodeResponse> deleteVisionActiveCodeAsync(
        DeleteVisionActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteVisionActiveCode);
    }

    /**
     * 企业管理员删除激活码
     *
     * 企业管理员批量删除激活码
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVisionActiveCodeRequest 请求对象
     * @return AsyncInvoker<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse>
     */
    public AsyncInvoker<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> deleteVisionActiveCodeAsyncInvoker(
        DeleteVisionActiveCodeRequest request) {
        return new AsyncInvoker<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse>(request,
            MeetingMeta.deleteVisionActiveCode, hcClient);
    }

    /**
     * 删除事件订阅配置信息
     *
     * 管理员可以通过该接口删除事件订阅(webhook)配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWebHookConfigRequest 请求对象
     * @return CompletableFuture<DeleteWebHookConfigResponse>
     */
    public CompletableFuture<DeleteWebHookConfigResponse> deleteWebHookConfigAsync(DeleteWebHookConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteWebHookConfig);
    }

    /**
     * 删除事件订阅配置信息
     *
     * 管理员可以通过该接口删除事件订阅(webhook)配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWebHookConfigRequest 请求对象
     * @return AsyncInvoker<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse>
     */
    public AsyncInvoker<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse> deleteWebHookConfigAsyncInvoker(
        DeleteWebHookConfigRequest request) {
        return new AsyncInvoker<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse>(request,
            MeetingMeta.deleteWebHookConfig, hcClient);
    }

    /**
     * 取消网络研讨会
     *
     * 您可根据需要取消网络研讨会。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWebinarRequest 请求对象
     * @return CompletableFuture<DeleteWebinarResponse>
     */
    public CompletableFuture<DeleteWebinarResponse> deleteWebinarAsync(DeleteWebinarRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteWebinar);
    }

    /**
     * 取消网络研讨会
     *
     * 您可根据需要取消网络研讨会。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWebinarRequest 请求对象
     * @return AsyncInvoker<DeleteWebinarRequest, DeleteWebinarResponse>
     */
    public AsyncInvoker<DeleteWebinarRequest, DeleteWebinarResponse> deleteWebinarAsyncInvoker(
        DeleteWebinarRequest request) {
        return new AsyncInvoker<DeleteWebinarRequest, DeleteWebinarResponse>(request, MeetingMeta.deleteWebinar,
            hcClient);
    }

    /**
     * 回收云会议室
     *
     * 企业管理员通过该接口回收云会议室
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateVmrRequest 请求对象
     * @return CompletableFuture<DisassociateVmrResponse>
     */
    public CompletableFuture<DisassociateVmrResponse> disassociateVmrAsync(DisassociateVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.disassociateVmr);
    }

    /**
     * 回收云会议室
     *
     * 企业管理员通过该接口回收云会议室
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateVmrRequest 请求对象
     * @return AsyncInvoker<DisassociateVmrRequest, DisassociateVmrResponse>
     */
    public AsyncInvoker<DisassociateVmrRequest, DisassociateVmrResponse> disassociateVmrAsyncInvoker(
        DisassociateVmrRequest request) {
        return new AsyncInvoker<DisassociateVmrRequest, DisassociateVmrResponse>(request, MeetingMeta.disassociateVmr,
            hcClient);
    }

    /**
     * 举手
     *
     * 所有来宾可以举手。来宾举手后，可以取消自己的举手。主持人可以取消所有来宾的举手。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param HandRequest 请求对象
     * @return CompletableFuture<HandResponse>
     */
    public CompletableFuture<HandResponse> handAsync(HandRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.hand);
    }

    /**
     * 举手
     *
     * 所有来宾可以举手。来宾举手后，可以取消自己的举手。主持人可以取消所有来宾的举手。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param HandRequest 请求对象
     * @return AsyncInvoker<HandRequest, HandResponse>
     */
    public AsyncInvoker<HandRequest, HandResponse> handAsyncInvoker(HandRequest request) {
        return new AsyncInvoker<HandRequest, HandResponse>(request, MeetingMeta.hand, hcClient);
    }

    /**
     * 挂断与会者
     *
     * 挂断正在通话中的与会者。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param HangUpRequest 请求对象
     * @return CompletableFuture<HangUpResponse>
     */
    public CompletableFuture<HangUpResponse> hangUpAsync(HangUpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.hangUp);
    }

    /**
     * 挂断与会者
     *
     * 挂断正在通话中的与会者。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param HangUpRequest 请求对象
     * @return AsyncInvoker<HangUpRequest, HangUpResponse>
     */
    public AsyncInvoker<HangUpRequest, HangUpResponse> hangUpAsyncInvoker(HangUpRequest request) {
        return new AsyncInvoker<HangUpRequest, HangUpResponse>(request, MeetingMeta.hangUp, hcClient);
    }

    /**
     * 主持人邀请与会者开启、关闭摄像头
     *
     * 主持人邀请与会者开启、关闭摄像头
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param InviteOperateVideoRequest 请求对象
     * @return CompletableFuture<InviteOperateVideoResponse>
     */
    public CompletableFuture<InviteOperateVideoResponse> inviteOperateVideoAsync(InviteOperateVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteOperateVideo);
    }

    /**
     * 主持人邀请与会者开启、关闭摄像头
     *
     * 主持人邀请与会者开启、关闭摄像头
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param InviteOperateVideoRequest 请求对象
     * @return AsyncInvoker<InviteOperateVideoRequest, InviteOperateVideoResponse>
     */
    public AsyncInvoker<InviteOperateVideoRequest, InviteOperateVideoResponse> inviteOperateVideoAsyncInvoker(
        InviteOperateVideoRequest request) {
        return new AsyncInvoker<InviteOperateVideoRequest, InviteOperateVideoResponse>(request,
            MeetingMeta.inviteOperateVideo, hcClient);
    }

    /**
     * 邀请与会者
     *
     * 邀请与会者加入会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param InviteParticipantRequest 请求对象
     * @return CompletableFuture<InviteParticipantResponse>
     */
    public CompletableFuture<InviteParticipantResponse> inviteParticipantAsync(InviteParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteParticipant);
    }

    /**
     * 邀请与会者
     *
     * 邀请与会者加入会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param InviteParticipantRequest 请求对象
     * @return AsyncInvoker<InviteParticipantRequest, InviteParticipantResponse>
     */
    public AsyncInvoker<InviteParticipantRequest, InviteParticipantResponse> inviteParticipantAsyncInvoker(
        InviteParticipantRequest request) {
        return new AsyncInvoker<InviteParticipantRequest, InviteParticipantResponse>(request,
            MeetingMeta.inviteParticipant, hcClient);
    }

    /**
     * 邀请共享
     *
     * 场景描述：主席邀请、取消邀请会场共享 功能描述：主席邀请、取消邀请会场共享
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param InviteShareRequest 请求对象
     * @return CompletableFuture<InviteShareResponse>
     */
    public CompletableFuture<InviteShareResponse> inviteShareAsync(InviteShareRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteShare);
    }

    /**
     * 邀请共享
     *
     * 场景描述：主席邀请、取消邀请会场共享 功能描述：主席邀请、取消邀请会场共享
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param InviteShareRequest 请求对象
     * @return AsyncInvoker<InviteShareRequest, InviteShareResponse>
     */
    public AsyncInvoker<InviteShareRequest, InviteShareResponse> inviteShareAsyncInvoker(InviteShareRequest request) {
        return new AsyncInvoker<InviteShareRequest, InviteShareResponse>(request, MeetingMeta.inviteShare, hcClient);
    }

    /**
     * 邀请用户
     *
     * 通过手机号码或者邮箱地址邀请用户加入企业。
     * * 若被邀请用户在华为云会议系统中不存在，则：
     *   - 华为云会议免费版和华为云会议标准版发送短信/邮件邀请用户完成注册后加入企业。用户注册成功后，加入该企业。
     *   - 华为云会议旗舰版在企业内直接添加该用户。用户会收到华为云会议的初始密码，用户第一次以手机号或者邮箱登录时，需要修改密码。
     * * 若被邀请用户在华为云会议系统中存在，则该用户会收到短信或者邮件确认。确认完成后改用户加入企业内。该用户的密码保持原来的密码不变。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param InviteUserRequest 请求对象
     * @return CompletableFuture<InviteUserResponse>
     */
    public CompletableFuture<InviteUserResponse> inviteUserAsync(InviteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteUser);
    }

    /**
     * 邀请用户
     *
     * 通过手机号码或者邮箱地址邀请用户加入企业。
     * * 若被邀请用户在华为云会议系统中不存在，则：
     *   - 华为云会议免费版和华为云会议标准版发送短信/邮件邀请用户完成注册后加入企业。用户注册成功后，加入该企业。
     *   - 华为云会议旗舰版在企业内直接添加该用户。用户会收到华为云会议的初始密码，用户第一次以手机号或者邮箱登录时，需要修改密码。
     * * 若被邀请用户在华为云会议系统中存在，则该用户会收到短信或者邮件确认。确认完成后改用户加入企业内。该用户的密码保持原来的密码不变。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param InviteUserRequest 请求对象
     * @return AsyncInvoker<InviteUserRequest, InviteUserResponse>
     */
    public AsyncInvoker<InviteUserRequest, InviteUserResponse> inviteUserAsyncInvoker(InviteUserRequest request) {
        return new AsyncInvoker<InviteUserRequest, InviteUserResponse>(request, MeetingMeta.inviteUser, hcClient);
    }

    /**
     * 通过会议ID和密码邀请与会者
     *
     * 通过会议ID和密码邀请与会者
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param InviteWithPwdRequest 请求对象
     * @return CompletableFuture<InviteWithPwdResponse>
     */
    public CompletableFuture<InviteWithPwdResponse> inviteWithPwdAsync(InviteWithPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteWithPwd);
    }

    /**
     * 通过会议ID和密码邀请与会者
     *
     * 通过会议ID和密码邀请与会者
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param InviteWithPwdRequest 请求对象
     * @return AsyncInvoker<InviteWithPwdRequest, InviteWithPwdResponse>
     */
    public AsyncInvoker<InviteWithPwdRequest, InviteWithPwdResponse> inviteWithPwdAsyncInvoker(
        InviteWithPwdRequest request) {
        return new AsyncInvoker<InviteWithPwdRequest, InviteWithPwdResponse>(request, MeetingMeta.inviteWithPwd,
            hcClient);
    }

    /**
     * 查询历史召开的网络研讨会列表
     *
     * 查询历史召开的网络研讨会列表，企业管理员可查询企业内所有历史召开的网络研讨会，普通账号查询自己历史召开的网络研讨会
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHistoryWebinarsRequest 请求对象
     * @return CompletableFuture<ListHistoryWebinarsResponse>
     */
    public CompletableFuture<ListHistoryWebinarsResponse> listHistoryWebinarsAsync(ListHistoryWebinarsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.listHistoryWebinars);
    }

    /**
     * 查询历史召开的网络研讨会列表
     *
     * 查询历史召开的网络研讨会列表，企业管理员可查询企业内所有历史召开的网络研讨会，普通账号查询自己历史召开的网络研讨会
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHistoryWebinarsRequest 请求对象
     * @return AsyncInvoker<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse>
     */
    public AsyncInvoker<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse> listHistoryWebinarsAsyncInvoker(
        ListHistoryWebinarsRequest request) {
        return new AsyncInvoker<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse>(request,
            MeetingMeta.listHistoryWebinars, hcClient);
    }

    /**
     * 查询正在召开的网络研讨会列表
     *
     * 查询正在召开的网络研讨会列表：企业管理员可查询企业内所有正在召开的网络研讨会，普通账号查询自己正在召开的网络研讨会
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOngoingWebinarsRequest 请求对象
     * @return CompletableFuture<ListOngoingWebinarsResponse>
     */
    public CompletableFuture<ListOngoingWebinarsResponse> listOngoingWebinarsAsync(ListOngoingWebinarsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.listOngoingWebinars);
    }

    /**
     * 查询正在召开的网络研讨会列表
     *
     * 查询正在召开的网络研讨会列表：企业管理员可查询企业内所有正在召开的网络研讨会，普通账号查询自己正在召开的网络研讨会
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOngoingWebinarsRequest 请求对象
     * @return AsyncInvoker<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse>
     */
    public AsyncInvoker<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse> listOngoingWebinarsAsyncInvoker(
        ListOngoingWebinarsRequest request) {
        return new AsyncInvoker<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse>(request,
            MeetingMeta.listOngoingWebinars, hcClient);
    }

    /**
     * 查询即将召开的网络研讨会列表
     *
     * 查询即将召开的网络研讨会列表：企业管理员可查询企业内所有即将召开的网络研讨会，普通账号查询自己即将召开的网络研讨会
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListUpComingWebinarsRequest 请求对象
     * @return CompletableFuture<ListUpComingWebinarsResponse>
     */
    public CompletableFuture<ListUpComingWebinarsResponse> listUpComingWebinarsAsync(
        ListUpComingWebinarsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.listUpComingWebinars);
    }

    /**
     * 查询即将召开的网络研讨会列表
     *
     * 查询即将召开的网络研讨会列表：企业管理员可查询企业内所有即将召开的网络研讨会，普通账号查询自己即将召开的网络研讨会
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListUpComingWebinarsRequest 请求对象
     * @return AsyncInvoker<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse>
     */
    public AsyncInvoker<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse> listUpComingWebinarsAsyncInvoker(
        ListUpComingWebinarsRequest request) {
        return new AsyncInvoker<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse>(request,
            MeetingMeta.listUpComingWebinars, hcClient);
    }

    /**
     * 启停会议直播
     *
     * 启动或停止会议直播。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param LiveRequest 请求对象
     * @return CompletableFuture<LiveResponse>
     */
    public CompletableFuture<LiveResponse> liveAsync(LiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.live);
    }

    /**
     * 启停会议直播
     *
     * 启动或停止会议直播。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param LiveRequest 请求对象
     * @return AsyncInvoker<LiveRequest, LiveResponse>
     */
    public AsyncInvoker<LiveRequest, LiveResponse> liveAsyncInvoker(LiveRequest request) {
        return new AsyncInvoker<LiveRequest, LiveResponse>(request, MeetingMeta.live, hcClient);
    }

    /**
     * 锁定会议
     *
     * 锁定或解锁会议。锁定会议后，不允许与会者加入会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param LockMeetingRequest 请求对象
     * @return CompletableFuture<LockMeetingResponse>
     */
    public CompletableFuture<LockMeetingResponse> lockMeetingAsync(LockMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.lockMeeting);
    }

    /**
     * 锁定会议
     *
     * 锁定或解锁会议。锁定会议后，不允许与会者加入会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param LockMeetingRequest 请求对象
     * @return AsyncInvoker<LockMeetingRequest, LockMeetingResponse>
     */
    public AsyncInvoker<LockMeetingRequest, LockMeetingResponse> lockMeetingAsyncInvoker(LockMeetingRequest request) {
        return new AsyncInvoker<LockMeetingRequest, LockMeetingResponse>(request, MeetingMeta.lockMeeting, hcClient);
    }

    /**
     * 锁定会场视频源
     *
     * 锁定或者解锁某在线会场的视频源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param LockViewRequest 请求对象
     * @return CompletableFuture<LockViewResponse>
     */
    public CompletableFuture<LockViewResponse> lockViewAsync(LockViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.lockView);
    }

    /**
     * 锁定会场视频源
     *
     * 锁定或者解锁某在线会场的视频源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param LockViewRequest 请求对象
     * @return AsyncInvoker<LockViewRequest, LockViewResponse>
     */
    public AsyncInvoker<LockViewRequest, LockViewResponse> lockViewAsyncInvoker(LockViewRequest request) {
        return new AsyncInvoker<LockViewRequest, LockViewResponse>(request, MeetingMeta.lockView, hcClient);
    }

    /**
     * 全场静音
     *
     * 主持人可以通过该接口静音/取消静音整个会议所有与会者（主持人除外）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param MuteMeetingRequest 请求对象
     * @return CompletableFuture<MuteMeetingResponse>
     */
    public CompletableFuture<MuteMeetingResponse> muteMeetingAsync(MuteMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.muteMeeting);
    }

    /**
     * 全场静音
     *
     * 主持人可以通过该接口静音/取消静音整个会议所有与会者（主持人除外）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param MuteMeetingRequest 请求对象
     * @return AsyncInvoker<MuteMeetingRequest, MuteMeetingResponse>
     */
    public AsyncInvoker<MuteMeetingRequest, MuteMeetingResponse> muteMeetingAsyncInvoker(MuteMeetingRequest request) {
        return new AsyncInvoker<MuteMeetingRequest, MuteMeetingResponse>(request, MeetingMeta.muteMeeting, hcClient);
    }

    /**
     * 静音与会者
     *
     * 主持人可以静音/取消静音任意与会者，来宾也可静音/取消静音自己。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param MuteParticipantRequest 请求对象
     * @return CompletableFuture<MuteParticipantResponse>
     */
    public CompletableFuture<MuteParticipantResponse> muteParticipantAsync(MuteParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.muteParticipant);
    }

    /**
     * 静音与会者
     *
     * 主持人可以静音/取消静音任意与会者，来宾也可静音/取消静音自己。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param MuteParticipantRequest 请求对象
     * @return AsyncInvoker<MuteParticipantRequest, MuteParticipantResponse>
     */
    public AsyncInvoker<MuteParticipantRequest, MuteParticipantResponse> muteParticipantAsyncInvoker(
        MuteParticipantRequest request) {
        return new AsyncInvoker<MuteParticipantRequest, MuteParticipantResponse>(request, MeetingMeta.muteParticipant,
            hcClient);
    }

    /**
     * 延长会议
     *
     * 延长会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ProlongMeetingRequest 请求对象
     * @return CompletableFuture<ProlongMeetingResponse>
     */
    public CompletableFuture<ProlongMeetingResponse> prolongMeetingAsync(ProlongMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.prolongMeeting);
    }

    /**
     * 延长会议
     *
     * 延长会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ProlongMeetingRequest 请求对象
     * @return AsyncInvoker<ProlongMeetingRequest, ProlongMeetingResponse>
     */
    public AsyncInvoker<ProlongMeetingRequest, ProlongMeetingResponse> prolongMeetingAsyncInvoker(
        ProlongMeetingRequest request) {
        return new AsyncInvoker<ProlongMeetingRequest, ProlongMeetingResponse>(request, MeetingMeta.prolongMeeting,
            hcClient);
    }

    /**
     * 启停会议录制
     *
     * 启动或停止会议录制。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecordRequest 请求对象
     * @return CompletableFuture<RecordResponse>
     */
    public CompletableFuture<RecordResponse> recordAsync(RecordRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.record);
    }

    /**
     * 启停会议录制
     *
     * 启动或停止会议录制。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecordRequest 请求对象
     * @return AsyncInvoker<RecordRequest, RecordResponse>
     */
    public AsyncInvoker<RecordRequest, RecordResponse> recordAsyncInvoker(RecordRequest request) {
        return new AsyncInvoker<RecordRequest, RecordResponse>(request, MeetingMeta.record, hcClient);
    }

    /**
     * 重命名与会者
     *
     * 重命名某个与会者。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RenameParticipantRequest 请求对象
     * @return CompletableFuture<RenameParticipantResponse>
     */
    public CompletableFuture<RenameParticipantResponse> renameParticipantAsync(RenameParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.renameParticipant);
    }

    /**
     * 重命名与会者
     *
     * 重命名某个与会者。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RenameParticipantRequest 请求对象
     * @return AsyncInvoker<RenameParticipantRequest, RenameParticipantResponse>
     */
    public AsyncInvoker<RenameParticipantRequest, RenameParticipantResponse> renameParticipantAsyncInvoker(
        RenameParticipantRequest request) {
        return new AsyncInvoker<RenameParticipantRequest, RenameParticipantResponse>(request,
            MeetingMeta.renameParticipant, hcClient);
    }

    /**
     * 企业管理员重置硬终端激活码
     *
     * 当硬终端激活码失效时，企业管理员可以通过该接口重置激活码，使用重新获取的激活码激活终端，每24小时可重新激活5次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetActivecodeRequest 请求对象
     * @return CompletableFuture<ResetActivecodeResponse>
     */
    public CompletableFuture<ResetActivecodeResponse> resetActivecodeAsync(ResetActivecodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetActivecode);
    }

    /**
     * 企业管理员重置硬终端激活码
     *
     * 当硬终端激活码失效时，企业管理员可以通过该接口重置激活码，使用重新获取的激活码激活终端，每24小时可重新激活5次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetActivecodeRequest 请求对象
     * @return AsyncInvoker<ResetActivecodeRequest, ResetActivecodeResponse>
     */
    public AsyncInvoker<ResetActivecodeRequest, ResetActivecodeResponse> resetActivecodeAsyncInvoker(
        ResetActivecodeRequest request) {
        return new AsyncInvoker<ResetActivecodeRequest, ResetActivecodeResponse>(request, MeetingMeta.resetActivecode,
            hcClient);
    }

    /**
     * 用户重置密码
     *
     * 该接口提供给用户重置密码功能，服务器收到请求，重新设置用户密码并返回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetPwdRequest 请求对象
     * @return CompletableFuture<ResetPwdResponse>
     */
    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetPwd);
    }

    /**
     * 用户重置密码
     *
     * 该接口提供给用户重置密码功能，服务器收到请求，重新设置用户密码并返回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetPwdRequest 请求对象
     * @return AsyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public AsyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdAsyncInvoker(ResetPwdRequest request) {
        return new AsyncInvoker<ResetPwdRequest, ResetPwdResponse>(request, MeetingMeta.resetPwd, hcClient);
    }

    /**
     * 企业管理员重置企业成员密码
     *
     * 企业管理员通过该接口提供企业管理员重置企业成员密码的功能。当服务器收到重置密码的请求时，发送新的密码到企业成员的邮箱或者短信，并返回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetPwdByAdminRequest 请求对象
     * @return CompletableFuture<ResetPwdByAdminResponse>
     */
    public CompletableFuture<ResetPwdByAdminResponse> resetPwdByAdminAsync(ResetPwdByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetPwdByAdmin);
    }

    /**
     * 企业管理员重置企业成员密码
     *
     * 企业管理员通过该接口提供企业管理员重置企业成员密码的功能。当服务器收到重置密码的请求时，发送新的密码到企业成员的邮箱或者短信，并返回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetPwdByAdminRequest 请求对象
     * @return AsyncInvoker<ResetPwdByAdminRequest, ResetPwdByAdminResponse>
     */
    public AsyncInvoker<ResetPwdByAdminRequest, ResetPwdByAdminResponse> resetPwdByAdminAsyncInvoker(
        ResetPwdByAdminRequest request) {
        return new AsyncInvoker<ResetPwdByAdminRequest, ResetPwdByAdminResponse>(request, MeetingMeta.resetPwdByAdmin,
            hcClient);
    }

    /**
     * 企业管理员重置账号的激活码
     *
     * 企业管理员重置账号的激活码，重置后，原设备直接解绑，必须重新激活使用,若手机邮箱不填，则不会发送新的激活码
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetVisionActiveCodeRequest 请求对象
     * @return CompletableFuture<ResetVisionActiveCodeResponse>
     */
    public CompletableFuture<ResetVisionActiveCodeResponse> resetVisionActiveCodeAsync(
        ResetVisionActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetVisionActiveCode);
    }

    /**
     * 企业管理员重置账号的激活码
     *
     * 企业管理员重置账号的激活码，重置后，原设备直接解绑，必须重新激活使用,若手机邮箱不填，则不会发送新的激活码
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetVisionActiveCodeRequest 请求对象
     * @return AsyncInvoker<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse>
     */
    public AsyncInvoker<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> resetVisionActiveCodeAsyncInvoker(
        ResetVisionActiveCodeRequest request) {
        return new AsyncInvoker<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse>(request,
            MeetingMeta.resetVisionActiveCode, hcClient);
    }

    /**
     * 点名会场
     *
     * 同一时间，只允许一个与会者被点名。点名会场的效果是除了主持人外，点名与会者为非静音状态，未点名的与会者统一为静音状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RollcallParticipantRequest 请求对象
     * @return CompletableFuture<RollcallParticipantResponse>
     */
    public CompletableFuture<RollcallParticipantResponse> rollcallParticipantAsync(RollcallParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.rollcallParticipant);
    }

    /**
     * 点名会场
     *
     * 同一时间，只允许一个与会者被点名。点名会场的效果是除了主持人外，点名与会者为非静音状态，未点名的与会者统一为静音状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RollcallParticipantRequest 请求对象
     * @return AsyncInvoker<RollcallParticipantRequest, RollcallParticipantResponse>
     */
    public AsyncInvoker<RollcallParticipantRequest, RollcallParticipantResponse> rollcallParticipantAsyncInvoker(
        RollcallParticipantRequest request) {
        return new AsyncInvoker<RollcallParticipantRequest, RollcallParticipantResponse>(request,
            MeetingMeta.rollcallParticipant, hcClient);
    }

    /**
     * 查询历史会议的与会者记录
     *
     * 查询指定历史会议的与会者记录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchAttendanceRecordsOfHisMeetingRequest 请求对象
     * @return CompletableFuture<SearchAttendanceRecordsOfHisMeetingResponse>
     */
    public CompletableFuture<SearchAttendanceRecordsOfHisMeetingResponse> searchAttendanceRecordsOfHisMeetingAsync(
        SearchAttendanceRecordsOfHisMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchAttendanceRecordsOfHisMeeting);
    }

    /**
     * 查询历史会议的与会者记录
     *
     * 查询指定历史会议的与会者记录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchAttendanceRecordsOfHisMeetingRequest 请求对象
     * @return AsyncInvoker<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse>
     */
    public AsyncInvoker<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> searchAttendanceRecordsOfHisMeetingAsyncInvoker(
        SearchAttendanceRecordsOfHisMeetingRequest request) {
        return new AsyncInvoker<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse>(
            request, MeetingMeta.searchAttendanceRecordsOfHisMeeting, hcClient);
    }

    /**
     * SP管理员分页搜索企业
     *
     * 分页搜索企业,支持名称、企业ID搜索
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCorpRequest 请求对象
     * @return CompletableFuture<SearchCorpResponse>
     */
    public CompletableFuture<SearchCorpResponse> searchCorpAsync(SearchCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorp);
    }

    /**
     * SP管理员分页搜索企业
     *
     * 分页搜索企业,支持名称、企业ID搜索
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCorpRequest 请求对象
     * @return AsyncInvoker<SearchCorpRequest, SearchCorpResponse>
     */
    public AsyncInvoker<SearchCorpRequest, SearchCorpResponse> searchCorpAsyncInvoker(SearchCorpRequest request) {
        return new AsyncInvoker<SearchCorpRequest, SearchCorpResponse>(request, MeetingMeta.searchCorp, hcClient);
    }

    /**
     * 分页查询企业管理员
     *
     * 通过该接口分页查询企业管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCorpAdminsRequest 请求对象
     * @return CompletableFuture<SearchCorpAdminsResponse>
     */
    public CompletableFuture<SearchCorpAdminsResponse> searchCorpAdminsAsync(SearchCorpAdminsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpAdmins);
    }

    /**
     * 分页查询企业管理员
     *
     * 通过该接口分页查询企业管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCorpAdminsRequest 请求对象
     * @return AsyncInvoker<SearchCorpAdminsRequest, SearchCorpAdminsResponse>
     */
    public AsyncInvoker<SearchCorpAdminsRequest, SearchCorpAdminsResponse> searchCorpAdminsAsyncInvoker(
        SearchCorpAdminsRequest request) {
        return new AsyncInvoker<SearchCorpAdminsRequest, SearchCorpAdminsResponse>(request,
            MeetingMeta.searchCorpAdmins, hcClient);
    }

    /**
     * 查询企业通讯录
     *
     * 企业用户（含管理员）通过该接口查询该企业的通讯录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCorpDirRequest 请求对象
     * @return CompletableFuture<SearchCorpDirResponse>
     */
    public CompletableFuture<SearchCorpDirResponse> searchCorpDirAsync(SearchCorpDirRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpDir);
    }

    /**
     * 查询企业通讯录
     *
     * 企业用户（含管理员）通过该接口查询该企业的通讯录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCorpDirRequest 请求对象
     * @return AsyncInvoker<SearchCorpDirRequest, SearchCorpDirResponse>
     */
    public AsyncInvoker<SearchCorpDirRequest, SearchCorpDirResponse> searchCorpDirAsyncInvoker(
        SearchCorpDirRequest request) {
        return new AsyncInvoker<SearchCorpDirRequest, SearchCorpDirResponse>(request, MeetingMeta.searchCorpDir,
            hcClient);
    }

    /**
     * 企业管理员分页查询企业资源订单列表
     *
     * 企业管理员根据条件查询企业资源订单列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCorpResourcesRequest 请求对象
     * @return CompletableFuture<SearchCorpResourcesResponse>
     */
    public CompletableFuture<SearchCorpResourcesResponse> searchCorpResourcesAsync(SearchCorpResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpResources);
    }

    /**
     * 企业管理员分页查询企业资源订单列表
     *
     * 企业管理员根据条件查询企业资源订单列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCorpResourcesRequest 请求对象
     * @return AsyncInvoker<SearchCorpResourcesRequest, SearchCorpResourcesResponse>
     */
    public AsyncInvoker<SearchCorpResourcesRequest, SearchCorpResourcesResponse> searchCorpResourcesAsyncInvoker(
        SearchCorpResourcesRequest request) {
        return new AsyncInvoker<SearchCorpResourcesRequest, SearchCorpResourcesResponse>(request,
            MeetingMeta.searchCorpResources, hcClient);
    }

    /**
     * 企业管理员分页查询企业云会议室
     *
     * 企业管理员通过该接口分页查询企业的云会议室。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCorpVmrRequest 请求对象
     * @return CompletableFuture<SearchCorpVmrResponse>
     */
    public CompletableFuture<SearchCorpVmrResponse> searchCorpVmrAsync(SearchCorpVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpVmr);
    }

    /**
     * 企业管理员分页查询企业云会议室
     *
     * 企业管理员通过该接口分页查询企业的云会议室。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCorpVmrRequest 请求对象
     * @return AsyncInvoker<SearchCorpVmrRequest, SearchCorpVmrResponse>
     */
    public AsyncInvoker<SearchCorpVmrRequest, SearchCorpVmrResponse> searchCorpVmrAsyncInvoker(
        SearchCorpVmrRequest request) {
        return new AsyncInvoker<SearchCorpVmrRequest, SearchCorpVmrResponse>(request, MeetingMeta.searchCorpVmr,
            hcClient);
    }

    /**
     * 查询历史会议的会控记录
     *
     * 查询指定历史会议的会控记录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCtlRecordsOfHisMeetingRequest 请求对象
     * @return CompletableFuture<SearchCtlRecordsOfHisMeetingResponse>
     */
    public CompletableFuture<SearchCtlRecordsOfHisMeetingResponse> searchCtlRecordsOfHisMeetingAsync(
        SearchCtlRecordsOfHisMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCtlRecordsOfHisMeeting);
    }

    /**
     * 查询历史会议的会控记录
     *
     * 查询指定历史会议的会控记录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchCtlRecordsOfHisMeetingRequest 请求对象
     * @return AsyncInvoker<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse>
     */
    public AsyncInvoker<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> searchCtlRecordsOfHisMeetingAsyncInvoker(
        SearchCtlRecordsOfHisMeetingRequest request) {
        return new AsyncInvoker<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse>(request,
            MeetingMeta.searchCtlRecordsOfHisMeeting, hcClient);
    }

    /**
     * 按名称查询所有的部门
     *
     * 企业管理员通过该接口按名称查询所有的部门。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchDepartmentByNameRequest 请求对象
     * @return CompletableFuture<SearchDepartmentByNameResponse>
     */
    public CompletableFuture<SearchDepartmentByNameResponse> searchDepartmentByNameAsync(
        SearchDepartmentByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchDepartmentByName);
    }

    /**
     * 按名称查询所有的部门
     *
     * 企业管理员通过该接口按名称查询所有的部门。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchDepartmentByNameRequest 请求对象
     * @return AsyncInvoker<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse>
     */
    public AsyncInvoker<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> searchDepartmentByNameAsyncInvoker(
        SearchDepartmentByNameRequest request) {
        return new AsyncInvoker<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse>(request,
            MeetingMeta.searchDepartmentByName, hcClient);
    }

    /**
     * 分页查询终端
     *
     * 企业管理员通过该接口分页查询终端信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchDevicesRequest 请求对象
     * @return CompletableFuture<SearchDevicesResponse>
     */
    public CompletableFuture<SearchDevicesResponse> searchDevicesAsync(SearchDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchDevices);
    }

    /**
     * 分页查询终端
     *
     * 企业管理员通过该接口分页查询终端信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchDevicesRequest 请求对象
     * @return AsyncInvoker<SearchDevicesRequest, SearchDevicesResponse>
     */
    public AsyncInvoker<SearchDevicesRequest, SearchDevicesResponse> searchDevicesAsyncInvoker(
        SearchDevicesRequest request) {
        return new AsyncInvoker<SearchDevicesRequest, SearchDevicesResponse>(request, MeetingMeta.searchDevices,
            hcClient);
    }

    /**
     * 查询历史会议列表
     *
     * 管理员可以查询管理权限域内所有的历史会议，普通用户仅能查询当前帐号管理的历史会议。不带查询参数时，默认查询权限范围内的历史会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchHisMeetingsRequest 请求对象
     * @return CompletableFuture<SearchHisMeetingsResponse>
     */
    public CompletableFuture<SearchHisMeetingsResponse> searchHisMeetingsAsync(SearchHisMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchHisMeetings);
    }

    /**
     * 查询历史会议列表
     *
     * 管理员可以查询管理权限域内所有的历史会议，普通用户仅能查询当前帐号管理的历史会议。不带查询参数时，默认查询权限范围内的历史会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchHisMeetingsRequest 请求对象
     * @return AsyncInvoker<SearchHisMeetingsRequest, SearchHisMeetingsResponse>
     */
    public AsyncInvoker<SearchHisMeetingsRequest, SearchHisMeetingsResponse> searchHisMeetingsAsyncInvoker(
        SearchHisMeetingsRequest request) {
        return new AsyncInvoker<SearchHisMeetingsRequest, SearchHisMeetingsResponse>(request,
            MeetingMeta.searchHisMeetings, hcClient);
    }

    /**
     * 分页查询信息窗素材
     *
     * 分页查询信息窗素材
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchMaterialsRequest 请求对象
     * @return CompletableFuture<SearchMaterialsResponse>
     */
    public CompletableFuture<SearchMaterialsResponse> searchMaterialsAsync(SearchMaterialsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMaterials);
    }

    /**
     * 分页查询信息窗素材
     *
     * 分页查询信息窗素材
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchMaterialsRequest 请求对象
     * @return AsyncInvoker<SearchMaterialsRequest, SearchMaterialsResponse>
     */
    public AsyncInvoker<SearchMaterialsRequest, SearchMaterialsResponse> searchMaterialsAsyncInvoker(
        SearchMaterialsRequest request) {
        return new AsyncInvoker<SearchMaterialsRequest, SearchMaterialsResponse>(request, MeetingMeta.searchMaterials,
            hcClient);
    }

    /**
     * 查询会议纪要列表
     *
     * 用户查询自己的会议纪要列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchMeetingFileListRequest 请求对象
     * @return CompletableFuture<SearchMeetingFileListResponse>
     */
    public CompletableFuture<SearchMeetingFileListResponse> searchMeetingFileListAsync(
        SearchMeetingFileListRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMeetingFileList);
    }

    /**
     * 查询会议纪要列表
     *
     * 用户查询自己的会议纪要列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchMeetingFileListRequest 请求对象
     * @return AsyncInvoker<SearchMeetingFileListRequest, SearchMeetingFileListResponse>
     */
    public AsyncInvoker<SearchMeetingFileListRequest, SearchMeetingFileListResponse> searchMeetingFileListAsyncInvoker(
        SearchMeetingFileListRequest request) {
        return new AsyncInvoker<SearchMeetingFileListRequest, SearchMeetingFileListResponse>(request,
            MeetingMeta.searchMeetingFileList, hcClient);
    }

    /**
     * 查询会议列表
     *
     * 管理员可以查询管理权限域内所有的会议，普通用户仅能查询当前帐号管理的会议。不带查询参数时，默认查询权限范围内正在召开或还未召开的会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchMeetingsRequest 请求对象
     * @return CompletableFuture<SearchMeetingsResponse>
     */
    public CompletableFuture<SearchMeetingsResponse> searchMeetingsAsync(SearchMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMeetings);
    }

    /**
     * 查询会议列表
     *
     * 管理员可以查询管理权限域内所有的会议，普通用户仅能查询当前帐号管理的会议。不带查询参数时，默认查询权限范围内正在召开或还未召开的会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchMeetingsRequest 请求对象
     * @return AsyncInvoker<SearchMeetingsRequest, SearchMeetingsResponse>
     */
    public AsyncInvoker<SearchMeetingsRequest, SearchMeetingsResponse> searchMeetingsAsyncInvoker(
        SearchMeetingsRequest request) {
        return new AsyncInvoker<SearchMeetingsRequest, SearchMeetingsResponse>(request, MeetingMeta.searchMeetings,
            hcClient);
    }

    /**
     * 普通用户分页查询云会议室及个人会议ID
     *
     * 企业用户通过该接口查询个人已分配的云会议室及个人会议ID。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchMemberVmrRequest 请求对象
     * @return CompletableFuture<SearchMemberVmrResponse>
     */
    public CompletableFuture<SearchMemberVmrResponse> searchMemberVmrAsync(SearchMemberVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMemberVmr);
    }

    /**
     * 普通用户分页查询云会议室及个人会议ID
     *
     * 企业用户通过该接口查询个人已分配的云会议室及个人会议ID。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchMemberVmrRequest 请求对象
     * @return AsyncInvoker<SearchMemberVmrRequest, SearchMemberVmrResponse>
     */
    public AsyncInvoker<SearchMemberVmrRequest, SearchMemberVmrResponse> searchMemberVmrAsyncInvoker(
        SearchMemberVmrRequest request) {
        return new AsyncInvoker<SearchMemberVmrRequest, SearchMemberVmrResponse>(request, MeetingMeta.searchMemberVmr,
            hcClient);
    }

    /**
     * 查询在线会议列表
     *
     * 管理员可以查询管理权限域内所有在线会议，普通用户仅能查询当前自己帐号管理的在线会议。不带查询参数时，默认查询权限范围内的在线会议，按开始时间升序排列。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchOnlineMeetingsRequest 请求对象
     * @return CompletableFuture<SearchOnlineMeetingsResponse>
     */
    public CompletableFuture<SearchOnlineMeetingsResponse> searchOnlineMeetingsAsync(
        SearchOnlineMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchOnlineMeetings);
    }

    /**
     * 查询在线会议列表
     *
     * 管理员可以查询管理权限域内所有在线会议，普通用户仅能查询当前自己帐号管理的在线会议。不带查询参数时，默认查询权限范围内的在线会议，按开始时间升序排列。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchOnlineMeetingsRequest 请求对象
     * @return AsyncInvoker<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse>
     */
    public AsyncInvoker<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> searchOnlineMeetingsAsyncInvoker(
        SearchOnlineMeetingsRequest request) {
        return new AsyncInvoker<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse>(request,
            MeetingMeta.searchOnlineMeetings, hcClient);
    }

    /**
     * 查询信息窗节目
     *
     * 获取信息窗节目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchProgramsRequest 请求对象
     * @return CompletableFuture<SearchProgramsResponse>
     */
    public CompletableFuture<SearchProgramsResponse> searchProgramsAsync(SearchProgramsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchPrograms);
    }

    /**
     * 查询信息窗节目
     *
     * 获取信息窗节目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchProgramsRequest 请求对象
     * @return AsyncInvoker<SearchProgramsRequest, SearchProgramsResponse>
     */
    public AsyncInvoker<SearchProgramsRequest, SearchProgramsResponse> searchProgramsAsyncInvoker(
        SearchProgramsRequest request) {
        return new AsyncInvoker<SearchProgramsRequest, SearchProgramsResponse>(request, MeetingMeta.searchPrograms,
            hcClient);
    }

    /**
     * 查询信息窗发布
     *
     * 获取信息窗发布
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchPublicationsRequest 请求对象
     * @return CompletableFuture<SearchPublicationsResponse>
     */
    public CompletableFuture<SearchPublicationsResponse> searchPublicationsAsync(SearchPublicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchPublications);
    }

    /**
     * 查询信息窗发布
     *
     * 获取信息窗发布
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchPublicationsRequest 请求对象
     * @return AsyncInvoker<SearchPublicationsRequest, SearchPublicationsResponse>
     */
    public AsyncInvoker<SearchPublicationsRequest, SearchPublicationsResponse> searchPublicationsAsyncInvoker(
        SearchPublicationsRequest request) {
        return new AsyncInvoker<SearchPublicationsRequest, SearchPublicationsResponse>(request,
            MeetingMeta.searchPublications, hcClient);
    }

    /**
     * 查询录制列表
     *
     * 管理员可以查询管理权限域内所有的录制，普通用户仅能查询当前帐号管理的录制。不带查询参数时，默认查询权限范围内的录制。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchRecordingsRequest 请求对象
     * @return CompletableFuture<SearchRecordingsResponse>
     */
    public CompletableFuture<SearchRecordingsResponse> searchRecordingsAsync(SearchRecordingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchRecordings);
    }

    /**
     * 查询录制列表
     *
     * 管理员可以查询管理权限域内所有的录制，普通用户仅能查询当前帐号管理的录制。不带查询参数时，默认查询权限范围内的录制。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchRecordingsRequest 请求对象
     * @return AsyncInvoker<SearchRecordingsRequest, SearchRecordingsResponse>
     */
    public AsyncInvoker<SearchRecordingsRequest, SearchRecordingsResponse> searchRecordingsAsyncInvoker(
        SearchRecordingsRequest request) {
        return new AsyncInvoker<SearchRecordingsRequest, SearchRecordingsResponse>(request,
            MeetingMeta.searchRecordings, hcClient);
    }

    /**
     * SP管理员根据分页查询企业资源
     *
     * SP根据条件查询企业的资源项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchResourceRequest 请求对象
     * @return CompletableFuture<SearchResourceResponse>
     */
    public CompletableFuture<SearchResourceResponse> searchResourceAsync(SearchResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchResource);
    }

    /**
     * SP管理员根据分页查询企业资源
     *
     * SP根据条件查询企业的资源项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchResourceRequest 请求对象
     * @return AsyncInvoker<SearchResourceRequest, SearchResourceResponse>
     */
    public AsyncInvoker<SearchResourceRequest, SearchResourceResponse> searchResourceAsyncInvoker(
        SearchResourceRequest request) {
        return new AsyncInvoker<SearchResourceRequest, SearchResourceResponse>(request, MeetingMeta.searchResource,
            hcClient);
    }

    /**
     * SP管理员根据分页查询企业资源操作记录
     *
     * SP根据根据条件查询企业的资源操作记录，支持根据resourceId模糊搜索
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchResourceOpRecordRequest 请求对象
     * @return CompletableFuture<SearchResourceOpRecordResponse>
     */
    public CompletableFuture<SearchResourceOpRecordResponse> searchResourceOpRecordAsync(
        SearchResourceOpRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchResourceOpRecord);
    }

    /**
     * SP管理员根据分页查询企业资源操作记录
     *
     * SP根据根据条件查询企业的资源操作记录，支持根据resourceId模糊搜索
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchResourceOpRecordRequest 请求对象
     * @return AsyncInvoker<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse>
     */
    public AsyncInvoker<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> searchResourceOpRecordAsyncInvoker(
        SearchResourceOpRecordRequest request) {
        return new AsyncInvoker<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse>(request,
            MeetingMeta.searchResourceOpRecord, hcClient);
    }

    /**
     * 分页查询用户
     *
     * 企业管理员通过该接口分页查询企业用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchUsersRequest 请求对象
     * @return CompletableFuture<SearchUsersResponse>
     */
    public CompletableFuture<SearchUsersResponse> searchUsersAsync(SearchUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchUsers);
    }

    /**
     * 分页查询用户
     *
     * 企业管理员通过该接口分页查询企业用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchUsersRequest 请求对象
     * @return AsyncInvoker<SearchUsersRequest, SearchUsersResponse>
     */
    public AsyncInvoker<SearchUsersRequest, SearchUsersResponse> searchUsersAsyncInvoker(SearchUsersRequest request) {
        return new AsyncInvoker<SearchUsersRequest, SearchUsersResponse>(request, MeetingMeta.searchUsers, hcClient);
    }

    /**
     * 企业管理员分页查询激活码
     *
     * 企业管理员分页查询激活码，支持激活码、终端名称模糊查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchVisionActiveCodeRequest 请求对象
     * @return CompletableFuture<SearchVisionActiveCodeResponse>
     */
    public CompletableFuture<SearchVisionActiveCodeResponse> searchVisionActiveCodeAsync(
        SearchVisionActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchVisionActiveCode);
    }

    /**
     * 企业管理员分页查询激活码
     *
     * 企业管理员分页查询激活码，支持激活码、终端名称模糊查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchVisionActiveCodeRequest 请求对象
     * @return AsyncInvoker<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse>
     */
    public AsyncInvoker<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> searchVisionActiveCodeAsyncInvoker(
        SearchVisionActiveCodeRequest request) {
        return new AsyncInvoker<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse>(request,
            MeetingMeta.searchVisionActiveCode, hcClient);
    }

    /**
     * 发送滑块验证码
     *
     * 该接口提供发送滑块验证码。服务器收到请求，返回抠图以及抠图后的原图等结果。需要在前台界面显示出抠图以及抠图后的原图，用户通过滑块操作来匹配图形。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SendSlideVerifyCodeRequest 请求对象
     * @return CompletableFuture<SendSlideVerifyCodeResponse>
     */
    public CompletableFuture<SendSlideVerifyCodeResponse> sendSlideVerifyCodeAsync(SendSlideVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendSlideVerifyCode);
    }

    /**
     * 发送滑块验证码
     *
     * 该接口提供发送滑块验证码。服务器收到请求，返回抠图以及抠图后的原图等结果。需要在前台界面显示出抠图以及抠图后的原图，用户通过滑块操作来匹配图形。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SendSlideVerifyCodeRequest 请求对象
     * @return AsyncInvoker<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse>
     */
    public AsyncInvoker<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> sendSlideVerifyCodeAsyncInvoker(
        SendSlideVerifyCodeRequest request) {
        return new AsyncInvoker<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse>(request,
            MeetingMeta.sendSlideVerifyCode, hcClient);
    }

    /**
     * 发送验证码
     *
     * 该接口提供发送验证码，服务器收到请求，发送验证码到邮箱或者短信并返回结果。用户在前台界面通过滑块验证后，再进行发送验证码操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SendVeriCodeForChangePwdRequest 请求对象
     * @return CompletableFuture<SendVeriCodeForChangePwdResponse>
     */
    public CompletableFuture<SendVeriCodeForChangePwdResponse> sendVeriCodeForChangePwdAsync(
        SendVeriCodeForChangePwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendVeriCodeForChangePwd);
    }

    /**
     * 发送验证码
     *
     * 该接口提供发送验证码，服务器收到请求，发送验证码到邮箱或者短信并返回结果。用户在前台界面通过滑块验证后，再进行发送验证码操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SendVeriCodeForChangePwdRequest 请求对象
     * @return AsyncInvoker<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse>
     */
    public AsyncInvoker<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> sendVeriCodeForChangePwdAsyncInvoker(
        SendVeriCodeForChangePwdRequest request) {
        return new AsyncInvoker<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse>(request,
            MeetingMeta.sendVeriCodeForChangePwd, hcClient);
    }

    /**
     * 获取验证码
     *
     * 获取验证码，向手机或邮箱发送，一分钟内只会发送一次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SendVeriCodeForUpdateUserInfoRequest 请求对象
     * @return CompletableFuture<SendVeriCodeForUpdateUserInfoResponse>
     */
    public CompletableFuture<SendVeriCodeForUpdateUserInfoResponse> sendVeriCodeForUpdateUserInfoAsync(
        SendVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendVeriCodeForUpdateUserInfo);
    }

    /**
     * 获取验证码
     *
     * 获取验证码，向手机或邮箱发送，一分钟内只会发送一次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SendVeriCodeForUpdateUserInfoRequest 请求对象
     * @return AsyncInvoker<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse>
     */
    public AsyncInvoker<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> sendVeriCodeForUpdateUserInfoAsyncInvoker(
        SendVeriCodeForUpdateUserInfoRequest request) {
        return new AsyncInvoker<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse>(request,
            MeetingMeta.sendVeriCodeForUpdateUserInfo, hcClient);
    }

    /**
     * 设置自定义多画面
     *
     * 场景描述：会议管理员在confportal手动设置多画面 功能描述：提供给会议管理员手动设置多画面的功能
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetCustomMultiPictureRequest 请求对象
     * @return CompletableFuture<SetCustomMultiPictureResponse>
     */
    public CompletableFuture<SetCustomMultiPictureResponse> setCustomMultiPictureAsync(
        SetCustomMultiPictureRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setCustomMultiPicture);
    }

    /**
     * 设置自定义多画面
     *
     * 场景描述：会议管理员在confportal手动设置多画面 功能描述：提供给会议管理员手动设置多画面的功能
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetCustomMultiPictureRequest 请求对象
     * @return AsyncInvoker<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse>
     */
    public AsyncInvoker<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> setCustomMultiPictureAsyncInvoker(
        SetCustomMultiPictureRequest request) {
        return new AsyncInvoker<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse>(request,
            MeetingMeta.setCustomMultiPicture, hcClient);
    }

    /**
     * 主持人选看
     *
     * 用于主持人轮询、主持人选看多画面、主持人选看会场操作。目前只适用于硬终端为主持人的场景。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetHostViewRequest 请求对象
     * @return CompletableFuture<SetHostViewResponse>
     */
    public CompletableFuture<SetHostViewResponse> setHostViewAsync(SetHostViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setHostView);
    }

    /**
     * 主持人选看
     *
     * 用于主持人轮询、主持人选看多画面、主持人选看会场操作。目前只适用于硬终端为主持人的场景。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetHostViewRequest 请求对象
     * @return AsyncInvoker<SetHostViewRequest, SetHostViewResponse>
     */
    public AsyncInvoker<SetHostViewRequest, SetHostViewResponse> setHostViewAsyncInvoker(SetHostViewRequest request) {
        return new AsyncInvoker<SetHostViewRequest, SetHostViewResponse>(request, MeetingMeta.setHostView, hcClient);
    }

    /**
     * 设置多画面
     *
     * 设置会议多画面。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetMultiPictureRequest 请求对象
     * @return CompletableFuture<SetMultiPictureResponse>
     */
    public CompletableFuture<SetMultiPictureResponse> setMultiPictureAsync(SetMultiPictureRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setMultiPicture);
    }

    /**
     * 设置多画面
     *
     * 设置会议多画面。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetMultiPictureRequest 请求对象
     * @return AsyncInvoker<SetMultiPictureRequest, SetMultiPictureResponse>
     */
    public AsyncInvoker<SetMultiPictureRequest, SetMultiPictureResponse> setMultiPictureAsyncInvoker(
        SetMultiPictureRequest request) {
        return new AsyncInvoker<SetMultiPictureRequest, SetMultiPictureResponse>(request, MeetingMeta.setMultiPicture,
            hcClient);
    }

    /**
     * 会场选看
     *
     * 目前只适用于硬终端选看其他会场人的场景。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetParticipantViewRequest 请求对象
     * @return CompletableFuture<SetParticipantViewResponse>
     */
    public CompletableFuture<SetParticipantViewResponse> setParticipantViewAsync(SetParticipantViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setParticipantView);
    }

    /**
     * 会场选看
     *
     * 目前只适用于硬终端选看其他会场人的场景。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetParticipantViewRequest 请求对象
     * @return AsyncInvoker<SetParticipantViewRequest, SetParticipantViewResponse>
     */
    public AsyncInvoker<SetParticipantViewRequest, SetParticipantViewResponse> setParticipantViewAsyncInvoker(
        SetParticipantViewRequest request) {
        return new AsyncInvoker<SetParticipantViewRequest, SetParticipantViewResponse>(request,
            MeetingMeta.setParticipantView, hcClient);
    }

    /**
     * 申请主持人
     *
     * 申请或释放主持人。普通用户可申请主持人，主持人可释放主持人权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetRoleRequest 请求对象
     * @return CompletableFuture<SetRoleResponse>
     */
    public CompletableFuture<SetRoleResponse> setRoleAsync(SetRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setRole);
    }

    /**
     * 申请主持人
     *
     * 申请或释放主持人。普通用户可申请主持人，主持人可释放主持人权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetRoleRequest 请求对象
     * @return AsyncInvoker<SetRoleRequest, SetRoleResponse>
     */
    public AsyncInvoker<SetRoleRequest, SetRoleResponse> setRoleAsyncInvoker(SetRoleRequest request) {
        return new AsyncInvoker<SetRoleRequest, SetRoleResponse>(request, MeetingMeta.setRole, hcClient);
    }

    /**
     * 设置SSO鉴权配置
     *
     * 设置SSO鉴权配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetSsoConfigRequest 请求对象
     * @return CompletableFuture<SetSsoConfigResponse>
     */
    public CompletableFuture<SetSsoConfigResponse> setSsoConfigAsync(SetSsoConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setSsoConfig);
    }

    /**
     * 设置SSO鉴权配置
     *
     * 设置SSO鉴权配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetSsoConfigRequest 请求对象
     * @return AsyncInvoker<SetSsoConfigRequest, SetSsoConfigResponse>
     */
    public AsyncInvoker<SetSsoConfigRequest, SetSsoConfigResponse> setSsoConfigAsyncInvoker(
        SetSsoConfigRequest request) {
        return new AsyncInvoker<SetSsoConfigRequest, SetSsoConfigResponse>(request, MeetingMeta.setSsoConfig, hcClient);
    }

    /**
     * 设置事件订阅配置信息
     *
     * 设置企业事件订阅配置设置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetWebHookConfigRequest 请求对象
     * @return CompletableFuture<SetWebHookConfigResponse>
     */
    public CompletableFuture<SetWebHookConfigResponse> setWebHookConfigAsync(SetWebHookConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setWebHookConfig);
    }

    /**
     * 设置事件订阅配置信息
     *
     * 设置企业事件订阅配置设置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetWebHookConfigRequest 请求对象
     * @return AsyncInvoker<SetWebHookConfigRequest, SetWebHookConfigResponse>
     */
    public AsyncInvoker<SetWebHookConfigRequest, SetWebHookConfigResponse> setWebHookConfigAsyncInvoker(
        SetWebHookConfigRequest request) {
        return new AsyncInvoker<SetWebHookConfigRequest, SetWebHookConfigResponse>(request,
            MeetingMeta.setWebHookConfig, hcClient);
    }

    /**
     * 通过会议ID查询企业ID
     *
     * 与某个会议在同一个SP下的用户，可以通过会议ID查询到该会议对应的企业ID。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowConfOrgRequest 请求对象
     * @return CompletableFuture<ShowConfOrgResponse>
     */
    public CompletableFuture<ShowConfOrgResponse> showConfOrgAsync(ShowConfOrgRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showConfOrg);
    }

    /**
     * 通过会议ID查询企业ID
     *
     * 与某个会议在同一个SP下的用户，可以通过会议ID查询到该会议对应的企业ID。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowConfOrgRequest 请求对象
     * @return AsyncInvoker<ShowConfOrgRequest, ShowConfOrgResponse>
     */
    public AsyncInvoker<ShowConfOrgRequest, ShowConfOrgResponse> showConfOrgAsyncInvoker(ShowConfOrgRequest request) {
        return new AsyncInvoker<ShowConfOrgRequest, ShowConfOrgResponse>(request, MeetingMeta.showConfOrg, hcClient);
    }

    /**
     * SP管理员查询企业
     *
     * 获取企业
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCorpRequest 请求对象
     * @return CompletableFuture<ShowCorpResponse>
     */
    public CompletableFuture<ShowCorpResponse> showCorpAsync(ShowCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorp);
    }

    /**
     * SP管理员查询企业
     *
     * 获取企业
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCorpRequest 请求对象
     * @return AsyncInvoker<ShowCorpRequest, ShowCorpResponse>
     */
    public AsyncInvoker<ShowCorpRequest, ShowCorpResponse> showCorpAsyncInvoker(ShowCorpRequest request) {
        return new AsyncInvoker<ShowCorpRequest, ShowCorpResponse>(request, MeetingMeta.showCorp, hcClient);
    }

    /**
     * 查询企业管理员
     *
     * 通过该接口查询企业管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCorpAdminRequest 请求对象
     * @return CompletableFuture<ShowCorpAdminResponse>
     */
    public CompletableFuture<ShowCorpAdminResponse> showCorpAdminAsync(ShowCorpAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpAdmin);
    }

    /**
     * 查询企业管理员
     *
     * 通过该接口查询企业管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCorpAdminRequest 请求对象
     * @return AsyncInvoker<ShowCorpAdminRequest, ShowCorpAdminResponse>
     */
    public AsyncInvoker<ShowCorpAdminRequest, ShowCorpAdminResponse> showCorpAdminAsyncInvoker(
        ShowCorpAdminRequest request) {
        return new AsyncInvoker<ShowCorpAdminRequest, ShowCorpAdminResponse>(request, MeetingMeta.showCorpAdmin,
            hcClient);
    }

    /**
     * 企业管理员查询企业注册信息
     *
     * 企业管理员通过该接口查询企业注册信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCorpBasicInfoRequest 请求对象
     * @return CompletableFuture<ShowCorpBasicInfoResponse>
     */
    public CompletableFuture<ShowCorpBasicInfoResponse> showCorpBasicInfoAsync(ShowCorpBasicInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpBasicInfo);
    }

    /**
     * 企业管理员查询企业注册信息
     *
     * 企业管理员通过该接口查询企业注册信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCorpBasicInfoRequest 请求对象
     * @return AsyncInvoker<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse>
     */
    public AsyncInvoker<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> showCorpBasicInfoAsyncInvoker(
        ShowCorpBasicInfoRequest request) {
        return new AsyncInvoker<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse>(request,
            MeetingMeta.showCorpBasicInfo, hcClient);
    }

    /**
     * 企业管理员查询企业内资源及业务权限
     *
     * 企业管理员通过该接口查询企业内资源及业务权限，包括查询已使用的资源情况。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCorpResourceRequest 请求对象
     * @return CompletableFuture<ShowCorpResourceResponse>
     */
    public CompletableFuture<ShowCorpResourceResponse> showCorpResourceAsync(ShowCorpResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpResource);
    }

    /**
     * 企业管理员查询企业内资源及业务权限
     *
     * 企业管理员通过该接口查询企业内资源及业务权限，包括查询已使用的资源情况。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCorpResourceRequest 请求对象
     * @return AsyncInvoker<ShowCorpResourceRequest, ShowCorpResourceResponse>
     */
    public AsyncInvoker<ShowCorpResourceRequest, ShowCorpResourceResponse> showCorpResourceAsyncInvoker(
        ShowCorpResourceRequest request) {
        return new AsyncInvoker<ShowCorpResourceRequest, ShowCorpResourceResponse>(request,
            MeetingMeta.showCorpResource, hcClient);
    }

    /**
     * 通过部门编码查询部门信息
     *
     * 通过部门编码查询部门信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDepartmentRequest 请求对象
     * @return CompletableFuture<ShowDepartmentResponse>
     */
    public CompletableFuture<ShowDepartmentResponse> showDepartmentAsync(ShowDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDepartment);
    }

    /**
     * 通过部门编码查询部门信息
     *
     * 通过部门编码查询部门信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDepartmentRequest 请求对象
     * @return AsyncInvoker<ShowDepartmentRequest, ShowDepartmentResponse>
     */
    public AsyncInvoker<ShowDepartmentRequest, ShowDepartmentResponse> showDepartmentAsyncInvoker(
        ShowDepartmentRequest request) {
        return new AsyncInvoker<ShowDepartmentRequest, ShowDepartmentResponse>(request, MeetingMeta.showDepartment,
            hcClient);
    }

    /**
     * 查询部门及其一级子部门列表
     *
     * 企业管理员通过该接口查询部门及其一级子部门列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDeptAndChildDeptRequest 请求对象
     * @return CompletableFuture<ShowDeptAndChildDeptResponse>
     */
    public CompletableFuture<ShowDeptAndChildDeptResponse> showDeptAndChildDeptAsync(
        ShowDeptAndChildDeptRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeptAndChildDept);
    }

    /**
     * 查询部门及其一级子部门列表
     *
     * 企业管理员通过该接口查询部门及其一级子部门列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDeptAndChildDeptRequest 请求对象
     * @return AsyncInvoker<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse>
     */
    public AsyncInvoker<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> showDeptAndChildDeptAsyncInvoker(
        ShowDeptAndChildDeptRequest request) {
        return new AsyncInvoker<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse>(request,
            MeetingMeta.showDeptAndChildDept, hcClient);
    }

    /**
     * 查询终端详情
     *
     * 企业管理员通过该接口查询终端详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDeviceDetailRequest 请求对象
     * @return CompletableFuture<ShowDeviceDetailResponse>
     */
    public CompletableFuture<ShowDeviceDetailResponse> showDeviceDetailAsync(ShowDeviceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceDetail);
    }

    /**
     * 查询终端详情
     *
     * 企业管理员通过该接口查询终端详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDeviceDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeviceDetailRequest, ShowDeviceDetailResponse>
     */
    public AsyncInvoker<ShowDeviceDetailRequest, ShowDeviceDetailResponse> showDeviceDetailAsyncInvoker(
        ShowDeviceDetailRequest request) {
        return new AsyncInvoker<ShowDeviceDetailRequest, ShowDeviceDetailResponse>(request,
            MeetingMeta.showDeviceDetail, hcClient);
    }

    /**
     * 查询设备状态
     *
     * 调用本接口可以查询硬终端的状态。
     * 硬终端与发起查询请求的帐号需在同一企业下，否则会鉴权失败。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDeviceStatusRequest 请求对象
     * @return CompletableFuture<ShowDeviceStatusResponse>
     */
    public CompletableFuture<ShowDeviceStatusResponse> showDeviceStatusAsync(ShowDeviceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceStatus);
    }

    /**
     * 查询设备状态
     *
     * 调用本接口可以查询硬终端的状态。
     * 硬终端与发起查询请求的帐号需在同一企业下，否则会鉴权失败。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDeviceStatusRequest 请求对象
     * @return AsyncInvoker<ShowDeviceStatusRequest, ShowDeviceStatusResponse>
     */
    public AsyncInvoker<ShowDeviceStatusRequest, ShowDeviceStatusResponse> showDeviceStatusAsyncInvoker(
        ShowDeviceStatusRequest request) {
        return new AsyncInvoker<ShowDeviceStatusRequest, ShowDeviceStatusResponse>(request,
            MeetingMeta.showDeviceStatus, hcClient);
    }

    /**
     * 获取所有终端类型
     *
     * 企业管理员通过该接口获取所有的终端类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDeviceTypesRequest 请求对象
     * @return CompletableFuture<ShowDeviceTypesResponse>
     */
    public CompletableFuture<ShowDeviceTypesResponse> showDeviceTypesAsync(ShowDeviceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceTypes);
    }

    /**
     * 获取所有终端类型
     *
     * 企业管理员通过该接口获取所有的终端类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDeviceTypesRequest 请求对象
     * @return AsyncInvoker<ShowDeviceTypesRequest, ShowDeviceTypesResponse>
     */
    public AsyncInvoker<ShowDeviceTypesRequest, ShowDeviceTypesResponse> showDeviceTypesAsyncInvoker(
        ShowDeviceTypesRequest request) {
        return new AsyncInvoker<ShowDeviceTypesRequest, ShowDeviceTypesResponse>(request, MeetingMeta.showDeviceTypes,
            hcClient);
    }

    /**
     * 查询历史会议详情
     *
     * 管理员可以查询管理权限域内所有的历史会议详情，普通用户仅能查询当前帐号管理的历史会议详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHisMeetingDetailRequest 请求对象
     * @return CompletableFuture<ShowHisMeetingDetailResponse>
     */
    public CompletableFuture<ShowHisMeetingDetailResponse> showHisMeetingDetailAsync(
        ShowHisMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showHisMeetingDetail);
    }

    /**
     * 查询历史会议详情
     *
     * 管理员可以查询管理权限域内所有的历史会议详情，普通用户仅能查询当前帐号管理的历史会议详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHisMeetingDetailRequest 请求对象
     * @return AsyncInvoker<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse>
     */
    public AsyncInvoker<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> showHisMeetingDetailAsyncInvoker(
        ShowHisMeetingDetailRequest request) {
        return new AsyncInvoker<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse>(request,
            MeetingMeta.showHisMeetingDetail, hcClient);
    }

    /**
     * 查询会议详情
     *
     * 管理员可以查询管理权限域内所有会议的详情，普通用户仅能查询当前帐号管理的会议详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMeetingDetailRequest 请求对象
     * @return CompletableFuture<ShowMeetingDetailResponse>
     */
    public CompletableFuture<ShowMeetingDetailResponse> showMeetingDetailAsync(ShowMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMeetingDetail);
    }

    /**
     * 查询会议详情
     *
     * 管理员可以查询管理权限域内所有会议的详情，普通用户仅能查询当前帐号管理的会议详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMeetingDetailRequest 请求对象
     * @return AsyncInvoker<ShowMeetingDetailRequest, ShowMeetingDetailResponse>
     */
    public AsyncInvoker<ShowMeetingDetailRequest, ShowMeetingDetailResponse> showMeetingDetailAsyncInvoker(
        ShowMeetingDetailRequest request) {
        return new AsyncInvoker<ShowMeetingDetailRequest, ShowMeetingDetailResponse>(request,
            MeetingMeta.showMeetingDetail, hcClient);
    }

    /**
     * 查询会议纪要详情
     *
     * 用户查询单个会议纪要详情（主要目的是为了得到外链）。 IdeaHub是使用fileCode来查，所以终端保持一致。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMeetingFileRequest 请求对象
     * @return CompletableFuture<ShowMeetingFileResponse>
     */
    public CompletableFuture<ShowMeetingFileResponse> showMeetingFileAsync(ShowMeetingFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMeetingFile);
    }

    /**
     * 查询会议纪要详情
     *
     * 用户查询单个会议纪要详情（主要目的是为了得到外链）。 IdeaHub是使用fileCode来查，所以终端保持一致。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMeetingFileRequest 请求对象
     * @return AsyncInvoker<ShowMeetingFileRequest, ShowMeetingFileResponse>
     */
    public AsyncInvoker<ShowMeetingFileRequest, ShowMeetingFileResponse> showMeetingFileAsyncInvoker(
        ShowMeetingFileRequest request) {
        return new AsyncInvoker<ShowMeetingFileRequest, ShowMeetingFileResponse>(request, MeetingMeta.showMeetingFile,
            hcClient);
    }

    /**
     * 打开会议纪要文件列表
     *
     * 用户使用手机扫码后，手机端请求服务端，让服务端通知指定IdeaHub打开指定用户的会议纪要文件列表。二维码内容  cloudlink://cloudlink.huawei.com/h5page?action&#x3D;OPEN_MEETING_FILE_LIST&amp;key1&#x3D;value1&amp;key2&#x3D;value2    key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMeetingFileListRequest 请求对象
     * @return CompletableFuture<ShowMeetingFileListResponse>
     */
    public CompletableFuture<ShowMeetingFileListResponse> showMeetingFileListAsync(ShowMeetingFileListRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMeetingFileList);
    }

    /**
     * 打开会议纪要文件列表
     *
     * 用户使用手机扫码后，手机端请求服务端，让服务端通知指定IdeaHub打开指定用户的会议纪要文件列表。二维码内容  cloudlink://cloudlink.huawei.com/h5page?action&#x3D;OPEN_MEETING_FILE_LIST&amp;key1&#x3D;value1&amp;key2&#x3D;value2    key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMeetingFileListRequest 请求对象
     * @return AsyncInvoker<ShowMeetingFileListRequest, ShowMeetingFileListResponse>
     */
    public AsyncInvoker<ShowMeetingFileListRequest, ShowMeetingFileListResponse> showMeetingFileListAsyncInvoker(
        ShowMeetingFileListRequest request) {
        return new AsyncInvoker<ShowMeetingFileListRequest, ShowMeetingFileListResponse>(request,
            MeetingMeta.showMeetingFileList, hcClient);
    }

    /**
     * 用户查询自己的信息
     *
     * 企业用户通过该接口查询自己的信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMyInfoRequest 请求对象
     * @return CompletableFuture<ShowMyInfoResponse>
     */
    public CompletableFuture<ShowMyInfoResponse> showMyInfoAsync(ShowMyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMyInfo);
    }

    /**
     * 用户查询自己的信息
     *
     * 企业用户通过该接口查询自己的信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMyInfoRequest 请求对象
     * @return AsyncInvoker<ShowMyInfoRequest, ShowMyInfoResponse>
     */
    public AsyncInvoker<ShowMyInfoRequest, ShowMyInfoResponse> showMyInfoAsyncInvoker(ShowMyInfoRequest request) {
        return new AsyncInvoker<ShowMyInfoRequest, ShowMyInfoResponse>(request, MeetingMeta.showMyInfo, hcClient);
    }

    /**
     * 查询在线会议详情
     *
     * 管理员可以查询管理权限域内所有的在线会议详情，普通用户仅能查询当前自己的帐号管理的在线会议详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowOnlineMeetingDetailRequest 请求对象
     * @return CompletableFuture<ShowOnlineMeetingDetailResponse>
     */
    public CompletableFuture<ShowOnlineMeetingDetailResponse> showOnlineMeetingDetailAsync(
        ShowOnlineMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showOnlineMeetingDetail);
    }

    /**
     * 查询在线会议详情
     *
     * 管理员可以查询管理权限域内所有的在线会议详情，普通用户仅能查询当前自己的帐号管理的在线会议详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowOnlineMeetingDetailRequest 请求对象
     * @return AsyncInvoker<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse>
     */
    public AsyncInvoker<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> showOnlineMeetingDetailAsyncInvoker(
        ShowOnlineMeetingDetailRequest request) {
        return new AsyncInvoker<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse>(request,
            MeetingMeta.showOnlineMeetingDetail, hcClient);
    }

    /**
     * 查询企业的资源使用信息
     *
     * 企业管理员查询资源使用信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowOrgResRequest 请求对象
     * @return CompletableFuture<ShowOrgResResponse>
     */
    public CompletableFuture<ShowOrgResResponse> showOrgResAsync(ShowOrgResRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showOrgRes);
    }

    /**
     * 查询企业的资源使用信息
     *
     * 企业管理员查询资源使用信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowOrgResRequest 请求对象
     * @return AsyncInvoker<ShowOrgResRequest, ShowOrgResResponse>
     */
    public AsyncInvoker<ShowOrgResRequest, ShowOrgResResponse> showOrgResAsyncInvoker(ShowOrgResRequest request) {
        return new AsyncInvoker<ShowOrgResRequest, ShowOrgResResponse>(request, MeetingMeta.showOrgRes, hcClient);
    }

    /**
     * 根据ID查询节目详情
     *
     * 根据ID获取节目详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowProgramRequest 请求对象
     * @return CompletableFuture<ShowProgramResponse>
     */
    public CompletableFuture<ShowProgramResponse> showProgramAsync(ShowProgramRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showProgram);
    }

    /**
     * 根据ID查询节目详情
     *
     * 根据ID获取节目详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowProgramRequest 请求对象
     * @return AsyncInvoker<ShowProgramRequest, ShowProgramResponse>
     */
    public AsyncInvoker<ShowProgramRequest, ShowProgramResponse> showProgramAsyncInvoker(ShowProgramRequest request) {
        return new AsyncInvoker<ShowProgramRequest, ShowProgramResponse>(request, MeetingMeta.showProgram, hcClient);
    }

    /**
     * 根据ID查询信息窗发布详情
     *
     * 根据ID获取发布详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicationRequest 请求对象
     * @return CompletableFuture<ShowPublicationResponse>
     */
    public CompletableFuture<ShowPublicationResponse> showPublicationAsync(ShowPublicationRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showPublication);
    }

    /**
     * 根据ID查询信息窗发布详情
     *
     * 根据ID获取发布详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicationRequest 请求对象
     * @return AsyncInvoker<ShowPublicationRequest, ShowPublicationResponse>
     */
    public AsyncInvoker<ShowPublicationRequest, ShowPublicationResponse> showPublicationAsyncInvoker(
        ShowPublicationRequest request) {
        return new AsyncInvoker<ShowPublicationRequest, ShowPublicationResponse>(request, MeetingMeta.showPublication,
            hcClient);
    }

    /**
     * 查询会议实时信息
     *
     * 查询会议实时信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRealTimeInfoOfMeetingRequest 请求对象
     * @return CompletableFuture<ShowRealTimeInfoOfMeetingResponse>
     */
    public CompletableFuture<ShowRealTimeInfoOfMeetingResponse> showRealTimeInfoOfMeetingAsync(
        ShowRealTimeInfoOfMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRealTimeInfoOfMeeting);
    }

    /**
     * 查询会议实时信息
     *
     * 查询会议实时信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRealTimeInfoOfMeetingRequest 请求对象
     * @return AsyncInvoker<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse>
     */
    public AsyncInvoker<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> showRealTimeInfoOfMeetingAsyncInvoker(
        ShowRealTimeInfoOfMeetingRequest request) {
        return new AsyncInvoker<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse>(request,
            MeetingMeta.showRealTimeInfoOfMeeting, hcClient);
    }

    /**
     * 查询录制详情
     *
     * 查询某个录制详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRecordingDetailRequest 请求对象
     * @return CompletableFuture<ShowRecordingDetailResponse>
     */
    public CompletableFuture<ShowRecordingDetailResponse> showRecordingDetailAsync(ShowRecordingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRecordingDetail);
    }

    /**
     * 查询录制详情
     *
     * 查询某个录制详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRecordingDetailRequest 请求对象
     * @return AsyncInvoker<ShowRecordingDetailRequest, ShowRecordingDetailResponse>
     */
    public AsyncInvoker<ShowRecordingDetailRequest, ShowRecordingDetailResponse> showRecordingDetailAsyncInvoker(
        ShowRecordingDetailRequest request) {
        return new AsyncInvoker<ShowRecordingDetailRequest, ShowRecordingDetailResponse>(request,
            MeetingMeta.showRecordingDetail, hcClient);
    }

    /**
     * 查询录制文件下载链接
     *
     * 查询某个录制文件下载链接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRecordingFileDownloadUrlsRequest 请求对象
     * @return CompletableFuture<ShowRecordingFileDownloadUrlsResponse>
     */
    public CompletableFuture<ShowRecordingFileDownloadUrlsResponse> showRecordingFileDownloadUrlsAsync(
        ShowRecordingFileDownloadUrlsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRecordingFileDownloadUrls);
    }

    /**
     * 查询录制文件下载链接
     *
     * 查询某个录制文件下载链接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRecordingFileDownloadUrlsRequest 请求对象
     * @return AsyncInvoker<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse>
     */
    public AsyncInvoker<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> showRecordingFileDownloadUrlsAsyncInvoker(
        ShowRecordingFileDownloadUrlsRequest request) {
        return new AsyncInvoker<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse>(request,
            MeetingMeta.showRecordingFileDownloadUrls, hcClient);
    }

    /**
     * 查询会议所在区域信息
     *
     * 查询会议所在区域信息，如果会议不存在或者会议未召开，返回对应的错误码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRegionInfoOfMeetingRequest 请求对象
     * @return CompletableFuture<ShowRegionInfoOfMeetingResponse>
     */
    public CompletableFuture<ShowRegionInfoOfMeetingResponse> showRegionInfoOfMeetingAsync(
        ShowRegionInfoOfMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRegionInfoOfMeeting);
    }

    /**
     * 查询会议所在区域信息
     *
     * 查询会议所在区域信息，如果会议不存在或者会议未召开，返回对应的错误码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRegionInfoOfMeetingRequest 请求对象
     * @return AsyncInvoker<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse>
     */
    public AsyncInvoker<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> showRegionInfoOfMeetingAsyncInvoker(
        ShowRegionInfoOfMeetingRequest request) {
        return new AsyncInvoker<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse>(request,
            MeetingMeta.showRegionInfoOfMeeting, hcClient);
    }

    /**
     * 查询直播间高级设置
     *
     * 查询直播间高级设置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRoomSettingRequest 请求对象
     * @return CompletableFuture<ShowRoomSettingResponse>
     */
    public CompletableFuture<ShowRoomSettingResponse> showRoomSettingAsync(ShowRoomSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRoomSetting);
    }

    /**
     * 查询直播间高级设置
     *
     * 查询直播间高级设置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRoomSettingRequest 请求对象
     * @return AsyncInvoker<ShowRoomSettingRequest, ShowRoomSettingResponse>
     */
    public AsyncInvoker<ShowRoomSettingRequest, ShowRoomSettingResponse> showRoomSettingAsyncInvoker(
        ShowRoomSettingRequest request) {
        return new AsyncInvoker<ShowRoomSettingRequest, ShowRoomSettingResponse>(request, MeetingMeta.showRoomSetting,
            hcClient);
    }

    /**
     * 查询SP的共享资源使用信息
     *
     * SP管理查询所属SP的共享资源使用信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSpResRequest 请求对象
     * @return CompletableFuture<ShowSpResResponse>
     */
    public CompletableFuture<ShowSpResResponse> showSpResAsync(ShowSpResRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showSpRes);
    }

    /**
     * 查询SP的共享资源使用信息
     *
     * SP管理查询所属SP的共享资源使用信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSpResRequest 请求对象
     * @return AsyncInvoker<ShowSpResRequest, ShowSpResResponse>
     */
    public AsyncInvoker<ShowSpResRequest, ShowSpResResponse> showSpResAsyncInvoker(ShowSpResRequest request) {
        return new AsyncInvoker<ShowSpResRequest, ShowSpResResponse>(request, MeetingMeta.showSpRes, hcClient);
    }

    /**
     * SP管理员查询资源信息
     *
     * SP管理员查询SP的所有资源，包括已使用的资源
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSpResourceRequest 请求对象
     * @return CompletableFuture<ShowSpResourceResponse>
     */
    public CompletableFuture<ShowSpResourceResponse> showSpResourceAsync(ShowSpResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showSpResource);
    }

    /**
     * SP管理员查询资源信息
     *
     * SP管理员查询SP的所有资源，包括已使用的资源
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSpResourceRequest 请求对象
     * @return AsyncInvoker<ShowSpResourceRequest, ShowSpResourceResponse>
     */
    public AsyncInvoker<ShowSpResourceRequest, ShowSpResourceResponse> showSpResourceAsyncInvoker(
        ShowSpResourceRequest request) {
        return new AsyncInvoker<ShowSpResourceRequest, ShowSpResourceResponse>(request, MeetingMeta.showSpResource,
            hcClient);
    }

    /**
     * 查询SSO鉴权配置
     *
     * 查询SSO鉴权配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSsoConfigRequest 请求对象
     * @return CompletableFuture<ShowSsoConfigResponse>
     */
    public CompletableFuture<ShowSsoConfigResponse> showSsoConfigAsync(ShowSsoConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showSsoConfig);
    }

    /**
     * 查询SSO鉴权配置
     *
     * 查询SSO鉴权配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSsoConfigRequest 请求对象
     * @return AsyncInvoker<ShowSsoConfigRequest, ShowSsoConfigResponse>
     */
    public AsyncInvoker<ShowSsoConfigRequest, ShowSsoConfigResponse> showSsoConfigAsyncInvoker(
        ShowSsoConfigRequest request) {
        return new AsyncInvoker<ShowSsoConfigRequest, ShowSsoConfigResponse>(request, MeetingMeta.showSsoConfig,
            hcClient);
    }

    /**
     * 查询用户详情
     *
     * 企业管理员通过该接口查询企业用户详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowUserDetailRequest 请求对象
     * @return CompletableFuture<ShowUserDetailResponse>
     */
    public CompletableFuture<ShowUserDetailResponse> showUserDetailAsync(ShowUserDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showUserDetail);
    }

    /**
     * 查询用户详情
     *
     * 企业管理员通过该接口查询企业用户详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowUserDetailRequest 请求对象
     * @return AsyncInvoker<ShowUserDetailRequest, ShowUserDetailResponse>
     */
    public AsyncInvoker<ShowUserDetailRequest, ShowUserDetailResponse> showUserDetailAsyncInvoker(
        ShowUserDetailRequest request) {
        return new AsyncInvoker<ShowUserDetailRequest, ShowUserDetailResponse>(request, MeetingMeta.showUserDetail,
            hcClient);
    }

    /**
     * 查询事件订阅配置信息
     *
     * 查询企业事件订阅配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWebHookConfigRequest 请求对象
     * @return CompletableFuture<ShowWebHookConfigResponse>
     */
    public CompletableFuture<ShowWebHookConfigResponse> showWebHookConfigAsync(ShowWebHookConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showWebHookConfig);
    }

    /**
     * 查询事件订阅配置信息
     *
     * 查询企业事件订阅配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWebHookConfigRequest 请求对象
     * @return AsyncInvoker<ShowWebHookConfigRequest, ShowWebHookConfigResponse>
     */
    public AsyncInvoker<ShowWebHookConfigRequest, ShowWebHookConfigResponse> showWebHookConfigAsyncInvoker(
        ShowWebHookConfigRequest request) {
        return new AsyncInvoker<ShowWebHookConfigRequest, ShowWebHookConfigResponse>(request,
            MeetingMeta.showWebHookConfig, hcClient);
    }

    /**
     * 查询网络研讨会详情
     *
     * 根据conference_id查询网络研讨会详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWebinarRequest 请求对象
     * @return CompletableFuture<ShowWebinarResponse>
     */
    public CompletableFuture<ShowWebinarResponse> showWebinarAsync(ShowWebinarRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showWebinar);
    }

    /**
     * 查询网络研讨会详情
     *
     * 根据conference_id查询网络研讨会详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWebinarRequest 请求对象
     * @return AsyncInvoker<ShowWebinarRequest, ShowWebinarResponse>
     */
    public AsyncInvoker<ShowWebinarRequest, ShowWebinarResponse> showWebinarAsyncInvoker(ShowWebinarRequest request) {
        return new AsyncInvoker<ShowWebinarRequest, ShowWebinarResponse>(request, MeetingMeta.showWebinar, hcClient);
    }

    /**
     * 通过会议ID和密码激活会议
     *
     * 终端到会管进行鉴权并激活会议，先通过该接口获取会议所在Region信息，该接口需要携带会议主席密码，在会议未召开的情况下，该接口会拉起会议。如果已存在会议，则直接返回在线会议所在Region信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartMeetingRequest 请求对象
     * @return CompletableFuture<StartMeetingResponse>
     */
    public CompletableFuture<StartMeetingResponse> startMeetingAsync(StartMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.startMeeting);
    }

    /**
     * 通过会议ID和密码激活会议
     *
     * 终端到会管进行鉴权并激活会议，先通过该接口获取会议所在Region信息，该接口需要携带会议主席密码，在会议未召开的情况下，该接口会拉起会议。如果已存在会议，则直接返回在线会议所在Region信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartMeetingRequest 请求对象
     * @return AsyncInvoker<StartMeetingRequest, StartMeetingResponse>
     */
    public AsyncInvoker<StartMeetingRequest, StartMeetingResponse> startMeetingAsyncInvoker(
        StartMeetingRequest request) {
        return new AsyncInvoker<StartMeetingRequest, StartMeetingResponse>(request, MeetingMeta.startMeeting, hcClient);
    }

    /**
     * 结束会议
     *
     * 结束会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopMeetingRequest 请求对象
     * @return CompletableFuture<StopMeetingResponse>
     */
    public CompletableFuture<StopMeetingResponse> stopMeetingAsync(StopMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.stopMeeting);
    }

    /**
     * 结束会议
     *
     * 结束会议。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopMeetingRequest 请求对象
     * @return AsyncInvoker<StopMeetingRequest, StopMeetingResponse>
     */
    public AsyncInvoker<StopMeetingRequest, StopMeetingResponse> stopMeetingAsyncInvoker(StopMeetingRequest request) {
        return new AsyncInvoker<StopMeetingRequest, StopMeetingResponse>(request, MeetingMeta.stopMeeting, hcClient);
    }

    /**
     * 切换视频显示策略
     *
     * 切换视频显示策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SwitchModeRequest 请求对象
     * @return CompletableFuture<SwitchModeResponse>
     */
    public CompletableFuture<SwitchModeResponse> switchModeAsync(SwitchModeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.switchMode);
    }

    /**
     * 切换视频显示策略
     *
     * 切换视频显示策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SwitchModeRequest 请求对象
     * @return AsyncInvoker<SwitchModeRequest, SwitchModeResponse>
     */
    public AsyncInvoker<SwitchModeRequest, SwitchModeResponse> switchModeAsyncInvoker(SwitchModeRequest request) {
        return new AsyncInvoker<SwitchModeRequest, SwitchModeResponse>(request, MeetingMeta.switchMode, hcClient);
    }

    /**
     * 修改手机或邮箱
     *
     * 企业用户通过该接口修改手机或邮箱，需要先获取验证码，验证多次失败会禁止修改。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateContactRequest 请求对象
     * @return CompletableFuture<UpdateContactResponse>
     */
    public CompletableFuture<UpdateContactResponse> updateContactAsync(UpdateContactRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateContact);
    }

    /**
     * 修改手机或邮箱
     *
     * 企业用户通过该接口修改手机或邮箱，需要先获取验证码，验证多次失败会禁止修改。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateContactRequest 请求对象
     * @return AsyncInvoker<UpdateContactRequest, UpdateContactResponse>
     */
    public AsyncInvoker<UpdateContactRequest, UpdateContactResponse> updateContactAsyncInvoker(
        UpdateContactRequest request) {
        return new AsyncInvoker<UpdateContactRequest, UpdateContactResponse>(request, MeetingMeta.updateContact,
            hcClient);
    }

    /**
     * SP管理员修改企业
     *
     * 修改企业，若任一参数为null或者不携带则不修改
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCorpRequest 请求对象
     * @return CompletableFuture<UpdateCorpResponse>
     */
    public CompletableFuture<UpdateCorpResponse> updateCorpAsync(UpdateCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateCorp);
    }

    /**
     * SP管理员修改企业
     *
     * 修改企业，若任一参数为null或者不携带则不修改
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCorpRequest 请求对象
     * @return AsyncInvoker<UpdateCorpRequest, UpdateCorpResponse>
     */
    public AsyncInvoker<UpdateCorpRequest, UpdateCorpResponse> updateCorpAsyncInvoker(UpdateCorpRequest request) {
        return new AsyncInvoker<UpdateCorpRequest, UpdateCorpResponse>(request, MeetingMeta.updateCorp, hcClient);
    }

    /**
     * 企业管理员修改企业注册信息
     *
     * 企业管理员通过该接口修改企业注册信息。当前只支持修改地址。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCorpBasicInfoRequest 请求对象
     * @return CompletableFuture<UpdateCorpBasicInfoResponse>
     */
    public CompletableFuture<UpdateCorpBasicInfoResponse> updateCorpBasicInfoAsync(UpdateCorpBasicInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateCorpBasicInfo);
    }

    /**
     * 企业管理员修改企业注册信息
     *
     * 企业管理员通过该接口修改企业注册信息。当前只支持修改地址。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCorpBasicInfoRequest 请求对象
     * @return AsyncInvoker<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse>
     */
    public AsyncInvoker<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> updateCorpBasicInfoAsyncInvoker(
        UpdateCorpBasicInfoRequest request) {
        return new AsyncInvoker<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse>(request,
            MeetingMeta.updateCorpBasicInfo, hcClient);
    }

    /**
     * 修改部门
     *
     * 企业管理员通过该接口修改部门。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDepartmentRequest 请求对象
     * @return CompletableFuture<UpdateDepartmentResponse>
     */
    public CompletableFuture<UpdateDepartmentResponse> updateDepartmentAsync(UpdateDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateDepartment);
    }

    /**
     * 修改部门
     *
     * 企业管理员通过该接口修改部门。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDepartmentRequest 请求对象
     * @return AsyncInvoker<UpdateDepartmentRequest, UpdateDepartmentResponse>
     */
    public AsyncInvoker<UpdateDepartmentRequest, UpdateDepartmentResponse> updateDepartmentAsyncInvoker(
        UpdateDepartmentRequest request) {
        return new AsyncInvoker<UpdateDepartmentRequest, UpdateDepartmentResponse>(request,
            MeetingMeta.updateDepartment, hcClient);
    }

    /**
     * 修改终端
     *
     * 企业管理员通过该接口修改终端。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDeviceRequest 请求对象
     * @return CompletableFuture<UpdateDeviceResponse>
     */
    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateDevice);
    }

    /**
     * 修改终端
     *
     * 企业管理员通过该接口修改终端。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDeviceRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceAsyncInvoker(
        UpdateDeviceRequest request) {
        return new AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>(request, MeetingMeta.updateDevice, hcClient);
    }

    /**
     * 更新信息窗素材
     *
     * 更新信息窗素材
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMaterialRequest 请求对象
     * @return CompletableFuture<UpdateMaterialResponse>
     */
    public CompletableFuture<UpdateMaterialResponse> updateMaterialAsync(UpdateMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMaterial);
    }

    /**
     * 更新信息窗素材
     *
     * 更新信息窗素材
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMaterialRequest 请求对象
     * @return AsyncInvoker<UpdateMaterialRequest, UpdateMaterialResponse>
     */
    public AsyncInvoker<UpdateMaterialRequest, UpdateMaterialResponse> updateMaterialAsyncInvoker(
        UpdateMaterialRequest request) {
        return new AsyncInvoker<UpdateMaterialRequest, UpdateMaterialResponse>(request, MeetingMeta.updateMaterial,
            hcClient);
    }

    /**
     * 编辑预约会议
     *
     * 编辑预约会议。会议开始后，不能被编辑。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMeetingRequest 请求对象
     * @return CompletableFuture<UpdateMeetingResponse>
     */
    public CompletableFuture<UpdateMeetingResponse> updateMeetingAsync(UpdateMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMeeting);
    }

    /**
     * 编辑预约会议
     *
     * 编辑预约会议。会议开始后，不能被编辑。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMeetingRequest 请求对象
     * @return AsyncInvoker<UpdateMeetingRequest, UpdateMeetingResponse>
     */
    public AsyncInvoker<UpdateMeetingRequest, UpdateMeetingResponse> updateMeetingAsyncInvoker(
        UpdateMeetingRequest request) {
        return new AsyncInvoker<UpdateMeetingRequest, UpdateMeetingResponse>(request, MeetingMeta.updateMeeting,
            hcClient);
    }

    /**
     * 修改用会议室及个人会议ID信息
     *
     * 企业用户登录后可以修改分配给用户的云会议室及个人会议ID。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMemberVmrRequest 请求对象
     * @return CompletableFuture<UpdateMemberVmrResponse>
     */
    public CompletableFuture<UpdateMemberVmrResponse> updateMemberVmrAsync(UpdateMemberVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMemberVmr);
    }

    /**
     * 修改用会议室及个人会议ID信息
     *
     * 企业用户登录后可以修改分配给用户的云会议室及个人会议ID。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMemberVmrRequest 请求对象
     * @return AsyncInvoker<UpdateMemberVmrRequest, UpdateMemberVmrResponse>
     */
    public AsyncInvoker<UpdateMemberVmrRequest, UpdateMemberVmrResponse> updateMemberVmrAsyncInvoker(
        UpdateMemberVmrRequest request) {
        return new AsyncInvoker<UpdateMemberVmrRequest, UpdateMemberVmrResponse>(request, MeetingMeta.updateMemberVmr,
            hcClient);
    }

    /**
     * 用户修改自己的信息
     *
     * 企业用户通过该接口修改自己的信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMyInfoRequest 请求对象
     * @return CompletableFuture<UpdateMyInfoResponse>
     */
    public CompletableFuture<UpdateMyInfoResponse> updateMyInfoAsync(UpdateMyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMyInfo);
    }

    /**
     * 用户修改自己的信息
     *
     * 企业用户通过该接口修改自己的信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMyInfoRequest 请求对象
     * @return AsyncInvoker<UpdateMyInfoRequest, UpdateMyInfoResponse>
     */
    public AsyncInvoker<UpdateMyInfoRequest, UpdateMyInfoResponse> updateMyInfoAsyncInvoker(
        UpdateMyInfoRequest request) {
        return new AsyncInvoker<UpdateMyInfoRequest, UpdateMyInfoResponse>(request, MeetingMeta.updateMyInfo, hcClient);
    }

    /**
     * 更新信息窗节目
     *
     * 更新信息窗节目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateProgramRequest 请求对象
     * @return CompletableFuture<UpdateProgramResponse>
     */
    public CompletableFuture<UpdateProgramResponse> updateProgramAsync(UpdateProgramRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateProgram);
    }

    /**
     * 更新信息窗节目
     *
     * 更新信息窗节目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateProgramRequest 请求对象
     * @return AsyncInvoker<UpdateProgramRequest, UpdateProgramResponse>
     */
    public AsyncInvoker<UpdateProgramRequest, UpdateProgramResponse> updateProgramAsyncInvoker(
        UpdateProgramRequest request) {
        return new AsyncInvoker<UpdateProgramRequest, UpdateProgramResponse>(request, MeetingMeta.updateProgram,
            hcClient);
    }

    /**
     * 修改信息窗发布
     *
     * 修改信息窗发布
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePublicationRequest 请求对象
     * @return CompletableFuture<UpdatePublicationResponse>
     */
    public CompletableFuture<UpdatePublicationResponse> updatePublicationAsync(UpdatePublicationRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updatePublication);
    }

    /**
     * 修改信息窗发布
     *
     * 修改信息窗发布
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePublicationRequest 请求对象
     * @return AsyncInvoker<UpdatePublicationRequest, UpdatePublicationResponse>
     */
    public AsyncInvoker<UpdatePublicationRequest, UpdatePublicationResponse> updatePublicationAsyncInvoker(
        UpdatePublicationRequest request) {
        return new AsyncInvoker<UpdatePublicationRequest, UpdatePublicationResponse>(request,
            MeetingMeta.updatePublication, hcClient);
    }

    /**
     * 修改密码
     *
     * 企业成员通过该接口提供用户修改密码功能，服务器收到请求，修改用户密码并返回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePwdRequest 请求对象
     * @return CompletableFuture<UpdatePwdResponse>
     */
    public CompletableFuture<UpdatePwdResponse> updatePwdAsync(UpdatePwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updatePwd);
    }

    /**
     * 修改密码
     *
     * 企业成员通过该接口提供用户修改密码功能，服务器收到请求，修改用户密码并返回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePwdRequest 请求对象
     * @return AsyncInvoker<UpdatePwdRequest, UpdatePwdResponse>
     */
    public AsyncInvoker<UpdatePwdRequest, UpdatePwdResponse> updatePwdAsyncInvoker(UpdatePwdRequest request) {
        return new AsyncInvoker<UpdatePwdRequest, UpdatePwdResponse>(request, MeetingMeta.updatePwd, hcClient);
    }

    /**
     * 修改预定周期会议
     *
     * 修改预定的周期会议；会议开始时，不能修改会议
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRecurringMeetingRequest 请求对象
     * @return CompletableFuture<UpdateRecurringMeetingResponse>
     */
    public CompletableFuture<UpdateRecurringMeetingResponse> updateRecurringMeetingAsync(
        UpdateRecurringMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateRecurringMeeting);
    }

    /**
     * 修改预定周期会议
     *
     * 修改预定的周期会议；会议开始时，不能修改会议
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRecurringMeetingRequest 请求对象
     * @return AsyncInvoker<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse>
     */
    public AsyncInvoker<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse> updateRecurringMeetingAsyncInvoker(
        UpdateRecurringMeetingRequest request) {
        return new AsyncInvoker<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse>(request,
            MeetingMeta.updateRecurringMeeting, hcClient);
    }

    /**
     * 修改预定周期子会议
     *
     * 修改预定的周期子会议；会议开始时，不能修改会议
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRecurringSubMeetingRequest 请求对象
     * @return CompletableFuture<UpdateRecurringSubMeetingResponse>
     */
    public CompletableFuture<UpdateRecurringSubMeetingResponse> updateRecurringSubMeetingAsync(
        UpdateRecurringSubMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateRecurringSubMeeting);
    }

    /**
     * 修改预定周期子会议
     *
     * 修改预定的周期子会议；会议开始时，不能修改会议
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRecurringSubMeetingRequest 请求对象
     * @return AsyncInvoker<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse>
     */
    public AsyncInvoker<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse> updateRecurringSubMeetingAsyncInvoker(
        UpdateRecurringSubMeetingRequest request) {
        return new AsyncInvoker<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse>(request,
            MeetingMeta.updateRecurringSubMeeting, hcClient);
    }

    /**
     * SP管理员根据修改企业资源
     *
     * 企业修改资源的过期时间、停用状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResourceRequest 请求对象
     * @return CompletableFuture<UpdateResourceResponse>
     */
    public CompletableFuture<UpdateResourceResponse> updateResourceAsync(UpdateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateResource);
    }

    /**
     * SP管理员根据修改企业资源
     *
     * 企业修改资源的过期时间、停用状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResourceRequest 请求对象
     * @return AsyncInvoker<UpdateResourceRequest, UpdateResourceResponse>
     */
    public AsyncInvoker<UpdateResourceRequest, UpdateResourceResponse> updateResourceAsyncInvoker(
        UpdateResourceRequest request) {
        return new AsyncInvoker<UpdateResourceRequest, UpdateResourceResponse>(request, MeetingMeta.updateResource,
            hcClient);
    }

    /**
     * 高级设置 - 直播间设置
     *
     * 保存直播间高级设置。如有部分配置信息修改，则其他未修改的原始值也需要传入，否则部分字段会替换为默认值(即：只支持全量保存)
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRoomSettingRequest 请求对象
     * @return CompletableFuture<UpdateRoomSettingResponse>
     */
    public CompletableFuture<UpdateRoomSettingResponse> updateRoomSettingAsync(UpdateRoomSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateRoomSetting);
    }

    /**
     * 高级设置 - 直播间设置
     *
     * 保存直播间高级设置。如有部分配置信息修改，则其他未修改的原始值也需要传入，否则部分字段会替换为默认值(即：只支持全量保存)
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRoomSettingRequest 请求对象
     * @return AsyncInvoker<UpdateRoomSettingRequest, UpdateRoomSettingResponse>
     */
    public AsyncInvoker<UpdateRoomSettingRequest, UpdateRoomSettingResponse> updateRoomSettingAsyncInvoker(
        UpdateRoomSettingRequest request) {
        return new AsyncInvoker<UpdateRoomSettingRequest, UpdateRoomSettingResponse>(request,
            MeetingMeta.updateRoomSetting, hcClient);
    }

    /**
     * 会中修改配置
     *
     * 会中修改配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateStartedConfConfigRequest 请求对象
     * @return CompletableFuture<UpdateStartedConfConfigResponse>
     */
    public CompletableFuture<UpdateStartedConfConfigResponse> updateStartedConfConfigAsync(
        UpdateStartedConfConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateStartedConfConfig);
    }

    /**
     * 会中修改配置
     *
     * 会中修改配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateStartedConfConfigRequest 请求对象
     * @return AsyncInvoker<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse>
     */
    public AsyncInvoker<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> updateStartedConfConfigAsyncInvoker(
        UpdateStartedConfConfigRequest request) {
        return new AsyncInvoker<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse>(request,
            MeetingMeta.updateStartedConfConfig, hcClient);
    }

    /**
     * 刷新Token
     *
     * 该接口提供刷新Token功能，根据传入的Token，刷新Token失效时间并返回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTokenRequest 请求对象
     * @return CompletableFuture<UpdateTokenResponse>
     */
    public CompletableFuture<UpdateTokenResponse> updateTokenAsync(UpdateTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateToken);
    }

    /**
     * 刷新Token
     *
     * 该接口提供刷新Token功能，根据传入的Token，刷新Token失效时间并返回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTokenRequest 请求对象
     * @return AsyncInvoker<UpdateTokenRequest, UpdateTokenResponse>
     */
    public AsyncInvoker<UpdateTokenRequest, UpdateTokenResponse> updateTokenAsyncInvoker(UpdateTokenRequest request) {
        return new AsyncInvoker<UpdateTokenRequest, UpdateTokenResponse>(request, MeetingMeta.updateToken, hcClient);
    }

    /**
     * 修改用户
     *
     * 企业管理员通过该接口修改企业用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse>
     */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateUser);
    }

    /**
     * 修改用户
     *
     * 企业管理员通过该接口修改企业用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<UpdateUserRequest, UpdateUserResponse>(request, MeetingMeta.updateUser, hcClient);
    }

    /**
     * 变更订阅配置使用状态
     *
     * 变更订阅配置使用状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWebHookConfigStatusRequest 请求对象
     * @return CompletableFuture<UpdateWebHookConfigStatusResponse>
     */
    public CompletableFuture<UpdateWebHookConfigStatusResponse> updateWebHookConfigStatusAsync(
        UpdateWebHookConfigStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateWebHookConfigStatus);
    }

    /**
     * 变更订阅配置使用状态
     *
     * 变更订阅配置使用状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWebHookConfigStatusRequest 请求对象
     * @return AsyncInvoker<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse>
     */
    public AsyncInvoker<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse> updateWebHookConfigStatusAsyncInvoker(
        UpdateWebHookConfigStatusRequest request) {
        return new AsyncInvoker<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse>(request,
            MeetingMeta.updateWebHookConfigStatus, hcClient);
    }

    /**
     * 编辑网络研讨会
     *
     * 您可根据需要修改普通网络研讨会和周期网络研讨会。注意：暂不支持添加外部联系人作为与会嘉宾
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWebinarRequest 请求对象
     * @return CompletableFuture<UpdateWebinarResponse>
     */
    public CompletableFuture<UpdateWebinarResponse> updateWebinarAsync(UpdateWebinarRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateWebinar);
    }

    /**
     * 编辑网络研讨会
     *
     * 您可根据需要修改普通网络研讨会和周期网络研讨会。注意：暂不支持添加外部联系人作为与会嘉宾
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWebinarRequest 请求对象
     * @return AsyncInvoker<UpdateWebinarRequest, UpdateWebinarResponse>
     */
    public AsyncInvoker<UpdateWebinarRequest, UpdateWebinarResponse> updateWebinarAsyncInvoker(
        UpdateWebinarRequest request) {
        return new AsyncInvoker<UpdateWebinarRequest, UpdateWebinarResponse>(request, MeetingMeta.updateWebinar,
            hcClient);
    }

    /**
     * 开放接口 - 文件上传
     *
     * 文件上传的开放接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadFileRequest 请求对象
     * @return CompletableFuture<UploadFileResponse>
     */
    public CompletableFuture<UploadFileResponse> uploadFileAsync(UploadFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.uploadFile);
    }

    /**
     * 开放接口 - 文件上传
     *
     * 文件上传的开放接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadFileRequest 请求对象
     * @return AsyncInvoker<UploadFileRequest, UploadFileResponse>
     */
    public AsyncInvoker<UploadFileRequest, UploadFileResponse> uploadFileAsyncInvoker(UploadFileRequest request) {
        return new AsyncInvoker<UploadFileRequest, UploadFileResponse>(request, MeetingMeta.uploadFile, hcClient);
    }

    /**
     * 查询QoS历史会议列表
     *
     * * 查询企业内QoS历史会议列表。
     * * 支持按照时间范围查询，可查询最近3个月内数据。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQosHistoryMeetingsRequest 请求对象
     * @return CompletableFuture<SearchQosHistoryMeetingsResponse>
     */
    public CompletableFuture<SearchQosHistoryMeetingsResponse> searchQosHistoryMeetingsAsync(
        SearchQosHistoryMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchQosHistoryMeetings);
    }

    /**
     * 查询QoS历史会议列表
     *
     * * 查询企业内QoS历史会议列表。
     * * 支持按照时间范围查询，可查询最近3个月内数据。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQosHistoryMeetingsRequest 请求对象
     * @return AsyncInvoker<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse>
     */
    public AsyncInvoker<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> searchQosHistoryMeetingsAsyncInvoker(
        SearchQosHistoryMeetingsRequest request) {
        return new AsyncInvoker<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse>(request,
            MeetingMeta.searchQosHistoryMeetings, hcClient);
    }

    /**
     * 查询QoS在线会议列表
     *
     * * 查询企业内QoS在线会议列表。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQosOnlineMeetingsRequest 请求对象
     * @return CompletableFuture<SearchQosOnlineMeetingsResponse>
     */
    public CompletableFuture<SearchQosOnlineMeetingsResponse> searchQosOnlineMeetingsAsync(
        SearchQosOnlineMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchQosOnlineMeetings);
    }

    /**
     * 查询QoS在线会议列表
     *
     * * 查询企业内QoS在线会议列表。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQosOnlineMeetingsRequest 请求对象
     * @return AsyncInvoker<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse>
     */
    public AsyncInvoker<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> searchQosOnlineMeetingsAsyncInvoker(
        SearchQosOnlineMeetingsRequest request) {
        return new AsyncInvoker<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse>(request,
            MeetingMeta.searchQosOnlineMeetings, hcClient);
    }

    /**
     * 查询与会者的QoS数据
     *
     * * 查询企业内指定与会者的QoS数据，按照音频，视频，屏幕共享，CPU分类查询QoS数据。
     * * QoS数据的打点周期为5秒。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQosParticipantDetailRequest 请求对象
     * @return CompletableFuture<SearchQosParticipantDetailResponse>
     */
    public CompletableFuture<SearchQosParticipantDetailResponse> searchQosParticipantDetailAsync(
        SearchQosParticipantDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchQosParticipantDetail);
    }

    /**
     * 查询与会者的QoS数据
     *
     * * 查询企业内指定与会者的QoS数据，按照音频，视频，屏幕共享，CPU分类查询QoS数据。
     * * QoS数据的打点周期为5秒。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQosParticipantDetailRequest 请求对象
     * @return AsyncInvoker<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse>
     */
    public AsyncInvoker<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> searchQosParticipantDetailAsyncInvoker(
        SearchQosParticipantDetailRequest request) {
        return new AsyncInvoker<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse>(request,
            MeetingMeta.searchQosParticipantDetail, hcClient);
    }

    /**
     * 查询QoS会议与会者列表
     *
     * * 查询企业内QoS会议与会者列表。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQosParticipantsRequest 请求对象
     * @return CompletableFuture<SearchQosParticipantsResponse>
     */
    public CompletableFuture<SearchQosParticipantsResponse> searchQosParticipantsAsync(
        SearchQosParticipantsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchQosParticipants);
    }

    /**
     * 查询QoS会议与会者列表
     *
     * * 查询企业内QoS会议与会者列表。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQosParticipantsRequest 请求对象
     * @return AsyncInvoker<SearchQosParticipantsRequest, SearchQosParticipantsResponse>
     */
    public AsyncInvoker<SearchQosParticipantsRequest, SearchQosParticipantsResponse> searchQosParticipantsAsyncInvoker(
        SearchQosParticipantsRequest request) {
        return new AsyncInvoker<SearchQosParticipantsRequest, SearchQosParticipantsResponse>(request,
            MeetingMeta.searchQosParticipants, hcClient);
    }

    /**
     * 设置企业租户指定类型的会议质量阈值
     *
     * * 设置企业租户指定类型的会议质量阈值。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetQosThresholdRequest 请求对象
     * @return CompletableFuture<SetQosThresholdResponse>
     */
    public CompletableFuture<SetQosThresholdResponse> setQosThresholdAsync(SetQosThresholdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setQosThreshold);
    }

    /**
     * 设置企业租户指定类型的会议质量阈值
     *
     * * 设置企业租户指定类型的会议质量阈值。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetQosThresholdRequest 请求对象
     * @return AsyncInvoker<SetQosThresholdRequest, SetQosThresholdResponse>
     */
    public AsyncInvoker<SetQosThresholdRequest, SetQosThresholdResponse> setQosThresholdAsyncInvoker(
        SetQosThresholdRequest request) {
        return new AsyncInvoker<SetQosThresholdRequest, SetQosThresholdResponse>(request, MeetingMeta.setQosThreshold,
            hcClient);
    }

    /**
     * 查询企业租户指定类型的会议质量阈值
     *
     * * 查询企业租户指定类型的会议质量阈值。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQosThresholdRequest 请求对象
     * @return CompletableFuture<ShowQosThresholdResponse>
     */
    public CompletableFuture<ShowQosThresholdResponse> showQosThresholdAsync(ShowQosThresholdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showQosThreshold);
    }

    /**
     * 查询企业租户指定类型的会议质量阈值
     *
     * * 查询企业租户指定类型的会议质量阈值。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQosThresholdRequest 请求对象
     * @return AsyncInvoker<ShowQosThresholdRequest, ShowQosThresholdResponse>
     */
    public AsyncInvoker<ShowQosThresholdRequest, ShowQosThresholdResponse> showQosThresholdAsyncInvoker(
        ShowQosThresholdRequest request) {
        return new AsyncInvoker<ShowQosThresholdRequest, ShowQosThresholdResponse>(request,
            MeetingMeta.showQosThreshold, hcClient);
    }

    /**
     * 查询企业级会议总体统计数据
     *
     * * 查询企业级会议指定时间范围内总体统计数据，按日/按月统计。
     * * 查询企业级会议单日内总体统计数据，按小时统计。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchStatisticConferenceInfoRequest 请求对象
     * @return CompletableFuture<SearchStatisticConferenceInfoResponse>
     */
    public CompletableFuture<SearchStatisticConferenceInfoResponse> searchStatisticConferenceInfoAsync(
        SearchStatisticConferenceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchStatisticConferenceInfo);
    }

    /**
     * 查询企业级会议总体统计数据
     *
     * * 查询企业级会议指定时间范围内总体统计数据，按日/按月统计。
     * * 查询企业级会议单日内总体统计数据，按小时统计。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchStatisticConferenceInfoRequest 请求对象
     * @return AsyncInvoker<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse>
     */
    public AsyncInvoker<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse> searchStatisticConferenceInfoAsyncInvoker(
        SearchStatisticConferenceInfoRequest request) {
        return new AsyncInvoker<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse>(request,
            MeetingMeta.searchStatisticConferenceInfo, hcClient);
    }

    /**
     * 查询企业级会议与会统计数据
     *
     * * 查询企业级会议与会用户统计数据，按日/按月统计。
     * * 查询企业级会议与会硬件终端统计数据，按日/按月统计。
     * * 查询企业级会议与会设备统计数据，按日/按月统计。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchStatisticConferenceParticipantRequest 请求对象
     * @return CompletableFuture<SearchStatisticConferenceParticipantResponse>
     */
    public CompletableFuture<SearchStatisticConferenceParticipantResponse> searchStatisticConferenceParticipantAsync(
        SearchStatisticConferenceParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchStatisticConferenceParticipant);
    }

    /**
     * 查询企业级会议与会统计数据
     *
     * * 查询企业级会议与会用户统计数据，按日/按月统计。
     * * 查询企业级会议与会硬件终端统计数据，按日/按月统计。
     * * 查询企业级会议与会设备统计数据，按日/按月统计。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchStatisticConferenceParticipantRequest 请求对象
     * @return AsyncInvoker<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse>
     */
    public AsyncInvoker<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse> searchStatisticConferenceParticipantAsyncInvoker(
        SearchStatisticConferenceParticipantRequest request) {
        return new AsyncInvoker<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse>(
            request, MeetingMeta.searchStatisticConferenceParticipant, hcClient);
    }

    /**
     * 查询企业级会议已购资源使用统计数据
     *
     * * 查询企业级会议的已购资源使用状况，按日/按月统计。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchStatisticResourceInfoRequest 请求对象
     * @return CompletableFuture<SearchStatisticResourceInfoResponse>
     */
    public CompletableFuture<SearchStatisticResourceInfoResponse> searchStatisticResourceInfoAsync(
        SearchStatisticResourceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchStatisticResourceInfo);
    }

    /**
     * 查询企业级会议已购资源使用统计数据
     *
     * * 查询企业级会议的已购资源使用状况，按日/按月统计。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchStatisticResourceInfoRequest 请求对象
     * @return AsyncInvoker<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse>
     */
    public AsyncInvoker<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse> searchStatisticResourceInfoAsyncInvoker(
        SearchStatisticResourceInfoRequest request) {
        return new AsyncInvoker<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse>(request,
            MeetingMeta.searchStatisticResourceInfo, hcClient);
    }

    /**
     * 查询企业级会议的用户统计数据
     *
     * * 查询企业级会议用户登录数据，按日/按月统计。
     * * 查询企业级会议用户激活数据，按日/按月统计。
     * * 查询企业级会议用户登录设备数据，按日/按月统计。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchStatisticUserInfoRequest 请求对象
     * @return CompletableFuture<SearchStatisticUserInfoResponse>
     */
    public CompletableFuture<SearchStatisticUserInfoResponse> searchStatisticUserInfoAsync(
        SearchStatisticUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchStatisticUserInfo);
    }

    /**
     * 查询企业级会议的用户统计数据
     *
     * * 查询企业级会议用户登录数据，按日/按月统计。
     * * 查询企业级会议用户激活数据，按日/按月统计。
     * * 查询企业级会议用户登录设备数据，按日/按月统计。
     * * 权限角色 &#x3D; 旗舰版企业/标准版企业 + 管理员。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchStatisticUserInfoRequest 请求对象
     * @return AsyncInvoker<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse>
     */
    public AsyncInvoker<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse> searchStatisticUserInfoAsyncInvoker(
        SearchStatisticUserInfoRequest request) {
        return new AsyncInvoker<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse>(request,
            MeetingMeta.searchStatisticUserInfo, hcClient);
    }

}
