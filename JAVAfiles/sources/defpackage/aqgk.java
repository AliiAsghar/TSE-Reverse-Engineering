package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqgk extends apag implements apbu {
    public static final aqgk a;
    private static volatile apca f;
    public int b;
    public aqgb c;
    public aqfn d;
    public apax e = emptyProtobufList();

    static {
        aqgk aqgkVar = new aqgk();
        a = aqgkVar;
        apag.registerDefaultInstance(aqgk.class, aqgkVar);
    }

    private aqgk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", aqfn.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqgk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aqgk.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
