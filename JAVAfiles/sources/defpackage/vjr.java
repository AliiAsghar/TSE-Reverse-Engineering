package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjr extends apag implements apbu {
    public static final vjr a;
    private static volatile apca e;
    public int b;
    public int c = 1;
    public boolean d;

    static {
        vjr vjrVar = new vjr();
        a = vjrVar;
        apag.registerDefaultInstance(vjr.class, vjrVar);
    }

    private vjr() {
    }

    public static /* synthetic */ void a(vjr vjrVar) {
        vjrVar.b |= 2;
        vjrVar.d = true;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"b", "c", qgk.m, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new vjr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (vjr.class) {
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
