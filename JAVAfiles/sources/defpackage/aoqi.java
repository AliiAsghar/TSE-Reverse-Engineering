package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqi extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        String j = aoroVar.j();
        if (j.length() == 1) {
            return Character.valueOf(j.charAt(0));
        }
        throw new aook(hht.j(j, aoroVar, "Expecting character, got: ", "; at "));
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String obj2;
        Character ch = (Character) obj;
        if (ch == null) {
            obj2 = null;
        } else {
            obj2 = ch.toString();
        }
        aorpVar.m(obj2);
    }
}
