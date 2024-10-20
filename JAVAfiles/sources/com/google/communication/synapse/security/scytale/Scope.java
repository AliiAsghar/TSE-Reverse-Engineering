package com.google.communication.synapse.security.scytale;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class Scope {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends Scope {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native Scope create(EventPublisher eventPublisher);

        public static native void nativeDestroy(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public static Scope create(EventPublisher eventPublisher) {
        return CppProxy.create(eventPublisher);
    }
}
