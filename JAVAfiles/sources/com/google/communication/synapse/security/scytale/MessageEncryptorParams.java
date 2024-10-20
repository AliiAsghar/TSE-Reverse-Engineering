package com.google.communication.synapse.security.scytale;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MessageEncryptorParams {
    final DbWrapperFactory dbWrapperFactory;
    final boolean disableReplayProtection;
    final ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig experimentConfig;
    final String myDeviceId;
    final KeyPair myIdentityKey;
    final ArrayList<String> myIds;
    final boolean requireUserTrustedInfo;
    final String tableNamePrefix;

    public MessageEncryptorParams(ArrayList<String> arrayList, String str, KeyPair keyPair, DbWrapperFactory dbWrapperFactory, boolean z, String str2, boolean z2, ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig) {
        this.myIds = arrayList;
        this.myDeviceId = str;
        this.myIdentityKey = keyPair;
        this.dbWrapperFactory = dbWrapperFactory;
        this.disableReplayProtection = z;
        this.tableNamePrefix = str2;
        this.requireUserTrustedInfo = z2;
        this.experimentConfig = scytaleExperimentConfigOuterClass$ScytaleExperimentConfig;
    }

    public DbWrapperFactory getDbWrapperFactory() {
        return this.dbWrapperFactory;
    }

    public boolean getDisableReplayProtection() {
        return this.disableReplayProtection;
    }

    public ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig getExperimentConfig() {
        return this.experimentConfig;
    }

    public String getMyDeviceId() {
        return this.myDeviceId;
    }

    public KeyPair getMyIdentityKey() {
        return this.myIdentityKey;
    }

    public ArrayList<String> getMyIds() {
        return this.myIds;
    }

    public boolean getRequireUserTrustedInfo() {
        return this.requireUserTrustedInfo;
    }

    public String getTableNamePrefix() {
        return this.tableNamePrefix;
    }

    public String toString() {
        ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig = this.experimentConfig;
        DbWrapperFactory dbWrapperFactory = this.dbWrapperFactory;
        KeyPair keyPair = this.myIdentityKey;
        return "MessageEncryptorParams{myIds=" + String.valueOf(this.myIds) + ",myDeviceId=" + this.myDeviceId + ",myIdentityKey=" + String.valueOf(keyPair) + ",dbWrapperFactory=" + String.valueOf(dbWrapperFactory) + ",disableReplayProtection=" + this.disableReplayProtection + ",tableNamePrefix=" + this.tableNamePrefix + ",requireUserTrustedInfo=" + this.requireUserTrustedInfo + ",experimentConfig=" + String.valueOf(scytaleExperimentConfigOuterClass$ScytaleExperimentConfig) + "}";
    }
}
