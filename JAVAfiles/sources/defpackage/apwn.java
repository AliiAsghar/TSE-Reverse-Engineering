package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apwn extends apag implements apbu {
    public static final apwn a;
    private static volatile apca f;
    public int b;
    public int d;
    public String c = "";
    public aozb e = aozb.b;

    static {
        apwn apwnVar = new apwn();
        a = apwnVar;
        apag.registerDefaultInstance(apwn.class, apwnVar);
    }

    private apwn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", apwb.c, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apwn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (apwn.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
