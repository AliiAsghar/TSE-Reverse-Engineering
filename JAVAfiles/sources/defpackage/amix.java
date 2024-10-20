package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amix implements apak {
    LINK_ENTITY_TYPE_UNSET(0),
    UNKNOWN(1),
    WEB_URL(2),
    PHONE_NUMBER(3),
    EMAIL_ADDRESS(4);

    public final int f;

    amix(int i) {
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
