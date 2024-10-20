package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amvy extends apag implements apbu {
    public static final amvy a;
    private static volatile apca h;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public amva g;

    static {
        amvy amvyVar = new amvy();
        a = amvyVar;
        apag.registerDefaultInstance(amvy.class, amvyVar);
    }

    private amvy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amvy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amvy.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
