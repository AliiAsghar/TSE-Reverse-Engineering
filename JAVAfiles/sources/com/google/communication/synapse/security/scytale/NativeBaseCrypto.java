package com.google.communication.synapse.security.scytale;

import com.google.media.webrtc.common.StatusOr;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class NativeBaseCrypto {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends NativeBaseCrypto {
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

        public static native StatusOr<KeyPair> generateKeyPair();

        public static native int getProtocolVersion();

        public static native void nativeDestroy(long j);

        private native Status native_deleteMessageData(long j, Scope scope, String str);

        private native Status native_deleteOldOneTimeKeys(long j, Scope scope, long j2);

        private native StatusOr<TachyonCommon$PublicPreKeySets> native_generatePrekeySet(long j, Scope scope, int i);

        private native StatusOr<PrekeySet> native_generateScytalePrekeySet(long j, Scope scope, int i);

        private native StatusOr<Boolean> native_hasAnyGeneratedPrekeys(long j, Scope scope);

        public static native Status resetDataStore(Scope scope, DbWrapperFactory dbWrapperFactory, String str);

        public static native StatusOr<byte[]> signDataWithKey(byte[] bArr, byte[] bArr2);

        public static native StatusOr<Boolean> verifySignedDataWithKey(byte[] bArr, byte[] bArr2, byte[] bArr3);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.google.communication.synapse.security.scytale.NativeBaseCrypto
        public Status deleteMessageData(Scope scope, String str) {
            return native_deleteMessageData(this.nativeRef, scope, str);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeBaseCrypto
        public Status deleteOldOneTimeKeys(Scope scope, long j) {
            return native_deleteOldOneTimeKeys(this.nativeRef, scope, j);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.communication.synapse.security.scytale.NativeBaseCrypto
        public StatusOr<TachyonCommon$PublicPreKeySets> generatePrekeySet(Scope scope, int i) {
            return native_generatePrekeySet(this.nativeRef, scope, i);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeBaseCrypto
        public StatusOr<PrekeySet> generateScytalePrekeySet(Scope scope, int i) {
            return native_generateScytalePrekeySet(this.nativeRef, scope, i);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeBaseCrypto
        public StatusOr<Boolean> hasAnyGeneratedPrekeys(Scope scope) {
            return native_hasAnyGeneratedPrekeys(this.nativeRef, scope);
        }
    }

    public static StatusOr<KeyPair> generateKeyPair() {
        return CppProxy.generateKeyPair();
    }

    public static int getProtocolVersion() {
        return CppProxy.getProtocolVersion();
    }

    public static Status resetDataStore(Scope scope, DbWrapperFactory dbWrapperFactory, String str) {
        return CppProxy.resetDataStore(scope, dbWrapperFactory, str);
    }

    public static StatusOr<byte[]> signDataWithKey(byte[] bArr, byte[] bArr2) {
        return CppProxy.signDataWithKey(bArr, bArr2);
    }

    public static StatusOr<Boolean> verifySignedDataWithKey(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return CppProxy.verifySignedDataWithKey(bArr, bArr2, bArr3);
    }

    public abstract Status deleteMessageData(Scope scope, String str);

    public abstract Status deleteOldOneTimeKeys(Scope scope, long j);

    public abstract StatusOr<TachyonCommon$PublicPreKeySets> generatePrekeySet(Scope scope, int i);

    public abstract StatusOr<PrekeySet> generateScytalePrekeySet(Scope scope, int i);

    public abstract StatusOr<Boolean> hasAnyGeneratedPrekeys(Scope scope);
}
