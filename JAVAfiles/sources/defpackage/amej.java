package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amej implements apak {
    BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_UNKNOWN(0),
    BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_NOT_REQUIRED(1),
    BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_CONSENTED(2),
    BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_REJECTED(3);

    public final int e;

    amej(int i) {
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
