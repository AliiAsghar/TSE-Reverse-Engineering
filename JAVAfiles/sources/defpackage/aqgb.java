package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqgb extends apag implements apbu {
    public static final aqgb a;
    private static volatile apca j;
    public int b;
    public String c = "";
    public String d;
    public aozb e;
    public aqfl f;
    public aqfn g;
    public atol h;
    public int i;

    static {
        aqgb aqgbVar = new aqgb();
        a = aqgbVar;
        apag.registerDefaultInstance(aqgb.class, aqgbVar);
    }

    private aqgb() {
        aozb aozbVar = aozb.b;
        this.d = "";
        this.e = aozb.b;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001Ê\u0007\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0006\n\u0007ဉ\u0000\nဉ\u0001\u0010ဉ\u0005Ê\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aqgb();
            case 4:
                return new aozy(a);
            case 5:
                return a;
            case 6:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (aqgb.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
