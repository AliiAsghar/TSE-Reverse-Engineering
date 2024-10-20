package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asie extends apag implements apbu {
    public static final asie a;
    private static volatile apca d;
    private byte e = 2;
    public apax b = emptyProtobufList();
    public apax c = emptyProtobufList();

    static {
        asie asieVar = new asie();
        a = asieVar;
        apag.registerDefaultInstance(asie.class, asieVar);
    }

    private asie() {
    }

    public final void a() {
        apax apaxVar = this.b;
        if (!apaxVar.c()) {
            this.b = apag.mutableCopy(apaxVar);
        }
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0001\u0001Л\u0003\u001b", new Object[]{"b", asid.class, "c", asih.class});
            case NEW_MUTABLE_INSTANCE:
                return new asie();
            case NEW_BUILDER:
                return new aozy((float[][][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (asie.class) {
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
