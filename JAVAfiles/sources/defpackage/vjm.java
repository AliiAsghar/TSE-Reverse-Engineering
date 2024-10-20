package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjm extends apag implements apbu {
    public static final vjm a;
    private static volatile apca d;
    public apax b = apag.emptyProtobufList();
    public boolean c;
    private int e;

    static {
        vjm vjmVar = new vjm();
        a = vjmVar;
        apag.registerDefaultInstance(vjm.class, vjmVar);
    }

    private vjm() {
    }

    public static /* synthetic */ void a(vjm vjmVar) {
        vjmVar.e |= 1;
        vjmVar.c = true;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဇ\u0000", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new vjm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (vjm.class) {
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
