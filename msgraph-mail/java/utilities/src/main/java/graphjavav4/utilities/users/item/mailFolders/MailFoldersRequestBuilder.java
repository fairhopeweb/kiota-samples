package graphjavav4.utilities.users.item.mailfolders;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import graphjavav4.utilities.models.MailFolder;
import graphjavav4.utilities.models.MailFolderCollectionResponse;
import graphjavav4.utilities.models.odataerrors.ODataError;
import graphjavav4.utilities.users.item.mailfolders.count.CountRequestBuilder;
import graphjavav4.utilities.users.item.mailfolders.item.MailFolderItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users/{user-id}/mailFolders
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailFoldersRequestBuilder extends BaseRequestBuilder {
    /**
     * The Count property
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the graphjavav4.utilities.users.item.mailFolders.item collection
     * @param mailFolderId The unique identifier of mailFolder
     * @return a MailFolderItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MailFolderItemRequestBuilder byMailFolderId(@jakarta.annotation.Nonnull final String mailFolderId) {
        Objects.requireNonNull(mailFolderId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mailFolder%2Did", mailFolderId);
        return new MailFolderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new MailFoldersRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MailFoldersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders{?includeHiddenFolders,%24top,%24skip,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new MailFoldersRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MailFoldersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders{?includeHiddenFolders,%24top,%24skip,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * The user's mail folders. Read-only. Nullable.
     * @return a MailFolderCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/user-list-mailfolders?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MailFolderCollectionResponse get() {
        return get(null);
    }
    /**
     * The user's mail folders. Read-only. Nullable.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a MailFolderCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/user-list-mailfolders?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MailFolderCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, MailFolderCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Use this API to create a new mail folder in the root folder of the user's mailbox. If you intend a new folder to be hidden, you must set the isHidden property to true on creation. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a MailFolder
     * @see <a href="https://learn.microsoft.com/graph/api/user-post-mailfolders?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MailFolder post(@jakarta.annotation.Nonnull final MailFolder body) {
        return post(body, null);
    }
    /**
     * Use this API to create a new mail folder in the root folder of the user's mailbox. If you intend a new folder to be hidden, you must set the isHidden property to true on creation. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a MailFolder
     * @see <a href="https://learn.microsoft.com/graph/api/user-post-mailfolders?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public MailFolder post(@jakarta.annotation.Nonnull final MailFolder body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, MailFolder::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * The user's mail folders. Read-only. Nullable.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The user's mail folders. Read-only. Nullable.
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
     * Use this API to create a new mail folder in the root folder of the user's mailbox. If you intend a new folder to be hidden, you must set the isHidden property to true on creation. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MailFolder body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Use this API to create a new mail folder in the root folder of the user's mailbox. If you intend a new folder to be hidden, you must set the isHidden property to true on creation. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MailFolder body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a MailFoldersRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MailFoldersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MailFoldersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The user's mail folders. Read-only. Nullable.
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
         * Include Hidden Folders
         */
        @jakarta.annotation.Nullable
        public String includeHiddenFolders;
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
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
