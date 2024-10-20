package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amvn extends apag implements apbu {
    public static final amvn a;
    private static volatile apca h;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public aozb f = aozb.b;
    public int g;

    static {
        amvn amvnVar = new amvn();
        a = amvnVar;
        apag.registerDefaultInstance(amvn.class, amvnVar);
    }

    private amvn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", amvg.f, "f", "g", amvg.e});
            case NEW_MUTABLE_INSTANCE:
                return new amvn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amvn.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
