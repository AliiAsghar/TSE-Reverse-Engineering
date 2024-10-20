package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjt extends apag implements apbu {
    public static final abjt a;
    private static volatile apca d;
    public apax b = emptyProtobufList();
    public boolean c;

    static {
        abjt abjtVar = new abjt();
        a = abjtVar;
        apag.registerDefaultInstance(abjt.class, abjtVar);
    }

    private abjt() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\u0007", new Object[]{"b", abjs.class, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new abjt();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (abjt.class) {
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
