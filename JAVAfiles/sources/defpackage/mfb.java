package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfb extends apag implements apbu {
    public static final mfb a;
    private static volatile apca k;
    public int b;
    public int g;
    public int c = -1;
    public int d = -2;
    public int e = -2;
    public int f = -2;
    public apax h = emptyProtobufList();
    public int i = -1;
    public int j = -2;

    static {
        mfb mfbVar = new mfb();
        a = mfbVar;
        apag.registerDefaultInstance(mfb.class, mfbVar);
    }

    private mfb() {
    }

    public final void a() {
        apax apaxVar = this.h;
        if (!apaxVar.c()) {
            this.h = apag.mutableCopy(apaxVar);
        }
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ဏ\u0002\u0004ဏ\u0003\u0005᠌\u0004\u0006\u001b\u0007ဏ\u0005\bဏ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", apez.a, "h", mex.class, "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new mfb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (mfb.class) {
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
