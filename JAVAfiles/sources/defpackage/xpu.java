package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum xpu implements apak {
    FILE(0),
    THUMBNAIL(1);

    public final int c;

    xpu(int i) {
        this.c = i;
    }

    public static xpu b(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return THUMBNAIL;
        }
        return FILE;
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
