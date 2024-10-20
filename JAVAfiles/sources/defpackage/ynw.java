package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.PowerManager;
import android.view.View;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import defpackage.zly;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ynw implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ynw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [aabz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "conversation_id:".concat(String.valueOf(((ynx) this.a).getString(2)));
            case 1:
                return "message_logging_id:".concat(String.valueOf(((ynx) this.a).getString(1)));
            case 2:
                return "conversation_logging_id:".concat(String.valueOf(((ynx) this.a).getString(3)));
            case 3:
                return "generation_timestamp:".concat(String.valueOf(((ynx) this.a).getString(4)));
            case 4:
                return new zly.b((View) this.a);
            case 5:
                return ((aaya) ((aaiz) this.a).b.b()).a(amlx.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST, 1);
            case 6:
                int i = aasn.k;
                return Boolean.valueOf(!this.a.b());
            case 7:
                return Optional.of(((ajcb) this.a).c);
            case 8:
                return ((aaya) this.a.b()).a(amlx.PROVISIONING_UI_TYPE_STREAMLINED_PHONE_NUMBER_INPUT, 4);
            case 9:
                alvi alviVar = abem.a;
                Boolean bool = (Boolean) this.a.b();
                boolean booleanValue = bool.booleanValue();
                alvw e = abem.a.e();
                e.X(alwp.a, "BugleWearable");
                alvg alvgVar = (alvg) e;
                alvgVar.X(ydl.M, "CachedWearableCompanionAppInstalledImpl");
                ((alvg) alvgVar.h("com/google/android/apps/messaging/wearable/util/CachedWearableCompanionAppInstalledImpl", "getFromCache", 83, "CachedWearableCompanionAppInstalledImpl.java")).H("Memoizing value=%s and saving in cache with %d second(s) expiration", booleanValue, abem.b.e());
                return bool;
            case 10:
                int i2 = abwu.a;
                return ((Context) this.a).getSharedPreferences("DuoKitPrefs", 0);
            case 11:
                return ((alha) this.a).a;
            case 12:
                return acak.l((Context) this.a);
            case 13:
                apuv apuvVar = acaa.a;
                Context context = (Context) this.a;
                if (agqa.d(context)) {
                    acaa.a.n("getAndroidId called in direct boot mode.", new Object[0]);
                    return alfd.a;
                }
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                if (packageManager.checkPermission("com.google.android.providers.gsf.permission.READ_GSERVICES", packageName) == 0) {
                    return algw.i(Long.valueOf(acmd.b(context.getContentResolver(), "android_id", 0L)));
                }
                acaa.a.n("app %s doesn't have gservice read permission", packageName);
                return alfd.a;
            case 14:
                return new acbd((Activity) this.a);
            case 15:
                abmt abmtVar = accg.a;
                File file = new File(abmt.f(((Context) this.a).getFilesDir(), "wearos_assets"));
                abmt abmtVar2 = accg.a;
                File file2 = new File(abmt.f(file, "streamtmp"));
                file2.mkdirs();
                File[] listFiles = file2.listFiles();
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        file3.delete();
                    }
                }
                return file2;
            case 16:
                ImsConfiguration imsConfiguration = ((Configuration) this.a).mImsConfiguration;
                if (imsConfiguration != null) {
                    return adju.b(imsConfiguration).a();
                }
                return adju.a().a();
            case 17:
                return adju.b((ImsConfiguration) this.a).a();
            case 18:
                agoz agozVar = (agoz) this.a;
                return "(".concat(String.valueOf(agozVar.z(new agpo(agozVar.n, agozVar.e, true), false, new ArrayList())));
            case 19:
                return (AudioManager) ((agso) this.a).d.getSystemService("audio");
            default:
                return (PowerManager) ((agso) this.a).d.getSystemService("power");
        }
    }
}
