/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The image name from which a fleet is created.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The name of the fleet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The instance type of compute resources for the fleet. Fleet instances are launched from this instance type.
     * Available instance types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * </ul>
     */
    private String instanceType;
    /**
     * <p>
     * The parameters for the capacity allocated to the fleet.
     * </p>
     */
    private ComputeCapacity computeCapacity;
    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * The maximum time for which a streaming session can run. The input can be any numeric value in seconds between 600
     * and 57600.
     * </p>
     */
    private Integer maxUserDurationInSeconds;
    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. If a user who got disconnected
     * reconnects within this timeout interval, the user is connected back to their previous session. The input can be
     * any numeric value in seconds between 60 and 57600.
     * </p>
     */
    private Integer disconnectTimeoutInSeconds;
    /**
     * <p>
     * Delete the VPC association for the specified fleet.
     * </p>
     */
    @Deprecated
    private Boolean deleteVpcConfig;
    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * Enables or disables default internet access for the fleet.
     * </p>
     */
    private Boolean enableDefaultInternetAccess;
    /**
     * <p>
     * The <i>DirectoryName</i> and <i>OrganizationalUnitDistinguishedName</i> values, which are used to join domains
     * for the AppStream 2.0 streaming instances.
     * </p>
     */
    private DomainJoinInfo domainJoinInfo;
    /**
     * <p>
     * Fleet attributes to be deleted.
     * </p>
     */
    private java.util.List<String> attributesToDelete;

    /**
     * <p>
     * The image name from which a fleet is created.
     * </p>
     * 
     * @param imageName
     *        The image name from which a fleet is created.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The image name from which a fleet is created.
     * </p>
     * 
     * @return The image name from which a fleet is created.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The image name from which a fleet is created.
     * </p>
     * 
     * @param imageName
     *        The image name from which a fleet is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param name
     *        The name of the fleet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @return The name of the fleet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param name
     *        The name of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The instance type of compute resources for the fleet. Fleet instances are launched from this instance type.
     * Available instance types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        The instance type of compute resources for the fleet. Fleet instances are launched from this instance
     *        type. Available instance types are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        stream.standard.medium
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.standard.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.16xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-desktop.2xlarge
     *        </p>
     *        </li>
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of compute resources for the fleet. Fleet instances are launched from this instance type.
     * Available instance types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @return The instance type of compute resources for the fleet. Fleet instances are launched from this instance
     *         type. Available instance types are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         stream.standard.medium
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.standard.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.compute.8xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.large
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.2xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.memory.8xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-pro.4xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-pro.8xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-pro.16xlarge
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         stream.graphics-desktop.2xlarge
     *         </p>
     *         </li>
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of compute resources for the fleet. Fleet instances are launched from this instance type.
     * Available instance types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * stream.standard.medium
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.standard.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.compute.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.large
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.2xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.memory.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-pro.16xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * stream.graphics-desktop.2xlarge
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        The instance type of compute resources for the fleet. Fleet instances are launched from this instance
     *        type. Available instance types are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        stream.standard.medium
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.standard.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.compute.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.large
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.2xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.memory.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.4xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.8xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-pro.16xlarge
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        stream.graphics-desktop.2xlarge
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The parameters for the capacity allocated to the fleet.
     * </p>
     * 
     * @param computeCapacity
     *        The parameters for the capacity allocated to the fleet.
     */

    public void setComputeCapacity(ComputeCapacity computeCapacity) {
        this.computeCapacity = computeCapacity;
    }

    /**
     * <p>
     * The parameters for the capacity allocated to the fleet.
     * </p>
     * 
     * @return The parameters for the capacity allocated to the fleet.
     */

    public ComputeCapacity getComputeCapacity() {
        return this.computeCapacity;
    }

    /**
     * <p>
     * The parameters for the capacity allocated to the fleet.
     * </p>
     * 
     * @param computeCapacity
     *        The parameters for the capacity allocated to the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withComputeCapacity(ComputeCapacity computeCapacity) {
        setComputeCapacity(computeCapacity);
        return this;
    }

    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the fleet.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     * 
     * @return The VPC configuration for the fleet.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The maximum time for which a streaming session can run. The input can be any numeric value in seconds between 600
     * and 57600.
     * </p>
     * 
     * @param maxUserDurationInSeconds
     *        The maximum time for which a streaming session can run. The input can be any numeric value in seconds
     *        between 600 and 57600.
     */

    public void setMaxUserDurationInSeconds(Integer maxUserDurationInSeconds) {
        this.maxUserDurationInSeconds = maxUserDurationInSeconds;
    }

    /**
     * <p>
     * The maximum time for which a streaming session can run. The input can be any numeric value in seconds between 600
     * and 57600.
     * </p>
     * 
     * @return The maximum time for which a streaming session can run. The input can be any numeric value in seconds
     *         between 600 and 57600.
     */

    public Integer getMaxUserDurationInSeconds() {
        return this.maxUserDurationInSeconds;
    }

    /**
     * <p>
     * The maximum time for which a streaming session can run. The input can be any numeric value in seconds between 600
     * and 57600.
     * </p>
     * 
     * @param maxUserDurationInSeconds
     *        The maximum time for which a streaming session can run. The input can be any numeric value in seconds
     *        between 600 and 57600.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withMaxUserDurationInSeconds(Integer maxUserDurationInSeconds) {
        setMaxUserDurationInSeconds(maxUserDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. If a user who got disconnected
     * reconnects within this timeout interval, the user is connected back to their previous session. The input can be
     * any numeric value in seconds between 60 and 57600.
     * </p>
     * 
     * @param disconnectTimeoutInSeconds
     *        The time after disconnection when a session is considered to have ended. If a user who got disconnected
     *        reconnects within this timeout interval, the user is connected back to their previous session. The input
     *        can be any numeric value in seconds between 60 and 57600.
     */

    public void setDisconnectTimeoutInSeconds(Integer disconnectTimeoutInSeconds) {
        this.disconnectTimeoutInSeconds = disconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. If a user who got disconnected
     * reconnects within this timeout interval, the user is connected back to their previous session. The input can be
     * any numeric value in seconds between 60 and 57600.
     * </p>
     * 
     * @return The time after disconnection when a session is considered to have ended. If a user who got disconnected
     *         reconnects within this timeout interval, the user is connected back to their previous session. The input
     *         can be any numeric value in seconds between 60 and 57600.
     */

    public Integer getDisconnectTimeoutInSeconds() {
        return this.disconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. If a user who got disconnected
     * reconnects within this timeout interval, the user is connected back to their previous session. The input can be
     * any numeric value in seconds between 60 and 57600.
     * </p>
     * 
     * @param disconnectTimeoutInSeconds
     *        The time after disconnection when a session is considered to have ended. If a user who got disconnected
     *        reconnects within this timeout interval, the user is connected back to their previous session. The input
     *        can be any numeric value in seconds between 60 and 57600.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withDisconnectTimeoutInSeconds(Integer disconnectTimeoutInSeconds) {
        setDisconnectTimeoutInSeconds(disconnectTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * Delete the VPC association for the specified fleet.
     * </p>
     * 
     * @param deleteVpcConfig
     *        Delete the VPC association for the specified fleet.
     */
    @Deprecated
    public void setDeleteVpcConfig(Boolean deleteVpcConfig) {
        this.deleteVpcConfig = deleteVpcConfig;
    }

    /**
     * <p>
     * Delete the VPC association for the specified fleet.
     * </p>
     * 
     * @return Delete the VPC association for the specified fleet.
     */
    @Deprecated
    public Boolean getDeleteVpcConfig() {
        return this.deleteVpcConfig;
    }

    /**
     * <p>
     * Delete the VPC association for the specified fleet.
     * </p>
     * 
     * @param deleteVpcConfig
     *        Delete the VPC association for the specified fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateFleetRequest withDeleteVpcConfig(Boolean deleteVpcConfig) {
        setDeleteVpcConfig(deleteVpcConfig);
        return this;
    }

    /**
     * <p>
     * Delete the VPC association for the specified fleet.
     * </p>
     * 
     * @return Delete the VPC association for the specified fleet.
     */
    @Deprecated
    public Boolean isDeleteVpcConfig() {
        return this.deleteVpcConfig;
    }

    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param description
     *        The description displayed to end users on the AppStream 2.0 portal.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @return The description displayed to end users on the AppStream 2.0 portal.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param description
     *        The description displayed to end users on the AppStream 2.0 portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param displayName
     *        The name displayed to end users on the AppStream 2.0 portal.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @return The name displayed to end users on the AppStream 2.0 portal.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param displayName
     *        The name displayed to end users on the AppStream 2.0 portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the fleet.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the fleet.
     */

    public void setEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the fleet.
     * </p>
     * 
     * @return Enables or disables default internet access for the fleet.
     */

    public Boolean getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * Enables or disables default internet access for the fleet.
     * </p>
     * 
     * @param enableDefaultInternetAccess
     *        Enables or disables default internet access for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withEnableDefaultInternetAccess(Boolean enableDefaultInternetAccess) {
        setEnableDefaultInternetAccess(enableDefaultInternetAccess);
        return this;
    }

    /**
     * <p>
     * Enables or disables default internet access for the fleet.
     * </p>
     * 
     * @return Enables or disables default internet access for the fleet.
     */

    public Boolean isEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess;
    }

    /**
     * <p>
     * The <i>DirectoryName</i> and <i>OrganizationalUnitDistinguishedName</i> values, which are used to join domains
     * for the AppStream 2.0 streaming instances.
     * </p>
     * 
     * @param domainJoinInfo
     *        The <i>DirectoryName</i> and <i>OrganizationalUnitDistinguishedName</i> values, which are used to join
     *        domains for the AppStream 2.0 streaming instances.
     */

    public void setDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        this.domainJoinInfo = domainJoinInfo;
    }

    /**
     * <p>
     * The <i>DirectoryName</i> and <i>OrganizationalUnitDistinguishedName</i> values, which are used to join domains
     * for the AppStream 2.0 streaming instances.
     * </p>
     * 
     * @return The <i>DirectoryName</i> and <i>OrganizationalUnitDistinguishedName</i> values, which are used to join
     *         domains for the AppStream 2.0 streaming instances.
     */

    public DomainJoinInfo getDomainJoinInfo() {
        return this.domainJoinInfo;
    }

    /**
     * <p>
     * The <i>DirectoryName</i> and <i>OrganizationalUnitDistinguishedName</i> values, which are used to join domains
     * for the AppStream 2.0 streaming instances.
     * </p>
     * 
     * @param domainJoinInfo
     *        The <i>DirectoryName</i> and <i>OrganizationalUnitDistinguishedName</i> values, which are used to join
     *        domains for the AppStream 2.0 streaming instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetRequest withDomainJoinInfo(DomainJoinInfo domainJoinInfo) {
        setDomainJoinInfo(domainJoinInfo);
        return this;
    }

    /**
     * <p>
     * Fleet attributes to be deleted.
     * </p>
     * 
     * @return Fleet attributes to be deleted.
     * @see FleetAttribute
     */

    public java.util.List<String> getAttributesToDelete() {
        return attributesToDelete;
    }

    /**
     * <p>
     * Fleet attributes to be deleted.
     * </p>
     * 
     * @param attributesToDelete
     *        Fleet attributes to be deleted.
     * @see FleetAttribute
     */

    public void setAttributesToDelete(java.util.Collection<String> attributesToDelete) {
        if (attributesToDelete == null) {
            this.attributesToDelete = null;
            return;
        }

        this.attributesToDelete = new java.util.ArrayList<String>(attributesToDelete);
    }

    /**
     * <p>
     * Fleet attributes to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesToDelete(java.util.Collection)} or {@link #withAttributesToDelete(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param attributesToDelete
     *        Fleet attributes to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAttribute
     */

    public UpdateFleetRequest withAttributesToDelete(String... attributesToDelete) {
        if (this.attributesToDelete == null) {
            setAttributesToDelete(new java.util.ArrayList<String>(attributesToDelete.length));
        }
        for (String ele : attributesToDelete) {
            this.attributesToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Fleet attributes to be deleted.
     * </p>
     * 
     * @param attributesToDelete
     *        Fleet attributes to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAttribute
     */

    public UpdateFleetRequest withAttributesToDelete(java.util.Collection<String> attributesToDelete) {
        setAttributesToDelete(attributesToDelete);
        return this;
    }

    /**
     * <p>
     * Fleet attributes to be deleted.
     * </p>
     * 
     * @param attributesToDelete
     *        Fleet attributes to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAttribute
     */

    public UpdateFleetRequest withAttributesToDelete(FleetAttribute... attributesToDelete) {
        java.util.ArrayList<String> attributesToDeleteCopy = new java.util.ArrayList<String>(attributesToDelete.length);
        for (FleetAttribute value : attributesToDelete) {
            attributesToDeleteCopy.add(value.toString());
        }
        if (getAttributesToDelete() == null) {
            setAttributesToDelete(attributesToDeleteCopy);
        } else {
            getAttributesToDelete().addAll(attributesToDeleteCopy);
        }
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getComputeCapacity() != null)
            sb.append("ComputeCapacity: ").append(getComputeCapacity()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getMaxUserDurationInSeconds() != null)
            sb.append("MaxUserDurationInSeconds: ").append(getMaxUserDurationInSeconds()).append(",");
        if (getDisconnectTimeoutInSeconds() != null)
            sb.append("DisconnectTimeoutInSeconds: ").append(getDisconnectTimeoutInSeconds()).append(",");
        if (getDeleteVpcConfig() != null)
            sb.append("DeleteVpcConfig: ").append(getDeleteVpcConfig()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getEnableDefaultInternetAccess() != null)
            sb.append("EnableDefaultInternetAccess: ").append(getEnableDefaultInternetAccess()).append(",");
        if (getDomainJoinInfo() != null)
            sb.append("DomainJoinInfo: ").append(getDomainJoinInfo()).append(",");
        if (getAttributesToDelete() != null)
            sb.append("AttributesToDelete: ").append(getAttributesToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetRequest == false)
            return false;
        UpdateFleetRequest other = (UpdateFleetRequest) obj;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getComputeCapacity() == null ^ this.getComputeCapacity() == null)
            return false;
        if (other.getComputeCapacity() != null && other.getComputeCapacity().equals(this.getComputeCapacity()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getMaxUserDurationInSeconds() == null ^ this.getMaxUserDurationInSeconds() == null)
            return false;
        if (other.getMaxUserDurationInSeconds() != null && other.getMaxUserDurationInSeconds().equals(this.getMaxUserDurationInSeconds()) == false)
            return false;
        if (other.getDisconnectTimeoutInSeconds() == null ^ this.getDisconnectTimeoutInSeconds() == null)
            return false;
        if (other.getDisconnectTimeoutInSeconds() != null && other.getDisconnectTimeoutInSeconds().equals(this.getDisconnectTimeoutInSeconds()) == false)
            return false;
        if (other.getDeleteVpcConfig() == null ^ this.getDeleteVpcConfig() == null)
            return false;
        if (other.getDeleteVpcConfig() != null && other.getDeleteVpcConfig().equals(this.getDeleteVpcConfig()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getEnableDefaultInternetAccess() == null ^ this.getEnableDefaultInternetAccess() == null)
            return false;
        if (other.getEnableDefaultInternetAccess() != null && other.getEnableDefaultInternetAccess().equals(this.getEnableDefaultInternetAccess()) == false)
            return false;
        if (other.getDomainJoinInfo() == null ^ this.getDomainJoinInfo() == null)
            return false;
        if (other.getDomainJoinInfo() != null && other.getDomainJoinInfo().equals(this.getDomainJoinInfo()) == false)
            return false;
        if (other.getAttributesToDelete() == null ^ this.getAttributesToDelete() == null)
            return false;
        if (other.getAttributesToDelete() != null && other.getAttributesToDelete().equals(this.getAttributesToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getComputeCapacity() == null) ? 0 : getComputeCapacity().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getMaxUserDurationInSeconds() == null) ? 0 : getMaxUserDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDisconnectTimeoutInSeconds() == null) ? 0 : getDisconnectTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDeleteVpcConfig() == null) ? 0 : getDeleteVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getEnableDefaultInternetAccess() == null) ? 0 : getEnableDefaultInternetAccess().hashCode());
        hashCode = prime * hashCode + ((getDomainJoinInfo() == null) ? 0 : getDomainJoinInfo().hashCode());
        hashCode = prime * hashCode + ((getAttributesToDelete() == null) ? 0 : getAttributesToDelete().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetRequest clone() {
        return (UpdateFleetRequest) super.clone();
    }

}
