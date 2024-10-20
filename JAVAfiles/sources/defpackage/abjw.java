package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjw extends apag implements apbu {
    public static final abjw a;
    private static volatile apca d;
    public int b;
    public apax c = apag.emptyProtobufList();

    static {
        abjw abjwVar = new abjw();
        a = abjwVar;
        apag.registerDefaultInstance(abjw.class, abjwVar);
    }

    private abjw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002Ț", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new abjw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (abjw.class) {
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
