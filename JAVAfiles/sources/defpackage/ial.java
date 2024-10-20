package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ial extends apag implements apbu {
    public static final ial a;
    private static volatile apca e;
    public int b;
    public iam c;
    public ian d;

    static {
        ial ialVar = new ial();
        a = ialVar;
        apag.registerDefaultInstance(ial.class, ialVar);
    }

    private ial() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new ial();
            case 4:
                return new aozy(a);
            case 5:
                return a;
            case 6:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (ial.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
