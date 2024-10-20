package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amem extends apag implements apbu {
    public static final amem a;
    private static volatile apca i;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public amhg f;
    public amfw g;
    public String h = "";

    static {
        amem amemVar = new amem();
        a = amemVar;
        apag.registerDefaultInstance(amem.class, amemVar);
    }

    private amem() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0007ဈ\u0006", new Object[]{"b", "c", apwb.f, "d", ameh.f, "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new amem();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (amem.class) {
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
