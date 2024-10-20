package defpackage;

import android.view.ActionMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyp extends arrp implements arqr {
    private final /* synthetic */ int u;
    public static final jyp t = new jyp(20);
    public static final jyp s = new jyp(19);
    public static final jyp r = new jyp(18);
    public static final jyp q = new jyp(17);
    public static final jyp p = new jyp(16);
    public static final jyp o = new jyp(15);
    public static final jyp n = new jyp(14);
    public static final jyp m = new jyp(13);
    public static final jyp l = new jyp(12);
    public static final jyp k = new jyp(10);
    public static final jyp j = new jyp(9);
    public static final jyp i = new jyp(8);
    public static final jyp h = new jyp(7);
    public static final jyp g = new jyp(6);
    public static final jyp f = new jyp(5);
    public static final jyp e = new jyp(4);
    public static final jyp d = new jyp(3);
    public static final jyp c = new jyp(2);
    public static final jyp b = new jyp(1);
    public static final jyp a = new jyp(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyp(int i2) {
        super(1);
        this.u = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        switch (this.u) {
            case 0:
                ((Number) obj).intValue();
                return "message";
            case 1:
                ((aeoj) obj).getClass();
                return arnb.a;
            case 2:
                ((aeuj) obj).getClass();
                return arnb.a;
            case 3:
                return ((Long) obj).toString();
            case 4:
                afag afagVar = (afag) obj;
                afagVar.getClass();
                return afagVar.a;
            case 5:
                return ((zzi) obj).a();
            case 6:
                return a.ax(obj);
            case 7:
            case 8:
            case 9:
                return null;
            case 10:
                return Integer.valueOf(-((Number) obj).intValue());
            case 11:
                lqm lqmVar = (lqm) obj;
                lqmVar.getClass();
                lqmVar.e();
                return arnb.a;
            case 12:
                lqm lqmVar2 = (lqm) obj;
                lqmVar2.getClass();
                lqmVar2.a();
                return arnb.a;
            case 13:
                lqm lqmVar3 = (lqm) obj;
                lqmVar3.getClass();
                lqmVar3.b();
                return arnb.a;
            case 14:
                miu miuVar = (miu) obj;
                miuVar.getClass();
                return miuVar.d();
            case 15:
                iba ibaVar = (iba) obj;
                ibaVar.getClass();
                ibaVar.a();
                return arnb.a;
            case 16:
                kps kpsVar = (kps) obj;
                kpsVar.getClass();
                kpsVar.b();
                return arnb.a;
            case 17:
                lxw lxwVar = (lxw) obj;
                lxwVar.getClass();
                lxwVar.a();
                return arnb.a;
            case 18:
                ActionMode actionMode = (ActionMode) obj;
                actionMode.getClass();
                actionMode.finish();
                return arnb.a;
            case 19:
                return a.ax(obj);
            default:
                return d.Z(obj);
        }
    }
}
