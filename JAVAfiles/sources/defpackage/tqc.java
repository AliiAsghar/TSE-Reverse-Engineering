package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum tqc {
    UNARCHIVED(0),
    ARCHIVED(1),
    KEEP_ARCHIVED(2),
    SPAM_FOLDER(3),
    BLOCKED_FOLDER(4),
    CROSS_COUNTRY_FOLDER(5);

    public static final Set g = alpt.s(SPAM_FOLDER, BLOCKED_FOLDER, CROSS_COUNTRY_FOLDER);
    public final int h;

    tqc(int i2) {
        this.h = i2;
    }

    public static tqc a(int i2) {
        for (tqc tqcVar : values()) {
            if (tqcVar.h == i2) {
                return tqcVar;
            }
        }
        throw new IllegalArgumentException(a.bV(i2, "Invalid ArchiveStatus value: "));
    }

    public static tqc b(boolean z) {
        if (z) {
            return ARCHIVED;
        }
        return UNARCHIVED;
    }

    public static int i(tqc tqcVar) {
        if (tqcVar != null) {
            int ordinal = tqcVar.ordinal();
            if (ordinal == 0) {
                return 2;
            }
            if (ordinal == 1) {
                return 3;
            }
            if (ordinal == 2) {
                return 4;
            }
            if (ordinal == 3) {
                return 5;
            }
            if (ordinal != 4) {
                if (ordinal == 5) {
                    return 7;
                }
            } else {
                return 6;
            }
        }
        return 1;
    }

    public final boolean d() {
        if (this != UNARCHIVED) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this == BLOCKED_FOLDER) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return g.contains(this);
    }

    public final boolean g() {
        if (this == SPAM_FOLDER) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.h >= KEEP_ARCHIVED.h) {
            return true;
        }
        return false;
    }
}
