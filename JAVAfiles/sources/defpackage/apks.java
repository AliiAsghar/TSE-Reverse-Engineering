package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apks extends apag implements apbu {
    public static final apks a;
    private static volatile apca g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public apkv f;

    static {
        apks apksVar = new apks();
        a = apksVar;
        apag.registerDefaultInstance(apks.class, apksVar);
    }

    private apks() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003ဉ\u0000", new Object[]{"d", "c", "b", "e", apkz.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apks();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apks.class) {
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
