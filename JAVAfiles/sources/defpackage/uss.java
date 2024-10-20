package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uss {
    public final unx a;
    public final String b;
    public final List c;

    public uss(unx unxVar, String str, List list) {
        str.getClass();
        this.a = unxVar;
        this.b = str;
        this.c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.usq
            if (r0 == 0) goto L13
            r0 = r6
            usq r0 = (defpackage.usq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            usq r0 = new usq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.aqil.P(r6)
            unx r6 = r5.a
            usr r2 = new usr
            r2.<init>(r5)
            java.util.List r4 = r5.c
            alog r4 = defpackage.alzz.aZ(r4)
            akul r6 = r6.q(r2, r4)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uss.a(arpe):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uss)) {
            return false;
        }
        uss ussVar = (uss) obj;
        if (d.F(this.a, ussVar.a) && d.F(this.b, ussVar.b) && d.F(this.c, ussVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Tranche(handler=" + this.a + ", queueName=" + this.b + ", items=" + this.c + ")";
    }
}
