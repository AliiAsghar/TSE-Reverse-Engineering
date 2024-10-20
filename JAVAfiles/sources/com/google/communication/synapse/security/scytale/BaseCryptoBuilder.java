package com.google.communication.synapse.security.scytale;

import com.google.media.webrtc.common.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class BaseCryptoBuilder {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends BaseCryptoBuilder {
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

        public static native BaseCryptoBuilder createBuilder(DbWrapperFactory dbWrapperFactory, KeyPair keyPair);

        public static native void nativeDestroy(long j);

        private native StatusOr<NativeBaseCrypto> native_build(long j, Scope scope);

        private native BaseCryptoBuilder native_setExperimentConfig(long j, ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);

        private native BaseCryptoBuilder native_setTableNamePrefix(long j, String str);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.google.communication.synapse.security.scytale.BaseCryptoBuilder
        public StatusOr<NativeBaseCrypto> build(Scope scope) {
            return native_build(this.nativeRef, scope);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.communication.synapse.security.scytale.BaseCryptoBuilder
        public BaseCryptoBuilder setExperimentConfig(ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig) {
            return native_setExperimentConfig(this.nativeRef, scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);
        }

        @Override // com.google.communication.synapse.security.scytale.BaseCryptoBuilder
        public BaseCryptoBuilder setTableNamePrefix(String str) {
            return native_setTableNamePrefix(this.nativeRef, str);
        }
    }

    public static BaseCryptoBuilder createBuilder(DbWrapperFactory dbWrapperFactory, KeyPair keyPair) {
        return CppProxy.createBuilder(dbWrapperFactory, keyPair);
    }

    public abstract StatusOr<NativeBaseCrypto> build(Scope scope);

    public abstract BaseCryptoBuilder setExperimentConfig(ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig scytaleExperimentConfigOuterClass$ScytaleExperimentConfig);

    public abstract BaseCryptoBuilder setTableNamePrefix(String str);
}
