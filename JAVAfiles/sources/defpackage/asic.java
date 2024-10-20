package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum asic implements apak {
    UNKNOWN(0),
    CRONET(1);

    public final int c;

    asic(int i) {
        this.c = i;
    }

    public static asic b(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return CRONET;
        }
        return UNKNOWN;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
