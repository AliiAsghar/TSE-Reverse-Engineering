package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjb extends arpw implements arqv {
    int a;
    final /* synthetic */ kjc b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjb(kjc kjcVar, float f, arpe arpeVar) {
        super(2, arpeVar);
        this.b = kjcVar;
        this.c = f;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kjb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (defpackage.arwi.m(5000, r4) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r5 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        r5 = (defpackage.zxk) r5;
        r4.b.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        return defpackage.arnb.a;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r4.a
            r2 = 1
            defpackage.aqil.P(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L2d
        Ld:
            r4.a = r2
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r5 = defpackage.arwi.m(r1, r4)
            if (r5 == r0) goto L37
        L17:
            kjc r5 = r4.b
            float r1 = r4.c
            kja r2 = new kja
            r3 = 0
            r2.<init>(r1, r3)
            r1 = 2
            r4.a = r1
            wul r5 = r5.d
            java.lang.Object r5 = r5.d(r2, r4)
            if (r5 != r0) goto L2d
            goto L37
        L2d:
            zxk r5 = (defpackage.zxk) r5
            kjc r5 = r4.b
            r0 = 0
            r5.f = r0
            arnb r5 = defpackage.arnb.a
            return r5
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new kjb(this.b, this.c, arpeVar);
    }
}
