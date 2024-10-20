package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pwr {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final xoc b;
    public final int c;
    public final alor d;
    public final String e;
    public final Optional f;
    private final Optional g;

    public pwr() {
        throw null;
    }

    public static pwq a() {
        pwq pwqVar = new pwq(null);
        pwqVar.f(xoc.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
        pwqVar.e(0);
        pwqVar.d(altc.a);
        pwqVar.g("");
        return pwqVar;
    }

    private final aozy f() {
        int i;
        aozy createBuilder = amrl.a.createBuilder();
        int i2 = vzo.a;
        xoc xocVar = this.b;
        switch (xocVar.ordinal()) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(xocVar))));
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case 12:
                i = 12;
                break;
            case 13:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            case 15:
                i = 15;
                break;
            case 16:
                i = 16;
                break;
            case 17:
                i = 17;
                break;
            case 18:
                i = 18;
                break;
            case 19:
                i = 19;
                break;
            case 20:
                i = 20;
                break;
            case 21:
                i = 21;
                break;
            case 22:
                i = 22;
                break;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amrl amrlVar = (amrl) createBuilder.b;
        amrlVar.e = i - 1;
        amrlVar.b |= 1;
        aozy createBuilder2 = amrm.a.createBuilder();
        int i3 = this.c;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        long j = i3;
        amrm amrmVar = (amrm) createBuilder2.b;
        amrmVar.b = 1 | amrmVar.b;
        amrmVar.c = j;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amrl amrlVar2 = (amrl) createBuilder.b;
        amrm amrmVar2 = (amrm) createBuilder2.s();
        amrmVar2.getClass();
        amrlVar2.f = amrmVar2;
        amrlVar2.b |= 2;
        return createBuilder;
    }

    public final amrl b() {
        aozy f = f();
        this.g.ifPresent(new ptf(f, 5));
        return (amrl) f.s();
    }

    public final amrl c(amro amroVar) {
        aozy f = f();
        if (!f.b.isMutable()) {
            f.u();
        }
        amrl amrlVar = (amrl) f.b;
        amrl amrlVar2 = amrl.a;
        amroVar.getClass();
        amrlVar.h = amroVar;
        amrlVar.b |= 8;
        this.g.ifPresent(new ptf(f, 3));
        return (amrl) f.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.amrl d(int r7, defpackage.amro r8) {
        /*
            r6 = this;
            aozy r0 = r6.f()
            apag r1 = r0.b
            boolean r1 = r1.isMutable()
            if (r1 != 0) goto Lf
            r0.u()
        Lf:
            apag r1 = r0.b
            amrl r1 = (defpackage.amrl) r1
            amrl r2 = defpackage.amrl.a
            r8.getClass()
            r1.h = r8
            int r8 = r1.b
            r8 = r8 | 8
            r1.b = r8
            apag r8 = r0.b
            boolean r8 = r8.isMutable()
            if (r8 != 0) goto L2b
            r0.u()
        L2b:
            apag r8 = r0.b
            amrl r8 = (defpackage.amrl) r8
            int r1 = r8.b
            r1 = r1 | 16
            r8.b = r1
            r8.i = r7
            j$.util.Optional r7 = r6.g
            ptf r8 = new ptf
            r1 = 4
            r8.<init>(r0, r1)
            r7.ifPresent(r8)
            xoc r7 = r6.b
            int r7 = r7.ordinal()
            r8 = 12
            r2 = 6
            if (r7 == r8) goto La6
            r8 = 15
            if (r7 == r8) goto L53
            goto Lc7
        L53:
            j$.util.Optional r7 = r6.f
            java.lang.Object r7 = r7.get()
            apvj r7 = (defpackage.apvj) r7
            apvi r7 = r7.a
            r7.getClass()
            int r8 = r7.ordinal()
            r3 = 2
            if (r8 == 0) goto L8a
            r4 = 3
            r5 = 1
            if (r8 == r5) goto L88
            if (r8 == r3) goto L8b
            r3 = 5
            if (r8 == r4) goto L8a
            if (r8 == r1) goto L86
            if (r8 != r3) goto L76
            r1 = r5
            goto L8b
        L76:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "unknown enum value: "
            java.lang.String r7 = r0.concat(r7)
            r8.<init>(r7)
            throw r8
        L86:
            r1 = r2
            goto L8b
        L88:
            r1 = r4
            goto L8b
        L8a:
            r1 = r3
        L8b:
            apag r7 = r0.b
            boolean r7 = r7.isMutable()
            if (r7 != 0) goto L96
            r0.u()
        L96:
            apag r7 = r0.b
            amrl r7 = (defpackage.amrl) r7
            int r1 = r1 + (-1)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r7.d = r8
            r8 = 7
            r7.c = r8
            goto Lc7
        La6:
            j$.util.Optional r7 = r6.f
            java.lang.Object r7 = r7.get()
            aniq r7 = (defpackage.aniq) r7
            anit r7 = r7.a
            aptw r7 = defpackage.xea.a(r7)
            apag r8 = r0.b
            boolean r8 = r8.isMutable()
            if (r8 != 0) goto Lbf
            r0.u()
        Lbf:
            apag r8 = r0.b
            amrl r8 = (defpackage.amrl) r8
            r8.d = r7
            r8.c = r2
        Lc7:
            apag r7 = r0.s()
            amrl r7 = (defpackage.amrl) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwr.d(int, amro):amrl");
    }

    public final String e() {
        if (this.g.isPresent()) {
            return (String) this.g.map(new prj(18)).orElse("");
        }
        return (String) this.f.map(new prj(19)).orElse("");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pwr) {
            pwr pwrVar = (pwr) obj;
            if (this.b.equals(pwrVar.b) && this.c == pwrVar.c && this.d.equals(pwrVar.d) && this.e.equals(pwrVar.e) && this.g.equals(pwrVar.g) && this.f.equals(pwrVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.g;
        alor alorVar = this.d;
        return "FileTransferFailure{reason=" + String.valueOf(this.b) + ", httpResponseCode=" + this.c + ", httpHeaders=" + String.valueOf(alorVar) + ", transactionId=" + this.e + ", cronetException=" + String.valueOf(optional2) + ", genericException=" + String.valueOf(optional) + "}";
    }

    public pwr(xoc xocVar, int i, alor alorVar, String str, Optional optional, Optional optional2) {
        this.b = xocVar;
        this.c = i;
        this.d = alorVar;
        this.e = str;
        this.g = optional;
        this.f = optional2;
    }
}
