package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class albd extends apag implements apbu {
    public static final albd a;
    private static volatile apca f;
    public String b = "";
    public apax c = emptyProtobufList();
    public int d;
    public int e;
    private int g;

    static {
        albd albdVar = new albd();
        a = albdVar;
        apag.registerDefaultInstance(albd.class, albdVar);
    }

    private albd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0000\u0002Ȉ\u0003\u001b\u0005ဌ\u0000\u0006ဌ\u0001", new Object[]{"g", "b", "c", albb.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new albd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (albd.class) {
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
