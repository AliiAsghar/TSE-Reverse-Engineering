package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aorc extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        try {
            int c = aoroVar.c();
            if (c <= 65535 && c >= -32768) {
                return Short.valueOf((short) c);
            }
            throw new aook("Lossy conversion from " + c + " to short; at path " + aoroVar.f());
        } catch (NumberFormatException e) {
            throw new aook(e);
        }
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        if (((Number) obj) == null) {
            aorpVar.j();
        } else {
            aorpVar.k(r4.shortValue());
        }
    }
}
