package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqp extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        return new StringBuffer(aoroVar.j());
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String stringBuffer;
        StringBuffer stringBuffer2 = (StringBuffer) obj;
        if (stringBuffer2 == null) {
            stringBuffer = null;
        } else {
            stringBuffer = stringBuffer2.toString();
        }
        aorpVar.m(stringBuffer);
    }
}
