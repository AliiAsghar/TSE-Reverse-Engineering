package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aptp extends apag implements apbu {
    public static final aptp a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        aptp aptpVar = new aptp();
        a = aptpVar;
        apag.registerDefaultInstance(aptp.class, aptpVar);
    }

    private aptp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", aptj.class, aptn.class, apto.class, aptq.class, aptl.class, aptm.class});
            case NEW_MUTABLE_INSTANCE:
                return new aptp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aptp.class) {
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
