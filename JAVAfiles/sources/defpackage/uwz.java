package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uwz extends apag implements apbu {
    public static final uwz a;
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
        uwz uwzVar = new uwz();
        a = uwzVar;
        apag.registerDefaultInstance(uwz.class, uwzVar);
    }

    private uwz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007င\u0006\bဇ\u0007\tဉ\b\nဇ\t\u000bဉ\n\fဇ\u000b\rဉ\f", new Object[]{"b", "c", qgk.l, "d", "e", qgk.j, "f", qgk.k, "g", "h", qgk.i, "i", "j", "k", "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new uwz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = p;
                if (apcaVar == null) {
                    synchronized (uwz.class) {
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
