package defpackage;

import defpackage.cvc;
import defpackage.cxn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvg extends cxn.b {
    public static final cvg a = new cvg();

    /* compiled from: PG */
    /* renamed from: cvg$1, reason: invalid class name */
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
    /* renamed from: cvg$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cvc cvcVar) {
            super(1);
            this.a = cvcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a.o((cvc.a) obj, this.a, 0, 0);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cvg$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List list) {
            super(1);
            this.a = list;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            List list = this.a;
            cvc.a aVar = (cvc.a) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cvc.a.o(aVar, (cvc) list.get(i), 0, 0);
            }
            return arnb.a;
        }
    }

    private cvg() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.cue
    public final cuf e(cuh cuhVar, List list, long j) {
        cuf et;
        cuf et2;
        cuf et3;
        int size = list.size();
        if (size == 0) {
            et = cuhVar.et(dqs.d(j), dqs.c(j), arnw.a, AnonymousClass1.a);
            return et;
        }
        if (size != 1) {
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                cvc e = ((cuc) list.get(i3)).e(j);
                i = Math.max(e.a, i);
                i2 = Math.max(e.b, i2);
                arrayList.add(e);
            }
            et3 = cuhVar.et(dqt.c(j, i), dqt.b(j, i2), arnw.a, new AnonymousClass3(arrayList));
            return et3;
        }
        cvc e2 = ((cuc) list.get(0)).e(j);
        et2 = cuhVar.et(dqt.c(j, e2.a), dqt.b(j, e2.b), arnw.a, new AnonymousClass2(e2));
        return et2;
    }
}
