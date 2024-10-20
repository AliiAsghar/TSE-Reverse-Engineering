package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.SparseIntArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afox extends afoq {
    public static final /* synthetic */ artm[] n;
    public final Activity o;
    public final SparseIntArray p;
    public int q;
    public final arsn r;
    private final arwe s;

    static {
        arrr arrrVar = new arrr(afox.class, "recentItems", "getRecentItems()Ljava/util/List;", 0);
        int i = arsc.a;
        n = new artm[]{arrrVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afox(Activity activity, arwe arweVar, afmq afmqVar, afke afkeVar, arwe arweVar2, afpp afppVar) {
        super(afmqVar, afkeVar, arweVar2, afppVar);
        activity.getClass();
        arweVar.getClass();
        afmqVar.getClass();
        afkeVar.getClass();
        arweVar2.getClass();
        afppVar.getClass();
        this.o = activity;
        this.s = arweVar;
        this.p = new SparseIntArray();
        this.r = new afow(arnv.a, this);
    }

    private final boolean R(int i) {
        if (i < O()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afoq
    public final afot H(int i) {
        if (R(i)) {
            return (afot) Q().get(i);
        }
        return super.H(i - O());
    }

    @Override // defpackage.afoq
    public final void K(Context context, int i) {
        super.K(context, i);
        int i2 = this.f;
        this.q = i2 + i2;
    }

    @Override // defpackage.afoq
    public final afwv M(int i) {
        if (R(i)) {
            return afnp.a;
        }
        return afnn.a;
    }

    public final int N(int i) {
        if (i == 0) {
            return 0;
        }
        return this.p.get(i) + O();
    }

    public final int O() {
        return arrn.s(Q().size(), this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P(java.util.List r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.afou
            if (r0 == 0) goto L13
            r0 = r8
            afou r0 = (defpackage.afou) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afou r0 = new afou
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            afox r7 = r0.e
            afox r0 = r0.d
            defpackage.aqil.P(r8)
            goto L51
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.aqil.P(r8)
            arwe r8 = r6.s
            arpi r8 = r8.b()
            afov r2 = new afov
            r4 = 0
            r5 = 0
            r2.<init>(r6, r7, r4, r5)
            r0.d = r6
            r0.e = r6
            r0.c = r3
            java.lang.Object r8 = defpackage.arro.q(r8, r2, r0)
            if (r8 == r1) goto L5e
            r7 = r6
            r0 = r7
        L51:
            java.util.List r8 = (java.util.List) r8
            r8.getClass()
            r7.g = r8
            r0.p()
            arnb r7 = defpackage.arnb.a
            return r7
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afox.P(java.util.List, arpe):java.lang.Object");
    }

    public final List Q() {
        return (List) this.r.c(n[0]);
    }

    @Override // defpackage.afoq, defpackage.no
    public final int b() {
        return O() + super.b();
    }
}
