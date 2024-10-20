package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amhc implements apak {
    UNKNOWN_NOTIFICATION(0),
    INCOMING_MSG_NOTIFICATION(1),
    AUTOMOVED_SPAM_NOTIFICATION(2),
    DATA_DONATION_NOTIFICATION(3);

    public final int e;

    amhc(int i) {
        this.e = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
