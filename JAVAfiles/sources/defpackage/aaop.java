package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import defpackage.cvc;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaop extends arrp implements arqr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaop(Object obj, Object obj2, int i) {
        super(1);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r0v34, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v44, types: [aap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v50, types: [aap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v59, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r13v60, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v65, types: [cpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v66, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v71, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v78, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v84, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r13v89, types: [cij, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, adzm] */
    /* JADX WARN: Type inference failed for: r1v20, types: [cuh, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = 5;
        int i2 = 3;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                ((zof) obj).getClass();
                ((aaoq) this.a).b((Activity) this.b);
                return arnb.a;
            case 1:
                ((duj) this.b).c((cvc.a) obj, this.a);
                return arnb.a;
            case 2:
                ((zof) obj).getClass();
                alvw e = aaoq.a.e();
                e.X(alwp.a, "BugleWearable");
                alvg alvgVar = (alvg) e;
                alvgVar.X(ydl.M, "WearableDebugMenuProvider");
                ((alvg) alvgVar.h("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider", "forceDisableWearSync", 116, "WearableDebugMenuProvider.kt")).q("Clearing watch connected data store from debug menu.");
                Object obj2 = this.b;
                aaoq aaoqVar = (aaoq) this.a;
                qjh.l(aaoqVar.j, null, new zez(aaoqVar, (Activity) obj2, (arpe) null, 13), 3);
                return arnb.a;
            case 3:
                ((zof) obj).getClass();
                Object obj3 = this.b;
                Object obj4 = this.a;
                aanh aanhVar = new aanh(obj4, obj3, i2, bArr);
                aaoq aaoqVar2 = (aaoq) obj4;
                if (!aaoqVar2.f.b()) {
                    new AlertDialog.Builder((Context) obj3).setTitle("Potential misconfiguration").setMessage("Force enabling wear sync but no WearOS Companion app(s) is installed. Missing Wearable GmsCore modules may result in unexpected sync behavior.\n\nConsider installing \"Google Pixel Watch\" from the Play Store.").setCancelable(true).setPositiveButton("Ack", new aabt(aaoqVar2.h, "WearDebugDialogClick", new aajo(aanhVar, i), 8)).show();
                } else {
                    alvw e2 = aaoq.a.e();
                    e2.X(alwp.a, "BugleWearable");
                    alvg alvgVar2 = (alvg) e2;
                    alvgVar2.X(ydl.M, "WearableDebugMenuProvider");
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider", "forceEnableWearSync", 169, "WearableDebugMenuProvider.kt")).q("Marking watch as online from debug menu.");
                    aanhVar.run();
                }
                return arnb.a;
            case 4:
                abfg abfgVar = (abfg) obj;
                if (abfgVar.a == abff.a) {
                    this.a.call();
                }
                Object obj5 = this.b;
                abfgVar.getClass();
                alvw m = abfh.b.m();
                m.X(ydl.M, "WelcomeFlowEntryPoint");
                m.t("Launching Activity: %s", abfgVar.a);
                int ordinal = abfgVar.a.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        abfh.c((cg) obj5, abfgVar.b);
                    }
                } else {
                    abfh.c((cg) obj5, Optional.empty());
                }
                return arnb.a;
            case 5:
                String str = (String) obj;
                str.getClass();
                return this.b.a(((PersephoneDownloadWorker) this.a).e, str);
            case 6:
                aozy aozyVar = (aozy) obj;
                aozyVar.getClass();
                this.a.a(aozyVar);
                apct b = apds.b(((aday) this.b).a.f().toEpochMilli());
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aedx aedxVar = (aedx) aozyVar.b;
                aedx aedxVar2 = aedx.a;
                b.getClass();
                aedxVar.e = b;
                aedxVar.b |= 4;
                return arnb.a;
            case 7:
                ((bxi) obj).getClass();
                aaji aajiVar = new aaji(this.a, 19);
                Object obj6 = this.b;
                if (obj6 != null) {
                    ((AccessibilityManager) obj6).addAccessibilityStateChangeListener(new agsl(aajiVar, 1));
                }
                return new ljs(this.b, aajiVar, 4, null);
            case 8:
                diy diyVar = (diy) obj;
                diyVar.getClass();
                int i3 = aeim.a;
                this.b.h(diyVar);
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.a(diyVar);
                }
                return arnb.a;
            case 9:
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                dhl.f(dhoVar, (String) this.b);
                dhl.n(dhoVar, (String) this.a);
                return arnb.a;
            case 10:
                dho dhoVar2 = (dho) obj;
                dhoVar2.getClass();
                dhl.f(dhoVar2, (String) this.b);
                Object obj7 = this.a;
                if (obj7 != null) {
                    dhl.n(dhoVar2, (String) obj7);
                }
                return arnb.a;
            case 11:
                ((wd) obj).getClass();
                return new wr(wx.i(this.b, brg.a, 6), wx.j(this.a));
            case 12:
                long j = ((cjn) obj).a;
                ((arry) this.a).a = brg.a;
                ((arrx) this.b).a = false;
                return arnb.a;
            case 13:
                long j2 = ((cjn) obj).a;
                this.a.a(aenw.f);
                this.b.h(false);
                return arnb.a;
            case 14:
                cvc.a aVar = (cvc.a) obj;
                aVar.getClass();
                aVar.e((cvc) this.a, 0, this.b.eo(-4.0f), brg.a);
                return arnb.a;
            case 15:
                long j3 = ((cjn) obj).a;
                this.a.a(0);
                qjl.b(this.b).q.a(Integer.valueOf((int) Float.intBitsToFloat((int) (j3 >> 32))), Integer.valueOf((int) Float.intBitsToFloat((int) (j3 & 4294967295L))));
                return arnb.a;
            case 16:
                long j4 = ((cjn) obj).a;
                if (!((Boolean) qjl.b(this.b).p.a()).booleanValue() && !((Boolean) qjl.b(this.b).o.a()).booleanValue()) {
                    this.a.a();
                }
                return arnb.a;
            case 17:
                ((aya) obj).getClass();
                ((afar) this.a).e.a();
                this.b.a(false);
                return arnb.a;
            case 18:
                String str2 = (String) obj;
                str2.getClass();
                this.b.h(str2);
                ((afar) this.a).d.a(str2);
                return arnb.a;
            case 19:
                ((bxi) obj).getClass();
                return new ljs(this.b, this.a, 5, null);
            default:
                return ((afdv) this.a).a.getContentResolver().query((Uri) this.b, ((afdx) obj).a, null, null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaop(Object obj, Object obj2, int i, byte[] bArr) {
        super(1);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
