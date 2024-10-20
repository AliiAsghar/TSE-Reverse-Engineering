package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqic extends apag implements apbu {
    public static final aqic a;
    private static volatile apca h;
    public int b;
    public aqgb c;
    public apax d = emptyProtobufList();
    public int e;
    public int f;
    public boolean g;

    static {
        aqic aqicVar = new aqic();
        a = aqicVar;
        apag.registerDefaultInstance(aqic.class, aqicVar);
    }

    private aqic() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u0004\u0004\u0004\u0005\u0007", new Object[]{"b", "c", "d", aqgg.class, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqic();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aqic.class) {
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
