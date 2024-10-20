package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiu {
    public static final zv a = new zv(brg.a);
    public final ack b;
    public long c = Long.MIN_VALUE;
    public zv d = a;
    public float e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aiu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        Object a;
        Object b;
        float c;
        /* synthetic */ Object d;
        int f;
        aiu g;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return aiu.this.a(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aiu$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<Long, arnb> {
        final /* synthetic */ float b;
        final /* synthetic */ arqr c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f, arqr arqrVar) {
            super(1);
            this.b = f;
            this.c = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            long i;
            long longValue = ((Number) obj).longValue();
            aiu aiuVar = aiu.this;
            long j = aiuVar.c;
            if (j == Long.MIN_VALUE) {
                aiuVar.c = longValue;
                j = longValue;
            }
            float f = aiuVar.e;
            zv zvVar = new zv(f);
            float f2 = this.b;
            if (f2 == brg.a) {
                i = aiuVar.b.a(new zv(f), aiu.a, aiuVar.d);
            } else {
                i = arsk.i(((float) (longValue - j)) / f2);
            }
            aiu aiuVar2 = aiu.this;
            long j2 = i;
            float f3 = ((zv) aiuVar2.b.c(j2, zvVar, aiu.a, aiuVar2.d)).a;
            aiu aiuVar3 = aiu.this;
            aiuVar3.d = (zv) aiuVar3.b.d(j2, zvVar, aiu.a, aiuVar3.d);
            aiu aiuVar4 = aiu.this;
            aiuVar4.c = longValue;
            float f4 = aiuVar4.e - f3;
            aiuVar4.e = f3;
            this.c.a(Float.valueOf(f4));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aiu$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<Long, arnb> {
        final /* synthetic */ arqr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(arqr arqrVar) {
            super(1);
            this.b = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((Number) obj).longValue();
            aiu aiuVar = aiu.this;
            float f = aiuVar.e;
            aiuVar.e = brg.a;
            this.b.a(Float.valueOf(f));
            return arnb.a;
        }
    }

    public aiu(zr zrVar) {
        this.b = zrVar.a(aci.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (r13 != defpackage.brg.a) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009f -> B:24:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arqr r13, defpackage.arqg r14, defpackage.arpe r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiu.a(arqr, arqg, arpe):java.lang.Object");
    }
}
