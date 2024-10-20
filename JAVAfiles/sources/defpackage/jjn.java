package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjn extends arrp implements arqx {
    private final /* synthetic */ int c;
    public static final jjn b = new jjn(1);
    public static final jjn a = new jjn(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjn(int i) {
        super(4);
        this.c = i;
    }

    @Override // defpackage.arqx
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        if (this.c != 0) {
            ((Boolean) obj4).booleanValue();
            obj.getClass();
            obj2.getClass();
            return arnb.a;
        }
        cga cgaVar = (cga) obj;
        bqn bqnVar = (bqn) obj2;
        bwj bwjVar = (bwj) obj3;
        int intValue = ((Number) obj4).intValue();
        cgaVar.getClass();
        bqnVar.getClass();
        if ((intValue & 14) == 0) {
            if (true != bwjVar.G(cgaVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i = i3 | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 112) == 0) {
            if (true != bwjVar.G(bqnVar)) {
                i2 = 16;
            } else {
                i2 = 32;
            }
            i |= i2;
        }
        if ((i & 731) == 146 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bqk.a(bqnVar, ani.a(cgaVar), null, bwjVar, (i >> 3) & 14, 4);
        }
        return arnb.a;
    }
}
