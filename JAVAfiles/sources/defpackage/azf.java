package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azf extends arrp implements arqr<bey, dnd> {
    public static final azf a = new azf();

    public azf() {
        super(1);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bey beyVar = (bey) obj;
        Integer f = beyVar.f();
        if (f != null) {
            return new dnb(djc.a(beyVar.c) - f.intValue(), 0);
        }
        return null;
    }
}
