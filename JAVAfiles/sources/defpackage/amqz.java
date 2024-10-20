package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amqz extends apag implements apbu {
    public static final amqz a;
    private static volatile apca i;
    public int b;
    public long c;
    public long d;
    public int e;
    public boolean f;
    public apax g = emptyProtobufList();
    public apax h = emptyProtobufList();

    static {
        amqz amqzVar = new amqz();
        a = amqzVar;
        apag.registerDefaultInstance(amqz.class, amqzVar);
    }

    private amqz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005\u001b\u0006\u001b", new Object[]{"b", "c", "d", "e", amqk.l, "f", "g", amre.class, "h", amqw.class});
            case NEW_MUTABLE_INSTANCE:
                return new amqz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (amqz.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
