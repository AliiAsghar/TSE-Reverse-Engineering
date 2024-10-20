package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagd extends apag<aagd, aozy> implements apbu {
    public static final aagd a;
    private static volatile apca g;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;

    static {
        aagd aagdVar = new aagd();
        a = aagdVar;
        apag.registerDefaultInstance(aagd.class, aagdVar);
    }

    private aagd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0004ဇ\u0002\u0005င\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aagd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (aagd.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
