package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zah extends arpw implements arqv {
    Object a;
    boolean b;
    int c;
    final /* synthetic */ zhi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zah(zhi zhiVar, arpe arpeVar) {
        super(2, arpeVar);
        this.d = zhiVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zah) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L11
            boolean r0 = r6.b
            defpackage.aqil.P(r7)
            goto Lb2
        L11:
            java.lang.Object r1 = r6.a
            defpackage.aqil.P(r7)
            goto L97
        L18:
            defpackage.aqil.P(r7)
            zhi r7 = r6.d
            xze r1 = defpackage.psh.a
            xyo r1 = r1.c()
            uuf r4 = defpackage.psh.b
            java.lang.Object r4 = r4.e()
            java.lang.String r5 = "enable_chatbot_directory"
            r1.z(r5, r4)
            java.lang.Object r7 = r7.b
            psh r7 = (defpackage.psh) r7
            armf r4 = r7.e
            java.lang.Object r4 = r4.b()
            vru r4 = (defpackage.vru) r4
            amwt r4 = r4.a()
            java.lang.String r5 = "availability_state"
            r1.z(r5, r4)
            r1.q()
            uuf r1 = defpackage.psh.b
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L77
            armf r1 = r7.e
            java.lang.Object r1 = r1.b()
            vru r1 = (defpackage.vru) r1
            amwt r1 = r1.a()
            amwt r4 = defpackage.amwt.AVAILABLE
            if (r1 == r4) goto L65
            goto L77
        L65:
            hgj r1 = r7.f
            akul r1 = r1.q()
            psf r4 = new psf
            r4.<init>(r2)
            anen r7 = r7.d
            akul r7 = r1.h(r4, r7)
            goto L80
        L77:
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            akul r7 = defpackage.aktp.ag(r7)
        L80:
            zhi r1 = r6.d
            java.lang.Object r1 = r1.c
            hgj r1 = (defpackage.hgj) r1
            akul r1 = r1.q()
            r7.getClass()
            r6.a = r1
            r6.c = r3
            java.lang.Object r7 = defpackage.arro.F(r7, r6)
            if (r7 == r0) goto Lc5
        L97:
            r7.getClass()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1.getClass()
            r3 = 0
            r6.a = r3
            r6.b = r7
            r6.c = r2
            java.lang.Object r1 = defpackage.arro.F(r1, r6)
            if (r1 == r0) goto Lc5
            r0 = r7
            r7 = r1
        Lb2:
            j$.util.Optional r7 = (j$.util.Optional) r7
            java.lang.String r1 = ""
            java.lang.Object r7 = r7.orElse(r1)
            r7.getClass()
            java.lang.String r7 = (java.lang.String) r7
            zag r1 = new zag
            r1.<init>(r0, r7)
            return r1
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zah.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new zah(this.d, arpeVar);
    }
}
