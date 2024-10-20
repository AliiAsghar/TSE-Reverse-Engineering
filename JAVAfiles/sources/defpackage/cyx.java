package defpackage;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyx implements Comparator<cxn> {
    public static final cyx a = new cyx();

    private cyx() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(cxn cxnVar, cxn cxnVar2) {
        cxn cxnVar3 = cxnVar;
        cxn cxnVar4 = cxnVar2;
        int a2 = arro.a(cxnVar4.n, cxnVar3.n);
        if (a2 != 0) {
            return a2;
        }
        return arro.a(cxnVar3.hashCode(), cxnVar4.hashCode());
    }
}
