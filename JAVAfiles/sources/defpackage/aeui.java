package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeui extends arrp implements arqv {
    private final /* synthetic */ int v;
    public static final aeui u = new aeui(20);
    public static final aeui t = new aeui(19);
    public static final aeui s = new aeui(18);
    public static final aeui r = new aeui(17);
    public static final aeui q = new aeui(16);
    public static final aeui p = new aeui(15);
    public static final aeui o = new aeui(14);
    public static final aeui n = new aeui(13);
    public static final aeui m = new aeui(12);
    public static final aeui l = new aeui(11);
    public static final aeui k = new aeui(10);
    public static final aeui j = new aeui(9);
    public static final aeui i = new aeui(8);
    public static final aeui h = new aeui(7);
    public static final aeui g = new aeui(6);
    public static final aeui f = new aeui(5);
    public static final aeui e = new aeui(4);
    public static final aeui d = new aeui(3);
    public static final aeui c = new aeui(2);
    public static final aeui b = new aeui(1);
    public static final aeui a = new aeui(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeui(int i2) {
        super(2);
        this.v = i2;
    }

    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        byte[] bArr = null;
        switch (this.v) {
            case 0:
                ((Number) obj).intValue();
                ((Number) obj2).intValue();
                return false;
            case 1:
                bwj bwjVar = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    ahji.N(aeke.bg(aerb.R, bwjVar), dga.a(R.string.abc_text_field_list_item_clear, bwjVar), null, 0L, bwjVar, 8, 12);
                }
                return arnb.a;
            case 2:
                bwj bwjVar2 = (bwj) obj;
                ((Number) obj2).intValue();
                bwjVar2.y(1501141414);
                bwjVar2.q();
                return null;
            case 3:
                bwj bwjVar3 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar3.L()) {
                    bwjVar3.v();
                } else {
                    ahji.N(aeke.bg(aerb.aC, bwjVar3), dga.a(R.string.progress_bar_overlay_download_button_content_description, bwjVar3), null, 0L, bwjVar3, 8, 12);
                }
                return arnb.a;
            case 4:
                bwj bwjVar4 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar4.L()) {
                    bwjVar4.v();
                } else {
                    ahji.A(aetn.aN(amh.d(cga.e, 3.0f), dga.a(R.string.progress_bar_overlay_processing_spinner_content_description, bwjVar4), true), cku.d, 2.0f, cku.g, 0, brg.a, bwjVar4, 3456, 48);
                }
                return arnb.a;
            case 5:
                bwj bwjVar5 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar5.L()) {
                    bwjVar5.v();
                } else {
                    ahji.e(dga.a(R.string.preview_label_default_text, bwjVar5), amh.e(cga.e, 8.0f, 2.0f), bmp.a(bwjVar5).s, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(bwjVar5).o, bwjVar5, 48, 0, 65528);
                }
                return arnb.a;
            case 6:
                return a.aH(obj, obj2);
            case 7:
                bwj bwjVar6 = (bwj) obj;
                ((Number) obj2).intValue();
                bwjVar6.y(-1026362405);
                boolean a2 = aef.a(bwjVar6);
                bwjVar6.q();
                return Boolean.valueOf(a2);
            case 8:
                bwj bwjVar7 = (bwj) obj;
                ((Number) obj2).intValue();
                bwjVar7.y(36995648);
                bwjVar7.q();
                return true;
            case 9:
                bwj bwjVar8 = (bwj) obj;
                ((Number) obj2).intValue();
                bwjVar8.y(959171416);
                bpk bpkVar = new bpk(bArr);
                bwjVar8.q();
                return bpkVar;
            case 10:
                bwj bwjVar9 = (bwj) obj;
                ((Number) obj2).intValue();
                bwjVar9.y(1399949916);
                Object systemService = ((Context) bwjVar9.g(AndroidCompositionLocals_androidKt.b)).getSystemService("activity");
                systemService.getClass();
                aezu c2 = aezy.c(((ActivityManager) systemService).isLowRamDevice());
                bwjVar9.q();
                return c2;
            case 11:
                bwj bwjVar10 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar10.L()) {
                    bwjVar10.v();
                } else {
                    ahji.N(aeke.bg(aerb.ac, bwjVar10), dga.a(R.string.toolstone_close, bwjVar10), null, bmp.a(bwjVar10).s, bwjVar10, 8, 4);
                }
                return arnb.a;
            case 12:
                bwj bwjVar11 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar11.L()) {
                    bwjVar11.v();
                } else {
                    ahji.N(aeke.bg(aerb.aQ, bwjVar11), dga.a(R.string.partially_collapse_picker_button_content_description, bwjVar11), null, 0L, bwjVar11, 8, 12);
                }
                return arnb.a;
            case 13:
                bwj bwjVar12 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar12.L()) {
                    bwjVar12.v();
                } else {
                    akc.b(amv.j(cga.e, 32.0f, 4.0f), bwjVar12, 6);
                }
                return arnb.a;
            case 14:
                return Boolean.valueOf(d.F(obj, obj2));
            case 15:
                return Boolean.valueOf(d.F(obj, obj2));
            case 16:
                return null;
            case 17:
                int intValue = ((Number) obj).intValue();
                afmx afmxVar = (afmx) obj2;
                afmxVar.getClass();
                aflq aflqVar = (aflq) afpo.a.a(afmxVar.c()).get(intValue / afpo.b.size());
                List list = afpo.b;
                Object obj3 = list.get(intValue % list.size());
                obj3.getClass();
                return afmxVar.b(aflqVar, (aflr) obj3);
            case 18:
                int intValue2 = ((Number) obj).intValue();
                afmy afmyVar = (afmy) obj2;
                afmyVar.getClass();
                return afmyVar.b((aflq) afpo.a.a(afmyVar.a).get(intValue2));
            case 19:
                ((Number) obj).intValue();
                afmz afmzVar = (afmz) obj2;
                if (afmzVar == null) {
                    return null;
                }
                return afmzVar.a;
            default:
                int intValue3 = ((Number) obj).intValue();
                afna afnaVar = (afna) obj2;
                if (afnaVar == null) {
                    return null;
                }
                Object obj4 = afpo.b.get(intValue3);
                obj4.getClass();
                return afnaVar.b((aflr) obj4);
        }
    }
}
