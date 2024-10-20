package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzo extends apag implements apbu {
    public static final hzo a;
    private static volatile apca i;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;
    public int g;
    public hzk h;

    static {
        hzo hzoVar = new hzo();
        a = hzoVar;
        apag.registerDefaultInstance(hzo.class, hzoVar);
    }

    private hzo() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005", new Object[]{"b", "c", hzn.b, "d", hzn.a, "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new hzo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (hzo.class) {
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
