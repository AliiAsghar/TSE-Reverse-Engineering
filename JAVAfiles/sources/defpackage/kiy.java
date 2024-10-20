package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kiy extends arpv implements arqv {
    int a;
    int b;
    final /* synthetic */ arqr c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kiy(arqr arqrVar, arpe arpeVar) {
        super(arpeVar);
        this.c = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kiy) c((cqg) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0057 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0025 -> B:4:0x0028). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r12.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            int r1 = r12.a
            java.lang.Object r4 = r12.d
            cqg r4 = (defpackage.cqg) r4
            defpackage.aqil.P(r13)
            goto L28
        L12:
            defpackage.aqil.P(r13)
            java.lang.Object r13 = r12.d
            cqg r13 = (defpackage.cqg) r13
            r4 = r13
            r1 = r3
        L1b:
            r12.d = r4
            r12.a = r1
            r12.b = r2
            java.lang.Object r13 = defpackage.cqf.a(r4, r12)
            if (r13 != r0) goto L28
            return r0
        L28:
            cqq r13 = (defpackage.cqq) r13
            java.util.List r5 = r13.a
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L34
        L32:
            r5 = r3
            goto L55
        L34:
            java.util.Iterator r5 = r5.iterator()
            r6 = r3
        L39:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L51
            java.lang.Object r7 = r5.next()
            crc r7 = (defpackage.crc) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L39
            int r6 = r6 + 1
            if (r6 >= 0) goto L39
            defpackage.aqjn.F()
            goto L39
        L51:
            r5 = 2
            if (r6 != r5) goto L32
            r5 = r2
        L55:
            if (r1 != 0) goto L61
            if (r5 == 0) goto L61
            arqr r1 = r12.c
            kiw r6 = defpackage.kiw.a
            r1.a(r6)
            r1 = r2
        L61:
            if (r5 == 0) goto L84
            arqr r5 = r12.c
            kiv r6 = new kiv
            float r7 = defpackage.aiq.a(r13, r2)
            float r8 = defpackage.aiq.a(r13, r3)
            r9 = 0
            int r10 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r10 != 0) goto L77
            goto L7e
        L77:
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 != 0) goto L7c
            goto L7e
        L7c:
            float r11 = r7 / r8
        L7e:
            r6.<init>(r11)
            r5.a(r6)
        L84:
            java.util.List r13 = r13.a
            boolean r5 = r13.isEmpty()
            if (r5 == 0) goto L8d
            goto La3
        L8d:
            java.util.Iterator r13 = r13.iterator()
        L91:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto La3
            java.lang.Object r5 = r13.next()
            crc r5 = (defpackage.crc) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L91
            goto L1b
        La3:
            if (r1 == 0) goto Lac
            arqr r13 = r12.c
            kiw r0 = defpackage.kiw.b
            r13.a(r0)
        Lac:
            arnb r13 = defpackage.arnb.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kiy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        kiy kiyVar = new kiy(this.c, arpeVar);
        kiyVar.d = obj;
        return kiyVar;
    }
}
