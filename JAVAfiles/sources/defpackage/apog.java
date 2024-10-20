package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apog extends apag implements apbu {
    public static final apog a;
    private static volatile apca g;
    public int b;
    public int c;
    public apao d = emptyIntList();
    public int e;
    public int f;

    static {
        apog apogVar = new apog();
        a = apogVar;
        apag.registerDefaultInstance(apog.class, apogVar);
    }

    private apog() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002,\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apog();
            case NEW_BUILDER:
                return new aozy((short[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apog.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
