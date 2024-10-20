package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aue {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aue$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ avc a;
        final /* synthetic */ cga b;
        final /* synthetic */ amj c;
        final /* synthetic */ atz d;
        final /* synthetic */ float e;
        final /* synthetic */ cfq.c f;
        final /* synthetic */ ain g;
        final /* synthetic */ boolean h;
        final /* synthetic */ cpz i;
        final /* synthetic */ aje j;
        final /* synthetic */ arqx k;
        final /* synthetic */ int l;
        final /* synthetic */ int m;
        final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(avc avcVar, cga cgaVar, amj amjVar, atz atzVar, float f, cfq.c cVar, ain ainVar, boolean z, cpz cpzVar, aje ajeVar, arqx arqxVar, int i, int i2, int i3) {
            super(2);
            this.a = avcVar;
            this.b = cgaVar;
            this.c = amjVar;
            this.d = atzVar;
            this.e = f;
            this.f = cVar;
            this.g = ainVar;
            this.h = z;
            this.i = cpzVar;
            this.j = ajeVar;
            this.k = arqxVar;
            this.l = i;
            this.m = i2;
            this.n = i3;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.l;
            int i2 = this.m;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            int i3 = this.n;
            aue.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (bwj) obj, a, a2, i3);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: aue$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ avc b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(avc avcVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = avcVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            Object obj2;
            Object obj3 = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                avc avcVar = this.b;
                this.a = 1;
                auv auvVar = avf.a;
                if (avcVar.j() - 1 < 0 || (obj2 = avc.y(avcVar, avcVar.j() - 1, null, this, 6)) != arpl.a) {
                    obj2 = arnb.a;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass2(this.b, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: aue$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ avc b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(avc avcVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = avcVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass3) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            Object obj2;
            Object obj3 = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                avc avcVar = this.b;
                this.a = 1;
                auv auvVar = avf.a;
                if (avcVar.j() + 1 >= avcVar.b() || (obj2 = avc.y(avcVar, avcVar.j() + 1, null, this, 6)) != arpl.a) {
                    obj2 = arnb.a;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass3(this.b, arpeVar);
        }
    }

    public static final boolean a(avc avcVar, arwe arweVar) {
        if (avcVar.g()) {
            arrn.J(arweVar, null, null, new AnonymousClass2(avcVar, null), 3);
            return true;
        }
        return false;
    }

    public static final boolean b(avc avcVar, arwe arweVar) {
        if (avcVar.h()) {
            arrn.J(arweVar, null, null, new AnonymousClass3(avcVar, null), 3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.avc r29, defpackage.cga r30, defpackage.amj r31, defpackage.atz r32, float r33, cfq.c r34, defpackage.ain r35, boolean r36, defpackage.cpz r37, defpackage.aje r38, defpackage.arqx r39, defpackage.bwj r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aue.c(avc, cga, amj, atz, float, cfq$c, ain, boolean, cpz, aje, arqx, bwj, int, int, int):void");
    }
}
