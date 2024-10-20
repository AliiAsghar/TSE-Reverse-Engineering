package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epz {
    public static final epz a = new epz();
    private efu b;

    static {
        eul.M(0);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
    }

    public final efu a() {
        if (this.b == null) {
            this.b = new efu((byte[]) null, (byte[]) null, (byte[]) null);
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 486696559;
    }
}
