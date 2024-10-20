package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apkk implements apak {
    CONSENT_REASON_UNKNOWN(0),
    SEAMLESS_AUTHORIZED_PROVISIONING_ALLOWED(1),
    IMEI_PII_FORMAT_NONE(2),
    IMEI_PII_FORMAT_SHORT(3),
    IMEI_PII_FORMAT_IGNORED(4),
    IMSI_PII_FORMAT_NONE(5),
    IMSI_PII_FORMAT_SHORT(6),
    IMSI_PII_FORMAT_IGNORED(7),
    CONSENT_ALREADY_GRANTED(8),
    HE_REQUEST_SUCCESSFUL(9),
    GOOGLE_TOS_DISABLED(10),
    RCS_DEFAULT_ON_ALREADY_SEEN(11);

    public final int m;

    apkk(int i) {
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
