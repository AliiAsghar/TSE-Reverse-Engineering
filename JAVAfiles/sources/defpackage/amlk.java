package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amlk extends apag implements apbu {
    public static final amlk a;
    private static volatile apca g;
    public int b;
    public amhb c;
    public int d;
    public int e;
    public int f;

    static {
        amlk amlkVar = new amlk();
        a = amlkVar;
        apag.registerDefaultInstance(amlk.class, amlkVar);
    }

    private amlk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", amjw.t});
            case NEW_MUTABLE_INSTANCE:
                return new amlk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amlk.class) {
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
