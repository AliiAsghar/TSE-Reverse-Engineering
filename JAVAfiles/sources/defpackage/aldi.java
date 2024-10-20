package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aldi extends apag implements apbu {
    public static final aldi a;
    private static volatile apca l;
    public int b;
    public alcv c;
    public aldh d;
    public aldn e;
    public aldo f;
    public alcs g;
    public boolean h;
    public aldf i;
    public aldk j;
    public aldj k;
    private byte m = 2;

    static {
        aldi aldiVar = new aldi();
        a = aldiVar;
        apag.registerDefaultInstance(aldi.class, aldiVar);
    }

    private aldi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u000b\t\u0000\u0000\u0001\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ᐉ\u0003\u0006ဉ\u0004\bဇ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aldi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (aldi.class) {
                        apcaVar = l;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            l = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
