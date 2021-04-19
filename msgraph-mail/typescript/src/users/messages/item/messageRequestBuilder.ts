import {HttpCore, HttpMethod, RequestInfo, ResponseHandler} from '@microsoft/kiota-abstractions';
import {AttachmentsRequestBuilder} from '../../mailFolders/messages/attachments/attachmentsRequestBuilder';
import {AttachmentRequestBuilder} from '../../mailFolders/messages/attachments/item/attachmentRequestBuilder';
import {ContentRequestBuilder} from '../../mailFolders/messages/content/contentRequestBuilder';
import {ExtensionsRequestBuilder} from '../../mailFolders/messages/extensions/extensionsRequestBuilder';
import {ExtensionRequestBuilder} from '../../mailFolders/messages/extensions/item/extensionRequestBuilder';
import {MultiValueLegacyExtendedPropertyRequestBuilder} from '../../mailFolders/messages/multiValueExtendedProperties/item/multiValueLegacyExtendedPropertyRequestBuilder';
import {MultiValueExtendedPropertiesRequestBuilder} from '../../mailFolders/messages/multiValueExtendedProperties/multiValueExtendedPropertiesRequestBuilder';
import {SingleValueLegacyExtendedPropertyRequestBuilder} from '../../mailFolders/messages/singleValueExtendedProperties/item/singleValueLegacyExtendedPropertyRequestBuilder';
import {SingleValueExtendedPropertiesRequestBuilder} from '../../mailFolders/messages/singleValueExtendedProperties/singleValueExtendedPropertiesRequestBuilder';
import {Message} from '../../message';

export class MessageRequestBuilder {
    public get content(): ContentRequestBuilder {
        const builder = new ContentRequestBuilder();
        builder.currentPath = (this.currentPath ?? '') + this.pathSegment;
        builder.httpCore = this.httpCore;
        return builder;
    }
    public get attachments(): AttachmentsRequestBuilder {
        const builder = new AttachmentsRequestBuilder();
        builder.currentPath = (this.currentPath ?? '') + this.pathSegment;
        builder.httpCore = this.httpCore;
        return builder;
    }
    public get extensions(): ExtensionsRequestBuilder {
        const builder = new ExtensionsRequestBuilder();
        builder.currentPath = (this.currentPath ?? '') + this.pathSegment;
        builder.httpCore = this.httpCore;
        return builder;
    }
    public get multiValueExtendedProperties(): MultiValueExtendedPropertiesRequestBuilder {
        const builder = new MultiValueExtendedPropertiesRequestBuilder();
        builder.currentPath = (this.currentPath ?? '') + this.pathSegment;
        builder.httpCore = this.httpCore;
        return builder;
    }
    public get singleValueExtendedProperties(): SingleValueExtendedPropertiesRequestBuilder {
        const builder = new SingleValueExtendedPropertiesRequestBuilder();
        builder.currentPath = (this.currentPath ?? '') + this.pathSegment;
        builder.httpCore = this.httpCore;
        return builder;
    }
    public readonly get = (q?: {
                    select?: string[],
                    expand?: string[]
                    } | undefined, h?: {} | undefined, responseHandler?: ResponseHandler | undefined) : Promise<Message | undefined> => {
        const requestInfo = this.createGetRequestInfo(
            q, h
        );
        return this.httpCore?.sendAsync<Message>(requestInfo, responseHandler) ?? Promise.reject(new Error('http core is null'));
    };
    public readonly createGetRequestInfo = (q?: {
                    select?: string[],
                    expand?: string[]
                    } | undefined, h?: {} | undefined) : RequestInfo => {
        const requestInfo = {
            URI: (this.currentPath ?? '') + this.pathSegment,
            headers: h,
            httpMethod: HttpMethod.GET,
            queryParameters: q,
        } as RequestInfo;
        return requestInfo;
    };
    public readonly patch = (body: Message, h?: {} | undefined, responseHandler?: ResponseHandler | undefined) : Promise<object | undefined> => {
        const requestInfo = this.createPatchRequestInfo(
            body, h
        );
        return this.httpCore?.sendAsync<object>(requestInfo, responseHandler) ?? Promise.reject(new Error('http core is null'));
    };
    public readonly createPatchRequestInfo = (body: Message, h?: {} | undefined) : RequestInfo => {
        const requestInfo = {
            URI: (this.currentPath ?? '') + this.pathSegment,
            headers: h,
            httpMethod: HttpMethod.PATCH,
            content: body as unknown,
        } as RequestInfo;
        return requestInfo;
    };
    public readonly delete = (h?: {} | undefined, responseHandler?: ResponseHandler | undefined) : Promise<object | undefined> => {
        const requestInfo = this.createDeleteRequestInfo(
            h
        );
        return this.httpCore?.sendAsync<object>(requestInfo, responseHandler) ?? Promise.reject(new Error('http core is null'));
    };
    public readonly createDeleteRequestInfo = (h?: {} | undefined) : RequestInfo => {
        const requestInfo = {
            URI: (this.currentPath ?? '') + this.pathSegment,
            headers: h,
            httpMethod: HttpMethod.DELETE,
        } as RequestInfo;
        return requestInfo;
    };
    private readonly pathSegment: string = "";
    public currentPath?: string | undefined;
    public httpCore?: HttpCore | undefined;
    public readonly attachmentsById = (id: String) : AttachmentRequestBuilder => {
        const builder = new AttachmentRequestBuilder();
        builder.currentPath = (this.currentPath ?? '') + this.pathSegment + "/attachments/" + id;
        builder.httpCore = this.httpCore;
        return builder;
    };
    public readonly extensionsById = (id: String) : ExtensionRequestBuilder => {
        const builder = new ExtensionRequestBuilder();
        builder.currentPath = (this.currentPath ?? '') + this.pathSegment + "/extensions/" + id;
        builder.httpCore = this.httpCore;
        return builder;
    };
    public readonly multiValueExtendedPropertiesById = (id: String) : MultiValueLegacyExtendedPropertyRequestBuilder => {
        const builder = new MultiValueLegacyExtendedPropertyRequestBuilder();
        builder.currentPath = (this.currentPath ?? '') + this.pathSegment + "/multiValueExtendedProperties/" + id;
        builder.httpCore = this.httpCore;
        return builder;
    };
    public readonly singleValueExtendedPropertiesById = (id: String) : SingleValueLegacyExtendedPropertyRequestBuilder => {
        const builder = new SingleValueLegacyExtendedPropertyRequestBuilder();
        builder.currentPath = (this.currentPath ?? '') + this.pathSegment + "/singleValueExtendedProperties/" + id;
        builder.httpCore = this.httpCore;
        return builder;
    };
}
