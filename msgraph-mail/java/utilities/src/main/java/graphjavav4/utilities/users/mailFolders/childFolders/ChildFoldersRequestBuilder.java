package graphjavav4.utilities.users.mailFolders.childFolders;

import com.microsoft.kiota.HttpCore;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParametersBase;
import com.microsoft.kiota.RequestInfo;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.SerializationWriterFactory;
import graphjavav4.utilities.users.mailFolders.MailFolder;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.function.Function;
import java.util.Map;
import java.util.Objects;
/** Builds and executes requests for operations under /users/{user-id}/mailFolders/{mailFolder-id}/childFolders  */
public class ChildFoldersRequestBuilder {
    /**
     * Get childFolders from users
     * @param q Request query parameters
     * @param h Request headers
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of ChildFoldersResponse
     */
    public java.util.concurrent.CompletableFuture<ChildFoldersResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetQueryParameters> q, @javax.annotation.Nullable final java.util.function.Consumer<Map<String, String>> h, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInfo requestInfo = createGetRequestInfo(
                q, h
            );
            return this.httpCore.sendAsync(requestInfo, ChildFoldersResponse.class, responseHandler);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get childFolders from users
     * @param q Request query parameters
     * @param h Request headers
     * @return a RequestInfo
     */
    @javax.annotation.Nonnull
    public RequestInfo createGetRequestInfo(@javax.annotation.Nullable final java.util.function.Consumer<GetQueryParameters> q, @javax.annotation.Nullable final java.util.function.Consumer<Map<String, String>> h) throws URISyntaxException {
        final RequestInfo requestInfo = new RequestInfo() {{
            uri = new URI(currentPath + pathSegment);
            httpMethod = HttpMethod.GET;
        }};
        if (q != null) {
            final GetQueryParameters qParams = new GetQueryParameters();
            q.accept(qParams);
            qParams.AddQueryParameters(requestInfo.queryParameters);
        }
        if (h != null) {
            h.accept(requestInfo.headers);
        }
        return requestInfo;
    }
    /**
     * Create new navigation property to childFolders for users
     * @param body 
     * @param h Request headers
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of MailFolder
     */
    public java.util.concurrent.CompletableFuture<MailFolder> post(@javax.annotation.Nonnull final MailFolder body, @javax.annotation.Nullable final java.util.function.Consumer<Map<String, String>> h, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInfo requestInfo = createPostRequestInfo(
                body, h
            );
            return this.httpCore.sendAsync(requestInfo, MailFolder.class, responseHandler);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Create new navigation property to childFolders for users
     * @param body 
     * @param h Request headers
     * @return a RequestInfo
     */
    @javax.annotation.Nonnull
    public RequestInfo createPostRequestInfo(@javax.annotation.Nonnull final MailFolder body, @javax.annotation.Nullable final java.util.function.Consumer<Map<String, String>> h) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInfo requestInfo = new RequestInfo() {{
            uri = new URI(currentPath + pathSegment);
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.setJsonContentFromParsable(body, serializerFactory);
        if (h != null) {
            h.accept(requestInfo.headers);
        }
        return requestInfo;
    }
    /** Path segment to use to build the URL for the current request builder  */
    @javax.annotation.Nonnull
    private final String pathSegment = "/childFolders";
    /** Current path for the request  */
    @javax.annotation.Nullable
    public String currentPath;
    /** Core service to use to execute the requests  */
    @javax.annotation.Nullable
    public HttpCore httpCore;
    /** Factory to use to get a serializer for payload serialization  */
    @javax.annotation.Nullable
    public SerializationWriterFactory serializerFactory;
    /** Get childFolders from users  */
    public class GetQueryParameters extends QueryParametersBase {
        /** Show only the first n items  */
        @javax.annotation.Nullable
        public Integer top;
        /** Skip the first n items  */
        @javax.annotation.Nullable
        public Integer skip;
        /** Search items by search phrases  */
        @javax.annotation.Nullable
        public String search;
        /** Filter items by property values  */
        @javax.annotation.Nullable
        public String filter;
        /** Include count of items  */
        @javax.annotation.Nullable
        public Boolean count;
        /** Order items by property values  */
        @javax.annotation.Nullable
        public String[] orderby;
        /** Select properties to be returned  */
        @javax.annotation.Nullable
        public String[] select;
        /** Expand related entities  */
        @javax.annotation.Nullable
        public String[] expand;
    }
    /**
     * Get childFolders from users
     * @param h Request headers
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of ChildFoldersResponse
     */
    public java.util.concurrent.CompletableFuture<ChildFoldersResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<Map<String, String>> h, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInfo requestInfo = createGetRequestInfo(
                h
            );
            return this.httpCore.sendAsync(requestInfo, ChildFoldersResponse.class, responseHandler);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get childFolders from users
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of ChildFoldersResponse
     */
    public java.util.concurrent.CompletableFuture<ChildFoldersResponse> get(@javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInfo requestInfo = createGetRequestInfo(
            );
            return this.httpCore.sendAsync(requestInfo, ChildFoldersResponse.class, responseHandler);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Create new navigation property to childFolders for users
     * @param body 
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of MailFolder
     */
    public java.util.concurrent.CompletableFuture<MailFolder> post(@javax.annotation.Nonnull final MailFolder body, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInfo requestInfo = createPostRequestInfo(
                body
            );
            return this.httpCore.sendAsync(requestInfo, MailFolder.class, responseHandler);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get childFolders from users
     * @return a CompletableFuture of ChildFoldersResponse
     */
    public java.util.concurrent.CompletableFuture<ChildFoldersResponse> get() {
        try {
            final RequestInfo requestInfo = createGetRequestInfo(
            );
            return this.httpCore.sendAsync(requestInfo, ChildFoldersResponse.class, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Create new navigation property to childFolders for users
     * @param body 
     * @return a CompletableFuture of MailFolder
     */
    public java.util.concurrent.CompletableFuture<MailFolder> post(@javax.annotation.Nonnull final MailFolder body) {
        Objects.requireNonNull(body);
        try {
            final RequestInfo requestInfo = createPostRequestInfo(
                body
            );
            return this.httpCore.sendAsync(requestInfo, MailFolder.class, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get childFolders from users
     * @param h Request headers
     * @return a RequestInfo
     */
    @javax.annotation.Nonnull
    public RequestInfo createGetRequestInfo(@javax.annotation.Nullable final java.util.function.Consumer<Map<String, String>> h) throws URISyntaxException {
        final RequestInfo requestInfo = new RequestInfo() {{
            uri = new URI(currentPath + pathSegment);
            httpMethod = HttpMethod.GET;
        }};
        if (h != null) {
            h.accept(requestInfo.headers);
        }
        return requestInfo;
    }
    /**
     * Get childFolders from users
     * @return a RequestInfo
     */
    @javax.annotation.Nonnull
    public RequestInfo createGetRequestInfo() throws URISyntaxException {
        final RequestInfo requestInfo = new RequestInfo() {{
            uri = new URI(currentPath + pathSegment);
            httpMethod = HttpMethod.GET;
        }};
        return requestInfo;
    }
    /**
     * Create new navigation property to childFolders for users
     * @param body 
     * @return a RequestInfo
     */
    @javax.annotation.Nonnull
    public RequestInfo createPostRequestInfo(@javax.annotation.Nonnull final MailFolder body) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInfo requestInfo = new RequestInfo() {{
            uri = new URI(currentPath + pathSegment);
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.setJsonContentFromParsable(body, serializerFactory);
        return requestInfo;
    }
}
