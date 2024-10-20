package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class appv extends apag implements apbu {
    public static final appv a;
    private static volatile apca h;
    public int b;
    public int c;
    public apax d = emptyProtobufList();
    public appm e;
    public int f;
    public long g;

    static {
        appv appvVar = new appv();
        a = appvVar;
        apag.registerDefaultInstance(appv.class, appvVar);
    }

    private appv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\f\u0005\u0002", new Object[]{"b", "c", "d", appm.class, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new appv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (appv.class) {
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
