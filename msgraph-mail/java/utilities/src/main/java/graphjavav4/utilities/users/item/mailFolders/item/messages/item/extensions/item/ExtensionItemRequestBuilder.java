package graphjavav4.utilities.users.item.mailfolders.item.messages.item.extensions.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import graphjavav4.utilities.models.Extension;
import graphjavav4.utilities.models.odataerrors.ODataError;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users/{user-id}/mailFolders/{mailFolder-id}/messages/{message-id}/extensions/{extension-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExtensionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ExtensionItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExtensionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/messages/{message%2Did}/extensions/{extension%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ExtensionItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExtensionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/messages/{message%2Did}/extensions/{extension%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete an open extension (openTypeExtension object) from the specified instance of a resource.  For the list of resources that support open extensions, see the table in the Permissions section. This API is available in the following national cloud deployments.
     * @return a InputStream
     * @see <a href="https://learn.microsoft.com/graph/api/opentypeextension-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream delete() {
        return delete(null);
    }
    /**
     * Delete an open extension (openTypeExtension object) from the specified instance of a resource.  For the list of resources that support open extensions, see the table in the Permissions section. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a InputStream
     * @see <a href="https://learn.microsoft.com/graph/api/opentypeextension-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public InputStream delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, InputStream.class, errorMapping);
    }
    /**
     * Get an open extension (openTypeExtension object) identified by name or fully qualified name. The table in the Permissions section lists the resources that support open extensions. The following table lists the three scenarios where you can get an open extension from a supported resource instance. This API is available in the following national cloud deployments.
     * @return a Extension
     * @see <a href="https://learn.microsoft.com/graph/api/opentypeextension-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Extension get() {
        return get(null);
    }
    /**
     * Get an open extension (openTypeExtension object) identified by name or fully qualified name. The table in the Permissions section lists the resources that support open extensions. The following table lists the three scenarios where you can get an open extension from a supported resource instance. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Extension
     * @see <a href="https://learn.microsoft.com/graph/api/opentypeextension-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Extension get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, Extension::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property extensions in users
     * @param body The request body
     * @return a Extension
     */
    @jakarta.annotation.Nullable
    public Extension patch(@jakarta.annotation.Nonnull final Extension body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property extensions in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Extension
     */
    @jakarta.annotation.Nullable
    public Extension patch(@jakarta.annotation.Nonnull final Extension body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, Extension::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete an open extension (openTypeExtension object) from the specified instance of a resource.  For the list of resources that support open extensions, see the table in the Permissions section. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete an open extension (openTypeExtension object) from the specified instance of a resource.  For the list of resources that support open extensions, see the table in the Permissions section. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get an open extension (openTypeExtension object) identified by name or fully qualified name. The table in the Permissions section lists the resources that support open extensions. The following table lists the three scenarios where you can get an open extension from a supported resource instance. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get an open extension (openTypeExtension object) identified by name or fully qualified name. The table in the Permissions section lists the resources that support open extensions. The following table lists the three scenarios where you can get an open extension from a supported resource instance. This API is available in the following national cloud deployments.
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
     * Update the navigation property extensions in users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Extension body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property extensions in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Extension body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ExtensionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ExtensionItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ExtensionItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get an open extension (openTypeExtension object) identified by name or fully qualified name. The table in the Permissions section lists the resources that support open extensions. The following table lists the three scenarios where you can get an open extension from a supported resource instance. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
