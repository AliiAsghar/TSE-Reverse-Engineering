package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclz extends apag implements apbu {
    public static final aclz a;
    private static volatile apca q;
    public int b;
    public double e;
    public float f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public long p;
    private byte r = 2;
    public aozb c = aozb.b;
    public String d = "";
    public apax k = emptyProtobufList();
    public apax l = emptyProtobufList();
    public apax m = apag.emptyProtobufList();
    public apar n = emptyLongList();
    public apan o = emptyFloatList();

    static {
        aclz aclzVar = new aclz();
        a = aclzVar;
        apag.registerDefaultInstance(aclz.class, aclzVar);
    }

    private aclz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", acmb.class, "l", acma.class, "m", "n", "p", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new aclz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = q;
                if (apcaVar == null) {
                    synchronized (aclz.class) {
                        apcaVar = q;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            q = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
