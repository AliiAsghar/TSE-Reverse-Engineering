package defpackage;

import defpackage.cfq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesh implements aesg {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final arqg f;
    public final cfq.c g;
    public final int h;

    public aesh(String str, String str2, List list, boolean z, boolean z2, arqg arqgVar, cfq.c cVar, int i) {
        list.getClass();
        arqgVar.getClass();
        cVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = arqgVar;
        this.g = cVar;
        this.h = i;
    }

    public static /* synthetic */ aesh a(aesh aeshVar, String str, String str2, List list, boolean z, arqg arqgVar, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            str = aeshVar.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = aeshVar.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = aeshVar.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = aeshVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = aeshVar.e;
        } else {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            arqgVar = aeshVar.f;
        }
        arqg arqgVar2 = arqgVar;
        cfq.c cVar = aeshVar.g;
        int i2 = aeshVar.h;
        str3.getClass();
        list2.getClass();
        arqgVar2.getClass();
        return new aesh(str3, str4, list2, z3, z4, arqgVar2, cVar, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aesh)) {
            return false;
        }
        aesh aeshVar = (aesh) obj;
        if (d.F(this.a, aeshVar.a) && d.F(this.b, aeshVar.b) && d.F(this.c, aeshVar.c) && this.d == aeshVar.d && this.e == aeshVar.e && d.F(this.f, aeshVar.f) && d.F(this.g, aeshVar.g) && this.h == aeshVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((((((hashCode2 + hashCode) * 31) + this.c.hashCode()) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h;
    }

    public final String toString() {
        return "CheckboxListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", subtitleAnnotations=" + this.c + ", isChecked=" + this.d + ", useTrailingCheckbox=" + this.e + ", onToggle=" + this.f + ", verticalAlignment=" + this.g + ", titleMaxLines=" + this.h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ aesh(java.lang.String r12, java.lang.String r13, java.util.List r14, boolean r15, boolean r16, defpackage.arqg r17, cfq.c r18, int r19, int r20) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 4
            if (r1 == 0) goto La
            arnv r1 = defpackage.arnv.a
            r5 = r1
            goto Lb
        La:
            r5 = r14
        Lb:
            r1 = r0 & 8
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L13
            r1 = r2
            goto L14
        L13:
            r1 = r3
        L14:
            r6 = r1 & r15
            r1 = r0 & 16
            if (r1 == 0) goto L1b
            goto L1c
        L1b:
            r2 = r3
        L1c:
            r7 = r2 & r16
            r1 = r0 & 32
            if (r1 == 0) goto L26
            aepz r1 = defpackage.aepz.n
            r8 = r1
            goto L28
        L26:
            r8 = r17
        L28:
            r1 = r0 & 64
            if (r1 == 0) goto L32
            int r1 = defpackage.cfq.a
            cfq$c r1 = cfq.a.k
            r9 = r1
            goto L34
        L32:
            r9 = r18
        L34:
            r1 = r0 & 2
            if (r1 == 0) goto L3b
            r1 = 0
            r4 = r1
            goto L3c
        L3b:
            r4 = r13
        L3c:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L42
            r10 = r3
            goto L44
        L42:
            r10 = r19
        L44:
            r2 = r11
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesh.<init>(java.lang.String, java.lang.String, java.util.List, boolean, boolean, arqg, cfq$c, int, int):void");
    }
}
