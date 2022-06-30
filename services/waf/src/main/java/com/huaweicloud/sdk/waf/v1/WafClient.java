package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.waf.v1.model.*;

public class WafClient {

    protected HcClient hcClient;

    public WafClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WafClient> newBuilder() {
        return new ClientBuilder<>(WafClient::new);
    }

    /**
     * 绑定证书到域名
     *
     * 绑定证书到域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ApplyCertificateToHostRequest 请求对象
     * @return ApplyCertificateToHostResponse
     */
    public ApplyCertificateToHostResponse applyCertificateToHost(ApplyCertificateToHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.applyCertificateToHost);
    }

    /**
     * 绑定证书到域名
     *
     * 绑定证书到域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ApplyCertificateToHostRequest 请求对象
     * @return SyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse>
     */
    public SyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> applyCertificateToHostInvoker(
        ApplyCertificateToHostRequest request) {
        return new SyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse>(request,
            WafMeta.applyCertificateToHost, hcClient);
    }

    /**
     * 创建防篡改规则
     *
     * 创建防篡改规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAntiTamperRuleRequest 请求对象
     * @return CreateAntiTamperRuleResponse
     */
    public CreateAntiTamperRuleResponse createAntiTamperRule(CreateAntiTamperRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createAntiTamperRule);
    }

    /**
     * 创建防篡改规则
     *
     * 创建防篡改规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAntiTamperRuleRequest 请求对象
     * @return SyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse>
     */
    public SyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> createAntiTamperRuleInvoker(
        CreateAntiTamperRuleRequest request) {
        return new SyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse>(request,
            WafMeta.createAntiTamperRule, hcClient);
    }

    /**
     * 创建证书
     *
     * 创建证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createCertificate);
    }

    /**
     * 创建证书
     *
     * 创建证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, WafMeta.createCertificate,
            hcClient);
    }

    /**
     * 创建地理位置规则
     *
     * 创建地理位置规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGeoipRuleRequest 请求对象
     * @return CreateGeoipRuleResponse
     */
    public CreateGeoipRuleResponse createGeoipRule(CreateGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createGeoipRule);
    }

    /**
     * 创建地理位置规则
     *
     * 创建地理位置规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGeoipRuleRequest 请求对象
     * @return SyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse>
     */
    public SyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse> createGeoipRuleInvoker(
        CreateGeoipRuleRequest request) {
        return new SyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse>(request, WafMeta.createGeoipRule,
            hcClient);
    }

    /**
     * 创建云模式防护域名
     *
     * 创建云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateHostRequest 请求对象
     * @return CreateHostResponse
     */
    public CreateHostResponse createHost(CreateHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createHost);
    }

    /**
     * 创建云模式防护域名
     *
     * 创建云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateHostRequest 请求对象
     * @return SyncInvoker<CreateHostRequest, CreateHostResponse>
     */
    public SyncInvoker<CreateHostRequest, CreateHostResponse> createHostInvoker(CreateHostRequest request) {
        return new SyncInvoker<CreateHostRequest, CreateHostResponse>(request, WafMeta.createHost, hcClient);
    }

    /**
     * 创建误报屏蔽规则
     *
     * 创建误报屏蔽规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateIgnoreRuleRequest 请求对象
     * @return CreateIgnoreRuleResponse
     */
    public CreateIgnoreRuleResponse createIgnoreRule(CreateIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createIgnoreRule);
    }

    /**
     * 创建误报屏蔽规则
     *
     * 创建误报屏蔽规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateIgnoreRuleRequest 请求对象
     * @return SyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse>
     */
    public SyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> createIgnoreRuleInvoker(
        CreateIgnoreRuleRequest request) {
        return new SyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse>(request, WafMeta.createIgnoreRule,
            hcClient);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPolicy);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public SyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyInvoker(CreatePolicyRequest request) {
        return new SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, WafMeta.createPolicy, hcClient);
    }

    /**
     * 创建独享模式域名
     *
     * 创建独享模式域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePremiumHostRequest 请求对象
     * @return CreatePremiumHostResponse
     */
    public CreatePremiumHostResponse createPremiumHost(CreatePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPremiumHost);
    }

    /**
     * 创建独享模式域名
     *
     * 创建独享模式域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePremiumHostRequest 请求对象
     * @return SyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>
     */
    public SyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHostInvoker(
        CreatePremiumHostRequest request) {
        return new SyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>(request, WafMeta.createPremiumHost,
            hcClient);
    }

    /**
     * 创建隐私屏蔽防护规则
     *
     * 创建隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePrivacyRuleRequest 请求对象
     * @return CreatePrivacyRuleResponse
     */
    public CreatePrivacyRuleResponse createPrivacyRule(CreatePrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createPrivacyRule);
    }

    /**
     * 创建隐私屏蔽防护规则
     *
     * 创建隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePrivacyRuleRequest 请求对象
     * @return SyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse>
     */
    public SyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> createPrivacyRuleInvoker(
        CreatePrivacyRuleRequest request) {
        return new SyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse>(request, WafMeta.createPrivacyRule,
            hcClient);
    }

    /**
     * 创建引用表
     *
     * 创建引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateValueListRequest 请求对象
     * @return CreateValueListResponse
     */
    public CreateValueListResponse createValueList(CreateValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createValueList);
    }

    /**
     * 创建引用表
     *
     * 创建引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateValueListRequest 请求对象
     * @return SyncInvoker<CreateValueListRequest, CreateValueListResponse>
     */
    public SyncInvoker<CreateValueListRequest, CreateValueListResponse> createValueListInvoker(
        CreateValueListRequest request) {
        return new SyncInvoker<CreateValueListRequest, CreateValueListResponse>(request, WafMeta.createValueList,
            hcClient);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWhiteblackipRuleRequest 请求对象
     * @return CreateWhiteblackipRuleResponse
     */
    public CreateWhiteblackipRuleResponse createWhiteblackipRule(CreateWhiteblackipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.createWhiteblackipRule);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWhiteblackipRuleRequest 请求对象
     * @return SyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse>
     */
    public SyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> createWhiteblackipRuleInvoker(
        CreateWhiteblackipRuleRequest request) {
        return new SyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse>(request,
            WafMeta.createWhiteblackipRule, hcClient);
    }

    /**
     * 删除防篡改防护规则
     *
     * 删除防篡改防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAntitamperRuleRequest 请求对象
     * @return DeleteAntitamperRuleResponse
     */
    public DeleteAntitamperRuleResponse deleteAntitamperRule(DeleteAntitamperRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteAntitamperRule);
    }

    /**
     * 删除防篡改防护规则
     *
     * 删除防篡改防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAntitamperRuleRequest 请求对象
     * @return SyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse>
     */
    public SyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> deleteAntitamperRuleInvoker(
        DeleteAntitamperRuleRequest request) {
        return new SyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse>(request,
            WafMeta.deleteAntitamperRule, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, WafMeta.deleteCertificate,
            hcClient);
    }

    /**
     * 删除地理位置防护规则
     *
     * 删除地理位置防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGeoipRuleRequest 请求对象
     * @return DeleteGeoipRuleResponse
     */
    public DeleteGeoipRuleResponse deleteGeoipRule(DeleteGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteGeoipRule);
    }

    /**
     * 删除地理位置防护规则
     *
     * 删除地理位置防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGeoipRuleRequest 请求对象
     * @return SyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>
     */
    public SyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRuleInvoker(
        DeleteGeoipRuleRequest request) {
        return new SyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>(request, WafMeta.deleteGeoipRule,
            hcClient);
    }

    /**
     * 删除云模式防护域名
     *
     * 删除云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteHostRequest 请求对象
     * @return DeleteHostResponse
     */
    public DeleteHostResponse deleteHost(DeleteHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteHost);
    }

    /**
     * 删除云模式防护域名
     *
     * 删除云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteHostRequest 请求对象
     * @return SyncInvoker<DeleteHostRequest, DeleteHostResponse>
     */
    public SyncInvoker<DeleteHostRequest, DeleteHostResponse> deleteHostInvoker(DeleteHostRequest request) {
        return new SyncInvoker<DeleteHostRequest, DeleteHostResponse>(request, WafMeta.deleteHost, hcClient);
    }

    /**
     * 删除误报屏蔽防护规则
     *
     * 删除误报屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteIgnoreRuleRequest 请求对象
     * @return DeleteIgnoreRuleResponse
     */
    public DeleteIgnoreRuleResponse deleteIgnoreRule(DeleteIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteIgnoreRule);
    }

    /**
     * 删除误报屏蔽防护规则
     *
     * 删除误报屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteIgnoreRuleRequest 请求对象
     * @return SyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse>
     */
    public SyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> deleteIgnoreRuleInvoker(
        DeleteIgnoreRuleRequest request) {
        return new SyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse>(request, WafMeta.deleteIgnoreRule,
            hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, WafMeta.deletePolicy, hcClient);
    }

    /**
     * 删除独享模式域名
     *
     * 删除独享模式域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePremiumHostRequest 请求对象
     * @return DeletePremiumHostResponse
     */
    public DeletePremiumHostResponse deletePremiumHost(DeletePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePremiumHost);
    }

    /**
     * 删除独享模式域名
     *
     * 删除独享模式域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePremiumHostRequest 请求对象
     * @return SyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>
     */
    public SyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHostInvoker(
        DeletePremiumHostRequest request) {
        return new SyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>(request, WafMeta.deletePremiumHost,
            hcClient);
    }

    /**
     * 删除隐私屏蔽防护规则
     *
     * 删除隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePrivacyRuleRequest 请求对象
     * @return DeletePrivacyRuleResponse
     */
    public DeletePrivacyRuleResponse deletePrivacyRule(DeletePrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deletePrivacyRule);
    }

    /**
     * 删除隐私屏蔽防护规则
     *
     * 删除隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePrivacyRuleRequest 请求对象
     * @return SyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse>
     */
    public SyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> deletePrivacyRuleInvoker(
        DeletePrivacyRuleRequest request) {
        return new SyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse>(request, WafMeta.deletePrivacyRule,
            hcClient);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteValueListRequest 请求对象
     * @return DeleteValueListResponse
     */
    public DeleteValueListResponse deleteValueList(DeleteValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteValueList);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteValueListRequest 请求对象
     * @return SyncInvoker<DeleteValueListRequest, DeleteValueListResponse>
     */
    public SyncInvoker<DeleteValueListRequest, DeleteValueListResponse> deleteValueListInvoker(
        DeleteValueListRequest request) {
        return new SyncInvoker<DeleteValueListRequest, DeleteValueListResponse>(request, WafMeta.deleteValueList,
            hcClient);
    }

    /**
     * 删除黑白名单防护规则
     *
     * 删除黑白名单防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWhiteBlackIpRuleRequest 请求对象
     * @return DeleteWhiteBlackIpRuleResponse
     */
    public DeleteWhiteBlackIpRuleResponse deleteWhiteBlackIpRule(DeleteWhiteBlackIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.deleteWhiteBlackIpRule);
    }

    /**
     * 删除黑白名单防护规则
     *
     * 删除黑白名单防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWhiteBlackIpRuleRequest 请求对象
     * @return SyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse>
     */
    public SyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> deleteWhiteBlackIpRuleInvoker(
        DeleteWhiteBlackIpRuleRequest request) {
        return new SyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse>(request,
            WafMeta.deleteWhiteBlackIpRule, hcClient);
    }

    /**
     * 查询防篡改规则列表
     *
     * 查询防篡改规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAntitamperRuleRequest 请求对象
     * @return ListAntitamperRuleResponse
     */
    public ListAntitamperRuleResponse listAntitamperRule(ListAntitamperRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listAntitamperRule);
    }

    /**
     * 查询防篡改规则列表
     *
     * 查询防篡改规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAntitamperRuleRequest 请求对象
     * @return SyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse>
     */
    public SyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse> listAntitamperRuleInvoker(
        ListAntitamperRuleRequest request) {
        return new SyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse>(request,
            WafMeta.listAntitamperRule, hcClient);
    }

    /**
     * 查询安全统计带宽数据
     *
     * 查询安全统计带宽数据
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBandwidthTimelineRequest 请求对象
     * @return ListBandwidthTimelineResponse
     */
    public ListBandwidthTimelineResponse listBandwidthTimeline(ListBandwidthTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listBandwidthTimeline);
    }

    /**
     * 查询安全统计带宽数据
     *
     * 查询安全统计带宽数据
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBandwidthTimelineRequest 请求对象
     * @return SyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>
     */
    public SyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> listBandwidthTimelineInvoker(
        ListBandwidthTimelineRequest request) {
        return new SyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>(request,
            WafMeta.listBandwidthTimeline, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCertificates);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, WafMeta.listCertificates,
            hcClient);
    }

    /**
     * 查询全部防护域名列表
     *
     * 查询全部防护域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCompositeHostsRequest 请求对象
     * @return ListCompositeHostsResponse
     */
    public ListCompositeHostsResponse listCompositeHosts(ListCompositeHostsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listCompositeHosts);
    }

    /**
     * 查询全部防护域名列表
     *
     * 查询全部防护域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCompositeHostsRequest 请求对象
     * @return SyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse>
     */
    public SyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse> listCompositeHostsInvoker(
        ListCompositeHostsRequest request) {
        return new SyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse>(request,
            WafMeta.listCompositeHosts, hcClient);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表，该API暂时不支持查询全部防护事件，pagesize参数不可设为-1，由于性能原因，数据量越大消耗的内存越大，后端最多限制查询10000条数据，例如：自定义时间段内的数据超过了10000条，就无法查出page为101，pagesize为100之后的数据，需要调整时间区间，再进行查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventRequest 请求对象
     * @return ListEventResponse
     */
    public ListEventResponse listEvent(ListEventRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listEvent);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表，该API暂时不支持查询全部防护事件，pagesize参数不可设为-1，由于性能原因，数据量越大消耗的内存越大，后端最多限制查询10000条数据，例如：自定义时间段内的数据超过了10000条，就无法查出page为101，pagesize为100之后的数据，需要调整时间区间，再进行查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventRequest 请求对象
     * @return SyncInvoker<ListEventRequest, ListEventResponse>
     */
    public SyncInvoker<ListEventRequest, ListEventResponse> listEventInvoker(ListEventRequest request) {
        return new SyncInvoker<ListEventRequest, ListEventResponse>(request, WafMeta.listEvent, hcClient);
    }

    /**
     * 查询地理位置规则列表
     *
     * 查询地理位置规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGeoipRuleRequest 请求对象
     * @return ListGeoipRuleResponse
     */
    public ListGeoipRuleResponse listGeoipRule(ListGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listGeoipRule);
    }

    /**
     * 查询地理位置规则列表
     *
     * 查询地理位置规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGeoipRuleRequest 请求对象
     * @return SyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse>
     */
    public SyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse> listGeoipRuleInvoker(ListGeoipRuleRequest request) {
        return new SyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse>(request, WafMeta.listGeoipRule, hcClient);
    }

    /**
     * 查询云模式防护域名列表
     *
     * 查询云模式防护域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostRequest 请求对象
     * @return ListHostResponse
     */
    public ListHostResponse listHost(ListHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listHost);
    }

    /**
     * 查询云模式防护域名列表
     *
     * 查询云模式防护域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostRequest 请求对象
     * @return SyncInvoker<ListHostRequest, ListHostResponse>
     */
    public SyncInvoker<ListHostRequest, ListHostResponse> listHostInvoker(ListHostRequest request) {
        return new SyncInvoker<ListHostRequest, ListHostResponse>(request, WafMeta.listHost, hcClient);
    }

    /**
     * 获取云模式域名路由信息
     *
     * 返回路由信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostRouteRequest 请求对象
     * @return ListHostRouteResponse
     */
    public ListHostRouteResponse listHostRoute(ListHostRouteRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listHostRoute);
    }

    /**
     * 获取云模式域名路由信息
     *
     * 返回路由信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostRouteRequest 请求对象
     * @return SyncInvoker<ListHostRouteRequest, ListHostRouteResponse>
     */
    public SyncInvoker<ListHostRouteRequest, ListHostRouteResponse> listHostRouteInvoker(ListHostRouteRequest request) {
        return new SyncInvoker<ListHostRouteRequest, ListHostRouteResponse>(request, WafMeta.listHostRoute, hcClient);
    }

    /**
     * 查询误报屏蔽规则列表
     *
     * 查询误报屏蔽规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIgnoreRuleRequest 请求对象
     * @return ListIgnoreRuleResponse
     */
    public ListIgnoreRuleResponse listIgnoreRule(ListIgnoreRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listIgnoreRule);
    }

    /**
     * 查询误报屏蔽规则列表
     *
     * 查询误报屏蔽规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIgnoreRuleRequest 请求对象
     * @return SyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse>
     */
    public SyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse> listIgnoreRuleInvoker(
        ListIgnoreRuleRequest request) {
        return new SyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse>(request, WafMeta.listIgnoreRule,
            hcClient);
    }

    /**
     * 查询安全总览分类统计top信息
     *
     * 查询安全总览分类统计top信息，包含受攻击域名 、攻击源ip、受攻击URL、攻击来源区域、事件分布
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOverviewsClassificationRequest 请求对象
     * @return ListOverviewsClassificationResponse
     */
    public ListOverviewsClassificationResponse listOverviewsClassification(ListOverviewsClassificationRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listOverviewsClassification);
    }

    /**
     * 查询安全总览分类统计top信息
     *
     * 查询安全总览分类统计top信息，包含受攻击域名 、攻击源ip、受攻击URL、攻击来源区域、事件分布
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOverviewsClassificationRequest 请求对象
     * @return SyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse>
     */
    public SyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> listOverviewsClassificationInvoker(
        ListOverviewsClassificationRequest request) {
        return new SyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse>(request,
            WafMeta.listOverviewsClassification, hcClient);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicy(ListPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPolicy);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return SyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public SyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyInvoker(ListPolicyRequest request) {
        return new SyncInvoker<ListPolicyRequest, ListPolicyResponse>(request, WafMeta.listPolicy, hcClient);
    }

    /**
     * 独享模式域名列表
     *
     * 独享模式域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPremiumHostRequest 请求对象
     * @return ListPremiumHostResponse
     */
    public ListPremiumHostResponse listPremiumHost(ListPremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPremiumHost);
    }

    /**
     * 独享模式域名列表
     *
     * 独享模式域名列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPremiumHostRequest 请求对象
     * @return SyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>
     */
    public SyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHostInvoker(
        ListPremiumHostRequest request) {
        return new SyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>(request, WafMeta.listPremiumHost,
            hcClient);
    }

    /**
     * 查询隐私屏蔽防护规则
     *
     * 查询隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPrivacyRuleRequest 请求对象
     * @return ListPrivacyRuleResponse
     */
    public ListPrivacyRuleResponse listPrivacyRule(ListPrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listPrivacyRule);
    }

    /**
     * 查询隐私屏蔽防护规则
     *
     * 查询隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPrivacyRuleRequest 请求对象
     * @return SyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse>
     */
    public SyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse> listPrivacyRuleInvoker(
        ListPrivacyRuleRequest request) {
        return new SyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse>(request, WafMeta.listPrivacyRule,
            hcClient);
    }

    /**
     * 查询安全统计qps次数
     *
     * 查询安全统计qps次数
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQpsTimelineRequest 请求对象
     * @return ListQpsTimelineResponse
     */
    public ListQpsTimelineResponse listQpsTimeline(ListQpsTimelineRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listQpsTimeline);
    }

    /**
     * 查询安全统计qps次数
     *
     * 查询安全统计qps次数
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQpsTimelineRequest 请求对象
     * @return SyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>
     */
    public SyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse> listQpsTimelineInvoker(
        ListQpsTimelineRequest request) {
        return new SyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>(request, WafMeta.listQpsTimeline,
            hcClient);
    }

    /**
     * 查询安全总览请求与攻击数量
     *
     * 查询安全总览请求与攻击数量
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStatisticsRequest 请求对象
     * @return ListStatisticsResponse
     */
    public ListStatisticsResponse listStatistics(ListStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listStatistics);
    }

    /**
     * 查询安全总览请求与攻击数量
     *
     * 查询安全总览请求与攻击数量
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStatisticsRequest 请求对象
     * @return SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public SyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsInvoker(
        ListStatisticsRequest request) {
        return new SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>(request, WafMeta.listStatistics,
            hcClient);
    }

    /**
     * 查询业务异常数量
     *
     * 查询业务异常数量
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTopAbnormalRequest 请求对象
     * @return ListTopAbnormalResponse
     */
    public ListTopAbnormalResponse listTopAbnormal(ListTopAbnormalRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listTopAbnormal);
    }

    /**
     * 查询业务异常数量
     *
     * 查询业务异常数量
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTopAbnormalRequest 请求对象
     * @return SyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>
     */
    public SyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse> listTopAbnormalInvoker(
        ListTopAbnormalRequest request) {
        return new SyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>(request, WafMeta.listTopAbnormal,
            hcClient);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListValueListRequest 请求对象
     * @return ListValueListResponse
     */
    public ListValueListResponse listValueList(ListValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listValueList);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListValueListRequest 请求对象
     * @return SyncInvoker<ListValueListRequest, ListValueListResponse>
     */
    public SyncInvoker<ListValueListRequest, ListValueListResponse> listValueListInvoker(ListValueListRequest request) {
        return new SyncInvoker<ListValueListRequest, ListValueListResponse>(request, WafMeta.listValueList, hcClient);
    }

    /**
     * 查询黑白名单规则列表
     *
     * 查询黑白名单规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWhiteblackipRuleRequest 请求对象
     * @return ListWhiteblackipRuleResponse
     */
    public ListWhiteblackipRuleResponse listWhiteblackipRule(ListWhiteblackipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.listWhiteblackipRule);
    }

    /**
     * 查询黑白名单规则列表
     *
     * 查询黑白名单规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWhiteblackipRuleRequest 请求对象
     * @return SyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse>
     */
    public SyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> listWhiteblackipRuleInvoker(
        ListWhiteblackipRuleRequest request) {
        return new SyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse>(request,
            WafMeta.listWhiteblackipRule, hcClient);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showCertificate);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(
        ShowCertificateRequest request) {
        return new SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, WafMeta.showCertificate,
            hcClient);
    }

    /**
     * 根据Id查询防护域名
     *
     * 根据Id查询防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCompositeHostRequest 请求对象
     * @return ShowCompositeHostResponse
     */
    public ShowCompositeHostResponse showCompositeHost(ShowCompositeHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showCompositeHost);
    }

    /**
     * 根据Id查询防护域名
     *
     * 根据Id查询防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCompositeHostRequest 请求对象
     * @return SyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse>
     */
    public SyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse> showCompositeHostInvoker(
        ShowCompositeHostRequest request) {
        return new SyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse>(request, WafMeta.showCompositeHost,
            hcClient);
    }

    /**
     * 局点支持特性查询
     *
     * 局点支持特性查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowConsoleConfigRequest 请求对象
     * @return ShowConsoleConfigResponse
     */
    public ShowConsoleConfigResponse showConsoleConfig(ShowConsoleConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showConsoleConfig);
    }

    /**
     * 局点支持特性查询
     *
     * 局点支持特性查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowConsoleConfigRequest 请求对象
     * @return SyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse>
     */
    public SyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse> showConsoleConfigInvoker(
        ShowConsoleConfigRequest request) {
        return new SyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse>(request, WafMeta.showConsoleConfig,
            hcClient);
    }

    /**
     * 查询攻击事件详情
     *
     * 查询攻击事件详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEventRequest 请求对象
     * @return ShowEventResponse
     */
    public ShowEventResponse showEvent(ShowEventRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showEvent);
    }

    /**
     * 查询攻击事件详情
     *
     * 查询攻击事件详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEventRequest 请求对象
     * @return SyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public SyncInvoker<ShowEventRequest, ShowEventResponse> showEventInvoker(ShowEventRequest request) {
        return new SyncInvoker<ShowEventRequest, ShowEventResponse>(request, WafMeta.showEvent, hcClient);
    }

    /**
     * 根据Id查询云模式防护域名
     *
     * 根据Id查询云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHostRequest 请求对象
     * @return ShowHostResponse
     */
    public ShowHostResponse showHost(ShowHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showHost);
    }

    /**
     * 根据Id查询云模式防护域名
     *
     * 根据Id查询云模式防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHostRequest 请求对象
     * @return SyncInvoker<ShowHostRequest, ShowHostResponse>
     */
    public SyncInvoker<ShowHostRequest, ShowHostResponse> showHostInvoker(ShowHostRequest request) {
        return new SyncInvoker<ShowHostRequest, ShowHostResponse>(request, WafMeta.showHost, hcClient);
    }

    /**
     * 根据Id查询防护策略
     *
     * 根据Id查询防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPolicyRequest 请求对象
     * @return ShowPolicyResponse
     */
    public ShowPolicyResponse showPolicy(ShowPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showPolicy);
    }

    /**
     * 根据Id查询防护策略
     *
     * 根据Id查询防护策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPolicyRequest 请求对象
     * @return SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public SyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyInvoker(ShowPolicyRequest request) {
        return new SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>(request, WafMeta.showPolicy, hcClient);
    }

    /**
     * 查看独享模式域名配置
     *
     * 查看独享模式域名配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPremiumHostRequest 请求对象
     * @return ShowPremiumHostResponse
     */
    public ShowPremiumHostResponse showPremiumHost(ShowPremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.showPremiumHost);
    }

    /**
     * 查看独享模式域名配置
     *
     * 查看独享模式域名配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPremiumHostRequest 请求对象
     * @return SyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>
     */
    public SyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHostInvoker(
        ShowPremiumHostRequest request) {
        return new SyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>(request, WafMeta.showPremiumHost,
            hcClient);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return UpdateCertificateResponse
     */
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateCertificate);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(
        UpdateCertificateRequest request) {
        return new SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, WafMeta.updateCertificate,
            hcClient);
    }

    /**
     * 更新地理位置防护规则
     *
     * 更新地理位置防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGeoipRuleRequest 请求对象
     * @return UpdateGeoipRuleResponse
     */
    public UpdateGeoipRuleResponse updateGeoipRule(UpdateGeoipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateGeoipRule);
    }

    /**
     * 更新地理位置防护规则
     *
     * 更新地理位置防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGeoipRuleRequest 请求对象
     * @return SyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>
     */
    public SyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRuleInvoker(
        UpdateGeoipRuleRequest request) {
        return new SyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>(request, WafMeta.updateGeoipRule,
            hcClient);
    }

    /**
     * 更新云模式防护域名
     *
     * 更新云模式防护域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostRequest 请求对象
     * @return UpdateHostResponse
     */
    public UpdateHostResponse updateHost(UpdateHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateHost);
    }

    /**
     * 更新云模式防护域名
     *
     * 更新云模式防护域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostRequest 请求对象
     * @return SyncInvoker<UpdateHostRequest, UpdateHostResponse>
     */
    public SyncInvoker<UpdateHostRequest, UpdateHostResponse> updateHostInvoker(UpdateHostRequest request) {
        return new SyncInvoker<UpdateHostRequest, UpdateHostResponse>(request, WafMeta.updateHost, hcClient);
    }

    /**
     * 修改域名防护状态
     *
     * 返回路由信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostProtectStatusRequest 请求对象
     * @return UpdateHostProtectStatusResponse
     */
    public UpdateHostProtectStatusResponse updateHostProtectStatus(UpdateHostProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateHostProtectStatus);
    }

    /**
     * 修改域名防护状态
     *
     * 返回路由信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostProtectStatusRequest 请求对象
     * @return SyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse>
     */
    public SyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> updateHostProtectStatusInvoker(
        UpdateHostProtectStatusRequest request) {
        return new SyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse>(request,
            WafMeta.updateHostProtectStatus, hcClient);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略，请求体可只传需要更新的部分
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyRequest 请求对象
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePolicy);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略，请求体可只传需要更新的部分
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyInvoker(UpdatePolicyRequest request) {
        return new SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>(request, WafMeta.updatePolicy, hcClient);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyProtectHostRequest 请求对象
     * @return UpdatePolicyProtectHostResponse
     */
    public UpdatePolicyProtectHostResponse updatePolicyProtectHost(UpdatePolicyProtectHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePolicyProtectHost);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的防护域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyProtectHostRequest 请求对象
     * @return SyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse>
     */
    public SyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> updatePolicyProtectHostInvoker(
        UpdatePolicyProtectHostRequest request) {
        return new SyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse>(request,
            WafMeta.updatePolicyProtectHost, hcClient);
    }

    /**
     * 修改单条规则的状态
     *
     * 修改单条规则的状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyRuleStatusRequest 请求对象
     * @return UpdatePolicyRuleStatusResponse
     */
    public UpdatePolicyRuleStatusResponse updatePolicyRuleStatus(UpdatePolicyRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePolicyRuleStatus);
    }

    /**
     * 修改单条规则的状态
     *
     * 修改单条规则的状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePolicyRuleStatusRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse>
     */
    public SyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> updatePolicyRuleStatusInvoker(
        UpdatePolicyRuleStatusRequest request) {
        return new SyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse>(request,
            WafMeta.updatePolicyRuleStatus, hcClient);
    }

    /**
     * 修改独享模式域名配置
     *
     * 修改独享模式域名配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePremiumHostRequest 请求对象
     * @return UpdatePremiumHostResponse
     */
    public UpdatePremiumHostResponse updatePremiumHost(UpdatePremiumHostRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumHost);
    }

    /**
     * 修改独享模式域名配置
     *
     * 修改独享模式域名配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePremiumHostRequest 请求对象
     * @return SyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>
     */
    public SyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHostInvoker(
        UpdatePremiumHostRequest request) {
        return new SyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>(request, WafMeta.updatePremiumHost,
            hcClient);
    }

    /**
     * 修改独享模式域名防护状态
     *
     * 修改独享模式域名防护状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePremiumHostProtectStatusRequest 请求对象
     * @return UpdatePremiumHostProtectStatusResponse
     */
    public UpdatePremiumHostProtectStatusResponse updatePremiumHostProtectStatus(
        UpdatePremiumHostProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePremiumHostProtectStatus);
    }

    /**
     * 修改独享模式域名防护状态
     *
     * 修改独享模式域名防护状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePremiumHostProtectStatusRequest 请求对象
     * @return SyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>
     */
    public SyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatusInvoker(
        UpdatePremiumHostProtectStatusRequest request) {
        return new SyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>(request,
            WafMeta.updatePremiumHostProtectStatus, hcClient);
    }

    /**
     * 更新隐私屏蔽防护规则
     *
     * 更新隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePrivacyRuleRequest 请求对象
     * @return UpdatePrivacyRuleResponse
     */
    public UpdatePrivacyRuleResponse updatePrivacyRule(UpdatePrivacyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updatePrivacyRule);
    }

    /**
     * 更新隐私屏蔽防护规则
     *
     * 更新隐私屏蔽防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePrivacyRuleRequest 请求对象
     * @return SyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse>
     */
    public SyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> updatePrivacyRuleInvoker(
        UpdatePrivacyRuleRequest request) {
        return new SyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse>(request, WafMeta.updatePrivacyRule,
            hcClient);
    }

    /**
     * 修改引用表
     *
     * 修改引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateValueListRequest 请求对象
     * @return UpdateValueListResponse
     */
    public UpdateValueListResponse updateValueList(UpdateValueListRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateValueList);
    }

    /**
     * 修改引用表
     *
     * 修改引用表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateValueListRequest 请求对象
     * @return SyncInvoker<UpdateValueListRequest, UpdateValueListResponse>
     */
    public SyncInvoker<UpdateValueListRequest, UpdateValueListResponse> updateValueListInvoker(
        UpdateValueListRequest request) {
        return new SyncInvoker<UpdateValueListRequest, UpdateValueListResponse>(request, WafMeta.updateValueList,
            hcClient);
    }

    /**
     * 更新黑白名单防护规则
     *
     * 更新黑白名单防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWhiteblackipRuleRequest 请求对象
     * @return UpdateWhiteblackipRuleResponse
     */
    public UpdateWhiteblackipRuleResponse updateWhiteblackipRule(UpdateWhiteblackipRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WafMeta.updateWhiteblackipRule);
    }

    /**
     * 更新黑白名单防护规则
     *
     * 更新黑白名单防护规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWhiteblackipRuleRequest 请求对象
     * @return SyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse>
     */
    public SyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> updateWhiteblackipRuleInvoker(
        UpdateWhiteblackipRuleRequest request) {
        return new SyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse>(request,
            WafMeta.updateWhiteblackipRule, hcClient);
    }

}
