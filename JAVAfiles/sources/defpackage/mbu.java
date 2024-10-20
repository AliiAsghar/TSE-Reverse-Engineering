package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbu extends apag implements apbu {
    public static final mbu a;
    private static volatile apca f;
    public int b;
    public mbz c;
    public mca d;
    public apax e = emptyProtobufList();
    private int g;

    static {
        mbu mbuVar = new mbu();
        a = mbuVar;
        apag.registerDefaultInstance(mbu.class, mbuVar);
    }

    private mbu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"g", "b", hzn.i, "c", "d", "e", mbi.class});
            case NEW_MUTABLE_INSTANCE:
                return new mbu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (mbu.class) {
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
