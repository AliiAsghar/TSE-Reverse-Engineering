package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum zmp implements apak {
    NONE(0),
    ARCHIVE(1),
    DELETE(2),
    MARK_AS_READ_OR_UNREAD(3);

    public final int e;

    zmp(int i) {
        this.e = i;
    }

    public static zmp b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return MARK_AS_READ_OR_UNREAD;
                }
                return DELETE;
            }
            return ARCHIVE;
        }
        return NONE;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
