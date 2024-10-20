package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class umo extends apag implements apbu {
    public static final umo a;
    private static volatile apca e;
    public int b;
    public int d;
    private byte f = 2;
    public String c = "";

    static {
        umo umoVar = new umo();
        a = umoVar;
        apag.registerDefaultInstance(umo.class, umoVar);
    }

    private umo() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᴌ\u0001", new Object[]{"b", "c", "d", amff.s});
            case NEW_MUTABLE_INSTANCE:
                return new umo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (umo.class) {
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
