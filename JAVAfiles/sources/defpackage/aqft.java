package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqft extends apag implements apbu {
    public static final aqft a;
    private static volatile apca e;
    public apbo d = apbo.a;
    public String b = "";
    public String c = "";

    static {
        aqft aqftVar = new aqft();
        a = aqftVar;
        apag.registerDefaultInstance(aqft.class, aqftVar);
    }

    private aqft() {
        aozb aozbVar = aozb.b;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\t\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\t2", new Object[]{"b", "c", "d", aqfs.a});
            case NEW_MUTABLE_INSTANCE:
                return new aqft();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aqft.class) {
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
