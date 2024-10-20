package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azh extends arrp implements arqr<bey, dnd> {
    public static final azh a = new azh();

    public azh() {
        super(1);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bey beyVar = (bey) obj;
        Integer d = beyVar.d();
        if (d != null) {
            return new dnb(djc.a(beyVar.c) - d.intValue(), 0);
        }
        return null;
    }
}
