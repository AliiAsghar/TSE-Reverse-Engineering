package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class mgg extends apag implements apbu {
    public static final mgg a;
    private static volatile apca k;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;

    static {
        mgg mggVar = new mgg();
        a = mggVar;
        apag.registerDefaultInstance(mgg.class, mggVar);
    }

    private mgg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\n\b\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006ဂ\u0005\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\u0006", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new mgg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (mgg.class) {
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
