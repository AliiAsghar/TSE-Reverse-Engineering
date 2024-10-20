package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anac extends apag implements apbu {
    public static final anac a;
    private static volatile apca i;
    public int b;
    public int c;
    public int d;
    public int e;
    public anab f;
    public anaa g;
    public anar h;

    static {
        anac anacVar = new anac();
        a = anacVar;
        apag.registerDefaultInstance(anac.class, anacVar);
    }

    private anac() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0006ဉ\u0005\bဉ\u0007\rဉ\f", new Object[]{"b", "c", amyg.l, "d", amyg.m, "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new anac();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (anac.class) {
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
