package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amxf extends apag implements apbu {
    public static final amxf a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;
    public boolean g;

    static {
        amxf amxfVar = new amxf();
        a = amxfVar;
        apag.registerDefaultInstance(amxf.class, amxfVar);
    }

    private amxf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဇ\u0004", new Object[]{"b", "c", amwm.o, "d", "e", "f", amwm.f, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amxf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amxf.class) {
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
