package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asja extends apag<asja, aozy> implements apbu {
    public static final asja a;
    private static volatile apca e;
    public int b;
    public long c;
    public int d;

    static {
        asja asjaVar = new asja();
        a = asjaVar;
        apag.registerDefaultInstance(asja.class, asjaVar);
    }

    private asja() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", asif.j});
            case NEW_MUTABLE_INSTANCE:
                return new asja();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (asja.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
