package users

import (
    "context"
    i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f "github.com/microsoft/kiota-abstractions-go"
    i64ecde285b206ca053eecbd6e7f197e884287a3d0eaa42aae2406e7b3007eba1 "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/models/odataerrors"
)

// ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder builds and executes requests for operations under \users\{user-id}\mailFolders\{mailFolder-id}\childFolders\{mailFolder-id1}\messageRules\$count
type ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder struct {
    i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.BaseRequestBuilder
}
// ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilderGetQueryParameters get the number of the resource
type ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilderGetQueryParameters struct {
    // Filter items by property values
    Filter *string `uriparametername:"%24filter"`
}
// ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilderGetRequestConfiguration configuration for the request such as headers, query parameters, and middleware options.
type ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilderGetRequestConfiguration struct {
    // Request headers
    Headers *i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestHeaders
    // Request options
    Options []i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestOption
    // Request query parameters
    QueryParameters *ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilderGetQueryParameters
}
// NewItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilderInternal instantiates a new CountRequestBuilder and sets the default values.
func NewItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilderInternal(pathParameters map[string]string, requestAdapter i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestAdapter)(*ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder) {
    m := &ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder{
        BaseRequestBuilder: *i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.NewBaseRequestBuilder(requestAdapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/childFolders/{mailFolder%2Did1}/messageRules/$count{?%24filter}", pathParameters),
    }
    return m
}
// NewItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder instantiates a new CountRequestBuilder and sets the default values.
func NewItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder(rawUrl string, requestAdapter i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestAdapter)(*ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder) {
    urlParams := make(map[string]string)
    urlParams["request-raw-url"] = rawUrl
    return NewItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilderInternal(urlParams, requestAdapter)
}
// Get get the number of the resource
func (m *ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder) Get(ctx context.Context, requestConfiguration *ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilderGetRequestConfiguration)(*int32, error) {
    requestInfo, err := m.ToGetRequestInformation(ctx, requestConfiguration);
    if err != nil {
        return nil, err
    }
    errorMapping := i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.ErrorMappings {
        "4XX": i64ecde285b206ca053eecbd6e7f197e884287a3d0eaa42aae2406e7b3007eba1.CreateODataErrorFromDiscriminatorValue,
        "5XX": i64ecde285b206ca053eecbd6e7f197e884287a3d0eaa42aae2406e7b3007eba1.CreateODataErrorFromDiscriminatorValue,
    }
    res, err := m.BaseRequestBuilder.RequestAdapter.SendPrimitive(ctx, requestInfo, "int32", errorMapping)
    if err != nil {
        return nil, err
    }
    if res == nil {
        return nil, nil
    }
    return res.(*int32), nil
}
// ToGetRequestInformation get the number of the resource
func (m *ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder) ToGetRequestInformation(ctx context.Context, requestConfiguration *ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilderGetRequestConfiguration)(*i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.RequestInformation, error) {
    requestInfo := i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.NewRequestInformationWithMethodAndUrlTemplateAndPathParameters(i2ae4187f7daee263371cb1c977df639813ab50ffa529013b7437480d1ec0158f.GET, m.BaseRequestBuilder.UrlTemplate, m.BaseRequestBuilder.PathParameters)
    if requestConfiguration != nil {
        if requestConfiguration.QueryParameters != nil {
            requestInfo.AddQueryParameters(*(requestConfiguration.QueryParameters))
        }
        requestInfo.Headers.AddAll(requestConfiguration.Headers)
        requestInfo.AddRequestOptions(requestConfiguration.Options)
    }
    requestInfo.Headers.TryAdd("Accept", "text/plain;q=0.9")
    return requestInfo, nil
}
// WithUrl returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
func (m *ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder) WithUrl(rawUrl string)(*ItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder) {
    return NewItemMailFoldersItemChildFoldersItemMessageRulesCountRequestBuilder(rawUrl, m.BaseRequestBuilder.RequestAdapter);
}
