package defpackage;

import defpackage.bwj;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajm {

    /* compiled from: PG */
    /* renamed from: ajm$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ ajq b;
        final /* synthetic */ byn c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ajq ajqVar, byn bynVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = ajqVar;
            this.c = bynVar;
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
                final ArrayList arrayList = new ArrayList();
                ajq ajqVar = this.b;
                final byn bynVar = this.c;
                asai a = ajqVar.a();
                asaj asajVar = new asaj() { // from class: ajm.1.1
                    @Override // defpackage.asaj
                    public final /* bridge */ /* synthetic */ Object fv(Object obj2, arpe arpeVar) {
                        ajp ajpVar = (ajp) obj2;
                        if (ajpVar instanceof ajk) {
                            arrayList.add(ajpVar);
                        } else if (ajpVar instanceof ajl) {
                            arrayList.remove(((ajl) ajpVar).a);
                        }
                        bynVar.h(Boolean.valueOf(!arrayList.isEmpty()));
                        return arnb.a;
                    }
                };
                this.a = 1;
                if (ascj.g((ascj) a, asajVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.b, this.c, arpeVar);
        }
    }

    public static final cas a(ajq ajqVar, bwj bwjVar, int i) {
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        boolean z = false;
        if (T == bwj.a.a) {
            byu byuVar = new byu(false, cav.a);
            bwkVar.ad(byuVar);
            T = byuVar;
        }
        byn bynVar = (byn) T;
        if ((((i & 14) ^ 6) > 4 && bwjVar.G(ajqVar)) || (i & 6) == 4) {
            z = true;
        }
        Object T2 = bwkVar.T();
        if (z || T2 == bwj.a.a) {
            T2 = new AnonymousClass1(ajqVar, bynVar, null);
            bwkVar.ad(T2);
        }
        bxl.g(ajqVar, (arqv) T2, bwjVar);
        return bynVar;
    }
}
