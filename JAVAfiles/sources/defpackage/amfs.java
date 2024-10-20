package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amfs extends apag implements apbu {
    public static final amfs a;
    private static volatile apca f;
    public int b;
    public int c;
    public int e;
    private byte g = 2;
    public String d = "";

    static {
        amfs amfsVar = new amfs();
        a = amfsVar;
        apag.registerDefaultInstance(amfs.class, amfsVar);
    }

    private amfs() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", amff.m, "d", "e", amff.l});
            case NEW_MUTABLE_INSTANCE:
                return new amfs();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amfs.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
