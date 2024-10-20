package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aldv extends apag implements apbu {
    public static final aldv a;
    private static volatile apca b;
    private int c;
    private apth d;
    private apbo e = apbo.a;
    private byte f = 2;

    static {
        aldv aldvVar = new aldv();
        a = aldvVar;
        apag.registerDefaultInstance(aldv.class, aldvVar);
    }

    private aldv() {
        emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b2 = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0005\u0002\u0001\u0000\u0001\u0001ᐉ\u0000\u00052", new Object[]{"c", "d", "e", aldu.a});
            case NEW_MUTABLE_INSTANCE:
                return new aldv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (aldv.class) {
                        apcaVar = b;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            b = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
