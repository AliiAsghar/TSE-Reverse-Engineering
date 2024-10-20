package defpackage;

import defpackage.cvc;
import defpackage.dqs;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akd implements cue {
    public final cfq a;
    private final boolean b;

    /* compiled from: PG */
    /* renamed from: akd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return a.bF(obj);
        }
    }

    /* compiled from: PG */
    /* renamed from: akd$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;
        final /* synthetic */ cuc b;
        final /* synthetic */ cuh c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;
        final /* synthetic */ akd f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cvc cvcVar, cuc cucVar, cuh cuhVar, int i, int i2, akd akdVar) {
            super(1);
            this.a = cvcVar;
            this.b = cucVar;
            this.c = cuhVar;
            this.d = i;
            this.e = i2;
            this.f = akdVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            akc.c((cvc.a) obj, this.a, this.b, this.c.q(), this.d, this.e, this.f.a);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: akd$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc[] a;
        final /* synthetic */ List b;
        final /* synthetic */ cuh c;
        final /* synthetic */ arrz d;
        final /* synthetic */ arrz e;
        final /* synthetic */ akd f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(cvc[] cvcVarArr, List list, cuh cuhVar, arrz arrzVar, arrz arrzVar2, akd akdVar) {
            super(1);
            this.a = cvcVarArr;
            this.b = list;
            this.c = cuhVar;
            this.d = arrzVar;
            this.e = arrzVar2;
            this.f = akdVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a aVar = (cvc.a) obj;
            int i = 0;
            int i2 = 0;
            while (true) {
                cvc[] cvcVarArr = this.a;
                if (i2 < cvcVarArr.length) {
                    akd akdVar = this.f;
                    arrz arrzVar = this.e;
                    arrz arrzVar2 = this.d;
                    cuh cuhVar = this.c;
                    List list = this.b;
                    cvc cvcVar = cvcVarArr[i2];
                    cvcVar.getClass();
                    akc.c(aVar, cvcVar, (cuc) list.get(i), cuhVar.q(), arrzVar2.a, arrzVar.a, akdVar.a);
                    i2++;
                    i++;
                } else {
                    return arnb.a;
                }
            }
        }
    }

    public akd(cfq cfqVar, boolean z) {
        this.a = cfqVar;
        this.b = z;
    }

    @Override // defpackage.cue
    public final /* synthetic */ int a(ctd ctdVar, List list, int i) {
        return cud.a(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int b(ctd ctdVar, List list, int i) {
        return cud.b(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int c(ctd ctdVar, List list, int i) {
        return cud.c(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final /* synthetic */ int d(ctd ctdVar, List list, int i) {
        return cud.d(this, ctdVar, list, i);
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        long j2;
        cuf et;
        int i;
        int i2;
        int d;
        int c;
        cvc e;
        cuf et2;
        cuf et3;
        if (list.isEmpty()) {
            et3 = cuhVar.et(dqs.d(j), dqs.c(j), arnw.a, AnonymousClass1.a);
            return et3;
        }
        if (this.b) {
            j2 = j;
        } else {
            j2 = j & (-8589934589L);
        }
        if (list.size() == 1) {
            cuc cucVar = (cuc) list.get(0);
            if (!akc.d(cucVar)) {
                e = cucVar.e(j2);
                d = Math.max(dqs.d(j), e.a);
                c = Math.max(dqs.c(j), e.b);
            } else {
                d = dqs.d(j);
                c = dqs.c(j);
                e = cucVar.e(dqs.a.c(dqs.d(j), dqs.c(j)));
            }
            int i3 = d;
            int i4 = c;
            et2 = cuhVar.et(i3, i4, arnw.a, new AnonymousClass2(e, cucVar, cuhVar, i3, i4, this));
            return et2;
        }
        cvc[] cvcVarArr = new cvc[list.size()];
        arrz arrzVar = new arrz();
        arrzVar.a = dqs.d(j);
        arrz arrzVar2 = new arrz();
        arrzVar2.a = dqs.c(j);
        int size = list.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            cuc cucVar2 = (cuc) list.get(i5);
            if (!akc.d(cucVar2)) {
                cvc e2 = cucVar2.e(j2);
                cvcVarArr[i5] = e2;
                arrzVar.a = Math.max(arrzVar.a, e2.a);
                arrzVar2.a = Math.max(arrzVar2.a, e2.b);
            } else {
                z = true;
            }
        }
        if (z) {
            int i6 = arrzVar.a;
            if (i6 != Integer.MAX_VALUE) {
                i = i6;
            } else {
                i = 0;
            }
            int i7 = arrzVar2.a;
            if (i7 != Integer.MAX_VALUE) {
                i2 = i7;
            } else {
                i2 = 0;
            }
            long d2 = dqt.d(i, i6, i2, i7);
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                cuc cucVar3 = (cuc) list.get(i8);
                if (akc.d(cucVar3)) {
                    cvcVarArr[i8] = cucVar3.e(d2);
                }
            }
        }
        et = cuhVar.et(arrzVar.a, arrzVar2.a, arnw.a, new AnonymousClass3(cvcVarArr, list, cuhVar, arrzVar, arrzVar2, this));
        return et;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akd)) {
            return false;
        }
        akd akdVar = (akd) obj;
        if (d.F(this.a, akdVar.a) && this.b == akdVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.v(this.b);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
