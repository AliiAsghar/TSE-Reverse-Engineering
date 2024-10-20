package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afob extends arrp implements arqr {
    private final /* synthetic */ int v;
    public static final afob u = new afob(20);
    public static final afob t = new afob(19);
    public static final afob s = new afob(18);
    public static final afob r = new afob(17);
    public static final afob q = new afob(16);
    public static final afob p = new afob(15);
    public static final afob o = new afob(14);
    public static final afob n = new afob(13);
    public static final afob m = new afob(12);
    public static final afob l = new afob(11);
    public static final afob k = new afob(10);
    public static final afob j = new afob(9);
    public static final afob i = new afob(8);
    public static final afob h = new afob(7);
    public static final afob g = new afob(6);
    public static final afob f = new afob(5);
    public static final afob e = new afob(4);
    public static final afob d = new afob(3);
    public static final afob c = new afob(2);
    public static final afob b = new afob(1);
    public static final afob a = new afob(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afob(int i2) {
        super(1);
        this.v = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        Set c2;
        EnumSet enumSet;
        int i2 = 0;
        switch (this.v) {
            case 0:
                afjo afjoVar = (afjo) obj;
                afjoVar.getClass();
                return (afnb) afjoVar.a;
            case 1:
                afnb afnbVar = (afnb) obj;
                afnbVar.getClass();
                return afnbVar.a().a().toString();
            case 2:
                Set set = (Set) obj;
                set.getClass();
                return aqjn.au(set, new zyv(5));
            case 3:
                afmx afmxVar = (afmx) obj;
                if (afmxVar != null && (c2 = afmxVar.c()) != null) {
                    i2 = c2.size();
                }
                arml armlVar = aflr.a;
                return Integer.valueOf(i2 * afwv.S().size());
            case 4:
                afmy afmyVar = (afmy) obj;
                if (afmyVar != null && (enumSet = afmyVar.a) != null) {
                    i2 = enumSet.size();
                }
                return Integer.valueOf(i2);
            case 5:
                return 1;
            case 6:
                anib anibVar = (anib) obj;
                anibVar.getClass();
                return anibVar.name();
            case 7:
                ((afso) obj).getClass();
                return false;
            case 8:
                afyh afyhVar = (afyh) obj;
                afyhVar.getClass();
                return Boolean.valueOf(afyhVar.b());
            case 9:
                efx efxVar = (efx) obj;
                efxVar.getClass();
                efxVar.K("button");
                return arnb.a;
            case 10:
                ((Animation) obj).getClass();
                return arnb.a;
            case 11:
                ((Animation) obj).getClass();
                return arnb.a;
            case 12:
                ((Animation) obj).getClass();
                return arnb.a;
            case 13:
                ((Context) obj).getClass();
                return 0;
            case 14:
                ((View) obj).getClass();
                return arnb.a;
            case 15:
                afll afllVar = (afll) obj;
                afllVar.getClass();
                afllVar.d();
                return arnb.a;
            case 16:
                afll afllVar2 = (afll) obj;
                afllVar2.getClass();
                afllVar2.e();
                return arnb.a;
            case 17:
                afll afllVar3 = (afll) obj;
                afllVar3.getClass();
                afllVar3.g();
                return arnb.a;
            case 18:
                armf armfVar = (armf) obj;
                armfVar.getClass();
                return (agaj) armfVar.b();
            case 19:
                return a.ax(obj);
            default:
                Context context = (Context) obj;
                context.getClass();
                fyx fyxVar = new fyx(context);
                fyxVar.setKeepScreenOn(true);
                dzg.h(fyxVar.b);
                fyxVar.b.a();
                dzg.d(true);
                fyxVar.setClickable(fyxVar.hasOnClickListeners());
                if (fyxVar.m) {
                    fyxVar.m = false;
                    if (fyxVar.r()) {
                        fyxVar.g.c(fyxVar.l);
                    } else {
                        fyj fyjVar = fyxVar.g;
                        if (fyjVar != null) {
                            fyjVar.b();
                            fyxVar.g.c(null);
                        }
                    }
                    fyxVar.j();
                }
                return fyxVar;
        }
    }
}
