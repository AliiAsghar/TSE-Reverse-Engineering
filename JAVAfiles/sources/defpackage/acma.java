package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acma extends apag implements apbu {
    public static final acma a;
    private static volatile apca e;
    public int b;
    public aclz d;
    private byte f = 2;
    public int c = 1;

    static {
        acma acmaVar = new acma();
        a = acmaVar;
        apag.registerDefaultInstance(acma.class, acmaVar);
    }

    private acma() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", wcn.r, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new acma();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (acma.class) {
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
