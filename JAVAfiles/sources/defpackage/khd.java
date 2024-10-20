package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khd {
    public final List a;
    public final khe b;
    public final khf c;
    public final boolean d;

    public khd() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khd)) {
            return false;
        }
        khd khdVar = (khd) obj;
        if (d.F(this.a, khdVar.a) && this.b == khdVar.b && d.F(this.c, khdVar.c) && this.d == khdVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        khf khfVar = this.c;
        if (khfVar == null) {
            hashCode = 0;
        } else {
            hashCode = khfVar.hashCode();
        }
        return (((hashCode2 * 31) + hashCode) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "SelectionData(messages=" + this.a + ", mode=" + this.b + ", offset=" + this.c + ", isOnFirstSelection=" + this.d + ")";
    }

    public khd(List list, khe kheVar, khf khfVar, boolean z) {
        list.getClass();
        kheVar.getClass();
        this.a = list;
        this.b = kheVar;
        this.c = khfVar;
        this.d = z;
    }

    public /* synthetic */ khd(List list, khe kheVar, int i) {
        this((i & 1) != 0 ? arnv.a : list, (i & 2) != 0 ? khe.a : kheVar, null, false);
    }
}
