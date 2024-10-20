package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqet extends apag implements apbu {
    public static final aqet a;
    private static volatile apca h;
    public int b;
    public aqgc c;
    public boolean d;
    public aqfg e;
    public aqfz f;
    public aozb g = aozb.b;

    static {
        aqet aqetVar = new aqet();
        a = aqetVar;
        apag.registerDefaultInstance(aqet.class, aqetVar);
    }

    private aqet() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\r\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0005ဉ\u0001\tဉ\u0003\r\n", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqet();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aqet.class) {
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
