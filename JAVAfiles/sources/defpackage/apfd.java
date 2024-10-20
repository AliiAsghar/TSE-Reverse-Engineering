package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apfd extends apag implements apbu {
    public static final apfd a;
    private static volatile apca i;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        apfd apfdVar = new apfd();
        a = apfdVar;
        apag.registerDefaultInstance(apfd.class, apfdVar);
    }

    private apfd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0013\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\t᠌\u0006\n᠌\u0007\u0013᠌\t", new Object[]{"b", "c", "d", "e", apjw.k, "f", apjw.l, "g", apjw.m, "h", apez.d});
            case NEW_MUTABLE_INSTANCE:
                return new apfd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (apfd.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
