package com.google.communication.synapse.security.scytale;

import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class NativeMessageEncryptorV2 {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    private static final class CppProxy extends NativeMessageEncryptorV2 {
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

        private native StatusOr<ArrayList<String>> native_checkMissingSessions(long j, Scope scope, ArrayList<String> arrayList);

        private native Status native_createSession(long j, Scope scope, ArrayList<PrekeyBundle> arrayList);

        private native StatusOr<DecryptResult> native_decrypt(long j, Scope scope, UserDevice userDevice, SenderTrustedInfo senderTrustedInfo, SecureMessage secureMessage, long j2);

        private native StatusOr<DecryptResult> native_decryptV2(long j, Scope scope, UserDevice userDevice, SenderTrustedInfo senderTrustedInfo, SecureMessage secureMessage, long j2, boolean z, boolean z2);

        private native StatusOr<byte[]> native_decryptWithOneTimeKey(long j, Scope scope, SecureMessage secureMessage, byte[] bArr, boolean z);

        private native Status native_deleteMessageOneTimeKey(long j, Scope scope, UserDevice userDevice, String str);

        private native Status native_deleteSession(long j, Scope scope, String str);

        private native StatusOr<EncryptResult> native_encrypt(long j, Scope scope, ArrayList<UserDevices> arrayList, boolean z, String str, boolean z2, PlaintextMessage plaintextMessage);

        private native StatusOr<EncryptResult> native_encryptV2(long j, Scope scope, ArrayList<UserDevices> arrayList, boolean z, String str, boolean z2, PlaintextMessage plaintextMessage, boolean z3, boolean z4);

        private native StatusOr<ConversationCode> native_getConversationCode(long j, Scope scope, String str, UserDevice userDevice);

        private native StatusOr<byte[]> native_getMessageOneTimeKey(long j, Scope scope, UserDevice userDevice, String str);

        private native StatusOr<HandleReceiptResult> native_handleReceipt(long j, Scope scope, UserDevice userDevice, ReceiptInfo receiptInfo);

        private native StatusOr<HandleReceiptResult> native_handleReceiptV2(long j, Scope scope, UserDevice userDevice, ReceiptInfo receiptInfo);

        private native StatusOr<RecreateFtdSessionResult> native_recreateFtdSession(long j, Scope scope, PrekeyBundle prekeyBundle, ReceiptInfo receiptInfo);

        private native Status native_setDeviceId(long j, Scope scope, String str);

        private native void native_setLocalUserIds(long j, ArrayList<String> arrayList);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public StatusOr<ArrayList<String>> checkMissingSessions(Scope scope, ArrayList<String> arrayList) {
            return native_checkMissingSessions(this.nativeRef, scope, arrayList);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public Status createSession(Scope scope, ArrayList<PrekeyBundle> arrayList) {
            return native_createSession(this.nativeRef, scope, arrayList);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public StatusOr<DecryptResult> decrypt(Scope scope, UserDevice userDevice, SenderTrustedInfo senderTrustedInfo, SecureMessage secureMessage, long j) {
            return native_decrypt(this.nativeRef, scope, userDevice, senderTrustedInfo, secureMessage, j);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public StatusOr<DecryptResult> decryptV2(Scope scope, UserDevice userDevice, SenderTrustedInfo senderTrustedInfo, SecureMessage secureMessage, long j, boolean z, boolean z2) {
            return native_decryptV2(this.nativeRef, scope, userDevice, senderTrustedInfo, secureMessage, j, z, z2);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public StatusOr<byte[]> decryptWithOneTimeKey(Scope scope, SecureMessage secureMessage, byte[] bArr, boolean z) {
            return native_decryptWithOneTimeKey(this.nativeRef, scope, secureMessage, bArr, z);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public Status deleteMessageOneTimeKey(Scope scope, UserDevice userDevice, String str) {
            return native_deleteMessageOneTimeKey(this.nativeRef, scope, userDevice, str);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public Status deleteSession(Scope scope, String str) {
            return native_deleteSession(this.nativeRef, scope, str);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public StatusOr<EncryptResult> encrypt(Scope scope, ArrayList<UserDevices> arrayList, boolean z, String str, boolean z2, PlaintextMessage plaintextMessage) {
            return native_encrypt(this.nativeRef, scope, arrayList, z, str, z2, plaintextMessage);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public StatusOr<EncryptResult> encryptV2(Scope scope, ArrayList<UserDevices> arrayList, boolean z, String str, boolean z2, PlaintextMessage plaintextMessage, boolean z3, boolean z4) {
            return native_encryptV2(this.nativeRef, scope, arrayList, z, str, z2, plaintextMessage, z3, z4);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public StatusOr<ConversationCode> getConversationCode(Scope scope, String str, UserDevice userDevice) {
            return native_getConversationCode(this.nativeRef, scope, str, userDevice);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public StatusOr<byte[]> getMessageOneTimeKey(Scope scope, UserDevice userDevice, String str) {
            return native_getMessageOneTimeKey(this.nativeRef, scope, userDevice, str);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public StatusOr<HandleReceiptResult> handleReceipt(Scope scope, UserDevice userDevice, ReceiptInfo receiptInfo) {
            return native_handleReceipt(this.nativeRef, scope, userDevice, receiptInfo);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public StatusOr<HandleReceiptResult> handleReceiptV2(Scope scope, UserDevice userDevice, ReceiptInfo receiptInfo) {
            return native_handleReceiptV2(this.nativeRef, scope, userDevice, receiptInfo);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public StatusOr<RecreateFtdSessionResult> recreateFtdSession(Scope scope, PrekeyBundle prekeyBundle, ReceiptInfo receiptInfo) {
            return native_recreateFtdSession(this.nativeRef, scope, prekeyBundle, receiptInfo);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public Status setDeviceId(Scope scope, String str) {
            return native_setDeviceId(this.nativeRef, scope, str);
        }

        @Override // com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2
        public void setLocalUserIds(ArrayList<String> arrayList) {
            native_setLocalUserIds(this.nativeRef, arrayList);
        }
    }

    public abstract StatusOr<ArrayList<String>> checkMissingSessions(Scope scope, ArrayList<String> arrayList);

    public abstract Status createSession(Scope scope, ArrayList<PrekeyBundle> arrayList);

    public abstract StatusOr<DecryptResult> decrypt(Scope scope, UserDevice userDevice, SenderTrustedInfo senderTrustedInfo, SecureMessage secureMessage, long j);

    public abstract StatusOr<DecryptResult> decryptV2(Scope scope, UserDevice userDevice, SenderTrustedInfo senderTrustedInfo, SecureMessage secureMessage, long j, boolean z, boolean z2);

    public abstract StatusOr<byte[]> decryptWithOneTimeKey(Scope scope, SecureMessage secureMessage, byte[] bArr, boolean z);

    public abstract Status deleteMessageOneTimeKey(Scope scope, UserDevice userDevice, String str);

    public abstract Status deleteSession(Scope scope, String str);

    public abstract StatusOr<EncryptResult> encrypt(Scope scope, ArrayList<UserDevices> arrayList, boolean z, String str, boolean z2, PlaintextMessage plaintextMessage);

    public abstract StatusOr<EncryptResult> encryptV2(Scope scope, ArrayList<UserDevices> arrayList, boolean z, String str, boolean z2, PlaintextMessage plaintextMessage, boolean z3, boolean z4);

    public abstract StatusOr<ConversationCode> getConversationCode(Scope scope, String str, UserDevice userDevice);

    public abstract StatusOr<byte[]> getMessageOneTimeKey(Scope scope, UserDevice userDevice, String str);

    public abstract StatusOr<HandleReceiptResult> handleReceipt(Scope scope, UserDevice userDevice, ReceiptInfo receiptInfo);

    public abstract StatusOr<HandleReceiptResult> handleReceiptV2(Scope scope, UserDevice userDevice, ReceiptInfo receiptInfo);

    public abstract StatusOr<RecreateFtdSessionResult> recreateFtdSession(Scope scope, PrekeyBundle prekeyBundle, ReceiptInfo receiptInfo);

    public abstract Status setDeviceId(Scope scope, String str);

    public abstract void setLocalUserIds(ArrayList<String> arrayList);
}
