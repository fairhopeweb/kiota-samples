package users

import (
    "context"
    i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f "github.com/microsoft/kiota-abstractions-go"
    i64ecde285b206ca053eecbd6e7f197e884287a3d0eaa42aae2406e7b3007eba1 "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/models/odataerrors"
)

// ItemMessagesItemValueContentRequestBuilder builds and executes requests for operations under \users\{user-id}\messages\{message-id}\$value
type ItemMessagesItemValueContentRequestBuilder struct {
    i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.BaseRequestBuilder
}
// ItemMessagesItemValueContentRequestBuilderGetRequestConfiguration configuration for the request such as headers, query parameters, and middleware options.
type ItemMessagesItemValueContentRequestBuilderGetRequestConfiguration struct {
    // Request headers
    Headers *i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestHeaders
    // Request options
    Options []i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestOption
}
// ItemMessagesItemValueContentRequestBuilderPutRequestConfiguration configuration for the request such as headers, query parameters, and middleware options.
type ItemMessagesItemValueContentRequestBuilderPutRequestConfiguration struct {
    // Request headers
    Headers *i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestHeaders
    // Request options
    Options []i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestOption
}
// NewItemMessagesItemValueContentRequestBuilderInternal instantiates a new ContentRequestBuilder and sets the default values.
func NewItemMessagesItemValueContentRequestBuilderInternal(pathParameters map[string]string, requestAdapter i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestAdapter)(*ItemMessagesItemValueContentRequestBuilder) {
    m := &ItemMessagesItemValueContentRequestBuilder{
        BaseRequestBuilder: *i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.NewBaseRequestBuilder(requestAdapter, "{+baseurl}/users/{user%2Did}/messages/{message%2Did}/$value", pathParameters),
    }
    return m
}
// NewItemMessagesItemValueContentRequestBuilder instantiates a new ContentRequestBuilder and sets the default values.
func NewItemMessagesItemValueContentRequestBuilder(rawUrl string, requestAdapter i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestAdapter)(*ItemMessagesItemValueContentRequestBuilder) {
    urlParams := make(map[string]string)
    urlParams["request-raw-url"] = rawUrl
    return NewItemMessagesItemValueContentRequestBuilderInternal(urlParams, requestAdapter)
}
// Get get media content for the navigation property messages from users
// [Find more info here]
// 
// [Find more info here]: https://learn.microsoft.com/graph/api/opentypeextension-get?view=graph-rest-1.0
func (m *ItemMessagesItemValueContentRequestBuilder) Get(ctx context.Context, requestConfiguration *ItemMessagesItemValueContentRequestBuilderGetRequestConfiguration)([]byte, error) {
    requestInfo, err := m.ToGetRequestInformation(ctx, requestConfiguration);
    if err != nil {
        return nil, err
    }
    errorMapping := i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.ErrorMappings {
        "4XX": i64ecde285b206ca053eecbd6e7f197e884287a3d0eaa42aae2406e7b3007eba1.CreateODataErrorFromDiscriminatorValue,
        "5XX": i64ecde285b206ca053eecbd6e7f197e884287a3d0eaa42aae2406e7b3007eba1.CreateODataErrorFromDiscriminatorValue,
    }
    res, err := m.BaseRequestBuilder.RequestAdapter.SendPrimitive(ctx, requestInfo, "[]byte", errorMapping)
    if err != nil {
        return nil, err
    }
    if res == nil {
        return nil, nil
    }
    return res.([]byte), nil
}
// Put update media content for the navigation property messages in users
func (m *ItemMessagesItemValueContentRequestBuilder) Put(ctx context.Context, body []byte, requestConfiguration *ItemMessagesItemValueContentRequestBuilderPutRequestConfiguration)([]byte, error) {
    requestInfo, err := m.ToPutRequestInformation(ctx, body, requestConfiguration);
    if err != nil {
        return nil, err
    }
    errorMapping := i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.ErrorMappings {
        "4XX": i64ecde285b206ca053eecbd6e7f197e884287a3d0eaa42aae2406e7b3007eba1.CreateODataErrorFromDiscriminatorValue,
        "5XX": i64ecde285b206ca053eecbd6e7f197e884287a3d0eaa42aae2406e7b3007eba1.CreateODataErrorFromDiscriminatorValue,
    }
    res, err := m.BaseRequestBuilder.RequestAdapter.SendPrimitive(ctx, requestInfo, "[]byte", errorMapping)
    if err != nil {
        return nil, err
    }
    if res == nil {
        return nil, nil
    }
    return res.([]byte), nil
}
// ToGetRequestInformation get media content for the navigation property messages from users
func (m *ItemMessagesItemValueContentRequestBuilder) ToGetRequestInformation(ctx context.Context, requestConfiguration *ItemMessagesItemValueContentRequestBuilderGetRequestConfiguration)(*i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestInformation, error) {
    requestInfo := i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.NewRequestInformationWithMethodAndUrlTemplateAndPathParameters(i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.GET, m.BaseRequestBuilder.UrlTemplate, m.BaseRequestBuilder.PathParameters)
    if requestConfiguration != nil {
        requestInfo.Headers.AddAll(requestConfiguration.Headers)
        requestInfo.AddRequestOptions(requestConfiguration.Options)
    }
    requestInfo.Headers.TryAdd("Accept", "application/octet-stream, application/json")
    return requestInfo, nil
}
// ToPutRequestInformation update media content for the navigation property messages in users
func (m *ItemMessagesItemValueContentRequestBuilder) ToPutRequestInformation(ctx context.Context, body []byte, requestConfiguration *ItemMessagesItemValueContentRequestBuilderPutRequestConfiguration)(*i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestInformation, error) {
    requestInfo := i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.NewRequestInformationWithMethodAndUrlTemplateAndPathParameters(i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.PUT, m.BaseRequestBuilder.UrlTemplate, m.BaseRequestBuilder.PathParameters)
    if requestConfiguration != nil {
        requestInfo.Headers.AddAll(requestConfiguration.Headers)
        requestInfo.AddRequestOptions(requestConfiguration.Options)
    }
    requestInfo.Headers.TryAdd("Accept", "application/json")
    requestInfo.SetStreamContentAndContentType(body, "application/octet-stream")
    return requestInfo, nil
}
// WithUrl returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
func (m *ItemMessagesItemValueContentRequestBuilder) WithUrl(rawUrl string)(*ItemMessagesItemValueContentRequestBuilder) {
    return NewItemMessagesItemValueContentRequestBuilder(rawUrl, m.BaseRequestBuilder.RequestAdapter);
}
