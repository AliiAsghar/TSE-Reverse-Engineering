package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class angj extends apag implements apbu {
    public static final angj a;
    private static volatile apca t;
    public int b;
    public anfv f;
    public angm g;
    public long h;
    public int k;
    public angk l;
    public boolean n;
    public boolean o;
    public int p;
    public boolean r;
    public angi s;
    public String c = "";
    public String d = "";
    public String e = "";
    public String i = "";
    public apax j = emptyProtobufList();
    public String m = "";
    public apax q = emptyProtobufList();

    static {
        angj angjVar = new angj();
        a = angjVar;
        apag.registerDefaultInstance(angj.class, angjVar);
    }

    private angj() {
    }

    public final void a() {
        apax apaxVar = this.j;
        if (!apaxVar.c()) {
            this.j = apag.mutableCopy(apaxVar);
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
                return newMessageInfo(a, "\u0004\u0011\u0000\u0001\u0001\u0016\u0011\u0000\u0002\u0000\u0001Ȉ\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0002\u0007Ȉ\tȈ\n\u001b\u000b\f\fȈ\rဉ\u0004\u000eȈ\u000f\u0007\u0010\u0007\u0012\f\u0013\u001b\u0014\u0007\u0016ဉ\u0007", new Object[]{"b", "c", "f", "g", "h", "i", "e", "j", angh.class, "k", "d", "l", "m", "n", "o", "p", "q", angs.class, "r", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new angj();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = t;
                if (apcaVar == null) {
                    synchronized (angj.class) {
                        apcaVar = t;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            t = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
