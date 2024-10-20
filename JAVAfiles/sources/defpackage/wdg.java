package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wdg extends apag implements apbu {
    public static final wdg a;
    private static volatile apca e;
    public int b;
    public int c;
    public aozn d;

    static {
        wdg wdgVar = new wdg();
        a = wdgVar;
        apag.registerDefaultInstance(wdg.class, wdgVar);
    }

    private wdg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"b", "c", wcn.e, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new wdg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (wdg.class) {
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
