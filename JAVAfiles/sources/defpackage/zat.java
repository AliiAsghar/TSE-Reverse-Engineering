package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zat {
    public final aeqm a;
    public final boolean b;

    public zat() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zat)) {
            return false;
        }
        zat zatVar = (zat) obj;
        if (d.F(this.a, zatVar.a) && this.b == zatVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.v(this.b);
    }

    public final String toString() {
        return "FavoriteContactsUiData(rowUiData=" + this.a + ", loaded=" + this.b + ")";
    }

    public zat(aeqm aeqmVar, boolean z) {
        this.a = aeqmVar;
        this.b = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ zat(byte[] r3) {
        /*
            r2 = this;
            aeqm r3 = new aeqm
            int r0 = defpackage.alog.d
            alog r0 = defpackage.alsx.a
            r0.getClass()
            java.lang.String r1 = ""
            r3.<init>(r1, r0)
            r0 = 0
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zat.<init>(byte[]):void");
    }
}
