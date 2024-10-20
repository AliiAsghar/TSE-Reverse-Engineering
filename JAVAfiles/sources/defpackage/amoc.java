package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amoc extends apag implements apbu {
    public static final amoc a;
    public static final apae b;
    private static volatile apca e;
    public int c;
    public aptf d;
    private byte f = 2;

    static {
        amoc amocVar = new amoc();
        a = amocVar;
        apag.registerDefaultInstance(amoc.class, amocVar);
        b = apag.newSingularGeneratedExtension(amnq.a, amocVar, amocVar, null, 120, apdf.MESSAGE, amoc.class);
    }

    private amoc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b2 = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new amoc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (amoc.class) {
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
