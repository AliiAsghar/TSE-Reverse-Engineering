package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apqf extends apag implements apbu {
    public static final apqf a;
    private static volatile apca h;
    public int b;
    public aprx c;
    public apri d;
    public String e = "";
    public apax f = apag.emptyProtobufList();
    public String g = "";

    static {
        apqf apqfVar = new apqf();
        a = apqfVar;
        apag.registerDefaultInstance(apqf.class, apqfVar);
    }

    private apqf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ț\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apqf();
            case NEW_BUILDER:
                return new aozy((boolean[][][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apqf.class) {
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
