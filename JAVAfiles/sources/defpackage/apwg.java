package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apwg extends apag implements apbu {
    public static final apwg a;
    private static volatile apca f;
    public int b;
    public long c;
    public apax d = emptyProtobufList();
    public aozb e = aozb.b;

    static {
        apwg apwgVar = new apwg();
        a = apwgVar;
        apag.registerDefaultInstance(apwg.class, apwgVar);
    }

    private apwg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ည\u0002", new Object[]{"b", "c", "d", apwf.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apwg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (apwg.class) {
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
