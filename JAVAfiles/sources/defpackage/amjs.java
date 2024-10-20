package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amjs extends apag implements apbu {
    public static final amjs a;
    private static volatile apca j;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public aozn h;
    public apax g = apag.emptyProtobufList();
    public String i = "";

    static {
        amjs amjsVar = new amjs();
        a = amjsVar;
        apag.registerDefaultInstance(amjs.class, amjsVar);
    }

    private amjs() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u001a\u0006ဉ\u0004\u0007ဈ\u0005", new Object[]{"b", "c", amiv.u, "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new amjs();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (amjs.class) {
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
