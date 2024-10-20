package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xip extends apag implements apbu {
    public static final xip a;
    private static volatile apca g;
    public int b;
    public aozb c = aozb.b;
    public String d = "";
    public apct e;
    public apct f;

    static {
        xip xipVar = new xip();
        a = xipVar;
        apag.registerDefaultInstance(xip.class, xipVar);
    }

    private xip() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new xip();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (xip.class) {
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
