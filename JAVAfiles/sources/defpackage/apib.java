package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apib extends apag implements apbu {
    public static final apib a;
    private static volatile apca i;
    public int b;
    public Object d;
    public int e;
    public int h;
    public int c = 0;
    public String f = "";
    public String g = "";

    static {
        apib apibVar = new apib();
        a = apibVar;
        apag.registerDefaultInstance(apib.class, apibVar);
    }

    private apib() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004᠌\u0000\u0005ဈ\u0001\u0006ဈ\u0002\u0007᠌\u0003", new Object[]{"d", "c", "b", apig.class, apih.class, apia.class, "e", aphl.i, "f", "g", "h", apkm.c});
            case NEW_MUTABLE_INSTANCE:
                return new apib();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (apib.class) {
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
