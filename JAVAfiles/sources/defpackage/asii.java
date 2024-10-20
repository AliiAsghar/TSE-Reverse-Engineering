package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asii extends apag implements apbu {
    public static final asii a;
    private static volatile apca g;
    public int b;
    public long c;
    public int d;
    public asim f;
    private byte h = 2;
    public apax e = emptyProtobufList();

    static {
        asii asiiVar = new asii();
        a = asiiVar;
        apag.registerDefaultInstance(asii.class, asiiVar);
    }

    private asii() {
    }

    public final void a() {
        apax apaxVar = this.e;
        if (!apaxVar.c()) {
            this.e = apag.mutableCopy(apaxVar);
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003᠌\u0001\u0006ဉ\u0004", new Object[]{"b", "c", "e", asij.class, "d", asif.e, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new asii();
            case NEW_BUILDER:
                return new aozy((char[]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (asii.class) {
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
