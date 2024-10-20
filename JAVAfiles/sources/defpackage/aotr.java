package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aotr implements apak {
    TYPE_UNKNOWN(0),
    TYPE_RULE(1),
    TYPE_MODEL(2),
    TYPE_PRIVATE_HASH_SET(3),
    TYPE_BLM_BLOCK_LIST(4),
    UNRECOGNIZED(-1);

    private final int h;

    aotr(int i) {
        this.h = i;
    }

    public static aotr b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return TYPE_BLM_BLOCK_LIST;
                    }
                    return TYPE_PRIVATE_HASH_SET;
                }
                return TYPE_MODEL;
            }
            return TYPE_RULE;
        }
        return TYPE_UNKNOWN;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
