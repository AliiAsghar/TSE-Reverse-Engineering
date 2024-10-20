package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anao extends apag implements apbu {
    public static final anao a;
    private static volatile apca i;
    public int b;
    public int c;
    public boolean d;
    public apao e = emptyIntList();
    public boolean f;
    public anam g;
    public boolean h;

    static {
        anao anaoVar = new anao();
        a = anaoVar;
        apag.registerDefaultInstance(anao.class, anaoVar);
    }

    private anao() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0003ဇ\u0002\u0006'\u0007ဇ\u0005\bဉ\u0006\u000bဇ\t", new Object[]{"b", "c", amyg.u, "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new anao();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (anao.class) {
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
