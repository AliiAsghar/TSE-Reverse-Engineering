package defpackage;

import defpackage.bzj;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzo extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    Object a;
    int b;
    final /* synthetic */ bzj c;
    final /* synthetic */ arqw d;
    final /* synthetic */ byd e;
    private /* synthetic */ Object f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bzo$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ arqw b;
        final /* synthetic */ byd c;
        private /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqw arqwVar, byd bydVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = arqwVar;
            this.c = bydVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                arwe arweVar = (arwe) this.d;
                arqw arqwVar = this.b;
                byd bydVar = this.c;
                this.a = 1;
                if (arqwVar.a(arweVar, bydVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, arpeVar);
            anonymousClass1.d = obj;
            return anonymousClass1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bzo$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<Set<? extends Object>, ces, arnb> {
        final /* synthetic */ bzj a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bzj bzjVar) {
            super(2);
            this.a = bzjVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            arvo arvoVar;
            int i;
            Set set = (Set) obj;
            bzj bzjVar = this.a;
            synchronized (bzjVar.d) {
                if (((bzj.d) bzjVar.n.c()).compareTo(bzj.d.e) >= 0) {
                    vh vhVar = bzjVar.p;
                    if (set instanceof cbj) {
                        vh vhVar2 = ((cbj) set).a;
                        Object[] objArr = vhVar2.b;
                        long[] jArr = vhVar2.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = i2 - length;
                                    int i4 = 0;
                                    while (true) {
                                        i = 8 - ((~i3) >>> 31);
                                        if (i4 >= i) {
                                            break;
                                        }
                                        if ((j & 255) < 128) {
                                            Object obj3 = objArr[(i2 << 3) + i4];
                                            if (!(obj3 instanceof cfh) || ((cfh) obj3).l(1)) {
                                                vhVar.j(obj3);
                                            }
                                        }
                                        j >>= 8;
                                        i4++;
                                    }
                                    if (i != 8) {
                                        break;
                                    }
                                }
                                if (i2 == length) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        for (Object obj4 : set) {
                            if (!(obj4 instanceof cfh) || ((cfh) obj4).l(1)) {
                                vhVar.j(obj4);
                            }
                        }
                    }
                    arvoVar = bzjVar.t();
                } else {
                    arvoVar = null;
                }
            }
            if (arvoVar != null) {
                arvoVar.w(arnb.a);
            }
            return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzo(bzj bzjVar, arqw arqwVar, byd bydVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = bzjVar;
        this.d = arqwVar;
        this.e = bydVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [cep] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        bzo bzoVar = new bzo(this.c, this.d, this.e, arpeVar);
        bzoVar.f = obj;
        return bzoVar;
    }
}
