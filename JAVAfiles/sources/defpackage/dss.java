package defpackage;

import defpackage.cvc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dss implements cue {
    public static final dss a = new dss();

    /* compiled from: PG */
    /* renamed from: dss$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list) {
            super(1);
            this.a = list;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            List list = this.a;
            cvc.a aVar = (cvc.a) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cvc.a.m(aVar, (cvc) list.get(i), 0, 0);
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
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            cvc e = ((cuc) list.get(i3)).e(j);
            i2 = Math.max(i2, e.a);
            i = Math.max(i, e.b);
            arrayList.add(e);
        }
        if (list.isEmpty()) {
            i2 = dqs.d(j);
            i = dqs.c(j);
        }
        et = cuhVar.et(i2, i, arnw.a, new AnonymousClass1(arrayList));
        return et;
    }
}
