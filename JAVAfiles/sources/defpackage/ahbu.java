package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbu extends apag implements apbu {
    public static final ahbu a;
    public static final apae b;
    private static volatile apca e;
    public int c = 0;
    public Object d;

    static {
        ahbu ahbuVar = new ahbu();
        a = ahbuVar;
        apag.registerDefaultInstance(ahbu.class, ahbuVar);
        b = apag.newSingularGeneratedExtension(ahbo.a, ahbuVar, ahbuVar, null, 9003, apdf.MESSAGE, ahbu.class);
    }

    private ahbu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", ahbt.class, ahbr.class, ahbs.class});
            case NEW_MUTABLE_INSTANCE:
                return new ahbu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (ahbu.class) {
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
