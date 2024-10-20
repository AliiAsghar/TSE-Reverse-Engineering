package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class angh extends apag implements apbu {
    public static final angh a;
    private static volatile apca e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        angh anghVar = new angh();
        a = anghVar;
        apag.registerDefaultInstance(angh.class, anghVar);
    }

    private angh() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "d", angq.class, angf.class, angy.class, angg.class});
            case NEW_MUTABLE_INSTANCE:
                return new angh();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (angh.class) {
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
