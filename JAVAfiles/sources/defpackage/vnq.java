package defpackage;

import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import android.telephony.CarrierConfigManager;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vnq extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnq(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v125, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        boolean z = true;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                return this.a;
            case 1:
                Optional optional = ((vac) this.a).a;
                if (true != optional.isPresent()) {
                    optional = null;
                }
                if (optional == null) {
                    return null;
                }
                return ((vni) optional.get()).m();
            case 2:
                return this.a;
            case 3:
                return (msh) ((voo) this.a).a.a();
            case 4:
                Object systemService = ((Context) this.a).getSystemService("batterymanager");
                systemService.getClass();
                return (BatteryManager) systemService;
            case 5:
                aiut.b();
                znj znjVar = (znj) ((yyt) this.a).d.b();
                aiwl a = wus.a();
                a.i(wuk.SATELLITE_SETTINGS);
                aozy createBuilder = wow.a.createBuilder();
                createBuilder.getClass();
                apag s = createBuilder.s();
                s.getClass();
                a.k((wow) s);
                return znjVar.ab(a.f());
            case 6:
                return (CarrierConfigManager) ((wpm) this.a).a.getSystemService(CarrierConfigManager.class);
            case 7:
                Object obj = this.a;
                akrh e = aktp.e("ScreenDetectionListener.handleDisplayChange");
                try {
                    wth wthVar = (wth) ((wtt) obj).f.get();
                    ((wtt) obj).a(((wtp) ((wtt) obj).b.b()).b(wthVar), wthVar);
                    armd.i(e, null);
                    return arnb.a;
                } finally {
                }
            case 8:
                akrc b = ((aksr) ((wtt) this.a).d.b()).b("ScreenDetectionListener.onDisplayChanged");
                try {
                    ((wtt) this.a).b();
                    armd.i(b, null);
                    return arnb.a;
                } finally {
                }
            case 9:
                znj znjVar2 = (znj) ((zxy) this.a).a.b();
                aiwl a2 = wus.a();
                a2.i(wuk.FORWARD_SYNC_WORK_ORGANIZER);
                a2.k(xlc.a);
                return znjVar2.ab(a2.f());
            case 10:
                znj znjVar3 = (znj) this.a.b();
                aiwl a3 = wus.a();
                a3.i(wuk.FORWARD_SYNC_WORK_ORGANIZER);
                a3.k(xlc.a);
                return znjVar3.ab(a3.f());
            case 11:
                znj znjVar4 = (znj) ((znj) this.a).a.b();
                aiwl a4 = wus.a();
                a4.i(wuk.TELEPHONY_DATABASE_UPDATE_SETTINGS);
                a4.k(xnt.a);
                return znjVar4.ab(a4.f());
            case 12:
                znj znjVar5 = (znj) this.a.b();
                aiwl a5 = wus.a();
                a5.i(wuk.DEBUG_SETTINGS);
                a5.k(uth.a);
                a5.h(new yaa(2));
                return znjVar5.ab(a5.f());
            case 13:
                ruu a6 = ruv.a();
                a6.s(new xhv());
                a6.b(tqc.SPAM_FOLDER);
                a6.j(alog.r(this.a));
                a6.e(false);
                a6.f(false);
                return a6.a();
            case 14:
                if (!((yxb) this.a).b()) {
                    String str = Build.DEVICE;
                    str.getClass();
                    z2 = albo.ar("eos", str);
                }
                return Boolean.valueOf(z2);
            case 15:
                if (!((ppx) ((yxb) this.a).b.b()).a() ? !(!((yxb) this.a).a() || !yyb.aD()) : !(!((yxb) this.a).a() || !yyb.aD() || ((Boolean) ((yxb) this.a).c.a()).booleanValue())) {
                    z2 = true;
                }
                return Boolean.valueOf((!((yxb) this.a).b()) & z2);
            case 16:
                if (!((yxb) this.a).a() || !((yxb) this.a).a.getPackageManager().hasSystemFeature("com.google.android.feature.p11")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (!((yxb) this.a).b()) {
                    String str2 = Build.DEVICE;
                    str2.getClass();
                    z2 = albo.ar("r11", str2);
                }
                return Boolean.valueOf(z2);
            case 18:
                if (!((yxb) this.a).a() || !yyb.aG()) {
                    z = false;
                }
                if (((yxb) this.a).b()) {
                    z = ((yxb) this.a).a();
                }
                return Boolean.valueOf(z);
            case 19:
                return Boolean.valueOf(((yxb) this.a).a.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
            default:
                this.a.a();
                return arnb.a;
        }
    }
}
