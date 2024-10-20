package com.google.communication.synapse.security.scytale;

import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class DbWrapperInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends DbWrapperInterface {
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

        private native void native_close(long j);

        private native Status native_execute(long j, String str);

        private native Status native_open(long j, EventPublisher eventPublisher, String str);

        private native StatusOr<SqlStatementInterface> native_prepare(long j, String str);

        private native StatusOr<WriteOnlySqlStatementInterface> native_prepareWriteOnly(long j, String str);

        private native StatusOr<SqlTransactionInterface> native_startTransaction(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
        public void close() {
            native_close(this.nativeRef);
        }

        @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
        public Status execute(String str) {
            return native_execute(this.nativeRef, str);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
        public Status open(EventPublisher eventPublisher, String str) {
            return native_open(this.nativeRef, eventPublisher, str);
        }

        @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
        public StatusOr<SqlStatementInterface> prepare(String str) {
            return native_prepare(this.nativeRef, str);
        }

        @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
        public StatusOr<WriteOnlySqlStatementInterface> prepareWriteOnly(String str) {
            return native_prepareWriteOnly(this.nativeRef, str);
        }

        @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
        public StatusOr<SqlTransactionInterface> startTransaction() {
            return native_startTransaction(this.nativeRef);
        }
    }

    public abstract void close();

    public abstract Status execute(String str);

    public abstract Status open(EventPublisher eventPublisher, String str);

    public abstract StatusOr<SqlStatementInterface> prepare(String str);

    public abstract StatusOr<WriteOnlySqlStatementInterface> prepareWriteOnly(String str);

    public abstract StatusOr<SqlTransactionInterface> startTransaction();
}
