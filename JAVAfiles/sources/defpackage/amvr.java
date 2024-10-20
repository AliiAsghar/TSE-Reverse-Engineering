package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amvr extends apag implements apbu {
    public static final amvr a;
    private static volatile apca p;
    public int b;
    public int c;
    public apct d;
    public int e;
    public int f;
    public apct g;
    public int h;
    public int i;
    public boolean j;
    public apct k;
    public boolean l;
    public apct m;
    public boolean n;
    public apct o;

    static {
        amvr amvrVar = new amvr();
        a = amvrVar;
        apag.registerDefaultInstance(amvr.class, amvrVar);
    }

    private amvr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007င\u0006\bဇ\u0007\tဉ\b\nဇ\t\u000bဉ\n\fဇ\u000b\rဉ\f", new Object[]{"b", "c", amvg.j, "d", "e", amvg.h, "f", amvg.i, "g", "h", amvg.g, "i", "j", "k", "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new amvr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = p;
                if (apcaVar == null) {
                    synchronized (amvr.class) {
                        apcaVar = p;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            p = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
