package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amxo implements apak {
    UNKNOWN_RCS_TYPE(0),
    RCS_LEGACY(1),
    RCS_SMAPI(2),
    RCS_TACHYGRAM(3),
    NOT_RCS(4),
    RCS_SINGLE_REG(5),
    RCS_DUAL_REG(6);

    public final int h;

    amxo(int i2) {
        this.h = i2;
    }

    public static amxo b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_RCS_TYPE;
            case 1:
                return RCS_LEGACY;
            case 2:
                return RCS_SMAPI;
            case 3:
                return RCS_TACHYGRAM;
            case 4:
                return NOT_RCS;
            case 5:
                return RCS_SINGLE_REG;
            case 6:
                return RCS_DUAL_REG;
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
