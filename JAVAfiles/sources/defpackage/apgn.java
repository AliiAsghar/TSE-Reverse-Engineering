package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apgn extends apag implements apbu {
    public static final apgn a;
    private static volatile apca e;
    public int b;
    public String c = "";
    public int d;

    static {
        apgn apgnVar = new apgn();
        a = apgnVar;
        apag.registerDefaultInstance(apgn.class, apgnVar);
    }

    private apgn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", apgo.b});
            case NEW_MUTABLE_INSTANCE:
                return new apgn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (apgn.class) {
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
