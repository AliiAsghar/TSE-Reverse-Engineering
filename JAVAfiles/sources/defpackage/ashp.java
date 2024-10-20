package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ashp extends apag implements apbu {
    public static final ashp a;
    public static final apae b;
    private static volatile apca l;
    public int c;
    public boolean d;
    public ashs e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ashr i;
    public int j;
    public apax k = emptyProtobufList();

    static {
        ashp ashpVar = new ashp();
        a = ashpVar;
        apag.registerDefaultInstance(ashp.class, ashpVar);
        b = apag.newSingularGeneratedExtension(ashu.a, ashpVar, ashpVar, null, 11, apdf.MESSAGE, ashp.class);
    }

    private ashp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0006\u0007ဇ\u0005\b᠌\u0007\n\u001b", new Object[]{"c", "d", "e", "f", "g", "i", "h", "j", apwb.o, "k", asht.class});
            case NEW_MUTABLE_INSTANCE:
                return new ashp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (ashp.class) {
                        apcaVar = l;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            l = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
