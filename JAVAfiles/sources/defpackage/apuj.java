package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apuj extends apag implements apbu {
    public static final apuj a;
    private static volatile apca h;
    public Object c;
    public int d;
    public int f;
    public int b = 0;
    public String e = "";
    public String g = "";

    static {
        apuj apujVar = new apuj();
        a = apujVar;
        apag.registerDefaultInstance(apuj.class, apujVar);
    }

    private apuj() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\r\u0001\u0000\u0001\u000f\r\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005\f\u0006<\u0000\u0007<\u0000\b<\u0000\n<\u0000\u000b<\u0000\f<\u0000\rȈ\u000f<\u0000", new Object[]{"c", "b", "d", "e", apub.class, apuh.class, "f", apui.class, apua.class, apuf.class, apuc.class, apud.class, apue.class, "g", apug.class});
            case NEW_MUTABLE_INSTANCE:
                return new apuj();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apuj.class) {
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
