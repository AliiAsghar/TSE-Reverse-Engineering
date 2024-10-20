package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzm extends arrp implements arqr {
    private final /* synthetic */ int v;
    public static final yzm u = new yzm(20);
    public static final yzm t = new yzm(19);
    public static final yzm s = new yzm(18);
    public static final yzm r = new yzm(17);
    public static final yzm q = new yzm(16);
    public static final yzm p = new yzm(15);
    public static final yzm o = new yzm(14);
    public static final yzm n = new yzm(13);
    public static final yzm m = new yzm(12);
    public static final yzm l = new yzm(11);
    public static final yzm k = new yzm(10);
    public static final yzm j = new yzm(9);
    public static final yzm i = new yzm(8);
    public static final yzm h = new yzm(7);
    public static final yzm g = new yzm(6);
    public static final yzm f = new yzm(5);
    public static final yzm e = new yzm(4);
    public static final yzm d = new yzm(3);
    public static final yzm c = new yzm(2);
    public static final yzm b = new yzm(1);
    public static final yzm a = new yzm(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzm(int i2) {
        super(1);
        this.v = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        switch (this.v) {
            case 0:
                yzs yzsVar = (yzs) obj;
                yzsVar.getClass();
                return "contact_".concat(yzsVar.b());
            case 1:
                return "group_chat_" + ((Number) obj).intValue();
            case 2:
                return null;
            case 3:
                ((String) obj).getClass();
                return arnb.a;
            case 4:
                return a.ax(obj);
            case 5:
                zdv zdvVar = (zdv) obj;
                zdvVar.getClass();
                return zdvVar.b();
            case 6:
                return null;
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                entry.getValue().getClass();
                return Boolean.valueOf(!((ChipData) r5).e);
            case 8:
                ((Boolean) obj).booleanValue();
                return arnb.a;
            case 9:
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                dhl.o(dhoVar, "sim_preference");
                return arnb.a;
            case 10:
                return ((msh) obj).e();
            case 11:
                return a.ax(obj);
            case 12:
                ((wd) obj).getClass();
                aae aaeVar = zzv.a;
                return new wr(wx.g(zs.d(1000, 0, zzv.a, 2), 2), wx.h(zs.d(1000, 0, zzv.b, 2), 2));
            case 13:
                return a.ax(obj);
            case 14:
                return a.ax(obj);
            case 15:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                return aqil.p(strArr);
            case 16:
                aagp aagpVar = (aagp) obj;
                aagpVar.getClass();
                aagpVar.d();
                return arnb.a;
            case 17:
                dty dtyVar = (dty) obj;
                dtyVar.getClass();
                ef.x(dtyVar.h, dtyVar.c.c);
                ef.w(dtyVar.f, dtyVar.c.b, brg.a, 6);
                ef.w(dtyVar.g, dtyVar.c.d, brg.a, 6);
                return arnb.a;
            case 18:
                dty dtyVar2 = (dty) obj;
                dtyVar2.getClass();
                ef.w(dtyVar2.g, dtyVar2.c.d, brg.a, 6);
                return arnb.a;
            case 19:
                return a.cc(obj, "\"", "\"");
            default:
                qlo qloVar = (qlo) obj;
                qloVar.getClass();
                aozy builder = qloVar.toBuilder();
                qln qlnVar = qloVar.d;
                if (qlnVar == null) {
                    qlnVar = qln.a;
                }
                aozy builder2 = qlnVar.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                ((qln) builder2.b).c = a.ak(5);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                qlo qloVar2 = (qlo) builder.b;
                qln qlnVar2 = (qln) builder2.s();
                qlnVar2.getClass();
                qloVar2.d = qlnVar2;
                qloVar2.b |= 1;
                apag s2 = builder.s();
                s2.getClass();
                return (qlo) s2;
        }
    }
}
