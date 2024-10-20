package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoum extends apag implements apbu {
    public static final aoum a;
    private static volatile apca b;
    private int c;
    private aoul d;
    private long e;

    static {
        aoum aoumVar = new aoum();
        a = aoumVar;
        apag.registerDefaultInstance(aoum.class, aoumVar);
    }

    private aoum() {
    }

    public static /* synthetic */ void a(aoum aoumVar, aoul aoulVar) {
        aoulVar.getClass();
        aoumVar.d = aoulVar;
        aoumVar.c |= 1;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aoum();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (aoum.class) {
                        apcaVar = b;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            b = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
