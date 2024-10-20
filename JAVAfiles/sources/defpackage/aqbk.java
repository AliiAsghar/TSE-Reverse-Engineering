package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqbk extends apag implements apbu {
    public static final aqbk a;
    private static volatile apca e;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        aqbk aqbkVar = new aqbk();
        a = aqbkVar;
        apag.registerDefaultInstance(aqbk.class, aqbkVar);
    }

    private aqbk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u000b\r\u0003\u0000\u0000\u0000\u000bȈ\fȈ\rȈ", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqbk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aqbk.class) {
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
