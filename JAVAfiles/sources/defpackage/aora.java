package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aora extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        return Boolean.valueOf(aoroVar.j());
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String bool;
        Boolean bool2 = (Boolean) obj;
        if (bool2 == null) {
            bool = "null";
        } else {
            bool = bool2.toString();
        }
        aorpVar.m(bool);
    }
}
