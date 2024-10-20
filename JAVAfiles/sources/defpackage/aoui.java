package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoui extends apag implements apbu {
    public static final aoui a;
    private static volatile apca c;
    public String b = "";
    private int d;

    static {
        aoui aouiVar = new aoui();
        a = aouiVar;
        apag.registerDefaultInstance(aoui.class, aouiVar);
    }

    private aoui() {
    }

    public static /* synthetic */ void a(aoui aouiVar) {
        aouiVar.d |= 1;
        aouiVar.b = "upi-mvp";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new aoui();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aoui.class) {
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
