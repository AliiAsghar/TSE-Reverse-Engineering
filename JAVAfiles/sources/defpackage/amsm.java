package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amsm extends apag implements apbu {
    public static final amsm a;
    private static volatile apca h;
    public int b;
    public long c;
    public apax d = emptyProtobufList();
    public int e;
    public int f;
    public amrj g;

    static {
        amsm amsmVar = new amsm();
        a = amsmVar;
        apag.registerDefaultInstance(amsm.class, amsmVar);
    }

    private amsm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003᠌\u0001\u0004င\u0002\u0007ဉ\u0005", new Object[]{"b", "c", "d", amoq.class, "e", amsa.f, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amsm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amsm.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
