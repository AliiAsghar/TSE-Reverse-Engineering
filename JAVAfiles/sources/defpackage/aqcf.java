package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqcf extends apag implements apbu {
    public static final aqcf a;
    private static volatile apca b;

    static {
        aqcf aqcfVar = new aqcf();
        a = aqcfVar;
        apag.registerDefaultInstance(aqcf.class, aqcfVar);
    }

    private aqcf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new aqcf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (aqcf.class) {
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
