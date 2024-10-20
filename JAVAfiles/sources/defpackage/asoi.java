package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asoi {
    public static final asqx a;
    public static final asqx b;
    public static final asqx c;
    public static final asqx d;
    public static final asqx e;
    public static final asqx f;
    public final asqx g;
    public final asqx h;
    public final int i;

    static {
        asqx asqxVar = asqx.a;
        a = aotl.R(":");
        b = aotl.R(":status");
        c = aotl.R(":method");
        d = aotl.R(":path");
        e = aotl.R(":scheme");
        f = aotl.R(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public asoi(String str, String str2) {
        this(aotl.R(str), aotl.R(str2));
        str2.getClass();
        asqx asqxVar = asqx.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asoi)) {
            return false;
        }
        asoi asoiVar = (asoi) obj;
        if (d.F(this.g, asoiVar.g) && d.F(this.h, asoiVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.h.hashCode();
    }

    public final String toString() {
        asqx asqxVar = this.h;
        return this.g.e() + ": " + asqxVar.e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public asoi(asqx asqxVar, String str) {
        this(asqxVar, aotl.R(str));
        asqxVar.getClass();
    }

    public asoi(asqx asqxVar, asqx asqxVar2) {
        this.g = asqxVar;
        this.h = asqxVar2;
        this.i = asqxVar.b() + 32 + asqxVar2.b();
    }
}
