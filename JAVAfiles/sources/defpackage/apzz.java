package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class apzz extends apag implements apbu {
    public static final apzz a;
    private static volatile apca j;
    public int b;
    public apzw f;
    public apzw g;
    public int h;
    public String c = "";
    public String d = "";
    public String e = "";
    public String i = "";

    static {
        apzz apzzVar = new apzz();
        a = apzzVar;
        apag.registerDefaultInstance(apzz.class, apzzVar);
    }

    private apzz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001Ȉ\u0005Ȉ\u0006Ȉ\u0007ဉ\u0000\bဉ\u0001\t\f\u000bȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new apzz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (apzz.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
