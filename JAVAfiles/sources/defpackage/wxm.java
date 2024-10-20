package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wxm extends apag implements apbu {
    public static final wxm a;
    private static volatile apca g;
    public int b;
    public wxo c;
    public aozb d = aozb.b;
    public apct e;
    public int f;

    static {
        wxm wxmVar = new wxm();
        a = wxmVar;
        apag.registerDefaultInstance(wxm.class, wxmVar);
    }

    private wxm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", wcn.i});
            case NEW_MUTABLE_INSTANCE:
                return new wxm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (wxm.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
