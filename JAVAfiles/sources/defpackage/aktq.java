package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktq extends apag implements apbu {
    public static final aktq a;
    private static volatile apca k;
    public int b;
    public long c;
    public long d;
    public apax e = emptyProtobufList();
    public long f;
    public long g;
    public int h;
    public akpv i;
    public int j;

    static {
        aktq aktqVar = new aktq();
        a = aktqVar;
        apag.registerDefaultInstance(aktq.class, aktqVar);
    }

    private aktq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0000\u0001စ\u0000\u0002စ\u0001\u0003\u001b\u0004ဂ\u0002\u0005ဂ\u0003\u0006င\u0004\nဉ\u0005\u000b᠌\u0006", new Object[]{"b", "c", "d", "e", akrg.class, "f", "g", "h", "i", "j", ahbp.i});
            case NEW_MUTABLE_INSTANCE:
                return new aktq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (aktq.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
