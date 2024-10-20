package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvz extends apab implements apac {
    public static final apvz a;
    private static volatile apca m;
    public int b;
    public long c;
    public long d;
    public int e;
    public aozb f;
    public long g;
    public aozb h;
    public boolean i;
    public String j;
    public apwd k;
    private byte n = 2;

    static {
        apvz apvzVar = new apvz();
        a = apvzVar;
        apag.registerDefaultInstance(apvz.class, apvzVar);
    }

    private apvz() {
        emptyProtobufList();
        aozb aozbVar = aozb.b;
        aozb aozbVar2 = aozb.b;
        this.f = aozbVar2;
        this.g = 180000L;
        this.h = aozbVar2;
        emptyIntList();
        emptyIntList();
        this.j = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001!\t\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0012ည\u0013\u0019ဇ\u0017\u001cဈ\u0018!ᐉ\u001b", new Object[]{"b", "c", "f", "e", "g", "d", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new apvz();
            case NEW_BUILDER:
                return new apaa(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (apvz.class) {
                        apcaVar = m;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            m = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
