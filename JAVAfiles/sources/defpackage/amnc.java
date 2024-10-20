package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amnc extends apag implements apbu {
    public static final amnc a;
    private static volatile apca g;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private byte h = 2;

    static {
        amnc amncVar = new amnc();
        a = amncVar;
        apag.registerDefaultInstance(amnc.class, amncVar);
    }

    private amnc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᴌ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", amna.e, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new amnc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amnc.class) {
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
