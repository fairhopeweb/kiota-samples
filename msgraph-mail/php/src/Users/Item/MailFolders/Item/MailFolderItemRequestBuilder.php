<?php

namespace Microsoft\Graph\Users\Item\MailFolders\Item;

use Exception;
use Http\Promise\Promise;
use Microsoft\Graph\Models\MailFolder;
use Microsoft\Graph\Models\ODataErrors\ODataError;
use Microsoft\Graph\Users\Item\MailFolders\Item\ChildFolders\ChildFoldersRequestBuilder;
use Microsoft\Graph\Users\Item\MailFolders\Item\MessageRules\MessageRulesRequestBuilder;
use Microsoft\Graph\Users\Item\MailFolders\Item\Messages\MessagesRequestBuilder;
use Microsoft\Kiota\Abstractions\BaseRequestBuilder;
use Microsoft\Kiota\Abstractions\HttpMethod;
use Microsoft\Kiota\Abstractions\RequestAdapter;
use Microsoft\Kiota\Abstractions\RequestInformation;
use Psr\Http\Message\StreamInterface;

/**
 * Builds and executes requests for operations under /users/{user-id}/mailFolders/{mailFolder-id}
*/
class MailFolderItemRequestBuilder extends BaseRequestBuilder 
{
    /**
     * The childFolders property
    */
    public function childFolders(): ChildFoldersRequestBuilder {
        return new ChildFoldersRequestBuilder($this->pathParameters, $this->requestAdapter);
    }
    
    /**
     * The messageRules property
    */
    public function messageRules(): MessageRulesRequestBuilder {
        return new MessageRulesRequestBuilder($this->pathParameters, $this->requestAdapter);
    }
    
    /**
     * The messages property
    */
    public function messages(): MessagesRequestBuilder {
        return new MessagesRequestBuilder($this->pathParameters, $this->requestAdapter);
    }
    
    /**
     * Instantiates a new MailFolderItemRequestBuilder and sets the default values.
     * @param array<string, mixed>|string $pathParametersOrRawUrl Path parameters for the request or a String representing the raw URL.
     * @param RequestAdapter $requestAdapter The request adapter to use to execute the requests.
    */
    public function __construct($pathParametersOrRawUrl, RequestAdapter $requestAdapter) {
        parent::__construct($requestAdapter, [], '{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}{?includeHiddenFolders,%24select,%24expand}');
        if (is_array($pathParametersOrRawUrl)) {
            $this->pathParameters = $pathParametersOrRawUrl;
        } else {
            $this->pathParameters = ['request-raw-url' => $pathParametersOrRawUrl];
        }
    }

    /**
     * Delete the specified mailFolder. The folder can be a mailSearchFolder. You can specify a mail folder by its folder ID, or by its well-known folder name, if one exists. This API is available in the following national cloud deployments.
     * @param MailFolderItemRequestBuilderDeleteRequestConfiguration|null $requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return Promise<StreamInterface|null>
     * @throws Exception
     * @link https://learn.microsoft.com/graph/api/mailfolder-delete?view=graph-rest-1.0 Find more info here
    */
    public function delete(?MailFolderItemRequestBuilderDeleteRequestConfiguration $requestConfiguration = null): Promise {
        $requestInfo = $this->toDeleteRequestInformation($requestConfiguration);
        $errorMappings = [
                '4XX' => [ODataError::class, 'createFromDiscriminatorValue'],
                '5XX' => [ODataError::class, 'createFromDiscriminatorValue'],
        ];
        /** @var Promise<StreamInterface|null> $result */
        $result = $this->requestAdapter->sendPrimitiveAsync($requestInfo, StreamInterface::class, $errorMappings);
        return $result;
    }

    /**
     * The user's mail folders. Read-only. Nullable.
     * @param MailFolderItemRequestBuilderGetRequestConfiguration|null $requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return Promise<MailFolder|null>
     * @throws Exception
     * @link https://learn.microsoft.com/graph/api/mailfolder-get?view=graph-rest-1.0 Find more info here
    */
    public function get(?MailFolderItemRequestBuilderGetRequestConfiguration $requestConfiguration = null): Promise {
        $requestInfo = $this->toGetRequestInformation($requestConfiguration);
        $errorMappings = [
                '4XX' => [ODataError::class, 'createFromDiscriminatorValue'],
                '5XX' => [ODataError::class, 'createFromDiscriminatorValue'],
        ];
        return $this->requestAdapter->sendAsync($requestInfo, [MailFolder::class, 'createFromDiscriminatorValue'], $errorMappings);
    }

