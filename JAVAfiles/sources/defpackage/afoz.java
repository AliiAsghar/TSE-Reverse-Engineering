package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afoz extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ afpb c;
    final /* synthetic */ String d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afoz(afpb afpbVar, String str, boolean z, arpe arpeVar) {
        super(2, arpeVar);
        this.c = afpbVar;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afoz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
    
        if (r10 != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r9.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r9.a
            defpackage.aqil.P(r10)
            goto L47
        Lf:
            defpackage.aqil.P(r10)
            goto L26
        L13:
            defpackage.aqil.P(r10)
            afpb r10 = r9.c
            java.lang.String r1 = r9.d
            afmd r10 = r10.d()
            r9.b = r2
            java.lang.Object r10 = r10.b(r1, r9)
            if (r10 == r0) goto L7b
        L26:
            aflw r10 = (defpackage.aflw) r10
            if (r10 != 0) goto L32
            java.lang.String r10 = r9.d
            aflo r1 = new aflo
            r1.<init>(r10)
            r10 = r1
        L32:
            afpb r1 = r9.c
            java.lang.String r2 = r9.d
            afmd r1 = r1.d()
            r9.a = r10
            r3 = 2
            r9.b = r3
            java.lang.Object r1 = r1.c(r2, r9)
            if (r1 == r0) goto L7b
            r0 = r10
            r10 = r1
        L47:
            afnb r10 = (defpackage.afnb) r10
            if (r10 != 0) goto L57
            afmz r10 = new afmz
            r1 = r0
            aflw r1 = (defpackage.aflw) r1
            aflp r1 = r1.b()
            r10.<init>(r1)
        L57:
            r3 = r10
            afpb r10 = r9.c
            arqg r10 = r10.bn()
            java.lang.Object r10 = r10.a()
            afkq r10 = (defpackage.afkq) r10
            aflb r10 = r10.a
            boolean r7 = r9.e
            afnn r6 = defpackage.afnn.a
            afnr r1 = new afnr
            r4 = r0
            aflw r4 = (defpackage.aflw) r4
            r5 = 0
            r8 = 4
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.f(r1)
            arnb r10 = defpackage.arnb.a
            return r10
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afoz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new afoz(this.c, this.d, this.e, arpeVar);
    }
}
