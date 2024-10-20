package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apqa extends apag implements apbu {
    public static final apqa a;
    private static volatile apca g;
    public int b;
    public int c;
    public apax d = emptyProtobufList();
    public appm e;
    public long f;

    static {
        apqa apqaVar = new apqa();
        a = apqaVar;
        apag.registerDefaultInstance(apqa.class, apqaVar);
    }

    private apqa() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0005\u0002", new Object[]{"b", "c", "d", appm.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apqa();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apqa.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
