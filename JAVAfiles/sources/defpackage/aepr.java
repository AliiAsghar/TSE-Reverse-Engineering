package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepr extends arrp implements arqv {
    final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepr(boolean z, int i) {
        super(2);
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        boolean a;
        if (this.b != 0) {
            bwj bwjVar = (bwj) obj;
            ((Number) obj2).intValue();
            bwjVar.y(-1649614481);
            if (this.a) {
                a = true;
            } else {
                a = aef.a(bwjVar);
            }
            bwjVar.q();
            return Boolean.valueOf(a);
        }
        bwj bwjVar2 = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar2.L()) {
            bwjVar2.v();
        } else {
            adom.G(this.a, bwjVar2, 0);
        }
        return arnb.a;
    }
}
