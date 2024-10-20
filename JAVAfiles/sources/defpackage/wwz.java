package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wwz extends apag implements apbu {
    public static final wwz a;
    private static volatile apca g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        wwz wwzVar = new wwz();
        a = wwzVar;
        apag.registerDefaultInstance(wwz.class, wwzVar);
    }

    private wwz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002\u0005ለ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new wwz();
            case 4:
                return new aozy(a);
            case 5:
                return a;
            case 6:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (wwz.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
