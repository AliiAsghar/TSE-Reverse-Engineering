package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afkf {
    public final boolean a;

    public afkf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afkf) && this.a == ((afkf) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.a);
    }

    public final String toString() {
        return "TracingConfiguration(isEnabled=" + this.a + ")";
    }

    public afkf() {
        this(true);
    }
}
