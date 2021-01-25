package com.huaweicloud.sdk.scm.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.scm.v3.model.*;

public class ScmClient {
    protected HcClient hcClient;

    public ScmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ScmClient> newBuilder() {
        return new ClientBuilder<>(ScmClient::new);
    }


    /**
     * 删除证书
     * 删除证书实例，即将证书资源从华为云系统中删除。
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.deleteCertificate);
    }

    /**
     * 导出证书
     * 导出证书。
     *
     * @param ExportCertificateRequest 请求对象
     * @return ExportCertificateResponse
     */
    public ExportCertificateResponse exportCertificate(ExportCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.exportCertificate);
    }

    /**
     * 导入证书
     * 导入证书到SCM服务管理。
     *
     * @param ImportCertificateRequest 请求对象
     * @return ImportCertificateResponse
     */
    public ImportCertificateResponse importCertificate(ImportCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.importCertificate);
    }

    /**
     * 查询证书列表
     * 根据证书名称或绑定域名查询证书列表。
     *
     * @param ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.listCertificates);
    }

    /**
     * 推送证书
     * 推送SSL证书到弹性负载均衡（Elastic Load Balance，简称ELB）、Web应用防火墙（Web Application Firewall，WAF）、CDN（Content Delivery Network，内容分发网络）等其它华为云产品中。
     *
     * @param PushCertificateRequest 请求对象
     * @return PushCertificateResponse
     */
    public PushCertificateResponse pushCertificate(PushCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.pushCertificate);
    }

    /**
     * 获取证书详情
     * 查询某张证书的详细信息。
     *
     * @param ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ScmMeta.showCertificate);
    }

}