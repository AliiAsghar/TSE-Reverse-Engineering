package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afvf extends apag implements apbu {
    public static final afvf a;
    private static volatile apca j;
    public int b;
    public int c;
    public int g;
    public int h;
    public long i;
    public apbo f = apbo.a;
    public String d = "";
    public String e = "";

    static {
        afvf afvfVar = new afvf();
        a = afvfVar;
        apag.registerDefaultInstance(afvf.class, afvfVar);
    }

    private afvf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u00042\u0005င\u0003\u0006င\u0004\u0007ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", afvd.a, "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new afvf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (afvf.class) {
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
