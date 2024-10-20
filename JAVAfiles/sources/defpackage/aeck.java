package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeck extends adcx {
    public static final aeck a = new aeck(null, 0 == true ? 1 : 0, false, 15);
    public final Set b;
    public final aecq c;
    public final boolean d;
    public final boolean e;

    public aeck() {
        this(null, 0 == true ? 1 : 0, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeck)) {
            return false;
        }
        aeck aeckVar = (aeck) obj;
        if (d.F(this.b, aeckVar.b) && d.F(this.c, aeckVar.c) && this.d == aeckVar.d && this.e == aeckVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + a.v(this.d)) * 31) + a.v(this.e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aeck(Set set, aecq aecqVar, boolean z, int i) {
        super(null, null);
        set = (i & 1) != 0 ? arnx.a : set;
        aecqVar = (i & 2) != 0 ? aecl.a : aecqVar;
        boolean z2 = (i & 4) != 0;
        boolean z3 = (i & 8) == 0;
        set.getClass();
        aecqVar.getClass();
        this.b = set;
        this.c = aecqVar;
        this.d = z2;
        this.e = z | (!z3);
    }
}
