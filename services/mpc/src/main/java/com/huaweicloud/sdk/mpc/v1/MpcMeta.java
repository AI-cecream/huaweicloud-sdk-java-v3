package com.huaweicloud.sdk.mpc.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.mpc.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class MpcMeta {

    public static final HttpRequestDef<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> createAnimatedGraphicsTask = genForcreateAnimatedGraphicsTask();

    private static HttpRequestDef<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> genForcreateAnimatedGraphicsTask() {
        // basic
        HttpRequestDef.Builder<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAnimatedGraphicsTaskRequest.class, CreateAnimatedGraphicsTaskResponse.class)
                .withUri("/v1/{project_id}/animated-graphics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateAnimatedGraphicsTaskReq.class,
            f -> f.withMarshaller(CreateAnimatedGraphicsTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> deleteAnimatedGraphicsTask = genFordeleteAnimatedGraphicsTask();

    private static HttpRequestDef<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> genFordeleteAnimatedGraphicsTask() {
        // basic
        HttpRequestDef.Builder<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAnimatedGraphicsTaskRequest.class, DeleteAnimatedGraphicsTaskResponse.class)
                .withUri("/v1/{project_id}/animated-graphics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAnimatedGraphicsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> listAnimatedGraphicsTask = genForlistAnimatedGraphicsTask();

    private static HttpRequestDef<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> genForlistAnimatedGraphicsTask() {
        // basic
        HttpRequestDef.Builder<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAnimatedGraphicsTaskRequest.class, ListAnimatedGraphicsTaskResponse.class)
                .withUri("/v1/{project_id}/animated-graphics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListAnimatedGraphicsTaskRequest.StatusEnum.class,
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );
        builder.withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAnimatedGraphicsTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEncryptTaskRequest, CreateEncryptTaskResponse> createEncryptTask = genForcreateEncryptTask();

    private static HttpRequestDef<CreateEncryptTaskRequest, CreateEncryptTaskResponse> genForcreateEncryptTask() {
        // basic
        HttpRequestDef.Builder<CreateEncryptTaskRequest, CreateEncryptTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEncryptTaskRequest.class, CreateEncryptTaskResponse.class)
                .withUri("/v1/{project_id}/encryptions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateEncryptReq.class,
            f -> f.withMarshaller(CreateEncryptTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> deleteEncryptTask = genFordeleteEncryptTask();

    private static HttpRequestDef<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> genFordeleteEncryptTask() {
        // basic
        HttpRequestDef.Builder<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEncryptTaskRequest.class, DeleteEncryptTaskResponse.class)
                .withUri("/v1/{project_id}/encryptions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteEncryptTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEncryptTaskRequest, ListEncryptTaskResponse> listEncryptTask = genForlistEncryptTask();

    private static HttpRequestDef<ListEncryptTaskRequest, ListEncryptTaskResponse> genForlistEncryptTask() {
        // basic
        HttpRequestDef.Builder<ListEncryptTaskRequest, ListEncryptTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEncryptTaskRequest.class, ListEncryptTaskResponse.class)
                .withUri("/v1/{project_id}/encryptions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListEncryptTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListEncryptTaskRequest.StatusEnum.class,
            f -> f.withMarshaller(ListEncryptTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEncryptTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEncryptTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEncryptTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEncryptTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExtractTaskRequest, CreateExtractTaskResponse> createExtractTask = genForcreateExtractTask();

    private static HttpRequestDef<CreateExtractTaskRequest, CreateExtractTaskResponse> genForcreateExtractTask() {
        // basic
        HttpRequestDef.Builder<CreateExtractTaskRequest, CreateExtractTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateExtractTaskRequest.class, CreateExtractTaskResponse.class)
                .withUri("/v1/{project_id}/extract-metadata")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateExtractTaskReq.class,
            f -> f.withMarshaller(CreateExtractTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteExtractTaskRequest, DeleteExtractTaskResponse> deleteExtractTask = genFordeleteExtractTask();

    private static HttpRequestDef<DeleteExtractTaskRequest, DeleteExtractTaskResponse> genFordeleteExtractTask() {
        // basic
        HttpRequestDef.Builder<DeleteExtractTaskRequest, DeleteExtractTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteExtractTaskRequest.class, DeleteExtractTaskResponse.class)
                .withUri("/v1/{project_id}/extract-metadata")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteExtractTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExtractTaskRequest, ListExtractTaskResponse> listExtractTask = genForlistExtractTask();

    private static HttpRequestDef<ListExtractTaskRequest, ListExtractTaskResponse> genForlistExtractTask() {
        // basic
        HttpRequestDef.Builder<ListExtractTaskRequest, ListExtractTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExtractTaskRequest.class, ListExtractTaskResponse.class)
                .withUri("/v1/{project_id}/extract-metadata")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListExtractTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListExtractTaskRequest.StatusEnum.class,
            f -> f.withMarshaller(ListExtractTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListExtractTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListExtractTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListExtractTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListExtractTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );
        builder.withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListExtractTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTranscodeDetailRequest, ListTranscodeDetailResponse> listTranscodeDetail = genForlistTranscodeDetail();

    private static HttpRequestDef<ListTranscodeDetailRequest, ListTranscodeDetailResponse> genForlistTranscodeDetail() {
        // basic
        HttpRequestDef.Builder<ListTranscodeDetailRequest, ListTranscodeDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTranscodeDetailRequest.class, ListTranscodeDetailResponse.class)
                .withUri("/v1/{project_id}/transcodings/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListTranscodeDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelRemuxTaskRequest, CancelRemuxTaskResponse> cancelRemuxTask = genForcancelRemuxTask();

    private static HttpRequestDef<CancelRemuxTaskRequest, CancelRemuxTaskResponse> genForcancelRemuxTask() {
        // basic
        HttpRequestDef.Builder<CancelRemuxTaskRequest, CancelRemuxTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelRemuxTaskRequest.class, CancelRemuxTaskResponse.class)
                .withUri("/v1/{project_id}/remux")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelRemuxTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRemuxTaskRequest, CreateRemuxTaskResponse> createRemuxTask = genForcreateRemuxTask();

    private static HttpRequestDef<CreateRemuxTaskRequest, CreateRemuxTaskResponse> genForcreateRemuxTask() {
        // basic
        HttpRequestDef.Builder<CreateRemuxTaskRequest, CreateRemuxTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRemuxTaskRequest.class, CreateRemuxTaskResponse.class)
                .withUri("/v1/{project_id}/remux")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateRemuxTaskReq.class,
            f -> f.withMarshaller(CreateRemuxTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> createRetryRemuxTask = genForcreateRetryRemuxTask();

    private static HttpRequestDef<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> genForcreateRetryRemuxTask() {
        // basic
        HttpRequestDef.Builder<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateRetryRemuxTaskRequest.class, CreateRetryRemuxTaskResponse.class)
                .withUri("/v1/{project_id}/remux")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RemuxRetryReq.class,
            f -> f.withMarshaller(CreateRetryRemuxTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> deleteRemuxTask = genFordeleteRemuxTask();

    private static HttpRequestDef<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> genFordeleteRemuxTask() {
        // basic
        HttpRequestDef.Builder<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRemuxTaskRequest.class, DeleteRemuxTaskResponse.class)
                .withUri("/v1/{project_id}/remux/task")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRemuxTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRemuxTaskRequest, ListRemuxTaskResponse> listRemuxTask = genForlistRemuxTask();

    private static HttpRequestDef<ListRemuxTaskRequest, ListRemuxTaskResponse> genForlistRemuxTask() {
        // basic
        HttpRequestDef.Builder<ListRemuxTaskRequest, ListRemuxTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRemuxTaskRequest.class, ListRemuxTaskResponse.class)
                .withUri("/v1/{project_id}/remux")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListRemuxTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListRemuxTaskRequest.StatusEnum.class,
            f -> f.withMarshaller(ListRemuxTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRemuxTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRemuxTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("input_bucket",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRemuxTaskRequest::getInputBucket, (req, v) -> {
                req.setInputBucket(v);
            })
        );
        builder.withRequestField("input_object",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRemuxTaskRequest::getInputObject, (req, v) -> {
                req.setInputObject(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRemuxTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRemuxTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroup = genForcreateTemplateGroup();

    private static HttpRequestDef<CreateTemplateGroupRequest, CreateTemplateGroupResponse> genForcreateTemplateGroup() {
        // basic
        HttpRequestDef.Builder<CreateTemplateGroupRequest, CreateTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateGroupRequest.class, CreateTemplateGroupResponse.class)
                .withUri("/v1/{project_id}/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TransTemplateGroup.class,
            f -> f.withMarshaller(CreateTemplateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroup = genFordeleteTemplateGroup();

    private static HttpRequestDef<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> genFordeleteTemplateGroup() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateGroupRequest.class, DeleteTemplateGroupResponse.class)
                .withUri("/v1/{project_id}/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTemplateGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroup = genForlistTemplateGroup();

    private static HttpRequestDef<ListTemplateGroupRequest, ListTemplateGroupResponse> genForlistTemplateGroup() {
        // basic
        HttpRequestDef.Builder<ListTemplateGroupRequest, ListTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateGroupRequest.class, ListTemplateGroupResponse.class)
                .withUri("/v1/{project_id}/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListTemplateGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListTemplateGroupRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTemplateGroupRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTemplateGroupRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroup = genForupdateTemplateGroup();

    private static HttpRequestDef<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> genForupdateTemplateGroup() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateGroupRequest.class, UpdateTemplateGroupResponse.class)
                .withUri("/v1/{project_id}/template_group/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModifyTransTemplateGroup.class,
            f -> f.withMarshaller(UpdateTemplateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> createThumbnailsTask = genForcreateThumbnailsTask();

    private static HttpRequestDef<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> genForcreateThumbnailsTask() {
        // basic
        HttpRequestDef.Builder<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateThumbnailsTaskRequest.class, CreateThumbnailsTaskResponse.class)
                .withUri("/v1/{project_id}/thumbnails")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateThumbReq.class,
            f -> f.withMarshaller(CreateThumbnailsTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> deleteThumbnailsTask = genFordeleteThumbnailsTask();

    private static HttpRequestDef<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> genFordeleteThumbnailsTask() {
        // basic
        HttpRequestDef.Builder<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteThumbnailsTaskRequest.class, DeleteThumbnailsTaskResponse.class)
                .withUri("/v1/{project_id}/thumbnails")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteThumbnailsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> listThumbnailsTask = genForlistThumbnailsTask();

    private static HttpRequestDef<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> genForlistThumbnailsTask() {
        // basic
        HttpRequestDef.Builder<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListThumbnailsTaskRequest.class, ListThumbnailsTaskResponse.class)
                .withUri("/v1/{project_id}/thumbnails")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListThumbnailsTaskRequest.StatusEnum.class,
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );
        builder.withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListThumbnailsTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> createTranscodingTask = genForcreateTranscodingTask();

    private static HttpRequestDef<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> genForcreateTranscodingTask() {
        // basic
        HttpRequestDef.Builder<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTranscodingTaskRequest.class, CreateTranscodingTaskResponse.class)
                .withUri("/v1/{project_id}/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateTranscodingReq.class,
            f -> f.withMarshaller(CreateTranscodingTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> deleteTranscodingTask = genFordeleteTranscodingTask();

    private static HttpRequestDef<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> genFordeleteTranscodingTask() {
        // basic
        HttpRequestDef.Builder<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTranscodingTaskRequest.class, DeleteTranscodingTaskResponse.class)
                .withUri("/v1/{project_id}/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteTranscodingTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTranscodingTaskRequest, ListTranscodingTaskResponse> listTranscodingTask = genForlistTranscodingTask();

    private static HttpRequestDef<ListTranscodingTaskRequest, ListTranscodingTaskResponse> genForlistTranscodingTask() {
        // basic
        HttpRequestDef.Builder<ListTranscodingTaskRequest, ListTranscodingTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTranscodingTaskRequest.class, ListTranscodingTaskResponse.class)
                .withUri("/v1/{project_id}/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListTranscodingTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTranscodingTaskRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTranscodingTaskRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTranscodingTaskRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTranscodingTaskRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTranscodingTaskRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );
        builder.withRequestField("x-language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTranscodingTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTransTemplateRequest, CreateTransTemplateResponse> createTransTemplate = genForcreateTransTemplate();

    private static HttpRequestDef<CreateTransTemplateRequest, CreateTransTemplateResponse> genForcreateTransTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTransTemplateRequest, CreateTransTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTransTemplateRequest.class, CreateTransTemplateResponse.class)
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TransTemplate.class,
            f -> f.withMarshaller(CreateTransTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate = genFordeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genFordeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateRequest, ListTemplateResponse> listTemplate = genForlistTemplate();

    private static HttpRequestDef<ListTemplateRequest, ListTemplateResponse> genForlistTemplate() {
        // basic
        HttpRequestDef.Builder<ListTemplateRequest, ListTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateRequest.class, ListTemplateResponse.class)
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTemplateRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTemplateRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTransTemplateRequest, UpdateTransTemplateResponse> updateTransTemplate = genForupdateTransTemplate();

    private static HttpRequestDef<UpdateTransTemplateRequest, UpdateTransTemplateResponse> genForupdateTransTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTransTemplateRequest, UpdateTransTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTransTemplateRequest.class, UpdateTransTemplateResponse.class)
                .withUri("/v1/{project_id}/template/transcodings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModifyTransTemplateReq.class,
            f -> f.withMarshaller(UpdateTransTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplate = genForcreateWatermarkTemplate();

    private static HttpRequestDef<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> genForcreateWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWatermarkTemplateRequest.class, CreateWatermarkTemplateResponse.class)
                .withUri("/v1/{project_id}/template/watermark")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            WatermarkTemplate.class,
            f -> f.withMarshaller(CreateWatermarkTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplate = genFordeleteWatermarkTemplate();

    private static HttpRequestDef<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> genFordeleteWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWatermarkTemplateRequest.class, DeleteWatermarkTemplateResponse.class)
                .withUri("/v1/{project_id}/template/watermark")
                .withContentType("application/json");

        // requests
        builder.withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteWatermarkTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplate = genForlistWatermarkTemplate();

    private static HttpRequestDef<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> genForlistWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWatermarkTemplateRequest.class, ListWatermarkTemplateResponse.class)
                .withUri("/v1/{project_id}/template/watermark")
                .withContentType("application/json");

        // requests
        builder.withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListWatermarkTemplateRequest::getSize, (req, v) -> {
                req.setSize(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplate = genForupdateWatermarkTemplate();

    private static HttpRequestDef<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> genForupdateWatermarkTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWatermarkTemplateRequest.class, UpdateWatermarkTemplateResponse.class)
                .withUri("/v1/{project_id}/template/watermark")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            WatermarkTemplate.class,
            f -> f.withMarshaller(UpdateWatermarkTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
