package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amkb implements apak {
    UNKNOWN(0),
    SENDERS_IDENTITY_INCORRECT(1),
    IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED(2),
    SENDERS_USER_ID_INCORRECT(3),
    TACHYON_DOWNLOAD_FAILED(4),
    OTHER_EXCEPTION(5),
    SUCCESS(6),
    SENDERS_USER_ID_EMPTY(7);

    public final int i;

    amkb(int i) {
        this.i = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
