package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amnp extends apag implements apbu {
    public static final amnp a;
    public static final apae b;
    private static volatile apca d;
    private Object e;
    public int c = 0;
    private byte f = 2;

    static {
        amnp amnpVar = new amnp();
        a = amnpVar;
        apag.registerDefaultInstance(amnp.class, amnpVar);
        b = apag.newSingularGeneratedExtension(amoe.a, amnpVar, amnpVar, null, 772, apdf.MESSAGE, amnp.class);
    }

    private amnp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b2 = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"e", "c", anat.class, anas.class});
            case NEW_MUTABLE_INSTANCE:
                return new amnp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amnp.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
