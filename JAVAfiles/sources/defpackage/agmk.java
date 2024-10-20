package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agmk {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Supplier g;
    public final int h;
    private final boolean i;
    private final agmj j;

    public agmk() {
        throw null;
    }

    public static agmi a() {
        agmi agmiVar = new agmi();
        agmiVar.b = new addh(13);
        agmiVar.f(false);
        agmiVar.d = 8;
        agmiVar.c(false);
        agmiVar.d(false);
        agmiVar.j(false);
        agmiVar.i(false);
        agmiVar.e(false);
        return agmiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r5.g == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r4.j.equals(r5.j) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        if (r1 == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.agmk
            r2 = 0
            if (r1 == 0) goto L60
            agmk r5 = (defpackage.agmk) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L60
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 != r3) goto L60
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 != r3) goto L60
            boolean r1 = r4.i
            boolean r3 = r5.i
            if (r1 != r3) goto L60
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 != r3) goto L60
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 != r3) goto L60
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 != r3) goto L60
            int r1 = r4.h
            int r3 = r5.h
            if (r1 == 0) goto L5e
            if (r1 != r3) goto L60
            java.util.function.Supplier r1 = r4.g
            if (r1 != 0) goto L4a
            java.util.function.Supplier r1 = r5.g
            if (r1 != 0) goto L60
            goto L53
        L4a:
            java.util.function.Supplier r3 = r5.g
            boolean r1 = defpackage.d$$ExternalSyntheticApiModelOutline0.m(r1, r3)
            if (r1 != 0) goto L53
            goto L60
        L53:
            agmj r1 = r4.j
            agmj r5 = r5.j
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L60
            return r0
        L5e:
            r5 = 0
            throw r5
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agmk.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        int i6 = this.h;
        a.bm(i6);
        Supplier supplier = this.g;
        if (supplier != null) {
            hashCode = supplier.hashCode();
        } else {
            hashCode = 0;
        }
        int i7 = hashCode2 * 1000003;
        int i8 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i9 = (i7 ^ i) * 1000003;
        if (true != this.c) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i10 = (i9 ^ i2) * 1000003;
        if (true != this.i) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i11 = (i10 ^ i3) * 1000003;
        if (true != this.d) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int i12 = (i11 ^ i4) * 1000003;
        if (true != this.e) {
            i5 = 1237;
        } else {
            i5 = 1231;
        }
        int i13 = (i12 ^ i5) * 1000003;
        if (true == this.f) {
            i8 = 1231;
        }
        return ((((((i13 ^ i8) * 1000003) ^ i6) * 1000003) ^ hashCode) * 1000003) ^ this.j.hashCode();
    }

    public final String toString() {
        String str;
        switch (this.h) {
            case 1:
                str = "INT";
                break;
            case 2:
                str = "INTEGER";
                break;
            case 3:
                str = "REAL";
                break;
            case 4:
                str = "TEXT";
                break;
            case 5:
                str = "BLOB";
                break;
            case 6:
                str = "NUMERIC";
                break;
            case 7:
                str = "DEPRECATED_STRING";
                break;
            case 8:
                str = "NOT_SPECIFIED";
                break;
            default:
                str = "null";
                break;
        }
        Supplier supplier = this.g;
        agmj agmjVar = this.j;
        return "ColumnReferenceData{columnName=" + this.a + ", isForeignKey=" + this.b + ", unique=" + this.c + ", sqlNotNull=" + this.i + ", isPartOfUniqueMultiColumnIndex=" + this.d + ", isPrimaryKey=" + this.e + ", hasIndex=" + this.f + ", sqlType=" + str + ", parent=" + String.valueOf(supplier) + ", setterForTesting=" + String.valueOf(agmjVar) + "}";
    }

    public agmk(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Supplier supplier, agmj agmjVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.i = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.h = i;
        this.g = supplier;
        this.j = agmjVar;
    }
}
