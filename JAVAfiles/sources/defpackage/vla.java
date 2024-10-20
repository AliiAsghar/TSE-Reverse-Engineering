package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vla extends apag implements apbu {
    public static final vla a;
    private static volatile apca g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;

    static {
        vla vlaVar = new vla();
        a = vlaVar;
        apag.registerDefaultInstance(vla.class, vlaVar);
    }

    private vla() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", qgk.n, "f", vmq.class, vnc.class, vnd.class});
            case NEW_MUTABLE_INSTANCE:
                return new vla();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (vla.class) {
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
