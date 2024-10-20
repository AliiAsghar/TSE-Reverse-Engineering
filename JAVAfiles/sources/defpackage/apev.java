package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apev extends apag implements apbu {
    public static final apev a;
    private static volatile apca b;

    static {
        apev apevVar = new apev();
        a = apevVar;
        apag.registerDefaultInstance(apev.class, apevVar);
    }

    private apev() {
        emptyProtobufList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new apev();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (apev.class) {
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
