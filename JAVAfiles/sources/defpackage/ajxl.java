package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajxl extends apag<ajxl, aozy> implements apbu {
    public static final ajxl a;
    private static volatile apca k;
    public int b;
    public int c;
    public int d;
    public int e;
    public apax f = apag.emptyProtobufList();
    public boolean g;
    public int h;
    public boolean i;
    public int j;

    static {
        ajxl ajxlVar = new ajxl();
        a = ajxlVar;
        apag.registerDefaultInstance(ajxl.class, ajxlVar);
    }

    private ajxl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004\u001a\u0005ဇ\u0003\u0006င\u0004\u0007ဇ\u0005\bင\u0006", new Object[]{"b", "c", "d", "e", ahbp.f, "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new ajxl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (ajxl.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
