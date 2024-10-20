package defpackage;

import defpackage.cvc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bah implements cue {
    private final arqg a;
    private final arqg b;

    /* compiled from: PG */
    /* renamed from: bah$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ List a;
        final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, List list2) {
            super(1);
            this.a = list;
            this.b = list2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            long j;
            cvc.a aVar = (cvc.a) obj;
            List list = this.a;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    armo armoVar = (armo) list.get(i);
                    aVar.f((cvc) armoVar.a, ((dre) armoVar.b).a, brg.a);
                }
            }
            List list2 = this.b;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    armo armoVar2 = (armo) list2.get(i2);
                    cvc cvcVar = (cvc) armoVar2.a;
                    arqg arqgVar = (arqg) armoVar2.b;
                    if (arqgVar != null) {
                        j = ((dre) arqgVar.a()).a;
                    } else {
                        j = 0;
                    }
                    aVar.f(cvcVar, j, brg.a);
                }
            }
            return arnb.a;
        }
    }

    public bah(arqg arqgVar, arqg arqgVar2) {
        this.a = arqgVar;
        this.b = arqgVar2;
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
        armo armoVar;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((cuc) obj).f() instanceof bak)) {
                arrayList.add(obj);
            }
        }
        List list2 = (List) this.b.a();
        ArrayList arrayList2 = null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((cjp) list2.get(i2)) != null) {
                    armoVar = new armo(((cuc) arrayList.get(i2)).e(dqt.l((int) Math.floor(r9.d - r9.b), (int) Math.floor(r9.e - r9.c), 5)), new dre((Math.round(r9.b) << 32) | (Math.round(r9.c) & 4294967295L)));
                } else {
                    armoVar = null;
                }
                if (armoVar != null) {
                    arrayList3.add(armoVar);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((cuc) obj2).f() instanceof bak) {
                arrayList4.add(obj2);
            }
        }
        et = cuhVar.et(dqs.b(j), dqs.a(j), arnw.a, new AnonymousClass1(arrayList2, awp.a(arrayList4, this.a)));
        return et;
    }
}
