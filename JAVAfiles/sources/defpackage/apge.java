package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apge extends apag implements apbu {
    public static final apge a;
    private static volatile apca g;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        apge apgeVar = new apge();
        a = apgeVar;
        apag.registerDefaultInstance(apge.class, apgeVar);
    }

    private apge() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", apez.u, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apge();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apge.class) {
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
