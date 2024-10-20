package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyf extends apag implements apbu {
    public static final acyf a;
    private static volatile apca e;
    public int b;
    public acye c;
    public int d;

    static {
        acyf acyfVar = new acyf();
        a = acyfVar;
        apag.registerDefaultInstance(acyf.class, acyfVar);
    }

    private acyf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", amiv.c});
            case NEW_MUTABLE_INSTANCE:
                return new acyf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (acyf.class) {
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
