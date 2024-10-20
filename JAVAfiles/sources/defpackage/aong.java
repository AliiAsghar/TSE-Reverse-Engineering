package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aong extends apag implements apbu {
    public static final aong a;
    private static volatile apca k;
    public int b;
    public int c;
    public long d;
    public ashu e;
    public aonc f;
    public anav g;
    public aond h;
    public apax i;
    public aonf j;
    private byte l = 2;

    static {
        aong aongVar = new aong();
        a = aongVar;
        apag.registerDefaultInstance(aong.class, aongVar);
    }

    private aong() {
        aozb aozbVar = aozb.b;
        this.i = emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0002\u0010\b\u0000\u0001\u0002\u0002ဉ\u0004\u0003ᐉ\u0005\u0007ဉ\u0006\t\u001b\f᠌\u0000\rဂ\u0001\u000eᐉ\u0002\u0010ဉ\b", new Object[]{"b", "f", "g", "h", "i", aoni.class, "c", anbb.h, "d", "e", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aong();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (aong.class) {
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
