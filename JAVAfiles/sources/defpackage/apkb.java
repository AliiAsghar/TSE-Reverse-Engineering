package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apkb extends apag implements apbu {
    public static final apkb a;
    private static volatile apca h;
    public int b;
    public int c;
    public String d = "";
    public apax e = emptyProtobufList();
    public int f;
    public boolean g;

    static {
        apkb apkbVar = new apkb();
        a = apkbVar;
        apag.registerDefaultInstance(apkb.class, apkbVar);
    }

    private apkb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဆ\u0002\u0005ဇ\u0003", new Object[]{"b", "c", apjw.e, "d", "e", apka.class, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apkb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apkb.class) {
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
