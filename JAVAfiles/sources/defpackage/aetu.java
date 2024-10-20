package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aetu {
    public final boolean a;
    public final byn b;
    public final byn c;

    public aetu(boolean z, byn bynVar, byn bynVar2) {
        bynVar.getClass();
        bynVar2.getClass();
        this.a = z;
        this.b = bynVar;
        this.c = bynVar2;
    }

    public final void a() {
        this.c.h(Boolean.valueOf(!((Boolean) this.c.a()).booleanValue()));
        this.b.h(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aetu)) {
            return false;
        }
        aetu aetuVar = (aetu) obj;
        if (this.a == aetuVar.a && d.F(this.b, aetuVar.b) && d.F(this.c, aetuVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.v(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BottomMetatextState(showByDefault=" + this.a + ", userInteracted=" + this.b + ", isShowing=" + this.c + ")";
    }
}
