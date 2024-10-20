package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vsn extends apag implements apbu {
    public static final vsn a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        vsn vsnVar = new vsn();
        a = vsnVar;
        apag.registerDefaultInstance(vsn.class, vsnVar);
    }

    private vsn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0001\u0000\n\u000e\u0005\u0000\u0000\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"c", "b", vsq.class, vso.class, vsp.class, vsr.class, vss.class});
            case NEW_MUTABLE_INSTANCE:
                return new vsn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (vsn.class) {
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
