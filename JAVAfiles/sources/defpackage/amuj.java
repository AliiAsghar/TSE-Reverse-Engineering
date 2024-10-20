package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amuj extends apag implements apbu {
    public static final amuj a;
    private static volatile apca i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";
    public long h;

    static {
        amuj amujVar = new amuj();
        a = amujVar;
        apag.registerDefaultInstance(amuj.class, amujVar);
    }

    private amuj() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", amud.j, "d", amud.l, "e", amud.k, "f", amud.m, "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new amuj();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (amuj.class) {
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
