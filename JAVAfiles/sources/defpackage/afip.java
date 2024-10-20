package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afip {
    private static final List e = aqjn.B("image/*", "video/*");
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public afip() {
        /*
            r2 = this;
            r0 = 0
            r1 = 15
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afip.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afip)) {
            return false;
        }
        afip afipVar = (afip) obj;
        if (d.F(this.a, afipVar.a) && this.b == afipVar.b && this.c == afipVar.c && this.d == afipVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.d;
        return ((((hashCode + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(z);
    }

    public final String toString() {
        return "SystemContentPickerConfiguration(allowedMimeTypes=" + this.a + ", areMultiplePicksAllowed=" + this.b + ", shouldShowFab=" + this.c + ", shouldShowTile=" + this.d + ")";
    }

    public /* synthetic */ afip(boolean z, boolean z2, int i) {
        List list = (i & 1) != 0 ? e : null;
        boolean z3 = (i & 2) != 0;
        boolean z4 = z & ((i & 4) == 0);
        boolean z5 = (i & 8) == 0;
        list.getClass();
        this.a = list;
        this.b = z3;
        this.c = z4;
        this.d = z2 & z5;
    }
}
