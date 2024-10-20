package defpackage;

import defpackage.cvc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsz implements cue {
    public static final dsz a = new dsz();

    /* compiled from: PG */
    /* renamed from: dsz$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
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
    /* renamed from: dsz$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cvc cvcVar) {
            super(1);
            this.a = cvcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a.m((cvc.a) obj, this.a, 0, 0);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: dsz$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List list) {
            super(1);
            this.a = list;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a aVar = (cvc.a) obj;
            int z = aqjn.z(this.a);
            if (z >= 0) {
                int i = 0;
                while (true) {
                    cvc.a.m(aVar, (cvc) this.a.get(i), 0, 0);
                    if (i == z) {
                        break;
                    }
                    i++;
                }
            }
            return arnb.a;
        }
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
        cuf et;
        cuf et2;
        cuf et3;
        int size = list.size();
        if (size == 0) {
            et = cuhVar.et(0, 0, arnw.a, AnonymousClass1.a);
            return et;
        }
        if (size != 1) {
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                cvc e = ((cuc) list.get(i3)).e(j);
                i = Math.max(i, e.a);
                i2 = Math.max(i2, e.b);
                arrayList.add(e);
            }
            et3 = cuhVar.et(i, i2, arnw.a, new AnonymousClass3(arrayList));
            return et3;
        }
        cvc e2 = ((cuc) list.get(0)).e(j);
        et2 = cuhVar.et(e2.a, e2.b, arnw.a, new AnonymousClass2(e2));
        return et2;
    }
}
