package messages

import (
    i04eb5309aeaafadd28374d79c8471df9b267510b4dc2e3144c378c50f6fd7b55 "github.com/microsoft/kiota/abstractions/go/serialization"
    ieea96ea0706c7e10d110f01563f903230c17531f1ba4f5e7095035777bc8b5e5 "github.com/microsoft/kiota-samples/msgraph-mail/go/utilities/models"
)

type MessagesResponse struct {
    additionalData map[string]interface{};
    nextLink *string;
    value []ieea96ea0706c7e10d110f01563f903230c17531f1ba4f5e7095035777bc8b5e5.Message;
}
func (m *MessagesResponse) getAdditionalData()(map[string]interface{}) {
    return nil
}
func (m *MessagesResponse) getNextLink()(*string) {
    return nil
}
func (m *MessagesResponse) getValue()([]ieea96ea0706c7e10d110f01563f903230c17531f1ba4f5e7095035777bc8b5e5.Message) {
    return nil
}
func (m *MessagesResponse) getFieldDeserializers()(map[string]func(interface{}, i04eb5309aeaafadd28374d79c8471df9b267510b4dc2e3144c378c50f6fd7b55.ParseNode)(error), error) {
    return nil
}
func (m *MessagesResponse) serialize(writer i04eb5309aeaafadd28374d79c8471df9b267510b4dc2e3144c378c50f6fd7b55.SerializationWriter)(error) {
    return nil
}
func (m *MessagesResponse) setAdditionalData(value map[string]interface{})() {
    return nil
}
func (m *MessagesResponse) setNextLink(value *string)() {
    return nil
}
func (m *MessagesResponse) setValue(value []ieea96ea0706c7e10d110f01563f903230c17531f1ba4f5e7095035777bc8b5e5.Message)() {
    return nil
}
