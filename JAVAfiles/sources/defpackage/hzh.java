package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzh extends apag implements apbu {
    public static final hzh a;
    private static volatile apca g;
    public int b;
    public iab c;
    public iac d;
    public iad e;
    public iaa f;

    static {
        hzh hzhVar = new hzh();
        a = hzhVar;
        apag.registerDefaultInstance(hzh.class, hzhVar);
    }

    private hzh() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u00017Ĩ\u0004\u0000\u0000\u00007ဉ\u0000ģဉ\u0001ħဉ\u0002Ĩဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new hzh();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (hzh.class) {
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
