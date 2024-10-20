package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psg extends apag implements apbu {
    public static final psg a;
    private static volatile apca c;
    public String b = "";
    private boolean d;

    static {
        psg psgVar = new psg();
        a = psgVar;
        apag.registerDefaultInstance(psg.class, psgVar);
    }

    private psg() {
    }

    public static /* synthetic */ void a(psg psgVar) {
        psgVar.d = true;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0007\u0003Ȉ", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new psg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (psg.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
