package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atok extends apag implements apbu {
    public static final atok a;
    private static volatile apca c;
    public String b = "";

    static {
        atok atokVar = new atok();
        a = atokVar;
        apag.registerDefaultInstance(atok.class, atokVar);
    }

    private atok() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
            case 3:
                return new atok();
            case 4:
                return new aozy(a);
            case 5:
                return a;
            case 6:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (atok.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
