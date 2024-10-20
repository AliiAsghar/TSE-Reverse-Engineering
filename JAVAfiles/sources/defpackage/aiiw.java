package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiiw extends aijc {
    public final int a;
    public final atkt b;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aiiw(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r4.<init>(r5)
            atkt r5 = new atkt
            r5.<init>()
            r4.b = r5
            r5 = 0
            r0 = 1
            int r1 = r6.hashCode()     // Catch: java.lang.IllegalArgumentException -> L50
            r2 = -1881192140(0xffffffff8fdf4934, float:-2.2017695E-29)
            r3 = 2
            if (r1 == r2) goto L35
            r2 = 2541448(0x26c788, float:3.561327E-39)
            if (r1 == r2) goto L2b
            r2 = 433141802(0x19d1382a, float:2.1632778E-23)
            if (r1 == r2) goto L21
            goto L3f
        L21:
            java.lang.String r1 = "UNKNOWN"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3f
            r1 = r5
            goto L40
        L2b:
            java.lang.String r1 = "SEND"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3f
            r1 = r0
            goto L40
        L35:
            java.lang.String r1 = "REPORT"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3f
            r1 = r3
            goto L40
        L3f:
            r1 = -1
        L40:
            if (r1 == 0) goto L59
            if (r1 == r0) goto L4e
            if (r1 != r3) goto L48
            r0 = 3
            goto L59
        L48:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L50
            r1.<init>()     // Catch: java.lang.IllegalArgumentException -> L50
            throw r1     // Catch: java.lang.IllegalArgumentException -> L50
        L4e:
            r0 = r3
            goto L59
        L50:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r6
            java.lang.String r5 = "Msrp method not understood: %s"
            defpackage.advr.q(r5, r1)
        L59:
            r4.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiiw.<init>(java.lang.String, java.lang.String):void");
    }

    public final String a() {
        return (String) this.c.get("Message-ID");
    }

    public final void b() {
        try {
            this.b.m();
            this.b.l();
        } catch (IOException e) {
            advr.i(e, "Error while closing request: %s", e.getMessage());
        }
    }

    @Override // defpackage.aijc
    public final boolean c() {
        if (!super.c() || !h("Message-ID")) {
            return false;
        }
        if (!h("Status") && this.a == 3) {
            return false;
        }
        return true;
    }
}
