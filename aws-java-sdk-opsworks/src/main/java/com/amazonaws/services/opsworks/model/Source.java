/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the information required to retrieve an app or cookbook from
 * a repository. For more information, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html"> Creating Apps </a> or <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html"> Custom Recipes and Cookbooks </a>
 * .
 * </p>
 */
public class Source implements Serializable, Cloneable {

    /**
     * The repository type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     */
    private String type;

    /**
     * The source URL.
     */
    private String url;

    /**
     * This parameter depends on the repository type. <ul> <li>For Amazon S3
     * bundles, set <code>Username</code> to the appropriate IAM access key
     * ID.</li> <li>For HTTP bundles, Git repositories, and Subversion
     * repositories, set <code>Username</code> to the user name.</li> </ul>
     */
    private String username;

    /**
     * When included in a request, the parameter depends on the repository
     * type. <ul> <li>For Amazon S3 bundles, set <code>Password</code> to the
     * appropriate IAM secret access key.</li> <li>For HTTP bundles and
     * Subversion repositories, set <code>Password</code> to the
     * password.</li> </ul> <p>For more information on how to safely handle
     * IAM credentials, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"/>.
     * <p>In responses, AWS OpsWorks returns <code>*****FILTERED*****</code>
     * instead of the actual value.
     */
    private String password;

    /**
     * In requests, the repository's SSH key. <p>In responses, AWS OpsWorks
     * returns <code>*****FILTERED*****</code> instead of the actual value.
     */
    private String sshKey;

    /**
     * The application's version. AWS OpsWorks enables you to easily deploy
     * new versions of an application. One of the simplest approaches is to
     * have branches or revisions in your repository that represent different
     * versions that can potentially be deployed.
     */
    private String revision;

    /**
     * The repository type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     *
     * @return The repository type.
     *
     * @see SourceType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The repository type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     *
     * @param type The repository type.
     *
     * @see SourceType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The repository type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     *
     * @param type The repository type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SourceType
     */
    public Source withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The repository type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     *
     * @param type The repository type.
     *
     * @see SourceType
     */
    public void setType(SourceType type) {
        this.type = type.toString();
    }
    
