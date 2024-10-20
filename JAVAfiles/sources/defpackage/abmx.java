package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmx extends apag implements apbu {
    public static final abmx a;
    private static volatile apca e;
    public int b;
    public long c;
    public apax d = emptyProtobufList();

    static {
        abmx abmxVar = new abmx();
        a = abmxVar;
        apag.registerDefaultInstance(abmx.class, abmxVar);
    }

    private abmx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"b", "c", "d", abmp.class});
            case NEW_MUTABLE_INSTANCE:
                return new abmx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (abmx.class) {
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
