package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apek extends apag implements apbu {
    public static final apek a;
    private static volatile apca m;
    public int b;
    public int c;
    public int d;
    public int e;
    public apeg f;
    public boolean g;
    public long h;
    public long i;
    public apax j;
    public int k;
    public apeh l;

    static {
        apek apekVar = new apek();
        a = apekVar;
        apag.registerDefaultInstance(apek.class, apekVar);
    }

    private apek() {
        emptyIntList();
        this.j = emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0002\f\n\u0000\u0001\u0000\u0002င\u0000\u0003င\u0001\u0004င\u0002\u0005ဉ\u0003\u0007ဇ\u0005\bဂ\u0006\tဂ\u0007\n\u001b\u000b᠌\b\fဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", apej.class, "k", anbb.r, "l"});
            case NEW_MUTABLE_INSTANCE:
                return new apek();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (apek.class) {
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
