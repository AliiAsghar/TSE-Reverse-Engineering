package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aont extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        return Float.valueOf((float) aoroVar.a());
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            aorpVar.j();
            return;
        }
        float floatValue = number.floatValue();
        aonx.k(floatValue);
        if (!(number instanceof Float)) {
            number = Float.valueOf(floatValue);
        }
        aorpVar.l(number);
    }
}
