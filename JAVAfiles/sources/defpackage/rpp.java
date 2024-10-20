package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpp implements rpe {
    private final /* synthetic */ int l;
    public static final rpp k = new rpp(10);
    public static final rpp j = new rpp(9);
    public static final rpp i = new rpp(8);
    public static final rpp h = new rpp(7);
    public static final rpp g = new rpp(6);
    public static final rpp f = new rpp(5);
    public static final rpp e = new rpp(4);
    public static final rpp d = new rpp(3);
    public static final rpp c = new rpp(2);
    public static final rpp b = new rpp(1);
    public static final rpp a = new rpp(0);

    private rpp(int i2) {
        this.l = i2;
    }

    @Override // defpackage.rpe
    public final /* synthetic */ agmh a() {
        switch (this.l) {
            case 0:
                return (agmh) rkz.e.a;
            case 1:
                return (agmh) rkq.e.c;
            case 2:
                return (agmh) rkq.e.c;
            case 3:
                return (agmh) rlk.e.u;
            case 4:
                return (agmh) rlv.d.c;
            case 5:
                return (agmh) rmh.e.c;
            case 6:
                return (agmh) rmq.e.a;
            case 7:
                return (agmh) rmz.e.b;
            case 8:
                return rnm.c.a;
            case 9:
                return (agmh) rnx.e.n;
            default:
                return (agmh) rpb.e.j;
        }
    }

    @Override // defpackage.rpe
    public final /* synthetic */ agpc b() {
        Object apply;
        switch (this.l) {
            case 0:
                return new rkx(rkz.a);
            case 1:
                rko a2 = rkq.a();
                apply = new rhr(20).apply(new rkp());
                a2.k(new agpw((rkp) apply));
                return a2;
            case 2:
                return rkq.a();
            case 3:
                return rlk.a();
            case 4:
                return new rlt(rlv.a);
            case 5:
                return new rmf(rmh.a);
            case 6:
                return new rmo(rmq.a);
            case 7:
                return new rmx(rmz.a);
            case 8:
                return rnm.a();
            case 9:
                return rnx.a();
            default:
                return rpb.a();
        }
    }

    @Override // defpackage.rpe
    public final /* synthetic */ agpc c(agpc agpcVar, List list) {
        agcp W;
        agcp W2;
        agcp W3;
        agcp W4;
        agcp W5;
        int i2 = 0;
        switch (this.l) {
            case 0:
                rkx rkxVar = (rkx) agpcVar;
                rku[] rkuVarArr = (rku[]) list.toArray(new rku[0]);
                rku[] rkuVarArr2 = (rku[]) Arrays.copyOf(rkuVarArr, rkuVarArr.length);
                W = agnc.d("backup").W();
                int c2 = W.c();
                Integer.valueOf(c2).getClass();
                int length = rkuVarArr2.length;
                while (i2 < length) {
                    if (((Integer) rkz.b.getOrDefault(rkuVarArr2[i2].toString(), -1)).intValue() > c2) {
                        agnc.t("columnReference.toString()", c2);
                    }
                    i2++;
                }
                rkxVar.m(rkuVarArr2);
                return rkxVar;
            case 1:
                rko rkoVar = (rko) agpcVar;
                rkk[] rkkVarArr = (rkk[]) list.toArray(new rkk[0]);
                rkoVar.c((rkk[]) Arrays.copyOf(rkkVarArr, rkkVarArr.length));
                return rkoVar;
            case 2:
                rko rkoVar2 = (rko) agpcVar;
                rkk[] rkkVarArr2 = (rkk[]) list.toArray(new rkk[0]);
                rkoVar2.c((rkk[]) Arrays.copyOf(rkkVarArr2, rkkVarArr2.length));
                return rkoVar2;
            case 3:
                rli rliVar = (rli) agpcVar;
                rld[] rldVarArr = (rld[]) list.toArray(new rld[0]);
                rliVar.c((rld[]) Arrays.copyOf(rldVarArr, rldVarArr.length));
                return rliVar;
            case 4:
                rlt rltVar = (rlt) agpcVar;
                rlp[] rlpVarArr = (rlp[]) list.toArray(new rlp[0]);
                rlp[] rlpVarArr2 = (rlp[]) Arrays.copyOf(rlpVarArr, rlpVarArr.length);
                W2 = agnc.d("backup").W();
                int c3 = W2.c();
                Integer.valueOf(c3).getClass();
                int length2 = rlpVarArr2.length;
                while (i2 < length2) {
                    if (((Integer) rlv.b.getOrDefault(rlpVarArr2[i2].toString(), -1)).intValue() > c3) {
                        agnc.t("columnReference.toString()", c3);
                    }
                    i2++;
                }
                rltVar.m(rlpVarArr2);
                return rltVar;
            case 5:
                rmf rmfVar = (rmf) agpcVar;
                rlz[] rlzVarArr = (rlz[]) list.toArray(new rlz[0]);
                rlz[] rlzVarArr2 = (rlz[]) Arrays.copyOf(rlzVarArr, rlzVarArr.length);
                W3 = agnc.d("backup").W();
                int c4 = W3.c();
                Integer.valueOf(c4).getClass();
                int length3 = rlzVarArr2.length;
                while (i2 < length3) {
                    if (((Integer) rmh.b.getOrDefault(rlzVarArr2[i2].toString(), -1)).intValue() > c4) {
                        agnc.t("columnReference.toString()", c4);
                    }
                    i2++;
                }
                rmfVar.m(rlzVarArr2);
                return rmfVar;
            case 6:
                rmo rmoVar = (rmo) agpcVar;
                rmk[] rmkVarArr = (rmk[]) list.toArray(new rmk[0]);
                rmk[] rmkVarArr2 = (rmk[]) Arrays.copyOf(rmkVarArr, rmkVarArr.length);
                W4 = agnc.d("backup").W();
                int c5 = W4.c();
                Integer.valueOf(c5).getClass();
                int length4 = rmkVarArr2.length;
                while (i2 < length4) {
                    if (((Integer) rmq.b.getOrDefault(rmkVarArr2[i2].toString(), -1)).intValue() > c5) {
                        agnc.t("columnReference.toString()", c5);
                    }
                    i2++;
                }
                rmoVar.m(rmkVarArr2);
                return rmoVar;
            case 7:
                rmx rmxVar = (rmx) agpcVar;
                rmu[] rmuVarArr = (rmu[]) list.toArray(new rmu[0]);
                rmu[] rmuVarArr2 = (rmu[]) Arrays.copyOf(rmuVarArr, rmuVarArr.length);
                W5 = agnc.d("backup").W();
                int c6 = W5.c();
                Integer.valueOf(c6).getClass();
                int length5 = rmuVarArr2.length;
                while (i2 < length5) {
                    if (((Integer) rmz.b.getOrDefault(rmuVarArr2[i2].toString(), -1)).intValue() > c6) {
                        agnc.t("columnReference.toString()", c6);
                    }
                    i2++;
                }
                rmxVar.m(rmuVarArr2);
                return rmxVar;
            case 8:
                rnk rnkVar = (rnk) agpcVar;
                rnf[] rnfVarArr = (rnf[]) list.toArray(new rnf[0]);
                rnkVar.c((rnf[]) Arrays.copyOf(rnfVarArr, rnfVarArr.length));
                return rnkVar;
            case 9:
                rnv rnvVar = (rnv) agpcVar;
                rnq[] rnqVarArr = (rnq[]) list.toArray(new rnq[0]);
                rnq[] rnqVarArr2 = (rnq[]) Arrays.copyOf(rnqVarArr, rnqVarArr.length);
                int intValue = rnx.b().intValue();
                int length6 = rnqVarArr2.length;
                while (i2 < length6) {
                    if (((Integer) rnx.b.getOrDefault(rnqVarArr2[i2].toString(), -1)).intValue() > intValue) {
                        agnc.t("columnReference.toString()", intValue);
                    }
                    i2++;
                }
                rnvVar.m(rnqVarArr2);
                return rnvVar;
            default:
                roz rozVar = (roz) agpcVar;
                rou[] rouVarArr = (rou[]) list.toArray(new rou[0]);
                rozVar.c((rou[]) Arrays.copyOf(rouVarArr, rouVarArr.length));
                return rozVar;
        }
    }
}
