package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amlm extends apag implements apbu {
    public static final amlm a;
    private static volatile apca b;
    private int c;
    private int d;
    private int e;
    private int f;
    private byte g = 2;

    static {
        amlm amlmVar = new amlm();
        a = amlmVar;
        apag.registerDefaultInstance(amlm.class, amlmVar);
    }

    private amlm() {
        emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b2 = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᴌ\u0000\u0002ᴌ\u0001\u0005ᴌ\u0004", new Object[]{"c", "d", amln.b, "e", amln.a, "f", amjw.u});
            case NEW_MUTABLE_INSTANCE:
                return new amlm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (amlm.class) {
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
