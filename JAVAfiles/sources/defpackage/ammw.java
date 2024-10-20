package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ammw extends apag implements apbu {
    public static final ammw a;
    private static volatile apca l;
    public int b;
    public int d;
    public String c = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";

    static {
        ammw ammwVar = new ammw();
        a = ammwVar;
        apag.registerDefaultInstance(ammw.class, ammwVar);
    }

    private ammw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"b", "c", "d", amiv.j, "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new ammw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (ammw.class) {
                        apcaVar = l;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            l = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
