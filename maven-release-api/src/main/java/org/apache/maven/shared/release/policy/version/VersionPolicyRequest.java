package org.apache.maven.shared.release.policy.version;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.artifact.repository.metadata.Metadata;

/**
 * <p>VersionPolicyRequest class.</p>
 *
 * @since 2.5.1 (MRELEASE-431)
 */
public class VersionPolicyRequest
{

    private String version;
    
    private Metadata metaData;

    /**
     * <p>Getter for the field <code>version</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getVersion()
    {
        return version;
    }

    /**
     * <p>Setter for the field <code>version</code>.</p>
     *
     * @param version a {@link java.lang.String} object
     * @return a {@link org.apache.maven.shared.release.policy.version.VersionPolicyRequest} object
     */
    public VersionPolicyRequest setVersion( String version )
    {
        this.version = version;
        return this;
    }
    
    /**
     * <p>Getter for the field <code>metaData</code>.</p>
     *
     * @return a {@link org.apache.maven.artifact.repository.metadata.Metadata} object
     */
    public Metadata getMetaData()
    {
        return metaData;
    }
    
    /**
     * <p>Setter for the field <code>metaData</code>.</p>
     *
     * @param metaData a {@link org.apache.maven.artifact.repository.metadata.Metadata} object
     * @return a {@link org.apache.maven.shared.release.policy.version.VersionPolicyRequest} object
     */
    public VersionPolicyRequest setMetaData( Metadata metaData )
    {
        this.metaData = metaData;
        return this;
    }
    
}
