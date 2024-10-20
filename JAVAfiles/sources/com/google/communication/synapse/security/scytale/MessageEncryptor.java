package com.google.communication.synapse.security.scytale;

import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class MessageEncryptor {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends MessageEncryptor {
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

        public static native StatusOr<MessageEncryptor> createInstance(EventPublisher eventPublisher, MessageEncryptorParams messageEncryptorParams);

        public static native StatusOr<PrekeySet> generateAndStorePrekeySet(EventPublisher eventPublisher, int i, KeyPair keyPair, DbWrapperFactory dbWrapperFactory, String str);

        public static native StatusOr<KeyPair> generateKeyPair();

        public static native int getProtocolVersion();

        public static native void nativeDestroy(long j);

        private native StatusOr<ArrayList<UserDevices>> native_checkMissingSessions(long j, EventPublisher eventPublisher, ArrayList<UserDevices> arrayList);

        private native StatusOr<DecryptionResult> native_decrypt(long j, EventPublisher eventPublisher, String str, String str2, SecureMessage secureMessage, SenderTrustedInfo senderTrustedInfo);

        private native StatusOr<byte[]> native_encrypt(long j, EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, ArrayList<UserDevices> arrayList, String str, String str2, boolean z, boolean z2, byte[] bArr);

        private native StatusOr<SecureMessage> native_encryptLegacy(long j, EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, UserDevices userDevices, boolean z, byte[] bArr);

        private native StatusOr<PrekeySet> native_generateNewPrekeySet(long j, EventPublisher eventPublisher, int i);

        private native Status native_generateNewPrekeys(long j, EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, int i);

        private native StatusOr<Boolean> native_hasSessions(long j, EventPublisher eventPublisher, ArrayList<UserDevices> arrayList);

        private native StatusOr<Boolean> native_processDeliverReceipt(long j, EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, String str, String str2, ReceiptInfo receiptInfo);

        private native Status native_removeSession(long j, EventPublisher eventPublisher, String str, String str2);

        private native Status native_setDeviceId(long j, EventPublisher eventPublisher, String str);

        private native void native_setMyIds(long j, ArrayList<String> arrayList);

        private native Status native_setupSessionsIfNeeded(long j, EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, ArrayList<UserDevices> arrayList);

        private native boolean native_shouldSendFtdReceipt(long j, EventPublisher eventPublisher, Status status, SecureMessage secureMessage);

        private native StatusOr<byte[]> native_signData(long j, EventPublisher eventPublisher, byte[] bArr);

        private native StatusOr<byte[]> native_signReceipt(long j, EventPublisher eventPublisher, ReceiptInfo receiptInfo, byte[] bArr);

        private native StatusOr<Boolean> native_verifyMessageReferencedByFtdWasSent(long j, EventPublisher eventPublisher, ReceiptInfo receiptInfo, String str, String str2);

        public static native Status resetDataStore(EventPublisher eventPublisher, DbWrapperFactory dbWrapperFactory, String str);

        public static native StatusOr<byte[]> signDataWithKey(byte[] bArr, byte[] bArr2);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public StatusOr<ArrayList<UserDevices>> checkMissingSessions(EventPublisher eventPublisher, ArrayList<UserDevices> arrayList) {
            return native_checkMissingSessions(this.nativeRef, eventPublisher, arrayList);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public StatusOr<DecryptionResult> decrypt(EventPublisher eventPublisher, String str, String str2, SecureMessage secureMessage, SenderTrustedInfo senderTrustedInfo) {
            return native_decrypt(this.nativeRef, eventPublisher, str, str2, secureMessage, senderTrustedInfo);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public StatusOr<byte[]> encrypt(EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, ArrayList<UserDevices> arrayList, String str, String str2, boolean z, boolean z2, byte[] bArr) {
            return native_encrypt(this.nativeRef, eventPublisher, prekeyRpcInterface, arrayList, str, str2, z, z2, bArr);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public StatusOr<SecureMessage> encryptLegacy(EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, UserDevices userDevices, boolean z, byte[] bArr) {
            return native_encryptLegacy(this.nativeRef, eventPublisher, prekeyRpcInterface, userDevices, z, bArr);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public StatusOr<PrekeySet> generateNewPrekeySet(EventPublisher eventPublisher, int i) {
            return native_generateNewPrekeySet(this.nativeRef, eventPublisher, i);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public Status generateNewPrekeys(EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, int i) {
            return native_generateNewPrekeys(this.nativeRef, eventPublisher, prekeyRpcInterface, i);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public StatusOr<Boolean> hasSessions(EventPublisher eventPublisher, ArrayList<UserDevices> arrayList) {
            return native_hasSessions(this.nativeRef, eventPublisher, arrayList);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public StatusOr<Boolean> processDeliverReceipt(EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, String str, String str2, ReceiptInfo receiptInfo) {
            return native_processDeliverReceipt(this.nativeRef, eventPublisher, prekeyRpcInterface, str, str2, receiptInfo);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public Status removeSession(EventPublisher eventPublisher, String str, String str2) {
            return native_removeSession(this.nativeRef, eventPublisher, str, str2);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public Status setDeviceId(EventPublisher eventPublisher, String str) {
            return native_setDeviceId(this.nativeRef, eventPublisher, str);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public void setMyIds(ArrayList<String> arrayList) {
            native_setMyIds(this.nativeRef, arrayList);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public Status setupSessionsIfNeeded(EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, ArrayList<UserDevices> arrayList) {
            return native_setupSessionsIfNeeded(this.nativeRef, eventPublisher, prekeyRpcInterface, arrayList);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public boolean shouldSendFtdReceipt(EventPublisher eventPublisher, Status status, SecureMessage secureMessage) {
            return native_shouldSendFtdReceipt(this.nativeRef, eventPublisher, status, secureMessage);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public StatusOr<byte[]> signData(EventPublisher eventPublisher, byte[] bArr) {
            return native_signData(this.nativeRef, eventPublisher, bArr);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public StatusOr<byte[]> signReceipt(EventPublisher eventPublisher, ReceiptInfo receiptInfo, byte[] bArr) {
            return native_signReceipt(this.nativeRef, eventPublisher, receiptInfo, bArr);
        }

        @Override // com.google.communication.synapse.security.scytale.MessageEncryptor
        public StatusOr<Boolean> verifyMessageReferencedByFtdWasSent(EventPublisher eventPublisher, ReceiptInfo receiptInfo, String str, String str2) {
            return native_verifyMessageReferencedByFtdWasSent(this.nativeRef, eventPublisher, receiptInfo, str, str2);
        }
    }

    public static StatusOr<MessageEncryptor> createInstance(EventPublisher eventPublisher, MessageEncryptorParams messageEncryptorParams) {
        return CppProxy.createInstance(eventPublisher, messageEncryptorParams);
    }

    public static StatusOr<PrekeySet> generateAndStorePrekeySet(EventPublisher eventPublisher, int i, KeyPair keyPair, DbWrapperFactory dbWrapperFactory, String str) {
        return CppProxy.generateAndStorePrekeySet(eventPublisher, i, keyPair, dbWrapperFactory, str);
    }

    public static StatusOr<KeyPair> generateKeyPair() {
        return CppProxy.generateKeyPair();
    }

    public static int getProtocolVersion() {
        return CppProxy.getProtocolVersion();
    }

    public static Status resetDataStore(EventPublisher eventPublisher, DbWrapperFactory dbWrapperFactory, String str) {
        return CppProxy.resetDataStore(eventPublisher, dbWrapperFactory, str);
    }

    public static StatusOr<byte[]> signDataWithKey(byte[] bArr, byte[] bArr2) {
        return CppProxy.signDataWithKey(bArr, bArr2);
    }

    public abstract StatusOr<ArrayList<UserDevices>> checkMissingSessions(EventPublisher eventPublisher, ArrayList<UserDevices> arrayList);

    public abstract StatusOr<DecryptionResult> decrypt(EventPublisher eventPublisher, String str, String str2, SecureMessage secureMessage, SenderTrustedInfo senderTrustedInfo);

    public abstract StatusOr<byte[]> encrypt(EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, ArrayList<UserDevices> arrayList, String str, String str2, boolean z, boolean z2, byte[] bArr);

    public abstract StatusOr<SecureMessage> encryptLegacy(EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, UserDevices userDevices, boolean z, byte[] bArr);

    public abstract StatusOr<PrekeySet> generateNewPrekeySet(EventPublisher eventPublisher, int i);

    public abstract Status generateNewPrekeys(EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, int i);

    public abstract StatusOr<Boolean> hasSessions(EventPublisher eventPublisher, ArrayList<UserDevices> arrayList);

    public abstract StatusOr<Boolean> processDeliverReceipt(EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, String str, String str2, ReceiptInfo receiptInfo);

    public abstract Status removeSession(EventPublisher eventPublisher, String str, String str2);

    public abstract Status setDeviceId(EventPublisher eventPublisher, String str);

    public abstract void setMyIds(ArrayList<String> arrayList);

    public abstract Status setupSessionsIfNeeded(EventPublisher eventPublisher, PrekeyRpcInterface prekeyRpcInterface, ArrayList<UserDevices> arrayList);

    public abstract boolean shouldSendFtdReceipt(EventPublisher eventPublisher, Status status, SecureMessage secureMessage);

    public abstract StatusOr<byte[]> signData(EventPublisher eventPublisher, byte[] bArr);

    public abstract StatusOr<byte[]> signReceipt(EventPublisher eventPublisher, ReceiptInfo receiptInfo, byte[] bArr);

    public abstract StatusOr<Boolean> verifyMessageReferencedByFtdWasSent(EventPublisher eventPublisher, ReceiptInfo receiptInfo, String str, String str2);
}
