package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqfp extends apag implements aqfq {
    public static final aqfp a;
    private static volatile apca e;
    public int b;
    public apcp c;
    public apcp d;

    static {
        aqfp aqfpVar = new aqfp();
        a = aqfpVar;
        apag.registerDefaultInstance(aqfp.class, aqfpVar);
    }

    private aqfp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0006ဉ\u0005", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfp();
            case NEW_BUILDER:
                return new aozy((byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aqfp.class) {
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
