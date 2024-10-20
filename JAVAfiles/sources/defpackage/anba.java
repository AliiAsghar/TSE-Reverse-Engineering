package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anba extends apag implements apbu {
    public static final anba a;
    private static volatile apca g;
    public int b;
    public Object d;
    public anax e;
    public int c = 0;
    private byte h = 2;
    public apax f = emptyProtobufList();

    static {
        anba anbaVar = new anba();
        a = anbaVar;
        apag.registerDefaultInstance(anba.class, anbaVar);
    }

    private anba() {
    }

    public final void a() {
        apax apaxVar = this.f;
        if (!apaxVar.c()) {
            this.f = apag.mutableCopy(apaxVar);
        }
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new Object[]{"d", "c", "b", "e", "f", anax.class, anay.class});
            case NEW_MUTABLE_INSTANCE:
                return new anba();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (anba.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
