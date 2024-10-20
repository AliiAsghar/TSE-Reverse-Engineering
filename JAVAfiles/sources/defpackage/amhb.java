package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amhb extends apag implements apbu {
    public static final amhb a;
    private static volatile apca i;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public int g;
    public int h;

    static {
        amhb amhbVar = new amhb();
        a = amhbVar;
        apag.registerDefaultInstance(amhb.class, amhbVar);
    }

    private amhb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", amgp.p, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new amhb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (amhb.class) {
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
