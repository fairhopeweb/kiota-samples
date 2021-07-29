package item

import (
    ida96af0f171bb75f894a4013a6b3146a4397c58f11adb81a2b7cbea9314783a9 "github.com/microsoft/kiota/abstractions/go"
    i04eb5309aeaafadd28374d79c8471df9b267510b4dc2e3144c378c50f6fd7b55 "github.com/microsoft/kiota/abstractions/go/serialization"
    ieea96ea0706c7e10d110f01563f903230c17531f1ba4f5e7095035777bc8b5e5 "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/models"
    iab1a0dd9a491da948f96274b48b251c29156f5ab5cdef57a533c314762a96cba "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/users/mailfolders/childfolders"
    id4ccc2d90f7e823c6e1c9e4a9a1f0e784a26e3fd6a68c038bda15d61728d0e46 "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/users/mailfolders/messagerules"
    i17b176b6a1414dd086eba0883aee3fc49c21b71511308a01a6732762ead9b8e8 "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/users/mailfolders/messages"
    i660191d0d3ef7133b6f3e0a4532d18c73c2f52a7222a034c4492d6ec6ef3fc3e "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/users/mailfolders/multivalueextendedproperties"
    ib4b1a269396ed151935b7d4ec590d14cf3ed072057ab6475f11863830766d145 "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/users/mailfolders/singlevalueextendedproperties"
    i0dcb0d8c6a911f67209ea659b254ba6713191c318f2799cf8a9383d821d87061 "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/users/mailfolders/childfolders/item"
    i5d2f606000ccb668c7a688148beea132a38f81fbf9cf32e175421151435d1b29 "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/users/mailfolders/messagerules/item"
    ifdebf055cf7726bc6ca41ec4be0e381235fd73f507038a2ea27cd08a6fa09506 "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/users/mailfolders/messages/item"
    id2dc360a4b1db0a33958a93a105ee47a087c7d3853efa23c73dbf41c05cd738e "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/users/mailfolders/multivalueextendedproperties/item"
    ic93bf2d2dca930088dbc375148726cf159640b4b7220bf5ee92920b4e2022faa "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/users/mailfolders/singlevalueextendedproperties/item"
)

type MailFolderRequestBuilder struct {
    ChildFolders iab1a0dd9a491da948f96274b48b251c29156f5ab5cdef57a533c314762a96cba.ChildFoldersRequestBuilder;
    currentPath *string;
    httpCore ida96af0f171bb75f894a4013a6b3146a4397c58f11adb81a2b7cbea9314783a9.HttpCore;
    MessageRules id4ccc2d90f7e823c6e1c9e4a9a1f0e784a26e3fd6a68c038bda15d61728d0e46.MessageRulesRequestBuilder;
    Messages i17b176b6a1414dd086eba0883aee3fc49c21b71511308a01a6732762ead9b8e8.MessagesRequestBuilder;
    MultiValueExtendedProperties i660191d0d3ef7133b6f3e0a4532d18c73c2f52a7222a034c4492d6ec6ef3fc3e.MultiValueExtendedPropertiesRequestBuilder;
    pathSegment *string;
    SingleValueExtendedProperties ib4b1a269396ed151935b7d4ec590d14cf3ed072057ab6475f11863830766d145.SingleValueExtendedPropertiesRequestBuilder;
}
func (m *MailFolderRequestBuilder) childFolders(id String)(i0dcb0d8c6a911f67209ea659b254ba6713191c318f2799cf8a9383d821d87061.MailFolderRequestBuilder, error) {
    return nil
}
func NewMailFolderRequestBuilder(currentPath *string, httpCore ida96af0f171bb75f894a4013a6b3146a4397c58f11adb81a2b7cbea9314783a9.HttpCore)(*MailFolderRequestBuilder) {
    return nil
}
func (m *MailFolderRequestBuilder) createDeleteRequestInfo(h func (value map[string]string) (err error))(ida96af0f171bb75f894a4013a6b3146a4397c58f11adb81a2b7cbea9314783a9.RequestInfo, error) {
    return nil
}
func (m *MailFolderRequestBuilder) createGetRequestInfo(q func (value GetQueryParameters) (err error), h func (value map[string]string) (err error))(ida96af0f171bb75f894a4013a6b3146a4397c58f11adb81a2b7cbea9314783a9.RequestInfo, error) {
    return nil
}
func (m *MailFolderRequestBuilder) createPatchRequestInfo(body ieea96ea0706c7e10d110f01563f903230c17531f1ba4f5e7095035777bc8b5e5.MailFolder, h func (value map[string]string) (err error))(ida96af0f171bb75f894a4013a6b3146a4397c58f11adb81a2b7cbea9314783a9.RequestInfo, error) {
    return nil
}
func (m *MailFolderRequestBuilder) delete(h func (value map[string]string) (err error), responseHandler ida96af0f171bb75f894a4013a6b3146a4397c58f11adb81a2b7cbea9314783a9.ResponseHandler)(func() (error)) {
    return nil
}
func (m *MailFolderRequestBuilder) get(q func (value GetQueryParameters) (err error), h func (value map[string]string) (err error), responseHandler ida96af0f171bb75f894a4013a6b3146a4397c58f11adb81a2b7cbea9314783a9.ResponseHandler)(func() (ieea96ea0706c7e10d110f01563f903230c17531f1ba4f5e7095035777bc8b5e5.MailFolder, error)) {
    return nil
}
func (m *MailFolderRequestBuilder) messageRules(id String)(i5d2f606000ccb668c7a688148beea132a38f81fbf9cf32e175421151435d1b29.MessageRuleRequestBuilder, error) {
    return nil
}
func (m *MailFolderRequestBuilder) messages(id String)(ifdebf055cf7726bc6ca41ec4be0e381235fd73f507038a2ea27cd08a6fa09506.MessageRequestBuilder, error) {
    return nil
}
func (m *MailFolderRequestBuilder) multiValueExtendedProperties(id String)(id2dc360a4b1db0a33958a93a105ee47a087c7d3853efa23c73dbf41c05cd738e.MultiValueLegacyExtendedPropertyRequestBuilder, error) {
    return nil
}
func (m *MailFolderRequestBuilder) patch(body ieea96ea0706c7e10d110f01563f903230c17531f1ba4f5e7095035777bc8b5e5.MailFolder, h func (value map[string]string) (err error), responseHandler ida96af0f171bb75f894a4013a6b3146a4397c58f11adb81a2b7cbea9314783a9.ResponseHandler)(func() (error)) {
    return nil
}
func (m *MailFolderRequestBuilder) singleValueExtendedProperties(id String)(ic93bf2d2dca930088dbc375148726cf159640b4b7220bf5ee92920b4e2022faa.SingleValueLegacyExtendedPropertyRequestBuilder, error) {
    return nil
}
