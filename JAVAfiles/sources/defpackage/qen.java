package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qen extends apag implements apbu {
    public static final qen a;
    private static volatile apca k;
    public int b;
    public qei f;
    public qfd i;
    public qgr j;
    public String c = "";
    public String d = "";
    public String e = "";
    public apax g = emptyProtobufList();
    public aozb h = aozb.b;

    static {
        qen qenVar = new qen();
        a = qenVar;
        apag.registerDefaultInstance(qen.class, qenVar);
    }

    private qen() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004\u001b\u0005ည\u0004\u0006ဉ\u0005\u0007ဈ\u0002\bဉ\u0006", new Object[]{"b", "c", "d", "f", "g", qei.class, "h", "i", "e", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new qen();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (qen.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
