package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asfp extends arrp implements arqv {
    private final /* synthetic */ int c;
    public static final asfp b = new asfp(1);
    public static final asfp a = new asfp(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asfp(int i) {
        super(2);
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            aryk arykVar = (aryk) obj;
            arpg arpgVar = (arpg) obj2;
            if (arykVar == null) {
                if (arpgVar instanceof aryk) {
                    return (aryk) arpgVar;
                }
                return null;
            }
            return arykVar;
        }
        asft asftVar = (asft) obj;
        arpg arpgVar2 = (arpg) obj2;
        if (arpgVar2 instanceof aryk) {
            aryk arykVar2 = (aryk) arpgVar2;
            Object a2 = arykVar2.a(asftVar.a);
            Object[] objArr = asftVar.b;
            int i = asftVar.d;
            objArr[i] = a2;
            aryk[] arykVarArr = asftVar.c;
            asftVar.d = i + 1;
            arykVar2.getClass();
            arykVarArr[i] = arykVar2;
        }
        return asftVar;
    }
}
