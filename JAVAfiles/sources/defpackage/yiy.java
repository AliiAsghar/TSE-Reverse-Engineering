package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yiy extends apag<yiy, aozy> implements apbu {
    public static final yiy a;
    private static volatile apca e;
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
    private int f;

    static {
        yiy yiyVar = new yiy();
        a = yiyVar;
        apag.registerDefaultInstance(yiy.class, yiyVar);
    }

    private yiy() {
    }

    public static /* synthetic */ void a(yiy yiyVar) {
        yiyVar.f |= 2;
        yiyVar.c = false;
    }

    public static /* synthetic */ void b(yiy yiyVar) {
        yiyVar.f |= 1;
        yiyVar.b = false;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"f", "b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new yiy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (yiy.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
