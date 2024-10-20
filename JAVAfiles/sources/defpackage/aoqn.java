package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqn extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        return new StringBuilder(aoroVar.j());
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String sb;
        StringBuilder sb2 = (StringBuilder) obj;
        if (sb2 == null) {
            sb = null;
        } else {
            sb = sb2.toString();
        }
        aorpVar.m(sb);
    }
}
