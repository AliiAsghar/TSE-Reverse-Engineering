package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class umw extends apag implements apbu {
    public static final umw a;
    private static volatile apca d;
    public int b;
    public boolean c;

    static {
        umw umwVar = new umw();
        a = umwVar;
        apag.registerDefaultInstance(umw.class, umwVar);
    }

    private umw() {
    }

    public static /* synthetic */ void a(umw umwVar) {
        umwVar.b |= 1;
        umwVar.c = true;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new umw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (umw.class) {
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
