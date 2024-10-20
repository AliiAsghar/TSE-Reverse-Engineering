package com.google.communication.synapse.security.scytale;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class MessageEncryptorParamsBuilder {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends MessageEncryptorParamsBuilder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native MessageEncryptorParamsBuilder createBuilder();

        public static native void nativeDestroy(long j);

        private native MessageEncryptorParams native_build(long j);

        private native MessageEncryptorParamsBuilder native_setDbWrapperFactory(long j, DbWrapperFactory dbWrapperFactory);

        private native MessageEncryptorParamsBuilder native_setDisableReplayProtection(long j, boolean z);

        private native MessageEncryptorParamsBuilder native_setExperimentConfig(long j, ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);

        private native MessageEncryptorParamsBuilder native_setMyDeviceId(long j, String str);

        private native MessageEncryptorParamsBuilder native_setMyIdentityKey(long j, KeyPair keyPair);

        private native MessageEncryptorParamsBuilder native_setMyIds(long j, ArrayList<String> arrayList);

        private native MessageEncryptorParamsBuilder native_setRequireUserTrustedInfo(long j, boolean z);

        private native MessageEncryptorParamsBuilder native_setTableNamePrefix(long j, String str);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptorParamsBuilder
        public MessageEncryptorParams build() {
            return native_build(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptorParamsBuilder
        public MessageEncryptorParamsBuilder setDbWrapperFactory(DbWrapperFactory dbWrapperFactory) {
            return native_setDbWrapperFactory(this.nativeRef, dbWrapperFactory);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptorParamsBuilder
        public MessageEncryptorParamsBuilder setDisableReplayProtection(boolean z) {
            return native_setDisableReplayProtection(this.nativeRef, z);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptorParamsBuilder
        public MessageEncryptorParamsBuilder setExperimentConfig(ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig) {
            return native_setExperimentConfig(this.nativeRef, scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptorParamsBuilder
        public MessageEncryptorParamsBuilder setMyDeviceId(String str) {
            return native_setMyDeviceId(this.nativeRef, str);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptorParamsBuilder
        public MessageEncryptorParamsBuilder setMyIdentityKey(KeyPair keyPair) {
            return native_setMyIdentityKey(this.nativeRef, keyPair);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptorParamsBuilder
        public MessageEncryptorParamsBuilder setMyIds(ArrayList<String> arrayList) {
            return native_setMyIds(this.nativeRef, arrayList);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptorParamsBuilder
        public MessageEncryptorParamsBuilder setRequireUserTrustedInfo(boolean z) {
            return native_setRequireUserTrustedInfo(this.nativeRef, z);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptorParamsBuilder
        public MessageEncryptorParamsBuilder setTableNamePrefix(String str) {
            return native_setTableNamePrefix(this.nativeRef, str);
        }
    }

    public static MessageEncryptorParamsBuilder createBuilder() {
        return CppProxy.createBuilder();
    }

    public abstract MessageEncryptorParams build();

    public abstract MessageEncryptorParamsBuilder setDbWrapperFactory(DbWrapperFactory dbWrapperFactory);

    public abstract MessageEncryptorParamsBuilder setDisableReplayProtection(boolean z);

    public abstract MessageEncryptorParamsBuilder setExperimentConfig(ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);

    public abstract MessageEncryptorParamsBuilder setMyDeviceId(String str);

    public abstract MessageEncryptorParamsBuilder setMyIdentityKey(KeyPair keyPair);

    public abstract MessageEncryptorParamsBuilder setMyIds(ArrayList<String> arrayList);

    public abstract MessageEncryptorParamsBuilder setRequireUserTrustedInfo(boolean z);

    public abstract MessageEncryptorParamsBuilder setTableNamePrefix(String str);
}
