package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apjp implements apak {
    NOT_SET(0),
    TRUE(1),
    FALSE(2);

    public final int d;

    apjp(int i) {
        this.d = i;
    }

    public static apjp b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return FALSE;
            }
            return TRUE;
        }
        return NOT_SET;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
