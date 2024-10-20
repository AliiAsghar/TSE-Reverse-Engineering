package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqgs extends apag implements apbu {
    public static final aqgs a;
    private static volatile apca h;
    public int b;
    public aqgb c;
    public aqfn d;
    public aqft e;
    public apax f = emptyProtobufList();
    public int g;

    static {
        aqgs aqgsVar = new aqgs();
        a = aqgsVar;
        apag.registerDefaultInstance(aqgs.class, aqgsVar);
    }

    private aqgs() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0007\f", new Object[]{"b", "c", "d", "e", "f", aqfn.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqgs();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aqgs.class) {
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
