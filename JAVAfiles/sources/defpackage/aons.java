package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aons extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        return Double.valueOf(aoroVar.a());
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            aorpVar.j();
            return;
        }
        double doubleValue = number.doubleValue();
        aonx.k(doubleValue);
        aorpVar.c();
        if (aorpVar.d != 1 && (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + doubleValue);
        }
        aorpVar.a();
        aorpVar.a.append((CharSequence) Double.toString(doubleValue));
    }
}
