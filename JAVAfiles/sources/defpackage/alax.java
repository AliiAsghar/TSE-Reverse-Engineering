package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alax extends apag implements apbu {
    public static final alax a;
    private static volatile apca g;
    public albk e;
    private int h;
    public String b = "";
    public String c = "";
    public apax d = emptyProtobufList();
    public apax f = emptyProtobufList();

    static {
        alax alaxVar = new alax();
        a = alaxVar;
        apag.registerDefaultInstance(alax.class, alaxVar);
    }

    private alax() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\b\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0004\u001b\u0006ဉ\u0001\b\u001b", new Object[]{"h", "b", "c", "d", alay.class, "e", "f", albj.class});
            case 3:
                return new alax();
            case 4:
                return new aozy(a);
            case 5:
                return a;
            case 6:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (alax.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
