package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class appz extends apag implements apbu {
    public static final appz a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public apax e = emptyProtobufList();
    public appm f;
    public long g;

    static {
        appz appzVar = new appz();
        a = appzVar;
        apag.registerDefaultInstance(appz.class, appzVar);
    }

    private appz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u0004\u0003\u001b\u0004ဉ\u0000\u0005\u0002", new Object[]{"b", "c", "d", "e", appm.class, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new appz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (appz.class) {
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
