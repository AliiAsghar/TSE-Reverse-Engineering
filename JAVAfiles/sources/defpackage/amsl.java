package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amsl extends apag implements apbu {
    public static final amsl a;
    private static volatile apca h;
    public int b;
    public int c;
    public boolean d;
    public apax e = emptyProtobufList();
    public int f;
    public int g;

    static {
        amsl amslVar = new amsl();
        a = amslVar;
        apag.registerDefaultInstance(amsl.class, amslVar);
    }

    private amsl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003\u001b\u0004᠌\u0002\u0005င\u0003", new Object[]{"b", "c", amsa.e, "d", "e", amoq.class, "f", amsa.f, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amsl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amsl.class) {
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
