package graphjavav4.utilities.users.item.inferenceclassification;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import graphjavav4.utilities.models.InferenceClassification;
import graphjavav4.utilities.models.odataerrors.ODataError;
import graphjavav4.utilities.users.item.inferenceclassification.overrides.OverridesRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users/{user-id}/inferenceClassification
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InferenceClassificationRequestBuilder extends BaseRequestBuilder {
    /**
     * The overrides property
     */
    @jakarta.annotation.Nonnull
    public OverridesRequestBuilder overrides() {
        return new OverridesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new InferenceClassificationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InferenceClassificationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/inferenceClassification{?%24select}", pathParameters);
    }
    /**
     * Instantiates a new InferenceClassificationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InferenceClassificationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/inferenceClassification{?%24select}", rawUrl);
    }
    /**
     * Relevance classification of the user's messages based on explicit designations that override inferred relevance or importance.
     * @return a InferenceClassification
     */
    @jakarta.annotation.Nullable
    public InferenceClassification get() {
        return get(null);
    }
    /**
     * Relevance classification of the user's messages based on explicit designations that override inferred relevance or importance.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a InferenceClassification
     */
    @jakarta.annotation.Nullable
    public InferenceClassification get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, InferenceClassification::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property inferenceClassification in users
     * @param body The request body
     * @return a InferenceClassification
     */
    @jakarta.annotation.Nullable
    public InferenceClassification patch(@jakarta.annotation.Nonnull final InferenceClassification body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property inferenceClassification in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a InferenceClassification
     */
    @jakarta.annotation.Nullable
    public InferenceClassification patch(@jakarta.annotation.Nonnull final InferenceClassification body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, InferenceClassification::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Relevance classification of the user's messages based on explicit designations that override inferred relevance or importance.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Relevance classification of the user's messages based on explicit designations that override inferred relevance or importance.
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
     * Update the navigation property inferenceClassification in users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final InferenceClassification body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property inferenceClassification in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final InferenceClassification body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a InferenceClassificationRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InferenceClassificationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InferenceClassificationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Relevance classification of the user's messages based on explicit designations that override inferred relevance or importance.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
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
