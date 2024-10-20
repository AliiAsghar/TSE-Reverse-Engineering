package defpackage;

import java.util.Currency;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqu extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        String j = aoroVar.j();
        try {
            return Currency.getInstance(j);
        } catch (IllegalArgumentException e) {
            throw new aook(hht.j(j, aoroVar, "Failed parsing '", "' as Currency; at path "), e);
        }
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        aorpVar.m(((Currency) obj).getCurrencyCode());
    }
}
