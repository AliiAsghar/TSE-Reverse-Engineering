package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xgj {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public xgj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.h = armfVar;
        armfVar2.getClass();
        this.g = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
        armfVar6.getClass();
        this.e = armfVar6;
        armfVar7.getClass();
        this.f = armfVar7;
        armfVar8.getClass();
        this.d = armfVar8;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [arwe, java.lang.Object] */
    @armg
    public final akul a(qei qeiVar) {
        qeiVar.getClass();
        return qjh.i(this.g, new wwh(this, qeiVar, (arpe) null, 20));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [xge, java.lang.Object] */
    public final ankt b(qei qeiVar, aqut aqutVar) {
        vdf vdfVar = (vdf) this.d.b();
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        if (b == qeh.PHONE) {
            adae adaeVar = (adae) this.c.b();
            String str = qeiVar.d;
            str.getClass();
            vcq a = vdfVar.a(adaeVar.d(str));
            ((Optional) this.h).isPresent();
            return new ankt(((Optional) this.h).get().a(a, aqutVar));
        }
        throw new xgh();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r13v2, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qei r11, defpackage.aqut r12, defpackage.arpe r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.xgi
            if (r0 == 0) goto L13
            r0 = r13
            xgi r0 = (defpackage.xgi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xgi r0 = new xgi
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            qei r11 = r0.e
            xgj r12 = r0.d
            defpackage.aqil.P(r13)
            goto L51
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            defpackage.aqil.P(r13)
            java.lang.Object r13 = r10.e
            yiv r2 = new yiv
            r8 = 0
            r9 = 1
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.d = r10
            r0.e = r11
            r0.c = r3
            java.lang.Object r13 = defpackage.arro.q(r13, r2, r0)
            if (r13 != r1) goto L50
            return r1
        L50:
            r12 = r10
        L51:
            ankt r13 = (defpackage.ankt) r13
            armf r0 = r12.b
            java.lang.Object r0 = r0.b()
            qdq r0 = (defpackage.qdq) r0
            anil r11 = r0.t(r11)
            armf r12 = r12.a
            java.lang.Object r12 = r12.b()
            qdq r12 = (defpackage.qdq) r12
            aogy r11 = r12.m(r13, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgj.c(qei, aqut, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [arwe, java.lang.Object] */
    @armg
    public final akul d(qei qeiVar, xdu xduVar) {
        qeiVar.getClass();
        return qjh.i(this.f, new wiu(xduVar, this, qeiVar, (arpe) null, 11));
    }

    @armg
    public final znj f(qei qeiVar) {
        qeiVar.getClass();
        aiut.b();
        armf armfVar = this.b;
        return new znj(((qdq) this.a.b()).m(b(qeiVar, null), ((qdq) armfVar.b()).t(qeiVar)), this.g, (byte[]) null);
    }

    public xgj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, char[] cArr) {
        armfVar.getClass();
        this.f = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.g = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
        armfVar6.getClass();
        this.c = armfVar6;
        armfVar7.getClass();
        this.b = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
    }

    public xgj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, byte[] bArr) {
        armfVar.getClass();
        this.h = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.f = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.b = armfVar6;
        armfVar7.getClass();
        this.a = armfVar7;
        armfVar8.getClass();
        this.g = armfVar8;
    }

    public xgj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.h = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
        armfVar6.getClass();
        this.d = armfVar6;
        armfVar7.getClass();
        this.f = armfVar7;
        armfVar8.getClass();
        this.g = armfVar8;
    }

    public xgj(arpi arpiVar, arwe arweVar, arwe arweVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, Optional optional) {
        arpiVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.e = arpiVar;
        this.f = arweVar;
        this.g = arweVar2;
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar4;
        this.d = armfVar5;
        this.h = optional;
    }
}
