package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mga extends apag implements apbu {
    public static final mga a;
    private static volatile apca c;
    public apbo b = apbo.a;
    private apbo d = apbo.a;

    static {
        mga mgaVar = new mga();
        a = mgaVar;
        apag.registerDefaultInstance(mga.class, mgaVar);
    }

    private mga() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", mfz.a, "d", mfy.a});
            case NEW_MUTABLE_INSTANCE:
                return new mga();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (mga.class) {
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
