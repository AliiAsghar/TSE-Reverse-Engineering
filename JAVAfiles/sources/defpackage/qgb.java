package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qgb extends apag implements apbu {
    public static final qgb a;
    private static volatile apca h;
    public int b;
    public qei c;
    public String d = "";
    public String e = "";
    public aozb f = aozb.b;
    public qei g;

    static {
        qgb qgbVar = new qgb();
        a = qgbVar;
        apag.registerDefaultInstance(qgb.class, qgbVar);
    }

    private qgb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new qgb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (qgb.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
