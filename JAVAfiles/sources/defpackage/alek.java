package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alek extends apag implements apbu {
    public static final alek a;
    private static volatile apca i;
    public int b;
    public int c;
    public apax d = emptyProtobufList();
    public int e;
    public String f;
    public alef g;
    public apax h;
    private int j;

    static {
        alek alekVar = new alek();
        a = alekVar;
        apag.registerDefaultInstance(alek.class, alekVar);
    }

    private alek() {
        emptyIntList();
        this.f = "";
        this.h = emptyProtobufList();
        emptyIntList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0004\u0019\u0007\u0000\u0002\u0000\u0004\u000b\u0005\f\n\f\u000bဉ\u0001\f\u001b\u0010\u001b\u0019Ȉ", new Object[]{"j", "b", "c", "e", "g", "h", ales.class, "d", alei.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new alek();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (alek.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
