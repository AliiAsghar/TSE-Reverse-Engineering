package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qic implements apak {
    UNSPECIFIED_STATUS(0),
    ENABLED(1),
    ENABLING(2),
    ENABLE_FAILED(3),
    DISABLED(4),
    DISABLING(5),
    DISABLE_FAILED(6);

    public final int h;

    qic(int i2) {
        this.h = i2;
    }

    public static qic b(int i2) {
        switch (i2) {
            case 0:
                return UNSPECIFIED_STATUS;
            case 1:
                return ENABLED;
            case 2:
                return ENABLING;
            case 3:
                return ENABLE_FAILED;
            case 4:
                return DISABLED;
            case 5:
                return DISABLING;
            case 6:
                return DISABLE_FAILED;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
