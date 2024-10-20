package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aphx implements apak {
    AUTHENTICATION_TYPE_UNKNOWN(0),
    AUTHENTICATION_TYPE_NONE(1),
    AUTHENTICATION_TYPE_BASIC(2),
    AUTHENTICATION_TYPE_DIGEST(3),
    AUTHENTICATION_TYPE_GBA(4);

    public final int f;

    aphx(int i) {
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
