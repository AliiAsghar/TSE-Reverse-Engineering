package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wbr implements apak {
    ERROR_CODE_UNKNOWN(0),
    ERROR_CODE_OK(1),
    ERROR_CODE_ERROR(2);

    public final int d;

    wbr(int i) {
        this.d = i;
    }

    public static wbr b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return ERROR_CODE_ERROR;
            }
            return ERROR_CODE_OK;
        }
        return ERROR_CODE_UNKNOWN;
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
