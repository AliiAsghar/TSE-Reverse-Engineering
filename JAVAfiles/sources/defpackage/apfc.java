package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apfc extends apag implements apbu {
    public static final apfc a;
    private static volatile apca h;
    public int b;
    public int e;
    public boolean g;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        apfc apfcVar = new apfc();
        a = apfcVar;
        apag.registerDefaultInstance(apfc.class, apfcVar);
    }

    private apfc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apfc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apfc.class) {
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
