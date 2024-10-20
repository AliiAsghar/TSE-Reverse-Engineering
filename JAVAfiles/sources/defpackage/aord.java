package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aord extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        try {
            return Integer.valueOf(aoroVar.c());
        } catch (NumberFormatException e) {
            throw new aook(e);
        }
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        if (((Number) obj) == null) {
            aorpVar.j();
        } else {
            aorpVar.k(r4.intValue());
        }
    }
}
