package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wdp extends apag implements apbu {
    public static final wdp a;
    private static volatile apca j;
    public int b;
    public aoyo c;
    public wdu d;
    public wcq e;
    public wda f;
    public wbk g;
    public boolean h;
    public int i;

    static {
        wdp wdpVar = new wdp();
        a = wdpVar;
        apag.registerDefaultInstance(wdp.class, wdpVar);
    }

    private wdp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007᠌\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", wcn.a});
            case NEW_MUTABLE_INSTANCE:
                return new wdp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (wdp.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
