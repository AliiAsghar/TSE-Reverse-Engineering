package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amgu extends apag implements apbu {
    public static final amgu a;
    private static volatile apca aE;
    public int A;
    public int B;
    public long C;
    public int D;
    public int E;
    public int F;
    public long G;
    public amie K;
    public boolean L;
    public int M;
    public int N;
    public amxb O;
    public amjk P;
    public int Q;
    public int R;
    public int S;
    public amee U;
    public amjc V;
    public amkn W;
    public int Y;
    public amgd aA;
    public int aB;
    public long aC;
    public int aD;
    public int aa;
    public int ab;
    public long ac;
    public boolean ad;
    public int ae;
    public int ai;
    public boolean aj;
    public int ak;
    public int al;
    public int am;
    public amrl an;
    public amlh ao;
    public int ap;
    public int aq;
    public ammx ar;
    public int as;
    public amrk at;
    public int av;
    public int aw;
    public boolean ax;
    public amrl ay;
    public int az;
    public int b;
    public int c;
    public int d;
    public Object f;
    public int g;
    public int h;
    public amhb i;
    public amgw j;
    public amim k;
    public amig l;
    public int m;
    public long n;
    public atok o;
    public amfn p;
    public amfn q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public amje y;
    public long z;
    public int e = 0;
    private byte aF = 2;
    public String H = "";
    public apai I = emptyBooleanList();
    public String J = "";
    public String T = "";
    public apax X = emptyProtobufList();
    public apao Z = emptyIntList();
    public String af = "";
    public String ag = "";
    public String ah = "";
    public String au = "";

    static {
        amgu amguVar = new amgu();
        a = amguVar;
        apag.registerDefaultInstance(amgu.class, amguVar);
    }

    private amgu() {
    }

    public final void a() {
        apax apaxVar = this.X;
        if (!apaxVar.c()) {
            this.X = apag.mutableCopy(apaxVar);
        }
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.aF);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.aF = b;
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amwm.r;
                return newMessageInfo(a, "\u0001O\u0001\u0003\u0001[O\u0000\u0003\u0001\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007<\u0000\b᠌\u0006\tဂ\u0007\nဉ\u000b\f᠌\u000e\u000e᠌\u0010\u000f᠌\u0011\u0010᠌\u0012\u0011᠌\u0013\u0012᠌\u0014\u0013᠌\u0015\u0014ဉ\u0016\u0015ဂ\u0017\u0016᠌\u0018\u0017᠌\u0019\u0018᠌\u001b\u0019᠌\u001c\u001a᠌\u001d\u001bဂ\u001e\u001cဉ\r\u001dဈ\u001f\u001e\u0019\u001fဈ %ဉ%'ဇ'(င()<\u0000*᠌)+ဉ*,ဉ+-᠌,.᠌-/᠌.0ဈ/1ဉ02ဉ13ဉ24\u001b5᠌37ࠞ8᠌59ဂ\u001a:ဂ7;ဇ8<<\u0000=᠌9>ဈ:?ဈ;@ဈ<A᠌=Bဇ>C᠌?D᠌@E᠌AFဉBGဉCHငDI᠌EJဉFMဉ\nN᠌GOဉHPဈIQ᠌JR᠌KSဇLTဉMVငNWဉOX᠌6Y᠌PZဂQ[᠌R", new Object[]{"f", "e", "b", "c", "d", "g", amfz.p, "h", amfz.o, "i", "j", "k", "l", amha.class, "m", amfz.n, "n", "p", "r", amff.a, "s", amfz.m, "t", amfz.g, "u", amfz.q, "v", amfz.l, "w", amwm.f, "x", amfz.i, "y", "z", "A", amfz.j, VCardConstants.PARAM_ENCODING_B, amgp.e, "D", amln.u, "E", amfz.s, "F", amgp.a, "G", "q", "H", "I", "J", "K", "L", "M", amij.class, VCardConstants.PROPERTY_N, amiv.c, "O", "P", "Q", amgp.f, "R", amgp.d, "S", amfz.e, "T", "U", "V", "W", "X", amkn.class, "Y", amgp.g, "Z", amfz.k, "aa", apamVar, "C", "ac", "ad", amhs.class, "ae", amgp.i, "af", "ag", "ah", "ai", amfz.f, "aj", "ak", amfz.u, "al", amgp.c, "am", amgp.b, "an", "ao", "ap", "aq", amgp.m, "ar", "o", "as", amgp.l, "at", "au", "av", amfz.t, "aw", amgp.k, "ax", "ay", "az", "aA", "ab", apamVar, "aB", amgp.j, "aC", "aD", amfz.r});
            case NEW_MUTABLE_INSTANCE:
                return new amgu();
            case NEW_BUILDER:
                return new amgl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = aE;
                if (apcaVar == null) {
                    synchronized (amgu.class) {
                        apcaVar = aE;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            aE = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
