package graphjavav4.utilities.users.item.mailfolders.item.childfolders.item.messages.item.attachments;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import graphjavav4.utilities.models.Attachment;
import graphjavav4.utilities.models.AttachmentCollectionResponse;
import graphjavav4.utilities.models.odataerrors.ODataError;
import graphjavav4.utilities.users.item.mailfolders.item.childfolders.item.messages.item.attachments.count.CountRequestBuilder;
import graphjavav4.utilities.users.item.mailfolders.item.childfolders.item.messages.item.attachments.item.AttachmentItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users/{user-id}/mailFolders/{mailFolder-id}/childFolders/{mailFolder-id1}/messages/{message-id}/attachments
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttachmentsRequestBuilder extends BaseRequestBuilder {
    /**
     * The Count property
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the graphjavav4.utilities.users.item.mailFolders.item.childFolders.item.messages.item.attachments.item collection
     * @param attachmentId The unique identifier of attachment
     * @return a AttachmentItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AttachmentItemRequestBuilder byAttachmentId(@jakarta.annotation.Nonnull final String attachmentId) {
        Objects.requireNonNull(attachmentId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("attachment%2Did", attachmentId);
        return new AttachmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AttachmentsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttachmentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/childFolders/{mailFolder%2Did1}/messages/{message%2Did}/attachments{?%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new AttachmentsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttachmentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/childFolders/{mailFolder%2Did1}/messages/{message%2Did}/attachments{?%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve a list of attachment objects attached to a message. This API is available in the following national cloud deployments.
     * @return a AttachmentCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/message-list-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AttachmentCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve a list of attachment objects attached to a message. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AttachmentCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/message-list-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AttachmentCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, AttachmentCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Use this API to add an attachment to a message. An attachment can be one of the following types: All these types of attachment resources are derived from the attachmentresource. You can add an attachment to an existing message by posting to its attachments collection, or you canadd an attachment to a message that is being created and sent on the fly. This operation limits the size of the attachment you can add to under 3 MB. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a Attachment
     * @see <a href="https://learn.microsoft.com/graph/api/message-post-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Attachment post(@jakarta.annotation.Nonnull final Attachment body) {
        return post(body, null);
    }
    /**
     * Use this API to add an attachment to a message. An attachment can be one of the following types: All these types of attachment resources are derived from the attachmentresource. You can add an attachment to an existing message by posting to its attachments collection, or you canadd an attachment to a message that is being created and sent on the fly. This operation limits the size of the attachment you can add to under 3 MB. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Attachment
     * @see <a href="https://learn.microsoft.com/graph/api/message-post-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Attachment post(@jakarta.annotation.Nonnull final Attachment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, Attachment::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Retrieve a list of attachment objects attached to a message. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of attachment objects attached to a message. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Use this API to add an attachment to a message. An attachment can be one of the following types: All these types of attachment resources are derived from the attachmentresource. You can add an attachment to an existing message by posting to its attachments collection, or you canadd an attachment to a message that is being created and sent on the fly. This operation limits the size of the attachment you can add to under 3 MB. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Attachment body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Use this API to add an attachment to a message. An attachment can be one of the following types: All these types of attachment resources are derived from the attachmentresource. You can add an attachment to an existing message by posting to its attachments collection, or you canadd an attachment to a message that is being created and sent on the fly. This operation limits the size of the attachment you can add to under 3 MB. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Attachment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AttachmentsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AttachmentsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AttachmentsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of attachment objects attached to a message. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
