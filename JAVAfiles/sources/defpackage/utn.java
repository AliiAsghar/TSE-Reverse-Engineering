package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class utn extends apag implements apbu {
    public static final utn a;
    private static volatile apca c;
    public boolean b;
    private int d;

    static {
        utn utnVar = new utn();
        a = utnVar;
        apag.registerDefaultInstance(utn.class, utnVar);
    }

    private utn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new utn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (utn.class) {
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
