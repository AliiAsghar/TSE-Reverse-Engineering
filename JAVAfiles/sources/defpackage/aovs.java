package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aovs extends apag implements apbu {
    public static final aovs a;
    private static volatile apca e;
    public int b;
    public apuo c;
    public double d;

    static {
        aovs aovsVar = new aovs();
        a = aovsVar;
        apag.registerDefaultInstance(aovs.class, aovsVar);
    }

    private aovs() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aovs();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aovs.class) {
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
