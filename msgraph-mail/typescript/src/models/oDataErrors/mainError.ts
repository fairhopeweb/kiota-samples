// tslint:disable
// eslint-disable
// Generated by Microsoft Kiota
import { createErrorDetailsFromDiscriminatorValue, serializeErrorDetails, type ErrorDetails } from './errorDetails';
import { createInnerErrorFromDiscriminatorValue, serializeInnerError, type InnerError } from './innerError';
import { type AdditionalDataHolder, type Parsable, type ParseNode, type SerializationWriter } from '@microsoft/kiota-abstractions';

export function createMainErrorFromDiscriminatorValue(parseNode: ParseNode | undefined) {
    if(!parseNode) throw new Error("parseNode cannot be undefined");
    return deserializeIntoMainError;
}
export function deserializeIntoMainError(mainError: MainError | undefined = {} as MainError) : Record<string, (node: ParseNode) => void> {
    return {
        "code": n => { mainError.code = n.getStringValue(); },
        "details": n => { mainError.details = n.getCollectionOfObjectValues<ErrorDetails>(createErrorDetailsFromDiscriminatorValue); },
        "innerError": n => { mainError.innerError = n.getObjectValue<InnerError>(createInnerErrorFromDiscriminatorValue); },
        "message": n => { mainError.message = n.getStringValue(); },
        "target": n => { mainError.target = n.getStringValue(); },
    }
}
export interface MainError extends AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    additionalData?: Record<string, unknown>;
    /**
     * The code property
     */
    code?: string;
    /**
     * The details property
     */
    details?: ErrorDetails[];
    /**
     * The structure of this object is service-specific
     */
    innerError?: InnerError;
    /**
     * The message property
     */
    message?: string;
    /**
     * The target property
     */
    target?: string;
}
export function serializeMainError(writer: SerializationWriter, mainError: MainError | undefined = {} as MainError) : void {
        writer.writeStringValue("code", mainError.code);
        writer.writeCollectionOfObjectValues<ErrorDetails>("details", mainError.details, serializeErrorDetails);
        writer.writeObjectValue<InnerError>("innerError", mainError.innerError, serializeInnerError);
        writer.writeStringValue("message", mainError.message);
        writer.writeStringValue("target", mainError.target);
        writer.writeAdditionalData(mainError.additionalData);
}
// tslint:enable
// eslint-enable
