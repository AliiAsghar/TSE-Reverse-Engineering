package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjp extends arpw implements arqv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ boolean c;
    final /* synthetic */ gid d;
    final /* synthetic */ arqr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjp(boolean z, gid gidVar, arpe arpeVar, arqr arqrVar) {
        super(2, arpeVar);
        this.c = z;
        this.d = gidVar;
        this.e = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjp) c((gjf) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r6.a
            if (r1 == 0) goto L85
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 == r2) goto L15
            java.lang.Object r0 = r6.b
            defpackage.aqil.P(r7)
            goto L6b
        L15:
            java.lang.Object r1 = r6.b
            gjf r1 = (defpackage.gjf) r1
            defpackage.aqil.P(r7)
            goto L5a
        L1d:
            java.lang.Object r1 = r6.b
            gjf r1 = (defpackage.gjf) r1
            defpackage.aqil.P(r7)
            goto L46
        L25:
            java.lang.Object r1 = r6.b
            gjf r1 = (defpackage.gjf) r1
            defpackage.aqil.P(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L46
            gid r7 = r6.d
            ghv r7 = r7.b()
            r6.b = r1
            r6.a = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 == r0) goto L45
            goto L46
        L45:
            return r0
        L46:
            arqr r7 = r6.e
            qkj r3 = new qkj
            r5 = 0
            r3.<init>(r5, r7, r4)
            r6.b = r1
            r6.a = r2
            r7 = 0
            java.lang.Object r7 = r1.c(r7, r3, r6)
            if (r7 != r0) goto L5a
            return r0
        L5a:
            boolean r2 = r6.c
            if (r2 != 0) goto L97
            r6.b = r7
            r2 = 4
            r6.a = r2
            java.lang.Object r1 = r1.b()
            if (r1 == r0) goto L84
            r0 = r7
            r7 = r1
        L6b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L82
            gid r7 = r6.d
            ghv r7 = r7.b()
            giw r1 = r7.c
            arqg r2 = r7.f
            arqg r7 = r7.g
            r1.g(r2, r7)
        L82:
            r7 = r0
            goto L97
        L84:
            return r0
        L85:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.b
            gjf r7 = (defpackage.gjf) r7
            r7.getClass()
            arqr r0 = r6.e
            ghw r7 = r7.a
            java.lang.Object r7 = r0.a(r7)
        L97:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        gjp gjpVar = new gjp(this.c, this.d, arpeVar, this.e);
        gjpVar.b = obj;
        return gjpVar;
    }
}
