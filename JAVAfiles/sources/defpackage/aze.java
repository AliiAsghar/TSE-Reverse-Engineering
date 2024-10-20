package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aze extends arrp implements arqr<bey, dnd> {
    public static final aze a = new aze();

    public aze() {
        super(1);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bey beyVar = (bey) obj;
        int a2 = beyVar.a();
        if (a2 != -1) {
            return new dnb(0, a2 - djc.a(beyVar.c));
        }
        return null;
    }
}
