package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aehz {
    public final String a;
    public final aerb b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final arqg i;
    public final arqg j;
    private final boolean k;

    public /* synthetic */ aehz(String str, aerb aerbVar, boolean z, boolean z2, boolean z3, boolean z4, List list, arqg arqgVar, arqg arqgVar2, int i) {
        List list2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        aerb aerbVar2;
        if ((i & 64) != 0) {
            list2 = arnv.a;
        } else {
            list2 = list;
        }
        int i2 = i & 16;
        if ((i & 32) != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (i2 != 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        int i3 = i & 4;
        int i4 = i & 2;
        boolean z9 = !z5;
        boolean z10 = !z6;
        if ((i & 8) != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (i3 != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        boolean z11 = z9 | z4;
        boolean z12 = z10 | z3;
        boolean z13 = z7 & z2;
        boolean z14 = z8 & z;
        if (i4 != 0) {
            aerbVar2 = null;
        } else {
            aerbVar2 = aerbVar;
        }
        boolean z15 = (i & 256) != 0;
        arqg arqgVar3 = (i & 512) == 0 ? arqgVar : null;
        str.getClass();
        list2.getClass();
        this.a = str;
        this.b = aerbVar2;
        this.c = z14;
        this.d = z13;
        this.e = z12;
        this.f = z11;
        this.g = list2;
        this.k = false;
        this.h = z15;
        this.i = arqgVar3;
        this.j = arqgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aehz)) {
            return false;
        }
        aehz aehzVar = (aehz) obj;
        if (!d.F(this.a, aehzVar.a) || this.b != aehzVar.b || this.c != aehzVar.c || this.d != aehzVar.d || this.e != aehzVar.e || this.f != aehzVar.f || !d.F(this.g, aehzVar.g)) {
            return false;
        }
        boolean z = aehzVar.k;
        if (this.h == aehzVar.h && d.F(this.i, aehzVar.i) && d.F(this.j, aehzVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        aerb aerbVar = this.b;
        int i = 0;
        if (aerbVar == null) {
            hashCode = 0;
        } else {
            hashCode = aerbVar.hashCode();
        }
        int v = (((((((((((((((hashCode2 + hashCode) * 31) + a.v(this.c)) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + a.v(this.f)) * 31) + this.g.hashCode()) * 31) + a.v(false)) * 31) + a.v(this.h)) * 31;
        arqg arqgVar = this.i;
        if (arqgVar != null) {
            i = arqgVar.hashCode();
        }
        return ((v + i) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "ActionUiData(title=" + this.a + ", icon=" + this.b + ", isIconBadged=" + this.c + ", pinToOverflowMenu=" + this.d + ", isVisible=" + this.e + ", canExecute=" + this.f + ", subActions=" + this.g + ", showIconsForSubActions=false, shouldTint=" + this.h + ", onResume=" + this.i + ", execute=" + this.j + ")";
    }
}
