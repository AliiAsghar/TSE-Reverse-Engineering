package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jld extends arrp implements arqr {
    private final /* synthetic */ int v;
    public static final jld u = new jld(20);
    public static final jld t = new jld(19);
    public static final jld s = new jld(18);
    public static final jld r = new jld(17);
    public static final jld q = new jld(16);
    public static final jld p = new jld(15);
    public static final jld o = new jld(14);
    public static final jld n = new jld(13);
    public static final jld m = new jld(12);
    public static final jld l = new jld(11);
    public static final jld k = new jld(10);
    public static final jld j = new jld(9);
    public static final jld i = new jld(8);
    public static final jld h = new jld(7);
    public static final jld g = new jld(6);
    public static final jld f = new jld(5);
    public static final jld e = new jld(4);
    public static final jld d = new jld(3);
    public static final jld c = new jld(2);
    public static final jld b = new jld(1);
    public static final jld a = new jld(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jld(int i2) {
        super(1);
        this.v = i2;
    }

    /* JADX WARN: Type inference failed for: r13v42, types: [ascv, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        switch (this.v) {
            case 0:
                return ((jqs) obj).a();
            case 1:
                return ((jrh) obj).a();
            case 2:
                jhc jhcVar = (jhc) obj;
                jhcVar.getClass();
                return jhcVar.b;
            case 3:
                jhc jhcVar2 = (jhc) obj;
                jhcVar2.getClass();
                if (jhcVar2.b.isEmpty()) {
                    return jhcVar2;
                }
                return jhc.c(jhcVar2, null, arnv.a, null, false, false, 0, 1021);
            case 4:
                jhc jhcVar3 = (jhc) obj;
                jhcVar3.getClass();
                return jhcVar3.b;
            case 5:
                return d.Z(obj);
            case 6:
                return d.Z(obj);
            case 7:
                return d.Z(obj);
            case 8:
                ((jhc) obj).getClass();
                return new jhc(null, null, null, false, null, null, null, false, 6, false, 767);
            case 9:
                jhc jhcVar4 = (jhc) obj;
                jhcVar4.getClass();
                return jhcVar4.b;
            case 10:
                jhc jhcVar5 = (jhc) obj;
                jhcVar5.getClass();
                return jhcVar5.e;
            case 11:
                jhc jhcVar6 = (jhc) obj;
                jhcVar6.getClass();
                return jhc.c(jhcVar6, null, null, null, false, false, 0, 895);
            case 12:
                jhc jhcVar7 = (jhc) obj;
                jhcVar7.getClass();
                return jhc.c(jhcVar7, null, null, null, false, true, 0, 895);
            case 13:
                nfb nfbVar = (nfb) obj;
                nfbVar.getClass();
                return Boolean.valueOf(nfbVar.h);
            case 14:
                nfb nfbVar2 = (nfb) obj;
                nfbVar2.getClass();
                return Boolean.valueOf(nfbVar2.h);
            case 15:
                jhc jhcVar8 = (jhc) obj;
                jhcVar8.getClass();
                return jhc.c(jhcVar8, null, null, null, false, false, 0, 1011);
            case 16:
                ((Context) obj).getClass();
                return 0;
            case 17:
                ((Context) obj).getClass();
                return Integer.valueOf((int) (afzv.c(r13).y * 0.75d));
            case 18:
                jhc jhcVar9 = (jhc) obj;
                jhcVar9.getClass();
                return Boolean.valueOf(hld.x(jhcVar9));
            case 19:
                if (((Boolean) ((addp) obj).b.c()).booleanValue()) {
                    return amue.NOISE_CANCELLATION_STATE_ENABLED;
                }
                return amue.NOISE_CANCELLATION_STATE_DISABLED;
            default:
                ((aeoj) obj).getClass();
                return arnb.a;
        }
    }
}
