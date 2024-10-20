package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apht extends apag implements apbu {
    public static final apht a;
    private static volatile apca k;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public String f = "";
    public apax g = emptyProtobufList();
    public boolean h;
    public boolean i;
    public int j;

    static {
        apht aphtVar = new apht();
        a = aphtVar;
        apag.registerDefaultInstance(apht.class, aphtVar);
    }

    private apht() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005\u001b\nဇ\b\u000bဇ\t\rင\u000b", new Object[]{"b", "c", apkm.l, "d", "e", apkm.i, "f", "g", aphs.class, "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new apht();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (apht.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
