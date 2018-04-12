/*
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 * this file except in compliance with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazon.asksdk.address.exceptions;

import com.amazon.asksdk.address.DeviceAddressSpeechlet;

/**
 * This exception indicates that the AlexaDeviceAddressClient failed because of a permission specific
 * reason. This is an exception aside from {@link DeviceAddressClientException} because permission related
 * issues should be handled separately from a generic failure.
 *
 * Refer to {@link DeviceAddressSpeechlet} to see how permission related errors are handled.
 */
public class UnauthorizedException extends DeviceAddressClientException {

    public UnauthorizedException(String message, Exception e) {
        super(message, e);
    }

    public UnauthorizedException(String message) {
        super(message);
    }
}