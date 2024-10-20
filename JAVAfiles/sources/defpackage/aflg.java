package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflg extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ aflh c;
    final /* synthetic */ String d;
    final /* synthetic */ arqv e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aflg(aflh aflhVar, String str, arqv arqvVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = aflhVar;
        this.d = str;
        this.e = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aflg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005a  */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r11.b
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L13
            java.lang.Object r0 = r11.a
            java.lang.Object r1 = r11.f
            arwe r1 = (defpackage.arwe) r1
            defpackage.aqil.P(r12)
            goto L56
        L13:
            java.lang.Object r1 = r11.f
            arwe r1 = (defpackage.arwe) r1
            defpackage.aqil.P(r12)
            goto L35
        L1b:
            defpackage.aqil.P(r12)
            java.lang.Object r12 = r11.f
            arwe r12 = (defpackage.arwe) r12
            aflh r1 = r11.c
            java.lang.String r3 = r11.d
            r11.f = r12
            r11.b = r2
            afmd r1 = r1.d
            java.lang.Object r1 = r1.b(r3, r11)
            if (r1 == r0) goto L88
            r10 = r1
            r1 = r12
            r12 = r10
        L35:
            aflw r12 = (defpackage.aflw) r12
            if (r12 != 0) goto L41
            java.lang.String r12 = r11.d
            aflo r2 = new aflo
            r2.<init>(r12)
            r12 = r2
        L41:
            aflh r2 = r11.c
            java.lang.String r3 = r11.d
            r11.f = r1
            r11.a = r12
            r4 = 2
            r11.b = r4
            afmd r2 = r2.d
            java.lang.Object r2 = r2.c(r3, r11)
            if (r2 == r0) goto L88
            r0 = r12
            r12 = r2
        L56:
            afnb r12 = (defpackage.afnb) r12
            if (r12 != 0) goto L66
            afmz r12 = new afmz
            r2 = r0
            aflw r2 = (defpackage.aflw) r2
            aflp r2 = r2.b()
            r12.<init>(r2)
        L66:
            r4 = r12
            afnr r12 = new afnr
            afno r7 = defpackage.afno.a
            r5 = r0
            aflw r5 = (defpackage.aflw) r5
            r8 = 0
            r9 = 20
            r6 = 0
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            boolean r0 = defpackage.arwi.h(r1)
            if (r0 == 0) goto L85
            arqv r0 = r11.e
            aflh r1 = r11.c
            java.util.List r1 = r1.a
            r0.a(r1, r12)
        L85:
            arnb r12 = defpackage.arnb.a
            return r12
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aflg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        aflg aflgVar = new aflg(this.c, this.d, this.e, arpeVar);
        aflgVar.f = obj;
        return aflgVar;
    }
}
