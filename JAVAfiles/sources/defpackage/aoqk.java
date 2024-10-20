package defpackage;

import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqk extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        String j = aoroVar.j();
        try {
            return aotl.w(j);
        } catch (NumberFormatException e) {
            throw new aook(hht.j(j, aoroVar, "Failed parsing '", "' as BigDecimal; at path "), e);
        }
    }

    @Override // defpackage.aoon
    public final /* synthetic */ void b(aorp aorpVar, Object obj) {
        aorpVar.l((BigDecimal) obj);
    }
}
