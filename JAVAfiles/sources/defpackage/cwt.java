package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwt {
    public static final Comparator a = new Comparator<cxn>() { // from class: cwt.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(cxn cxnVar, cxn cxnVar2) {
            cxn cxnVar3 = cxnVar;
            cxn cxnVar4 = cxnVar2;
            int a2 = arro.a(cxnVar3.n, cxnVar4.n);
            if (a2 != 0) {
                return a2;
            }
            return arro.a(cxnVar3.hashCode(), cxnVar4.hashCode());
        }
    };
}
