package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ales extends apag implements apbu {
    public static final apap a = new qex(13);
    public static final ales b;
    private static volatile apca s;
    public Object d;
    public int f;
    public int g;
    public int h;
    public long i;
    public long j;
    public int k;
    public int l;
    public long m;
    public int p;
    public int q;
    public int r;
    public int c = 0;
    public String e = "";
    public apao n = emptyIntList();
    public apar o = emptyLongList();

    static {
        ales alesVar = new ales();
        b = alesVar;
        apag.registerDefaultInstance(ales.class, alesVar);
    }

    private ales() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0000\u000f\u0001\u0000\u0001k\u000f\u0000\u0002\u0000\u0001Ȉ\u0002\u000b\u0003\f\u0011\f\u0013\f\u0016\u000b\u0017\u0002\u0018\u0002\u001a\u0003d,g\fh%i\fj\fk<\u0000", new Object[]{"d", "c", "e", "f", "g", "k", "l", "h", "i", "j", "m", "n", "p", "o", "q", "r", aler.class});
            case NEW_MUTABLE_INSTANCE:
                return new ales();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = s;
                if (apcaVar == null) {
                    synchronized (ales.class) {
                        apcaVar = s;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
                            s = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
