package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjc extends apag implements apbu {
    public static final wjc a;
    public static final apas f = new apas(wja.f, wja.PER_SIM_TOGGLE_STATE_UNSPECIFIED);
    private static volatile apca g;
    public int b;
    public apbo c = apbo.a;
    public wiy d;
    public int e;

    static {
        wjc wjcVar = new wjc();
        a = wjcVar;
        apag.registerDefaultInstance(wjc.class, wjcVar);
    }

    private wjc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0001\u0000\u0000\u0002࠲\u0003ဉ\u0000\u0004᠌\u0001", new Object[]{"b", "c", wjb.a, wcn.h, "d", "e", wcn.g});
            case NEW_MUTABLE_INSTANCE:
                return new wjc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (wjc.class) {
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
