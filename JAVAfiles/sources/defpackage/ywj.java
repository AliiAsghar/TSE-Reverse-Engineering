package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywj {
    private final int a;

    public ywj(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ywj) && this.a == ((ywj) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.bm(i);
        return i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PairedWatchNode(connectionStatus=");
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                str = "UNKNOWN";
            } else {
                str = "OFFLINE";
            }
        } else {
            str = "ONLINE";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }

    public ywj() {
        this(3);
    }
}
