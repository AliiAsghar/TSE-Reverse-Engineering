package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdo extends arpw implements arqv {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ hbb d;
    final /* synthetic */ int e;
    final /* synthetic */ float f;
    final /* synthetic */ hdv g;
    final /* synthetic */ byn h;
    final /* synthetic */ hdr i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdo(boolean z, boolean z2, hdr hdrVar, hbb hbbVar, int i, float f, hdv hdvVar, byn bynVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = z;
        this.c = z2;
        this.i = hdrVar;
        this.d = hbbVar;
        this.e = i;
        this.f = f;
        this.g = hdvVar;
        this.h = bynVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hdo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r12 != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a7, code lost:
    
        if (r12 == r0) goto L39;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r11.a
            r2 = 1
            defpackage.aqil.P(r12)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L73
            goto Laa
        Le:
            boolean r12 = r11.b
            if (r12 == 0) goto L73
            byn r12 = r11.h
            boolean r12 = defpackage.a.D(r12)
            if (r12 != 0) goto L73
            boolean r12 = r11.c
            if (r12 == 0) goto L73
            hdr r4 = r11.i
            r11.a = r2
            hbb r12 = r4.g()
            hdv r1 = r4.h()
            float r3 = r4.d()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 >= 0) goto L38
            if (r12 != 0) goto L38
            goto L4c
        L38:
            if (r12 != 0) goto L3c
        L3a:
            r6 = r5
            goto L4c
        L3c:
            if (r3 >= 0) goto L45
            if (r1 == 0) goto L4c
            float r12 = defpackage.hdv.a(r12)
            goto L4b
        L45:
            if (r1 == 0) goto L3a
            float r12 = defpackage.hdv.b(r12)
        L4b:
            r6 = r12
        L4c:
            hbb r5 = r4.g()
            float r12 = r4.c()
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r12 != 0) goto L59
            r2 = 0
        L59:
            r7 = r2
            aff r12 = r4.f
            hdq r1 = new hdq
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r12 = defpackage.aff.c(r12, r1, r11)
            arpl r1 = defpackage.arpl.a
            if (r12 == r1) goto L6d
            arnb r12 = defpackage.arnb.a
        L6d:
            if (r12 == r1) goto L71
            arnb r12 = defpackage.arnb.a
        L71:
            if (r12 == r0) goto La9
        L73:
            byn r12 = r11.h
            boolean r1 = r11.b
            defpackage.a.C(r12, r1)
            boolean r12 = r11.b
            if (r12 == 0) goto Laa
            hdr r12 = r11.i
            hbb r7 = r11.d
            int r4 = r11.e
            float r5 = r11.f
            hdv r6 = r11.g
            float r8 = r12.c()
            r1 = 2
            r11.a = r1
            int r3 = r12.e()
            hdp r10 = new hdp
            r9 = 0
            r1 = r10
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            aff r12 = r12.f
            java.lang.Object r12 = defpackage.aff.c(r12, r10, r11)
            arpl r1 = defpackage.arpl.a
            if (r12 == r1) goto La7
            arnb r12 = defpackage.arnb.a
        La7:
            if (r12 != r0) goto Laa
        La9:
            return r0
        Laa:
            arnb r12 = defpackage.arnb.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new hdo(this.b, this.c, this.i, this.d, this.e, this.f, this.g, this.h, arpeVar);
    }
}
