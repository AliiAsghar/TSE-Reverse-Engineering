package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jto implements jow, kkl {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl");
    public final Context b;
    public final arwe c;
    public final Optional d;
    public final ovk e;
    public final ovg f;
    public final ovm g;
    public final AtomicInteger h;
    public final ascc i;
    public final boolean j;
    public final afzk k;
    public final aflb l;
    public final ascv m;
    public final mgu n;
    public final jxv o;
    private final arwe p;
    private final arml q;
    private final ascv r;
    private final ascv s;
    private final ascv t;
    private final jtm u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ascv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [asai, java.lang.Object] */
    public jto(Context context, arwe arweVar, arwe arweVar2, jxv jxvVar, joe joeVar, armf armfVar, Optional optional, ascg ascgVar, ovv ovvVar, jgm jgmVar, ioy ioyVar, mgu mguVar, ovk ovkVar, ovg ovgVar, ovm ovmVar, owz owzVar, oxa oxaVar) {
        context.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        jxvVar.getClass();
        armfVar.getClass();
        ascgVar.getClass();
        ioyVar.getClass();
        mguVar.getClass();
        this.b = context;
        this.c = arweVar;
        this.p = arweVar2;
        this.o = jxvVar;
        this.d = optional;
        this.n = mguVar;
        this.e = ovkVar;
        this.f = ovgVar;
        this.g = ovmVar;
        this.h = new AtomicInteger();
        this.q = armd.a(new jmy(armfVar, 15));
        this.i = asck.e(0, 1, 3, 1);
        this.j = owzVar.a();
        jtf jtfVar = new jtf(new jtf(ascgVar, 1), 0);
        int i = ascp.a;
        ascv T = arrn.T(jtfVar, arweVar, asco.b, null);
        this.r = T;
        ascv T2 = arrn.T(new jtf(new jtf(ascgVar, 2), 3), arweVar, asco.b, "");
        this.s = T2;
        ascv T3 = arrn.T(new jtf(new jtf(ascgVar, 4), 5), arweVar, asco.b, null);
        this.t = T3;
        jtm jtmVar = new jtm(this, 0);
        this.u = jtmVar;
        afzk afzkVar = new afzk(jtmVar, joeVar.a(), ovvVar.a() ? jgmVar : ioyVar);
        this.k = afzkVar;
        this.l = afzkVar.f;
        asai Q = arrn.Q(new jtf(jxvVar.a, 6), T2, T3, T, new jtn(this, oxaVar, null));
        ascp ascpVar = asco.b;
        String str = ((jhc) jxvVar.a.c()).a;
        this.m = arrn.T(Q, arweVar, ascpVar, new aeno(afzkVar, (CharSequence) (str == null ? "" : str), (String) T2.c(), (Integer) T.c(), true, (aeor) null, new aenn(ovgVar.a(), ovmVar.a(), false, 4)));
        qjh.l(arweVar, null, new jpc(this, (arpe) null, 6), 3);
        qjh.l(arweVar, null, new jpc(this, (arpe) null, 7, (byte[]) null), 3);
        qjh.l(arweVar, null, new jpc(this, (arpe) null, 8, (char[]) null), 3);
    }

    @Override // defpackage.jow
    public final void a() {
        qjh.l(this.c, null, new jsu(this, (arpe) null, 2), 3);
    }

    public final mxe b() {
        return (mxe) this.q.a();
    }

    @Override // defpackage.kkl, java.lang.AutoCloseable
    public final void close() {
        qjh.l(this.p, null, new jpc(this, (arpe) null, 9, (short[]) null), 3);
    }
}
