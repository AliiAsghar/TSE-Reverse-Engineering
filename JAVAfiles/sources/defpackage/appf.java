package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class appf extends apag implements apbu {
    public static final appf a;
    private static volatile apca e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        appf appfVar = new appf();
        a = appfVar;
        apag.registerDefaultInstance(appf.class, appfVar);
    }

    private appf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"c", "b", "d", appe.class});
            case NEW_MUTABLE_INSTANCE:
                return new appf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (appf.class) {
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
