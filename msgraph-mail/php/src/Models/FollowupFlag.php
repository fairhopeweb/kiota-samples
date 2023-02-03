<?php

namespace Microsoft\Graph\Models;

use Microsoft\Kiota\Abstractions\Serialization\AdditionalDataHolder;
use Microsoft\Kiota\Abstractions\Serialization\Parsable;
use Microsoft\Kiota\Abstractions\Serialization\ParseNode;
use Microsoft\Kiota\Abstractions\Serialization\SerializationWriter;

class FollowupFlag implements AdditionalDataHolder, Parsable 
{
    /**
     * @var array<string, mixed> $additionalData Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
    */
    private array $additionalData;
    
    /**
     * @var DateTimeTimeZone|null $completedDateTime 
    */
    private ?DateTimeTimeZone $completedDateTime = null;
    
    /**
     * @var DateTimeTimeZone|null $dueDateTime 
    */
    private ?DateTimeTimeZone $dueDateTime = null;
    
    /**
     * @var FollowupFlagStatus|null $flagStatus 
    */
    private ?FollowupFlagStatus $flagStatus = null;
    
    /**
     * @var DateTimeTimeZone|null $startDateTime 
    */
    private ?DateTimeTimeZone $startDateTime = null;
    
    /**
     * Instantiates a new followupFlag and sets the default values.
    */
    public function __construct() {
        $this->setAdditionalData([]);
    }

    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param ParseNode $parseNode The parse node to use to read the discriminator value and create the object
     * @return FollowupFlag
    */
    public static function createFromDiscriminatorValue(ParseNode $parseNode): FollowupFlag {
        return new FollowupFlag();
    }

    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return array<string, mixed>
    */
    public function getAdditionalData(): ?array {
        return $this->additionalData;
    }

    /**
     * Gets the completedDateTime property value. 
     * @return DateTimeTimeZone|null
    */
    public function getCompletedDateTime(): ?DateTimeTimeZone {
        return $this->completedDateTime;
    }

    /**
     * Gets the dueDateTime property value. 
     * @return DateTimeTimeZone|null
    */
    public function getDueDateTime(): ?DateTimeTimeZone {
        return $this->dueDateTime;
    }

    /**
     * The deserialization information for the current model
     * @return array<string, callable>
    */
    public function getFieldDeserializers(): array {
        $o = $this;
        return  [
            'completedDateTime' => fn(ParseNode $n) => $o->setCompletedDateTime($n->getObjectValue([DateTimeTimeZone::class, 'createFromDiscriminatorValue'])),
            'dueDateTime' => fn(ParseNode $n) => $o->setDueDateTime($n->getObjectValue([DateTimeTimeZone::class, 'createFromDiscriminatorValue'])),
            'flagStatus' => fn(ParseNode $n) => $o->setFlagStatus($n->getEnumValue(FollowupFlagStatus::class)),
            'startDateTime' => fn(ParseNode $n) => $o->setStartDateTime($n->getObjectValue([DateTimeTimeZone::class, 'createFromDiscriminatorValue'])),
        ];
    }

    /**
     * Gets the flagStatus property value. 
     * @return FollowupFlagStatus|null
    */
    public function getFlagStatus(): ?FollowupFlagStatus {
        return $this->flagStatus;
    }

    /**
     * Gets the startDateTime property value. 
     * @return DateTimeTimeZone|null
    */
    public function getStartDateTime(): ?DateTimeTimeZone {
        return $this->startDateTime;
    }

    /**
     * Serializes information the current object
     * @param SerializationWriter $writer Serialization writer to use to serialize this model
    */
    public function serialize(SerializationWriter $writer): void {
        $writer->writeObjectValue('completedDateTime', $this->getCompletedDateTime());
        $writer->writeObjectValue('dueDateTime', $this->getDueDateTime());
        $writer->writeEnumValue('flagStatus', $this->getFlagStatus());
        $writer->writeObjectValue('startDateTime', $this->getStartDateTime());
        $writer->writeAdditionalData($this->getAdditionalData());
    }

    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param array<string,mixed> $value Value to set for the AdditionalData property.
    */
    public function setAdditionalData(?array $value): void {
        $this->additionalData = $value;
    }

    /**
     * Sets the completedDateTime property value. 
     * @param DateTimeTimeZone|null $value Value to set for the completedDateTime property.
    */
    public function setCompletedDateTime(?DateTimeTimeZone $value): void {
        $this->completedDateTime = $value;
    }

    /**
     * Sets the dueDateTime property value. 
     * @param DateTimeTimeZone|null $value Value to set for the dueDateTime property.
    */
    public function setDueDateTime(?DateTimeTimeZone $value): void {
        $this->dueDateTime = $value;
    }

    /**
     * Sets the flagStatus property value. 
     * @param FollowupFlagStatus|null $value Value to set for the flagStatus property.
    */
    public function setFlagStatus(?FollowupFlagStatus $value): void {
        $this->flagStatus = $value;
    }

    /**
     * Sets the startDateTime property value. 
     * @param DateTimeTimeZone|null $value Value to set for the startDateTime property.
    */
    public function setStartDateTime(?DateTimeTimeZone $value): void {
        $this->startDateTime = $value;
    }

}