    /**
     * Update the properties of mailfolder object. This API is available in the following national cloud deployments.
     * @param MailFolder $body The request body
     * @param MailFolderItemRequestBuilderPatchRequestConfiguration|null $requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return Promise<MailFolder|null>
     * @throws Exception
     * @link https://learn.microsoft.com/graph/api/mailfolder-update?view=graph-rest-1.0 Find more info here
    */
    public function patch(MailFolder $body, ?MailFolderItemRequestBuilderPatchRequestConfiguration $requestConfiguration = null): Promise {
        $requestInfo = $this->toPatchRequestInformation($body, $requestConfiguration);
        $errorMappings = [
                '4XX' => [ODataError::class, 'createFromDiscriminatorValue'],
                '5XX' => [ODataError::class, 'createFromDiscriminatorValue'],
        ];
        return $this->requestAdapter->sendAsync($requestInfo, [MailFolder::class, 'createFromDiscriminatorValue'], $errorMappings);
    }

    /**
     * Delete the specified mailFolder. The folder can be a mailSearchFolder. You can specify a mail folder by its folder ID, or by its well-known folder name, if one exists. This API is available in the following national cloud deployments.
     * @param MailFolderItemRequestBuilderDeleteRequestConfiguration|null $requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return RequestInformation
    */
    public function toDeleteRequestInformation(?MailFolderItemRequestBuilderDeleteRequestConfiguration $requestConfiguration = null): RequestInformation {
        $requestInfo = new RequestInformation();
        $requestInfo->urlTemplate = $this->urlTemplate;
        $requestInfo->pathParameters = $this->pathParameters;
        $requestInfo->httpMethod = HttpMethod::DELETE;
        if ($requestConfiguration !== null) {
            $requestInfo->addHeaders($requestConfiguration->headers);
            $requestInfo->addRequestOptions(...$requestConfiguration->options);
        }
        $requestInfo->tryAddHeader('Accept', "application/json");
        return $requestInfo;
    }

    /**
     * The user's mail folders. Read-only. Nullable.
     * @param MailFolderItemRequestBuilderGetRequestConfiguration|null $requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return RequestInformation
    */
    public function toGetRequestInformation(?MailFolderItemRequestBuilderGetRequestConfiguration $requestConfiguration = null): RequestInformation {
        $requestInfo = new RequestInformation();
        $requestInfo->urlTemplate = $this->urlTemplate;
        $requestInfo->pathParameters = $this->pathParameters;
        $requestInfo->httpMethod = HttpMethod::GET;
        if ($requestConfiguration !== null) {
            $requestInfo->addHeaders($requestConfiguration->headers);
            if ($requestConfiguration->queryParameters !== null) {
                $requestInfo->setQueryParameters($requestConfiguration->queryParameters);
            }
            $requestInfo->addRequestOptions(...$requestConfiguration->options);
        }
        $requestInfo->tryAddHeader('Accept', "application/json;q=1");
        return $requestInfo;
    }

    /**
     * Update the properties of mailfolder object. This API is available in the following national cloud deployments.
     * @param MailFolder $body The request body
     * @param MailFolderItemRequestBuilderPatchRequestConfiguration|null $requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return RequestInformation
    */
    public function toPatchRequestInformation(MailFolder $body, ?MailFolderItemRequestBuilderPatchRequestConfiguration $requestConfiguration = null): RequestInformation {
        $requestInfo = new RequestInformation();
        $requestInfo->urlTemplate = $this->urlTemplate;
        $requestInfo->pathParameters = $this->pathParameters;
        $requestInfo->httpMethod = HttpMethod::PATCH;
        if ($requestConfiguration !== null) {
            $requestInfo->addHeaders($requestConfiguration->headers);
            $requestInfo->addRequestOptions(...$requestConfiguration->options);
        }
        $requestInfo->tryAddHeader('Accept', "application/json;q=1");
        $requestInfo->setContentFromParsable($this->requestAdapter, "application/json", $body);
        return $requestInfo;
    }

    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param string $rawUrl The raw URL to use for the request builder.
     * @return MailFolderItemRequestBuilder
    */
    public function withUrl(string $rawUrl): MailFolderItemRequestBuilder {
        return new MailFolderItemRequestBuilder($rawUrl, $this->requestAdapter);
    }

}
