package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wkw extends apag implements apbu {
    public static final wkw a;
    private static volatile apca e;
    public int b;
    public wku c;
    public apax d = emptyProtobufList();

    static {
        wkw wkwVar = new wkw();
        a = wkwVar;
        apag.registerDefaultInstance(wkw.class, wkwVar);
    }

    private wkw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", wkx.class});
            case NEW_MUTABLE_INSTANCE:
                return new wkw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (wkw.class) {
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
