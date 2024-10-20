package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azg extends arrp implements arqr<bey, dnd> {
    public static final azg a = new azg();

    public azg() {
        super(1);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bey beyVar = (bey) obj;
        Integer e = beyVar.e();
        if (e != null) {
            return new dnb(0, e.intValue() - djc.a(beyVar.c));
        }
        return null;
    }
}
