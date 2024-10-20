package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqhb extends apag implements apbu {
    public static final aqhb a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        aqhb aqhbVar = new aqhb();
        a = aqhbVar;
        apag.registerDefaultInstance(aqhb.class, aqhbVar);
    }

    private aqhb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"b", aqfn.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqhb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aqhb.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
