package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amiy extends apag implements apbu {
    public static final amiy a;
    private static volatile apca h;
    public int b;
    public amhb d;
    public int e;
    public long f;
    public String c = "";
    public apao g = emptyIntList();

    static {
        amiy amiyVar = new amiy();
        a = amiyVar;
        apag.registerDefaultInstance(amiy.class, amiyVar);
    }

    private amiy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ࠞ", new Object[]{"b", "c", "d", "e", amid.u, "f", "g", amiv.d});
            case NEW_MUTABLE_INSTANCE:
                return new amiy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amiy.class) {
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
