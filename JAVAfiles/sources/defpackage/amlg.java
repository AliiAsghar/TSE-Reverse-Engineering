package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amlg implements apak {
    UNDEFINED(0),
    XMS_MESSAGE_ON_RCS_GROUP(1),
    RECIPIENT_LOST_RCS(2),
    ATTACHMENT_FAILED_TO_SEND(3),
    MESSAGE_TO_NON_ENCRYPTED_RECIPIENT(4),
    RECIPIENT_DID_NOT_DECRYPT(5),
    ATTACHMENT_PROCESS_FAILED(6),
    APP_RESTART(7),
    EMERGENCY_NUMBER(8),
    CANCELED(9),
    SENDING_TIMEOUT(10),
    DELIVERY_TIMEOUT(11);

    public final int m;

    amlg(int i) {
        this.m = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
