package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aonm extends apag implements apbu {
    public static final aonm a;
    private static volatile apca e;
    public int b;
    public apax c = emptyProtobufList();
    public aonl d;

    static {
        aonm aonmVar = new aonm();
        a = aonmVar;
        apag.registerDefaultInstance(aonm.class, aonmVar);
    }

    private aonm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", aonk.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aonm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aonm.class) {
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
