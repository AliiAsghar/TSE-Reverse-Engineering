package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoto extends apag implements apbu {
    public static final aoto a;
    private static volatile apca e;
    public aozb b = aozb.b;
    public int c;
    public int d;

    static {
        aoto aotoVar = new aoto();
        a = aotoVar;
        apag.registerDefaultInstance(aoto.class, aotoVar);
    }

    private aoto() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001\n\u0002\f\u0005\u0004", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aoto();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aoto.class) {
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
