package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoql extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        String j = aoroVar.j();
        try {
            return aotl.x(j);
        } catch (NumberFormatException e) {
            throw new aook(hht.j(j, aoroVar, "Failed parsing '", "' as BigInteger; at path "), e);
        }
    }

    @Override // defpackage.aoon
    public final /* synthetic */ void b(aorp aorpVar, Object obj) {
        aorpVar.l((BigInteger) obj);
    }
}
