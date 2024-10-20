package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amkj implements apak {
    UNKNOWN_PROVISIONING_STATE(0),
    PROVISIONED(1),
    NOT_PROVISIONED(2),
    DISABLED(3),
    NOT_PROVISIONED_BUT_INITIALIZED(4);

    public final int f;

    amkj(int i) {
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
