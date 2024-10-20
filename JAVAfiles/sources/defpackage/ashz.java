package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ashz extends apab implements apac {
    public static final ashz a;
    private static volatile apca h;
    public int b;
    public ashy c;
    public asiz d;
    public int e;
    public ashx f;
    private byte i = 2;
    public String g = "";

    static {
        ashz ashzVar = new ashz();
        a = ashzVar;
        apag.registerDefaultInstance(ashz.class, ashzVar);
    }

    private ashz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", apwb.r, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new ashz();
            case NEW_BUILDER:
                return new apaa(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (ashz.class) {
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
