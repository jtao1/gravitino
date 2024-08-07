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
package org.apache.gravitino;

import lombok.EqualsAndHashCode;
import org.apache.gravitino.connector.BaseSchema;

@EqualsAndHashCode(callSuper = true)
public class TestSchema extends BaseSchema {

  private TestSchema() {}

  public static class Builder extends BaseSchema.BaseSchemaBuilder<Builder, TestSchema> {
    /** Creates a new instance of {@link Builder}. */
    private Builder() {}

    @Override
    protected TestSchema internalBuild() {
      TestSchema schema = new TestSchema();

      schema.name = name;
      schema.comment = comment;
      schema.properties = properties;
      schema.auditInfo = auditInfo;

      return schema;
    }
  }

  /**
   * Creates a new instance of {@link Builder}.
   *
   * @return The new instance.
   */
  public static Builder builder() {
    return new Builder();
  }
}
