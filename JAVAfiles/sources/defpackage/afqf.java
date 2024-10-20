package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqf extends apag implements apbu {
    public static final afqf a;
    private static volatile apca h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;
    public afuh g;

    static {
        afqf afqfVar = new afqf();
        a = afqfVar;
        apag.registerDefaultInstance(afqf.class, afqfVar);
    }

    private afqf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001d\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003dဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new afqf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (afqf.class) {
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
