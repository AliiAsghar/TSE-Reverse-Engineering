package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alel extends apag implements apbu {
    public static final alel a;
    private static volatile apca e;
    public Object c;
    public int b = 0;
    public aozb d = aozb.b;

    static {
        alel alelVar = new alel();
        a = alelVar;
        apag.registerDefaultInstance(alel.class, alelVar);
    }

    private alel() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0007\u0001\u0000\t✐\u0007\u0000\u0000\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000ϩ\n✐<\u0000", new Object[]{"c", "b", alev.class, alee.class, alec.class, aleu.class, aleo.class, "d", alet.class});
            case NEW_MUTABLE_INSTANCE:
                return new alel();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (alel.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
