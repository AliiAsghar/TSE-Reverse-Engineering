package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqdo extends apag implements apbu {
    public static final aqdo a;
    private static volatile apca e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        aqdo aqdoVar = new aqdo();
        a = aqdoVar;
        apag.registerDefaultInstance(aqdo.class, aqdoVar);
    }

    private aqdo() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0007\u0001\u0000\u0001n\u0007\u0000\u0000\u0000\u0001\fi<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000", new Object[]{"c", "b", "d", aqgr.class, aqgj.class, aqgz.class, aqgo.class, aqgn.class, aqgm.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqdo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aqdo.class) {
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
