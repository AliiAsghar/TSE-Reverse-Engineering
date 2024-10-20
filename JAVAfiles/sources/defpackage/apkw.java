package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apkw extends apag implements apbu {
    public static final apkw a;
    private static volatile apca f;
    public String b = "";
    public apax c = emptyProtobufList();
    public long d;
    public int e;

    static {
        apkw apkwVar = new apkw();
        a = apkwVar;
        apag.registerDefaultInstance(apkw.class, apkwVar);
    }

    private apkw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0003\u0004\f", new Object[]{"b", "c", apks.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apkw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (apkw.class) {
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
