package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apeu extends apag implements apbu {
    public static final apeu a;
    private static volatile apca k;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";

    static {
        apeu apeuVar = new apeu();
        a = apeuVar;
        apag.registerDefaultInstance(apeu.class, apeuVar);
    }

    private apeu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0007\bဈ\u0006", new Object[]{"b", "c", anbb.t, "d", anbb.s, "e", "f", "g", "h", "j", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new apeu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (apeu.class) {
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
