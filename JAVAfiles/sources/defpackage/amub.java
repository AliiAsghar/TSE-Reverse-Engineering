package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amub extends apag implements apbu {
    public static final amub a;
    public static final apae b;
    private static volatile apca c;

    static {
        amub amubVar = new amub();
        a = amubVar;
        apag.registerDefaultInstance(amub.class, amubVar);
        b = apag.newSingularGeneratedExtension(amoe.a, amubVar, amubVar, null, 973, apdf.MESSAGE, amub.class);
    }

    private amub() {
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
                return new amub();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (amub.class) {
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
