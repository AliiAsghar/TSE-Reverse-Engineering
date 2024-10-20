package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azi extends arrp implements arqr<bey, dnd> {
    public static final azi a = new azi();

    public azi() {
        super(1);
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bey beyVar = (bey) obj;
        Integer c = beyVar.c();
        if (c != null) {
            return new dnb(0, c.intValue() - djc.a(beyVar.c));
        }
        return null;
    }
}
