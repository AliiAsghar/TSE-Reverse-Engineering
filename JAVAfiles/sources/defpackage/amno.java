package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amno extends apag implements apbu {
    public static final amno a;
    private static volatile apca o;
    public int b;
    public Object d;
    public Object f;
    public amnm g;
    public amnm h;
    public apfc i;
    public int j;
    public int k;
    public apfl n;
    public int c = 0;
    public int e = 0;
    private byte p = 2;
    public String l = "";
    public String m = "";

    static {
        amno amnoVar = new amno();
        a = amnoVar;
        apag.registerDefaultInstance(amno.class, amnoVar);
    }

    private amno() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004#\u0002\u0001\u0002(#\u0000\u0000\u0001\u0002ဉ\u0001\u0003ဉ\u0002\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0001\n<\u0001\u000b<\u0001\f<\u0001\r<\u0001\u000e<\u0001\u000f<\u0001\u0010<\u0001\u0011<\u0001\u0012м\u0001\u0014<\u0001\u0015<\u0001\u0016<\u0001\u0017<\u0001\u0018ဉ\u0006\u0019<\u0001\u001a᠌\u0007\u001b᠌\b\u001c<\u0001\u001d<\u0001\u001eဈ\t\u001f<\u0001 <\u0001!<\u0001#ဈ\n$<\u0001%<\u0001&<\u0001'<\u0001(ဉ\u000b", new Object[]{"d", "c", "f", "e", "b", "g", "h", apfr.class, apfq.class, apft.class, apga.class, apet.class, aphn.class, apfm.class, apfv.class, apfe.class, apev.class, apfp.class, apgd.class, apkr.class, apkp.class, aper.class, aphw.class, apgc.class, "i", apjh.class, "j", amna.l, "k", amna.m, apfb.class, apes.class, "l", apgb.class, apeu.class, apfd.class, "m", apjs.class, aphz.class, apfk.class, asgx.class, "n"});
            case NEW_MUTABLE_INSTANCE:
                return new amno();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = o;
                if (apcaVar == null) {
                    synchronized (amno.class) {
                        apcaVar = o;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            o = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
