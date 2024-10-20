package defpackage;

import defpackage.cvc;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aye implements cue {
    public final arqg a;

    /* compiled from: PG */
    /* renamed from: aye$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ List a;
        final /* synthetic */ aye b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, aye ayeVar) {
            super(1);
            this.a = list;
            this.b = ayeVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            long j;
            cvc.a aVar = (cvc.a) obj;
            List a = awp.a(this.a, this.b.a);
            if (a != null) {
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    armo armoVar = (armo) a.get(i);
                    cvc cvcVar = (cvc) armoVar.a;
                    arqg arqgVar = (arqg) armoVar.b;
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

    public aye(arqg arqgVar) {
        this.a = arqgVar;
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
        et = cuhVar.et(dqs.b(j), dqs.a(j), arnw.a, new AnonymousClass1(list, this));
        return et;
    }
}
