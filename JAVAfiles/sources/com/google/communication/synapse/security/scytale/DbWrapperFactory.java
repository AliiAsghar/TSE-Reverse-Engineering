package com.google.communication.synapse.security.scytale;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class DbWrapperFactory {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends DbWrapperFactory {
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

        private native DbWrapperInterface native_createDbWrapper(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.google.communication.synapse.security.scytale.DbWrapperFactory
        public DbWrapperInterface createDbWrapper() {
            return native_createDbWrapper(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public abstract DbWrapperInterface createDbWrapper();
}
