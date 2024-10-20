package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjz extends apag implements apbu {
    public static final abjz a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        abjz abjzVar = new abjz();
        a = abjzVar;
        apag.registerDefaultInstance(abjz.class, abjzVar);
    }

    private abjz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002Ȼ\u0000", new Object[]{"c", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new abjz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (abjz.class) {
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
