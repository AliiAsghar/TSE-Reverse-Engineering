package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anai extends apag implements apbu {
    public static final anai a;
    private static volatile apca d;
    public int b;
    public anam c;
    private int e;

    static {
        anai anaiVar = new anai();
        a = anaiVar;
        apag.registerDefaultInstance(anai.class, anaiVar);
    }

    private anai() {
        apag.emptyProtobufList();
    }

    public static /* synthetic */ void a(anai anaiVar) {
        anaiVar.b |= 2;
        anaiVar.e = 1;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဋ\u0001\u0004ဉ\u0002", new Object[]{"b", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new anai();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (anai.class) {
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
