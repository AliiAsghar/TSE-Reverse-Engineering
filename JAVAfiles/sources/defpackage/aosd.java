package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aosd extends apag implements apbu {
    public static final aosd a;
    private static volatile apca c;
    private byte d = 2;
    public apax b = emptyProtobufList();

    static {
        aosd aosdVar = new aosd();
        a = aosdVar;
        apag.registerDefaultInstance(aosd.class, aosdVar);
    }

    private aosd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", aosc.class});
            case NEW_MUTABLE_INSTANCE:
                return new aosd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aosd.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
