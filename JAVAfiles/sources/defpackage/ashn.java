package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ashn extends apag implements apbu {
    public static final ashn a;
    private static volatile apca ao;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public ashm G;
    public long H;
    public ashm I;
    public ashm J;
    public ashm K;
    public ashm L;
    public ashm M;
    public ashm N;
    public ashm O;
    public ashm P;
    public ashm Q;
    public ashm R;
    public ashm S;
    public ashm T;
    public ashm U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public long aa;
    public long ab;
    public long ac;
    public long ad;
    public long ae;
    public long af;
    public long ag;
    public long ah;
    public long ai;
    public long aj;
    public ashm ak;
    public long al;
    public long am;
    public long an;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public ashm n;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;
    public apax h = emptyProtobufList();
    public apax i = emptyProtobufList();
    public apax j = emptyProtobufList();
    public apax k = emptyProtobufList();
    public apax l = emptyProtobufList();
    public apax m = emptyProtobufList();
    public apax o = emptyProtobufList();
    public apax p = emptyProtobufList();
    public apax q = emptyProtobufList();
    public apax r = emptyProtobufList();

    static {
        ashn ashnVar = new ashn();
        a = ashnVar;
        apag.registerDefaultInstance(ashn.class, ashnVar);
    }

    private ashn() {
    }

    public final void a() {
        apax apaxVar = this.m;
        if (!apaxVar.c()) {
            this.m = apag.mutableCopy(apaxVar);
        }
    }

    public final void b() {
        apax apaxVar = this.o;
        if (!apaxVar.c()) {
            this.o = apag.mutableCopy(apaxVar);
        }
    }

    public final void c() {
        apax apaxVar = this.l;
        if (!apaxVar.c()) {
            this.l = apag.mutableCopy(apaxVar);
        }
    }

    public final void d() {
        apax apaxVar = this.k;
        if (!apaxVar.c()) {
            this.k = apag.mutableCopy(apaxVar);
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
                return newMessageInfo(a, "\u0001?\u0000\u0002\u0001@?\u0000\n\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000bဉ\u0004\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010ဂ\u0005\u0011ဂ\u0006\u0012ဂ\u0007\u0013ဂ\b\u0014ဂ\t\u0015ဂ\n\u0016ဂ\u000b\u0017ဂ\f\u0018ဂ\r\u0019ဂ\u000e\u001aဂ\u000f\u001bဂ\u0010\u001cဂ\u0011\u001dဂ\u0012\u001eဉ\u0013\u001fဂ\u0014 ဉ\u0015!ဉ\u0016\"ဉ\u0017#ဉ\u0018$ဉ\u0019%ဉ\u001a&ဉ\u001b'ဉ\u001c(ဉ\u001d)ဉ\u001e*ဉ\u001f+ဉ ,ဉ!-ဂ\".ဂ#/ဂ$0ဂ%1ဂ&2ဂ'3ဂ(4ဂ)5ဂ*6ဂ+7ဂ,8ဂ-9ဂ.:ဂ/;ဂ0=ဉ1>ဂ2?ဂ3@ဂ4", new Object[]{"b", "c", "d", "e", "f", "g", "h", ashm.class, "i", ashm.class, "j", ashm.class, "k", ashm.class, "l", ashm.class, "m", ashm.class, "n", "o", ashm.class, "p", ashj.class, "q", ashk.class, "r", ashi.class, "s", "t", "u", "v", "w", "x", "y", "z", "A", VCardConstants.PARAM_ENCODING_B, "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N, "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an"});
            case NEW_MUTABLE_INSTANCE:
                return new ashn();
            case NEW_BUILDER:
                return new aozy((int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = ao;
                if (apcaVar == null) {
                    synchronized (ashn.class) {
                        apcaVar = ao;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            ao = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void e() {
        apax apaxVar = this.h;
        if (!apaxVar.c()) {
            this.h = apag.mutableCopy(apaxVar);
        }
    }

    public final void f() {
        apax apaxVar = this.i;
        if (!apaxVar.c()) {
            this.i = apag.mutableCopy(apaxVar);
        }
    }

    public final void g() {
        apax apaxVar = this.j;
        if (!apaxVar.c()) {
            this.j = apag.mutableCopy(apaxVar);
        }
    }
}
