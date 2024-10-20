package com.google.communication.synapse.security.scytale;

import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class PrekeyRpcInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends PrekeyRpcInterface {
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

        public static native void nativeDestroy(long j);

        private native StatusOr<ArrayList<PrekeyBundle>> native_getPrekeyBundlesBatch(long j, ArrayList<UserDevices> arrayList, int i, int i2);

        private native Status native_setPrekeys(long j, int i, ArrayList<Prekey> arrayList, Prekey prekey);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.communication.synapse.security.scytale.PrekeyRpcInterface
        public StatusOr<ArrayList<PrekeyBundle>> getPrekeyBundlesBatch(ArrayList<UserDevices> arrayList, int i, int i2) {
            return native_getPrekeyBundlesBatch(this.nativeRef, arrayList, i, i2);
        }

        @Override // com.google.communication.synapse.security.scytale.PrekeyRpcInterface
        public Status setPrekeys(int i, ArrayList<Prekey> arrayList, Prekey prekey) {
            return native_setPrekeys(this.nativeRef, i, arrayList, prekey);
        }
    }

    public abstract StatusOr<ArrayList<PrekeyBundle>> getPrekeyBundlesBatch(ArrayList<UserDevices> arrayList, int i, int i2);

    public abstract Status setPrekeys(int i, ArrayList<Prekey> arrayList, Prekey prekey);
}
