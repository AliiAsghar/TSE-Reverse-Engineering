package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ur extends arpv implements arqv {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    long h;
    int i;
    final /* synthetic */ us j;
    final /* synthetic */ vh k;
    private /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(us usVar, vh vhVar, arpe arpeVar) {
        super(arpeVar);
        this.j = usVar;
        this.k = vhVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ur) c((artz) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:14:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004d -> B:5:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x006c -> B:4:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0095 -> B:4:0x0099). Please report as a decompilation issue!!! */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            arpl r1 = defpackage.arpl.a
            int r2 = r0.i
            r4 = 1
            r5 = 8
            if (r2 == 0) goto L24
            int r2 = r0.g
            int r6 = r0.f
            long r7 = r0.h
            int r9 = r0.e
            int r10 = r0.d
            java.lang.Object r11 = r0.c
            java.lang.Object r12 = r0.b
            java.lang.Object r13 = r0.a
            java.lang.Object r14 = r0.l
            artz r14 = (defpackage.artz) r14
            defpackage.aqil.P(r23)
            goto L99
        L24:
            defpackage.aqil.P(r23)
            java.lang.Object r2 = r0.l
            artz r2 = (defpackage.artz) r2
            us r6 = r0.j
            vh r7 = r0.k
            vh r8 = r6.b
            long[] r8 = r8.a
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lac
            r10 = 0
        L39:
            r11 = r8
            long[] r11 = (long[]) r11
            r12 = r11[r10]
            long r14 = ~r12
            r11 = 7
            long r14 = r14 << r11
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 == 0) goto La7
            int r11 = r10 - r9
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r14 = r2
            r2 = 0
            r19 = r12
            r13 = r6
            r12 = r7
            r6 = r11
            r11 = r8
            r7 = r19
            r21 = r10
            r10 = r9
            r9 = r21
        L63:
            if (r2 >= r6) goto L9c
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L99
            int r15 = r9 << 3
            int r15 = r15 + r2
            r3 = r13
            us r3 = (defpackage.us) r3
            r3.a = r15
            r3 = r12
            vh r3 = (defpackage.vh) r3
            java.lang.Object[] r3 = r3.b
            r3 = r3[r15]
            r0.l = r14
            r0.a = r13
            r0.b = r12
            r0.c = r11
            r0.d = r10
            r0.e = r9
            r0.h = r7
            r0.f = r6
            r0.g = r2
            r0.i = r4
            java.lang.Object r3 = r14.a(r3, r0)
            if (r3 == r1) goto L98
            goto L99
        L98:
            return r1
        L99:
            long r7 = r7 >> r5
            int r2 = r2 + r4
            goto L63
        L9c:
            if (r6 != r5) goto Lac
            r8 = r11
            r7 = r12
            r6 = r13
            r2 = r14
            r19 = r10
            r10 = r9
            r9 = r19
        La7:
            if (r10 == r9) goto Lac
            int r10 = r10 + 1
            goto L39
        Lac:
            arnb r1 = defpackage.arnb.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        ur urVar = new ur(this.j, this.k, arpeVar);
        urVar.l = obj;
        return urVar;
    }
}
