package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amee extends apag implements apbu {
    public static final apap a = new qex(14);
    public static final amee b;
    private static volatile apca k;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public apao j = emptyIntList();

    static {
        amee ameeVar = new amee();
        b = ameeVar;
        apag.registerDefaultInstance(amee.class, ameeVar);
    }

    private amee() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ࠬ", new Object[]{"c", "d", ahbp.s, "e", ahbp.q, "f", "g", amna.k, "h", "i", "j", ahbp.r});
            case NEW_MUTABLE_INSTANCE:
                return new amee();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (amee.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
