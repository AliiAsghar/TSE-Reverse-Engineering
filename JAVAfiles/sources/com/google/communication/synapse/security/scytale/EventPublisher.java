package com.google.communication.synapse.security.scytale;

import com.google.scytale.logging.ScytaleLoggingProto$ScytaleEvent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class EventPublisher {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends EventPublisher {
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

        private native void native_onScytaleEvent(long j, ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.communication.synapse.security.scytale.EventPublisher
        public void onScytaleEvent(ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent) {
            native_onScytaleEvent(this.nativeRef, scytaleLoggingProto$ScytaleEvent);
        }
    }

    public abstract void onScytaleEvent(ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent);
}
