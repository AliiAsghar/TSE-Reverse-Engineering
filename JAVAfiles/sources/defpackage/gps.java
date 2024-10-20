package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gps {
    public static final gps b = new gpr(1.0f);
    public static final gps c = new gps("hinge");
    private final String a;

    public gps(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gps)) {
            return false;
        }
        return d.F(this.a, ((gps) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public gps() {
        this("hinge");
    }
}
