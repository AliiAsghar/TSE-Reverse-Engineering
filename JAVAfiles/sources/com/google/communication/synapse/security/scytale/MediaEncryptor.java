package com.google.communication.synapse.security.scytale;

import com.google.media.webrtc.common.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class MediaEncryptor {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends MediaEncryptor {
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

        public static native StatusOr<MediaEncryptor> createDecryptorInstance(MediaDecryptionParams mediaDecryptionParams);

        public static native StatusOr<MediaEncryptor> createEncryptorInstance();

        public static native int getBlockSize();

        public static native void nativeDestroy(long j);

        private native StatusOr<byte[]> native_decrypt(long j, byte[] bArr, boolean z);

        private native StatusOr<byte[]> native_encrypt(long j, byte[] bArr, boolean z);

        private native byte[] native_getDigest(long j);

        private native byte[] native_getKeyMaterial(long j);

        private native int native_getVersion(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.google.communication.synapse.security.scytale.MediaEncryptor
        public StatusOr<byte[]> decrypt(byte[] bArr, boolean z) {
            return native_decrypt(this.nativeRef, bArr, z);
        }

        @Override // com.google.communication.synapse.security.scytale.MediaEncryptor
        public StatusOr<byte[]> encrypt(byte[] bArr, boolean z) {
            return native_encrypt(this.nativeRef, bArr, z);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.communication.synapse.security.scytale.MediaEncryptor
        public byte[] getDigest() {
            return native_getDigest(this.nativeRef);
        }

        @Override // com.google.communication.synapse.security.scytale.MediaEncryptor
        public byte[] getKeyMaterial() {
            return native_getKeyMaterial(this.nativeRef);
        }

        @Override // com.google.communication.synapse.security.scytale.MediaEncryptor
        public int getVersion() {
            return native_getVersion(this.nativeRef);
        }
    }

    public static StatusOr<MediaEncryptor> createDecryptorInstance(MediaDecryptionParams mediaDecryptionParams) {
        return CppProxy.createDecryptorInstance(mediaDecryptionParams);
    }

    public static StatusOr<MediaEncryptor> createEncryptorInstance() {
        return CppProxy.createEncryptorInstance();
    }

    public static int getBlockSize() {
        return CppProxy.getBlockSize();
    }

    public abstract StatusOr<byte[]> decrypt(byte[] bArr, boolean z);

    public abstract StatusOr<byte[]> encrypt(byte[] bArr, boolean z);

    public abstract byte[] getDigest();

    public abstract byte[] getKeyMaterial();

    public abstract int getVersion();
}
