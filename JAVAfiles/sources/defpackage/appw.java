package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class appw extends apag implements apbu {
    public static final appw a;
    private static volatile apca h;
    public int b;
    public int c;
    public apax d = emptyProtobufList();
    public appm e;
    public int f;
    public long g;

    static {
        appw appwVar = new appw();
        a = appwVar;
        apag.registerDefaultInstance(appw.class, appwVar);
    }

    private appw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0005\f\u0006\u0002", new Object[]{"b", "c", "d", appm.class, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new appw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (appw.class) {
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
