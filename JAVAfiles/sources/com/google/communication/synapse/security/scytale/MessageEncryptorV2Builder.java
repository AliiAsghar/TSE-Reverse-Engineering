package com.google.communication.synapse.security.scytale;

import com.google.media.webrtc.common.StatusOr;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class MessageEncryptorV2Builder {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends MessageEncryptorV2Builder {
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

        public static native MessageEncryptorV2Builder createBuilder(NativeBaseCrypto nativeBaseCrypto, ArrayList<String> arrayList, String str);

        public static native void nativeDestroy(long j);

        private native StatusOr<NativeMessageEncryptorV2> native_build(long j, Scope scope);

        private native MessageEncryptorV2Builder native_setRequireUserTrustedInfo(long j, boolean z);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptorV2Builder
        public StatusOr<NativeMessageEncryptorV2> build(Scope scope) {
            return native_build(this.nativeRef, scope);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptorV2Builder
        public MessageEncryptorV2Builder setRequireUserTrustedInfo(boolean z) {
            return native_setRequireUserTrustedInfo(this.nativeRef, z);
        }
    }

    public static MessageEncryptorV2Builder createBuilder(NativeBaseCrypto nativeBaseCrypto, ArrayList<String> arrayList, String str) {
        return CppProxy.createBuilder(nativeBaseCrypto, arrayList, str);
    }

    public abstract StatusOr<NativeMessageEncryptorV2> build(Scope scope);

    public abstract MessageEncryptorV2Builder setRequireUserTrustedInfo(boolean z);
}
