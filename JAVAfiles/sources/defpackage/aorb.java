package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aorb extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        try {
            int c = aoroVar.c();
            if (c <= 255 && c >= -128) {
                return Byte.valueOf((byte) c);
            }
            throw new aook("Lossy conversion from " + c + " to byte; at path " + aoroVar.f());
        } catch (NumberFormatException e) {
            throw new aook(e);
        }
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        if (((Number) obj) == null) {
            aorpVar.j();
        } else {
            aorpVar.k(r4.byteValue());
        }
    }
}
