package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wrg extends apag implements apbu {
    public static final wrg a;
    private static volatile apca h;
    public int b;
    public wrd c;
    public apax d = emptyProtobufList();
    public apct e;
    public wrv f;
    public int g;

    static {
        wrg wrgVar = new wrg();
        a = wrgVar;
        apag.registerDefaultInstance(wrg.class, wrgVar);
    }

    private wrg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဌ\u0003", new Object[]{"b", "c", "d", wrf.class, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new wrg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (wrg.class) {
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
