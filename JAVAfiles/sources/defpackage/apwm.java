package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apwm implements apak {
    UNKNOWN(0),
    SUCCESS(1),
    FAILED_TO_DECRYPT(2),
    NOT_INTENDED_RECIPIENT(3),
    READ(4);

    public final int f;

    apwm(int i) {
        this.f = i;
    }

    public static apwm b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return READ;
                    }
                    return NOT_INTENDED_RECIPIENT;
                }
                return FAILED_TO_DECRYPT;
            }
            return SUCCESS;
        }
        return UNKNOWN;
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