    /**
     * The repository type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>git, svn, archive, s3
     *
     * @param type The repository type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SourceType
     */
    public Source withType(SourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * The source URL.
     *
     * @return The source URL.
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * The source URL.
     *
     * @param url The source URL.
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
     * The source URL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param url The source URL.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Source withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * This parameter depends on the repository type. <ul> <li>For Amazon S3
     * bundles, set <code>Username</code> to the appropriate IAM access key
     * ID.</li> <li>For HTTP bundles, Git repositories, and Subversion
     * repositories, set <code>Username</code> to the user name.</li> </ul>
     *
     * @return This parameter depends on the repository type. <ul> <li>For Amazon S3
     *         bundles, set <code>Username</code> to the appropriate IAM access key
     *         ID.</li> <li>For HTTP bundles, Git repositories, and Subversion
     *         repositories, set <code>Username</code> to the user name.</li> </ul>
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * This parameter depends on the repository type. <ul> <li>For Amazon S3
     * bundles, set <code>Username</code> to the appropriate IAM access key
     * ID.</li> <li>For HTTP bundles, Git repositories, and Subversion
     * repositories, set <code>Username</code> to the user name.</li> </ul>
     *
     * @param username This parameter depends on the repository type. <ul> <li>For Amazon S3
     *         bundles, set <code>Username</code> to the appropriate IAM access key
     *         ID.</li> <li>For HTTP bundles, Git repositories, and Subversion
     *         repositories, set <code>Username</code> to the user name.</li> </ul>
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * This parameter depends on the repository type. <ul> <li>For Amazon S3
     * bundles, set <code>Username</code> to the appropriate IAM access key
     * ID.</li> <li>For HTTP bundles, Git repositories, and Subversion
     * repositories, set <code>Username</code> to the user name.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param username This parameter depends on the repository type. <ul> <li>For Amazon S3
     *         bundles, set <code>Username</code> to the appropriate IAM access key
     *         ID.</li> <li>For HTTP bundles, Git repositories, and Subversion
     *         repositories, set <code>Username</code> to the user name.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Source withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * When included in a request, the parameter depends on the repository
     * type. <ul> <li>For Amazon S3 bundles, set <code>Password</code> to the
     * appropriate IAM secret access key.</li> <li>For HTTP bundles and
     * Subversion repositories, set <code>Password</code> to the
     * password.</li> </ul> <p>For more information on how to safely handle
     * IAM credentials, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"/>.
     * <p>In responses, AWS OpsWorks returns <code>*****FILTERED*****</code>
     * instead of the actual value.
     *
     * @return When included in a request, the parameter depends on the repository
     *         type. <ul> <li>For Amazon S3 bundles, set <code>Password</code> to the
     *         appropriate IAM secret access key.</li> <li>For HTTP bundles and
     *         Subversion repositories, set <code>Password</code> to the
     *         password.</li> </ul> <p>For more information on how to safely handle
     *         IAM credentials, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"/>.
     *         <p>In responses, AWS OpsWorks returns <code>*****FILTERED*****</code>
     *         instead of the actual value.
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * When included in a request, the parameter depends on the repository
     * type. <ul> <li>For Amazon S3 bundles, set <code>Password</code> to the
     * appropriate IAM secret access key.</li> <li>For HTTP bundles and
     * Subversion repositories, set <code>Password</code> to the
     * password.</li> </ul> <p>For more information on how to safely handle
     * IAM credentials, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"/>.
     * <p>In responses, AWS OpsWorks returns <code>*****FILTERED*****</code>
     * instead of the actual value.
     *
     * @param password When included in a request, the parameter depends on the repository
     *         type. <ul> <li>For Amazon S3 bundles, set <code>Password</code> to the
     *         appropriate IAM secret access key.</li> <li>For HTTP bundles and
     *         Subversion repositories, set <code>Password</code> to the
     *         password.</li> </ul> <p>For more information on how to safely handle
     *         IAM credentials, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"/>.
     *         <p>In responses, AWS OpsWorks returns <code>*****FILTERED*****</code>
     *         instead of the actual value.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * When included in a request, the parameter depends on the repository
     * type. <ul> <li>For Amazon S3 bundles, set <code>Password</code> to the
     * appropriate IAM secret access key.</li> <li>For HTTP bundles and
     * Subversion repositories, set <code>Password</code> to the
     * password.</li> </ul> <p>For more information on how to safely handle
     * IAM credentials, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"/>.
     * <p>In responses, AWS OpsWorks returns <code>*****FILTERED*****</code>
     * instead of the actual value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param password When included in a request, the parameter depends on the repository
     *         type. <ul> <li>For Amazon S3 bundles, set <code>Password</code> to the
     *         appropriate IAM secret access key.</li> <li>For HTTP bundles and
     *         Subversion repositories, set <code>Password</code> to the
     *         password.</li> </ul> <p>For more information on how to safely handle
     *         IAM credentials, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"/>.
     *         <p>In responses, AWS OpsWorks returns <code>*****FILTERED*****</code>
     *         instead of the actual value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Source withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * In requests, the repository's SSH key. <p>In responses, AWS OpsWorks
     * returns <code>*****FILTERED*****</code> instead of the actual value.
     *
     * @return In requests, the repository's SSH key. <p>In responses, AWS OpsWorks
     *         returns <code>*****FILTERED*****</code> instead of the actual value.
     */
    public String getSshKey() {
        return sshKey;
    }
    
    /**
     * In requests, the repository's SSH key. <p>In responses, AWS OpsWorks
     * returns <code>*****FILTERED*****</code> instead of the actual value.
     *
     * @param sshKey In requests, the repository's SSH key. <p>In responses, AWS OpsWorks
     *         returns <code>*****FILTERED*****</code> instead of the actual value.
     */
    public void setSshKey(String sshKey) {
        this.sshKey = sshKey;
    }
    
    /**
     * In requests, the repository's SSH key. <p>In responses, AWS OpsWorks
     * returns <code>*****FILTERED*****</code> instead of the actual value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshKey In requests, the repository's SSH key. <p>In responses, AWS OpsWorks
     *         returns <code>*****FILTERED*****</code> instead of the actual value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Source withSshKey(String sshKey) {
        this.sshKey = sshKey;
        return this;
    }

    /**
     * The application's version. AWS OpsWorks enables you to easily deploy
     * new versions of an application. One of the simplest approaches is to
     * have branches or revisions in your repository that represent different
     * versions that can potentially be deployed.
     *
     * @return The application's version. AWS OpsWorks enables you to easily deploy
     *         new versions of an application. One of the simplest approaches is to
     *         have branches or revisions in your repository that represent different
     *         versions that can potentially be deployed.
     */
    public String getRevision() {
        return revision;
    }
    
    /**
     * The application's version. AWS OpsWorks enables you to easily deploy
     * new versions of an application. One of the simplest approaches is to
     * have branches or revisions in your repository that represent different
     * versions that can potentially be deployed.
     *
     * @param revision The application's version. AWS OpsWorks enables you to easily deploy
     *         new versions of an application. One of the simplest approaches is to
     *         have branches or revisions in your repository that represent different
     *         versions that can potentially be deployed.
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }
    
    /**
     * The application's version. AWS OpsWorks enables you to easily deploy
     * new versions of an application. One of the simplest approaches is to
     * have branches or revisions in your repository that represent different
     * versions that can potentially be deployed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param revision The application's version. AWS OpsWorks enables you to easily deploy
     *         new versions of an application. One of the simplest approaches is to
     *         have branches or revisions in your repository that represent different
     *         versions that can potentially be deployed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Source withRevision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getUrl() != null) sb.append("Url: " + getUrl() + ",");
        if (getUsername() != null) sb.append("Username: " + getUsername() + ",");
        if (getPassword() != null) sb.append("Password: " + getPassword() + ",");
        if (getSshKey() != null) sb.append("SshKey: " + getSshKey() + ",");
        if (getRevision() != null) sb.append("Revision: " + getRevision() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode()); 
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode()); 
        hashCode = prime * hashCode + ((getSshKey() == null) ? 0 : getSshKey().hashCode()); 
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Source == false) return false;
        Source other = (Source)obj;
        
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getUrl() == null ^ this.getUrl() == null) return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false) return false; 
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getPassword() == null ^ this.getPassword() == null) return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false) return false; 
        if (other.getSshKey() == null ^ this.getSshKey() == null) return false;
        if (other.getSshKey() != null && other.getSshKey().equals(this.getSshKey()) == false) return false; 
        if (other.getRevision() == null ^ this.getRevision() == null) return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false) return false; 
        return true;
    }
    
    @Override
    public Source clone() {
        try {
            return (Source) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    