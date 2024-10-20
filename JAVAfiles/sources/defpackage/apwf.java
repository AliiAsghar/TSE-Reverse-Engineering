package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apwf extends apag implements apbu {
    public static final apwf a;
    private static volatile apca e;
    public Object c;
    public int b = 0;
    public apax d = emptyProtobufList();

    static {
        apwf apwfVar = new apwf();
        a = apwfVar;
        apag.registerDefaultInstance(apwf.class, apwfVar);
    }

    private apwf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u00018\u0000\u0003\u001b\u00045\u0000", new Object[]{"c", "b", "d", apwe.class});
            case NEW_MUTABLE_INSTANCE:
                return new apwf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (apwf.class) {
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
