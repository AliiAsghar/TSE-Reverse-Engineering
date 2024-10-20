package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arua extends arrp implements arqr {
    private final /* synthetic */ int h;
    public static final arua g = new arua(6);
    public static final arua f = new arua(5);
    public static final arua e = new arua(4);
    public static final arua d = new arua(3);
    public static final arua c = new arua(2);
    public static final arua b = new arua(1);
    public static final arua a = new arua(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arua(int i) {
        super(1);
        this.h = i;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.h;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            arpg arpgVar = (arpg) obj;
                            if (!(arpgVar instanceof arxe)) {
                                return null;
                            }
                            return (arxe) arpgVar;
                        }
                        arpg arpgVar2 = (arpg) obj;
                        if (!(arpgVar2 instanceof arwb)) {
                            return null;
                        }
                        return (arwb) arpgVar2;
                    }
                    String str = (String) obj;
                    str.getClass();
                    return str;
                }
                if (obj != null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            return albo.bI(true);
        }
        artx artxVar = (artx) obj;
        artxVar.getClass();
        return artxVar.a();
    }
}
