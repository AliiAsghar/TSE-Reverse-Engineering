package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apii extends apag implements apbu {
    public static final apii a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";
    public amva g;

    static {
        apii apiiVar = new apii();
        a = apiiVar;
        apag.registerDefaultInstance(apii.class, apiiVar);
    }

    private apii() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", apjw.i, "d", apkm.f, "e", apjw.q, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apii();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apii.class) {
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
