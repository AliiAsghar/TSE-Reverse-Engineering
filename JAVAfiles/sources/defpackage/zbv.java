package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbv {
    public final List a;
    public final List b;
    public final List c;

    public zbv() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbv)) {
            return false;
        }
        zbv zbvVar = (zbv) obj;
        if (d.F(this.a, zbvVar.a) && d.F(this.b, zbvVar.b) && d.F(this.c, zbvVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CombinedChipData(visibleNonRcsChips=" + this.a + ", visibleNonE2eeChips=" + this.b + ", totalChips=" + this.c + ")";
    }

    public zbv(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public /* synthetic */ zbv(List list, int i) {
        this((i & 1) != 0 ? arnv.a : null, (i & 2) != 0 ? arnv.a : null, (i & 4) != 0 ? arnv.a : list);
    }
}
