package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apkl implements apak {
    GOOGLE_TOS_CONSENT_SOURCE_UNKNOWN(0),
    GOOGLE_TOS_UI(1),
    REVOKE_CONSENT_FROM_SETTINGS(2),
    LEGAL_FYI_SEEN(3),
    RCS_DEFAULT_ON_OOB_CONSENT(4);

    public final int f;

    apkl(int i) {
        this.f = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
