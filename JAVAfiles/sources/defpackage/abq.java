package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abq {

    /* compiled from: PG */
    /* renamed from: abq$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T, V extends zz> extends arps {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int d;
        zt e;
        arsb f;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return abq.b(null, null, 0L, null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: abq$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<Long, arnb> {
        final /* synthetic */ arsb a;
        final /* synthetic */ Object b;
        final /* synthetic */ zn c;
        final /* synthetic */ zz d;
        final /* synthetic */ zt e;
        final /* synthetic */ float f;
        final /* synthetic */ arqr g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arsb arsbVar, Object obj, zn znVar, zz zzVar, zt ztVar, float f, arqr arqrVar) {
            super(1);
            this.a = arsbVar;
            this.b = obj;
            this.c = znVar;
            this.d = zzVar;
            this.e = ztVar;
            this.f = f;
            this.g = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            long longValue = ((Number) obj).longValue();
            zn znVar = this.c;
            acg c = znVar.c();
            znVar.g();
            zq zqVar = new zq(this.b, c, this.d, longValue, longValue, new abr(this.e));
            abq.f(zqVar, longValue, this.f, this.c, this.e, this.g);
            this.a.a = zqVar;
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: abq$3 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqg<arnb> {
        final /* synthetic */ zt a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(zt ztVar) {
            super(0);
            this.a = ztVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            this.a.e = false;
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: abq$4 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<Long, arnb> {
        final /* synthetic */ arsb a;
        final /* synthetic */ float b;
        final /* synthetic */ zn c;
        final /* synthetic */ zt d;
        final /* synthetic */ arqr e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(arsb arsbVar, float f, zn znVar, zt ztVar, arqr arqrVar) {
            super(1);
            this.a = arsbVar;
            this.b = f;
            this.c = znVar;
            this.d = ztVar;
            this.e = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            long longValue = ((Number) obj).longValue();
            Object obj2 = this.a.a;
            obj2.getClass();
            abq.f((zq) obj2, longValue, this.b, this.c, this.d, this.e);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: abq$5 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqr<zq, arnb> {
        public static final AnonymousClass5 a = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: abq$6 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqr {
        final /* synthetic */ arqr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(arqr arqrVar) {
            super(1);
            this.a = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return this.a.a(Long.valueOf(((Number) obj).longValue()));
        }
    }

    public static final float a(arpi arpiVar) {
        float f;
        cge cgeVar = (cge) arpiVar.get(cge.a);
        if (cgeVar != null) {
            f = cgeVar.a();
        } else {
            f = 1.0f;
        }
        if (f < brg.a) {
            abi.b("negative scale factor");
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6 A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x003a, blocks: (B:12:0x0035, B:14:0x00c9, B:16:0x00d6), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r28v1, types: [arqr] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.zt r23, defpackage.zn r24, long r25, defpackage.arqr r27, defpackage.arpe r28) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abq.b(zt, zn, long, arqr, arpe):java.lang.Object");
    }

    public static final Object c(float f, float f2, float f3, zr zrVar, arqv arqvVar, arpe arpeVar) {
        acg acgVar = aci.a;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        ach achVar = (ach) acgVar;
        zz zzVar = (zz) achVar.a.a(new Float(f3));
        if (zzVar == null) {
            zzVar = ((zz) achVar.a.a(f4)).c();
        }
        zz zzVar2 = zzVar;
        Object b = b(new zt(acgVar, f4, zzVar2, 56), new abs(zrVar, acgVar, f4, f5, zzVar2), Long.MIN_VALUE, new abp(arqvVar, acgVar), arpeVar);
        arpl arplVar = arpl.a;
        if (b != arplVar) {
            b = arnb.a;
        }
        if (b == arplVar) {
            return b;
        }
        return arnb.a;
    }

    public static final Object d(zt ztVar, aag aagVar, boolean z, arqr arqrVar, arpe arpeVar) {
        long j;
        aaf aafVar = new aaf(aagVar, ztVar.a, ztVar.a(), ztVar.b);
        if (z) {
            j = ztVar.c;
        } else {
            j = Long.MIN_VALUE;
        }
        Object b = b(ztVar, aafVar, j, arqrVar, arpeVar);
        if (b == arpl.a) {
            return b;
        }
        return arnb.a;
    }

    public static final Object e(zt ztVar, Object obj, zr zrVar, boolean z, arqr arqrVar, arpe arpeVar) {
        long j;
        abs absVar = new abs(zrVar, ztVar.a, ztVar.a(), obj, ztVar.b);
        if (z) {
            j = ztVar.c;
        } else {
            j = Long.MIN_VALUE;
        }
        Object b = b(ztVar, absVar, j, arqrVar, arpeVar);
        if (b == arpl.a) {
            return b;
        }
        return arnb.a;
    }

    public static final void f(zq zqVar, long j, float f, zn znVar, zt ztVar, arqr arqrVar) {
        long j2;
        if (f == brg.a) {
            j2 = znVar.a();
        } else {
            j2 = ((float) (j - zqVar.a)) / f;
        }
        zqVar.d = j;
        zqVar.b.h(znVar.d(j2));
        zqVar.c = znVar.b(j2);
        if (znVar.e(j2)) {
            zqVar.e = zqVar.d;
            zqVar.e();
        }
        g(zqVar, ztVar);
        arqrVar.a(zqVar);
    }

    public static final void g(zq zqVar, zt ztVar) {
        ztVar.c(zqVar.a());
        zz zzVar = ztVar.b;
        zz zzVar2 = zqVar.c;
        int b = zzVar.b();
        for (int i = 0; i < b; i++) {
            zzVar.e(i, zzVar2.a(i));
        }
        ztVar.d = zqVar.e;
        ztVar.c = zqVar.d;
        ztVar.e = zqVar.d();
    }

    public static /* synthetic */ Object h(float f, float f2, zr zrVar, arqv arqvVar, arpe arpeVar, int i) {
        if ((i & 8) != 0) {
            zrVar = zs.c(brg.a, brg.a, null, 7);
        }
        return c(f, f2, brg.a, zrVar, arqvVar, arpeVar);
    }

    public static /* synthetic */ Object j(zt ztVar, Object obj, zr zrVar, boolean z, arqr arqrVar, arpe arpeVar, int i) {
        boolean z2;
        if ((i & 2) != 0) {
            zrVar = zs.c(brg.a, brg.a, null, 7);
        }
        zr zrVar2 = zrVar;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z2 & z;
        if ((i & 8) != 0) {
            arqrVar = AnonymousClass5.a;
        }
        return e(ztVar, obj, zrVar2, z3, arqrVar, arpeVar);
    }

    private static final Object k(zn znVar, arqr arqrVar, arpe arpeVar) {
        if (znVar.f()) {
            return aav.a(arqrVar, arpeVar);
        }
        return byf.c(new AnonymousClass6(arqrVar), arpeVar);
    }
}
