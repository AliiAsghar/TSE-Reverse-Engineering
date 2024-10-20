package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aotg extends apag implements apbu {
    public static final aotg a;
    private static volatile apca d;
    public aozb b = aozb.b;
    public int c;

    static {
        aotg aotgVar = new aotg();
        a = aotgVar;
        apag.registerDefaultInstance(aotg.class, aotgVar);
    }

    private aotg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\n\u0003\f", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aotg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aotg.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
