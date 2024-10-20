package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abke extends apag implements apbu {
    public static final abke a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        abke abkeVar = new abke();
        a = abkeVar;
        apag.registerDefaultInstance(abke.class, abkeVar);
    }

    private abke() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", abjw.class, abjv.class, abka.class, abkd.class, abjz.class, abkb.class, abjy.class, abjt.class, abju.class, abkc.class});
            case NEW_MUTABLE_INSTANCE:
                return new abke();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (abke.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
