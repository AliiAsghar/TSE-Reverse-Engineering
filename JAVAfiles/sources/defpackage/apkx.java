package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apkx extends apag implements apbu {
    public static final apkx a;
    private static volatile apca e;
    public String b = "";
    public int c;
    public int d;

    static {
        apkx apkxVar = new apkx();
        a = apkxVar;
        apag.registerDefaultInstance(apkx.class, apkxVar);
    }

    private apkx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new apkx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (apkx.class) {
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
