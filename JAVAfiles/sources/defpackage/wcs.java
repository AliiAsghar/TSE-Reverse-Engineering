package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wcs extends apag implements apbu {
    public static final wcs a;
    private static volatile apca h;
    public int b;
    public int c = 0;
    public Object d;
    public wbk e;
    public apct f;
    public int g;

    static {
        wcs wcsVar = new wcs();
        a = wcsVar;
        apag.registerDefaultInstance(wcs.class, wcsVar);
    }

    private wcs() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004ဉ\u0001\u0005င\u0002", new Object[]{"d", "c", "b", "e", wcw.class, wcu.class, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new wcs();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (wcs.class) {
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
