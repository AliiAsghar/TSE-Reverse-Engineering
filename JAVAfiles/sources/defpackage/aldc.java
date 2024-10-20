package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aldc extends apag implements apbu {
    public static final aldc a;
    private static volatile apca f;
    public int b;
    public Object d;
    public aldc e;
    public int c = 0;
    private byte g = 2;

    static {
        aldc aldcVar = new aldc();
        a = aldcVar;
        apag.registerDefaultInstance(aldc.class, aldcVar);
    }

    private aldc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\b\u0001\u0001\u0004\r\b\u0000\u0000\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\tм\u0000\u000bᐉ\u0001\f<\u0000\r<\u0000", new Object[]{"d", "c", "b", alcs.class, alcs.class, alcs.class, alcy.class, aldv.class, "e", alcu.class, alcz.class});
            case NEW_MUTABLE_INSTANCE:
                return new aldc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aldc.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
