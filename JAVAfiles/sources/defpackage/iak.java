package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iak extends apag implements apbu {
    public static final iak a;
    private static volatile apca g;
    public int b;
    public int c;
    public long d;
    public iae e;
    public int f;

    static {
        iak iakVar = new iak();
        a = iakVar;
        apag.registerDefaultInstance(iak.class, iakVar);
    }

    private iak() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဃ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", hzn.d, "d", "e", "f", hzn.e});
            case 3:
                return new iak();
            case 4:
                return new aozy(a);
            case 5:
                return a;
            case 6:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (iak.class) {
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
