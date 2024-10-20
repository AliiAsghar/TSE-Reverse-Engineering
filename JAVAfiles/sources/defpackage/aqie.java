package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqie extends apag implements apbu {
    public static final aqie a;
    private static volatile apca d;
    public aqfn b;
    public apax c = emptyProtobufList();
    private int e;

    static {
        aqie aqieVar = new aqie();
        a = aqieVar;
        apag.registerDefaultInstance(aqie.class, aqieVar);
    }

    private aqie() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"e", "b", "c", aqid.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqie();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aqie.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
