package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aphv extends apag implements apbu {
    public static final aphv a;
    private static volatile apca f;
    public int b;
    public int c;
    public boolean d;
    public apax e = emptyProtobufList();

    static {
        aphv aphvVar = new aphv();
        a = aphvVar;
        apag.registerDefaultInstance(aphv.class, aphvVar);
    }

    private aphv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002င\u0000\u0004ဇ\u0001\u0005\u001b", new Object[]{"b", "c", "d", "e", aphu.class});
            case NEW_MUTABLE_INSTANCE:
                return new aphv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aphv.class) {
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
