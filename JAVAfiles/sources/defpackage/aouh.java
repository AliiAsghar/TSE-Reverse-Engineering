package defpackage;

import com.android.vcard.VCardConfig;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aouh extends apag implements apbu {
    private static volatile apca R;
    public static final apap a = new qex(18);
    public static final apap b = new qex(19);
    public static final aouh c;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public aozn I;
    public aozn J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean Q;
    private int S;
    public int d;
    public Object f;
    public int g;
    public int k;
    public aozn l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public boolean z;
    public int e = 0;
    public apao h = emptyIntList();
    public apao i = emptyIntList();
    public String j = "";
    public String q = "";
    public String r = "";
    public String A = "";
    public String B = "";
    public String P = "";

    static {
        aouh aouhVar = new aouh();
        c = aouhVar;
        apag.registerDefaultInstance(aouh.class, aouhVar);
    }

    private aouh() {
    }

    public static /* synthetic */ void A(aouh aouhVar) {
        aouhVar.d |= 8;
        aouhVar.k = -1;
    }

    public static /* synthetic */ void B(aouh aouhVar) {
        aouhVar.d |= 16384;
        aouhVar.u = false;
    }

    public static /* synthetic */ void C(aouh aouhVar) {
        aouhVar.d |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        aouhVar.H = false;
    }

    public static /* synthetic */ void D(aouh aouhVar) {
        aouhVar.d |= 512;
        aouhVar.q = "";
    }

    public static /* synthetic */ void E(aouh aouhVar) {
        aouhVar.d |= 1024;
        aouhVar.r = "";
    }

    public static /* synthetic */ void F(aouh aouhVar) {
        aouhVar.D = a.am(5);
        aouhVar.d |= 16777216;
    }

    public static /* synthetic */ void G(aouh aouhVar) {
        aouhVar.E = a.am(5);
        aouhVar.d |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
    }

    public static /* synthetic */ void H(aouh aouhVar) {
        aouhVar.p = a.ap(2);
        aouhVar.d |= 256;
    }

    public static /* synthetic */ void I(aouh aouhVar) {
        aouhVar.F = a.am(3);
        aouhVar.d |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
    }

    public static /* synthetic */ void a(aouh aouhVar, aozn aoznVar) {
        aoznVar.getClass();
        aouhVar.I = aoznVar;
        aouhVar.d |= 536870912;
    }

    public static /* synthetic */ void b(aouh aouhVar, aozn aoznVar) {
        aoznVar.getClass();
        aouhVar.J = aoznVar;
        aouhVar.d |= 1073741824;
    }

    public static /* synthetic */ void c(aouh aouhVar) {
        aouhVar.e = 2;
        aouhVar.f = "";
    }

    public static /* synthetic */ void d(aouh aouhVar) {
        aouhVar.d |= 32768;
        aouhVar.v = false;
    }

    public static /* synthetic */ void e(aouh aouhVar) {
        aouhVar.S |= 8;
        aouhVar.O = false;
    }

    public static /* synthetic */ void f(aouh aouhVar) {
        aouhVar.d |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        aouhVar.C = false;
    }

    public static /* synthetic */ void g(aouh aouhVar) {
        aouhVar.S |= 2;
        aouhVar.M = false;
    }

    public static /* synthetic */ void h(aouh aouhVar) {
        aouhVar.d |= 131072;
        aouhVar.x = false;
    }

    public static /* synthetic */ void i(aouh aouhVar) {
        aouhVar.d |= 524288;
        aouhVar.z = false;
    }

    public static /* synthetic */ void j(aouh aouhVar) {
        aouhVar.d |= 32;
        aouhVar.m = false;
    }

    public static /* synthetic */ void k(aouh aouhVar) {
        aouhVar.d |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        aouhVar.G = false;
    }

    public static /* synthetic */ void l(aouh aouhVar) {
        aouhVar.S |= 4;
        aouhVar.N = false;
    }

    public static /* synthetic */ void m(aouh aouhVar) {
        aouhVar.d |= 8192;
        aouhVar.t = false;
    }

    public static /* synthetic */ void n(aouh aouhVar) {
        aouhVar.e = 3;
        aouhVar.f = "";
    }

    public static /* synthetic */ void o(aouh aouhVar) {
        aouhVar.S |= 32;
        aouhVar.Q = false;
    }

    public static /* synthetic */ void p(aouh aouhVar) {
        aouhVar.d |= Integer.MIN_VALUE;
        aouhVar.K = false;
    }

    public static /* synthetic */ void q(aouh aouhVar) {
        aouhVar.d |= 2;
        aouhVar.j = "";
    }

    public static /* synthetic */ void r(aouh aouhVar) {
        aouhVar.d |= 65536;
        aouhVar.w = false;
    }

    public static /* synthetic */ void s(aouh aouhVar) {
        aouhVar.d |= 262144;
        aouhVar.y = 10;
    }

    public static /* synthetic */ void t(aouh aouhVar) {
        aouhVar.d |= 2097152;
        aouhVar.A = "UP_T";
    }

    public static /* synthetic */ void u(aouh aouhVar) {
        aouhVar.d |= 4194304;
        aouhVar.B = "5.1B";
    }

    public static /* synthetic */ void v(aouh aouhVar) {
        aouhVar.d |= 4096;
        aouhVar.s = false;
    }

    public static /* synthetic */ void w(aouh aouhVar) {
        aouhVar.S |= 16;
        aouhVar.P = "";
    }

    public static /* synthetic */ void x(aouh aouhVar) {
        aouhVar.d |= 128;
        aouhVar.o = false;
    }

    public static /* synthetic */ void y(aouh aouhVar) {
        aouhVar.d |= 64;
        aouhVar.n = false;
    }

    public static /* synthetic */ void z(aouh aouhVar) {
        aouhVar.S |= 1;
        aouhVar.L = false;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(c, "\u0000'\u0001\u0002\u00022'\u0000\u0002\u0000\u0002Ȼ\u0000\u0003Ȼ\u0000\u0005ለ\u0001\u0007င\u0003\bဉ\u0004\tဇ\u0006\nဇ\u0007\u000bဇ\u000f\fဇ\u0013\u000eለ\u0015\u000fለ\u0016\u0010ဇ\u0017\u0011ဌ\u0018\u0012ဌ\u0019\u0013ဉ\u001d\u0014ဉ\u001e\u0015ဇ\u001f\u0018ဌ\u0000\u001aဇ\u0010\u001dဇ \u001eဇ\u0005\u001fဇ\u0011!ဌ\u001a\"ဌ\b#ለ\t$ለ$%ဇ%&ဇ\f'ဇ\r(,*ဇ\u000e+င\u0012,ဇ!-ဇ\".ለ\n/,0ဇ#1ဇ\u001b2ဇ\u001c", new Object[]{"f", "e", "d", "S", "j", "k", "l", "n", "o", "v", "z", "A", VCardConstants.PARAM_ENCODING_B, "C", "D", "E", "I", "J", "K", "g", "w", "L", "m", "x", "F", "p", "q", "P", "Q", "s", "t", "h", "u", "y", "M", VCardConstants.PROPERTY_N, "r", "i", "O", "G", "H"});
            case NEW_MUTABLE_INSTANCE:
                return new aouh();
            case NEW_BUILDER:
                return new aozy(c);
            case GET_DEFAULT_INSTANCE:
                return c;
            case GET_PARSER:
                apca apcaVar = R;
                if (apcaVar == null) {
                    synchronized (aouh.class) {
                        apcaVar = R;
                        if (apcaVar == null) {
                            apcaVar = new aozz(c);
                            R = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
