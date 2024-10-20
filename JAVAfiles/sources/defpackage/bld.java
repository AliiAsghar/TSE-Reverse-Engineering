package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.cfq;
import defpackage.cvc;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bld implements cue {
    public static final bld a = new bld();

    /* compiled from: PG */
    /* renamed from: bld$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ cvc d;
        final /* synthetic */ int e;
        final /* synthetic */ cvc f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc cvcVar, int i, int i2, cvc cvcVar2, int i3, cvc cvcVar3, int i4) {
            super(1);
            this.a = cvcVar;
            this.b = i;
            this.c = i2;
            this.d = cvcVar2;
            this.e = i3;
            this.f = cvcVar3;
            this.g = i4;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a aVar = (cvc.a) obj;
            cvc cvcVar = this.a;
            if (cvcVar != null) {
                int i = cfq.a;
                cvc.a.m(aVar, cvcVar, 0, cfq.a.k.a(this.b, this.c));
            }
            cvc.a.m(aVar, this.d, this.e, 0);
            cvc cvcVar2 = this.f;
            if (cvcVar2 != null) {
                int i2 = this.e + this.d.a;
                int i3 = cfq.a;
                cvc.a.m(aVar, cvcVar2, i2, cfq.a.k.a(this.g, this.c));
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
        cvc cvcVar;
        Object obj;
        cvc cvcVar2;
        Object obj2;
        cuf et;
        int size = list.size();
        int i = 0;
        while (true) {
            cvcVar = null;
            if (i < size) {
                obj = list.get(i);
                if (d.F(ctk.b((cuc) obj), "leadingIcon")) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        cuc cucVar = (cuc) obj;
        if (cucVar != null) {
            cvcVar2 = cucVar.e(dqs.k(j, 0, 0, 0, 0, 10));
        } else {
            cvcVar2 = null;
        }
        int b = btf.b(cvcVar2);
        int a2 = btf.a(cvcVar2);
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size2) {
                obj2 = list.get(i2);
                if (d.F(ctk.b((cuc) obj2), "trailingIcon")) {
                    break;
                }
                i2++;
            } else {
                obj2 = null;
                break;
            }
        }
        cuc cucVar2 = (cuc) obj2;
        if (cucVar2 != null) {
            cvcVar = cucVar2.e(dqs.k(j, 0, 0, 0, 0, 10));
        }
        cvc cvcVar3 = cvcVar;
        int b2 = btf.b(cvcVar3);
        int a3 = btf.a(cvcVar3);
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            cuc cucVar3 = (cuc) list.get(i3);
            if (d.F(ctk.b(cucVar3), ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)) {
                cvc e = cucVar3.e(dqt.k(j, -(b + b2), 0, 2));
                int i4 = e.a + b + b2;
                int max = Math.max(a2, Math.max(e.b, a3));
                et = cuhVar.et(i4, max, arnw.a, new AnonymousClass1(cvcVar2, a2, max, e, b, cvcVar3, a3));
                return et;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
