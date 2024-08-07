/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.gravitino.exceptions;

import com.google.errorprone.annotations.FormatMethod;
import com.google.errorprone.annotations.FormatString;

/** Base class for all exceptions thrown when a resource is not found. */
public class NotFoundException extends GravitinoRuntimeException {

  /**
   * Constructs a new NotFoundException.
   *
   * @param message The detail message.
   * @param args The arguments to the message.
   */
  @FormatMethod
  public NotFoundException(@FormatString String message, Object... args) {
    super(message, args);
  }

  /**
   * Constructs a new NotFoundException.
   *
   * @param cause The cause of the exception.
   * @param message The detail message.
   * @param args The arguments to the message.
   */
  @FormatMethod
  public NotFoundException(Throwable cause, String message, Object... args) {
    super(cause, message, args);
  }
}
