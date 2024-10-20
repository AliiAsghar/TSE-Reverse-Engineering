package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aplq extends apag implements apbu {
    public static final aplq a;
    private static volatile apca e;
    public int b;
    public int c;
    public boolean d;

    static {
        aplq aplqVar = new aplq();
        a = aplqVar;
        apag.registerDefaultInstance(aplq.class, aplqVar);
    }

    private aplq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"b", "c", apkm.r, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aplq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aplq.class) {
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
