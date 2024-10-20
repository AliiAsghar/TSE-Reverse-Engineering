package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum lwz implements apak {
    UNDEFINED(0),
    TEST(1),
    D2D(2);

    public final int d;

    lwz(int i) {
        this.d = i;
    }

    public static lwz b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return D2D;
            }
            return TEST;
        }
        return UNDEFINED;
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
