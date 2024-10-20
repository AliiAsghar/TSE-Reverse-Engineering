package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.cvc;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class brh implements cue {
    final /* synthetic */ arqv a;

    /* compiled from: PG */
    /* renamed from: brh$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc cvcVar, int i) {
            super(1);
            this.a = cvcVar;
            this.b = i;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a aVar = (cvc.a) obj;
            cvc cvcVar = this.a;
            if (cvcVar != null) {
                int i = this.b;
                float f = brg.a;
                cvc.a.m(aVar, cvcVar, 0, (i - cvcVar.b) / 2);
            }
            return arnb.a;
        }
    }

    public brh(arqv arqvVar) {
        this.a = arqvVar;
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
        int i;
        cuf et;
        int i2 = 0;
        if (this.a != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                cuc cucVar = (cuc) list.get(i3);
                if (d.F(ctk.b(cucVar), ConversationSuggestion.SUGGESTION_PROPERTY_TEXT)) {
                    cvcVar = cucVar.e(dqs.k(j, 0, 0, 0, 0, 11));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        cvcVar = null;
        if (cvcVar != null) {
            i = cvcVar.a;
        } else {
            i = 0;
        }
        int max = Math.max(i, 0);
        int eo = cuhVar.eo(brg.a);
        if (cvcVar != null) {
            i2 = cvcVar.b;
        }
        int max2 = Math.max(eo, i2 + cuhVar.en(brg.c));
        if (cvcVar != null) {
            cvcVar.ei(csi.a);
        }
        if (cvcVar != null) {
            cvcVar.ei(csi.b);
        }
        et = cuhVar.et(max, max2, arnw.a, new AnonymousClass1(cvcVar, max2));
        return et;
    }
}
