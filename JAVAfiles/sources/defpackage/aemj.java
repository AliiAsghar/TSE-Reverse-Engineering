package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aemj {
    public final aemi a;
    public final List b;
    public final boolean c;
    public final aemg d;
    private final aemg e;
    private final boolean f;

    public /* synthetic */ aemj(aemi aemiVar, List list, boolean z, aemg aemgVar, int i) {
        boolean z2;
        this.a = aemiVar;
        this.b = list;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.c = z2 & z;
        this.e = null;
        this.d = (i & 16) != 0 ? null : aemgVar;
        this.f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aemj)) {
            return false;
        }
        aemj aemjVar = (aemj) obj;
        if (!d.F(this.a, aemjVar.a) || !d.F(this.b, aemjVar.b) || this.c != aemjVar.c) {
            return false;
        }
        aemg aemgVar = aemjVar.e;
        if (!d.F(null, null) || !d.F(this.d, aemjVar.d)) {
            return false;
        }
        boolean z = aemjVar.f;
        return true;
    }

    public final int hashCode() {
        int hashCode;
        aemi aemiVar = this.a;
        int i = 0;
        if (aemiVar == null) {
            hashCode = 0;
        } else {
            hashCode = aemiVar.hashCode();
        }
        int hashCode2 = (hashCode * 31) + this.b.hashCode();
        boolean z = this.c;
        aemg aemgVar = this.d;
        if (aemgVar != null) {
            i = aemgVar.hashCode();
        }
        return (((((hashCode2 * 31) + a.v(z)) * 961) + i) * 31) + a.v(true);
    }

    public final String toString() {
        return "CardstoneUiData(title=" + this.a + ", listItems=" + this.b + ", isError=" + this.c + ", confirmButton=null, cancelButton=" + this.d + ", useOutline=true)";
    }
}
