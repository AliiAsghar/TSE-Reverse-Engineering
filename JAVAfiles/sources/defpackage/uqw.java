package defpackage;

import android.R;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uqw implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uqw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "queue:".concat(String.valueOf(((uqx) this.a).getString(0)));
            case 1:
                ura uraVar = new ura(urd.a);
                agpw agpwVar = (agpw) this.a;
                uraVar.k(agpwVar);
                uraVar.w("work_queue_work_manager_ids-deleteAndReturnDeletedRows-query");
                alog t = uraVar.b().t();
                uqy uqyVar = new uqy();
                uqyVar.a = agpwVar;
                uqyVar.f("work_queue_work_manager_ids-deleteAndReturnDeletedRows-delete");
                uqyVar.a().V();
                return t;
            case 2:
                return "workmanager_id:".concat(String.valueOf(((uqx) this.a).getString(1)));
            case 3:
                return "scheduled_at_time:".concat(String.valueOf(((uqx) this.a).getString(2)));
            case 4:
                return "minimum_start_time:".concat(String.valueOf(((uqx) this.a).getString(3)));
            case 5:
                return "requires_network_type:".concat(String.valueOf(((uqx) this.a).getString(4)));
            case 6:
                return "requires_charging:".concat(String.valueOf(((uqx) this.a).getString(5)));
            case 7:
                return "requires_device_idle:".concat(String.valueOf(((uqx) this.a).getString(6)));
            case 8:
                return "requires_battery_not_low:".concat(String.valueOf(((uqx) this.a).getString(7)));
            case 9:
                return "requires_storage_not_low:".concat(String.valueOf(((uqx) this.a).getString(8)));
            case 10:
                alwo alwoVar = utr.a;
                return new CopyOnWriteArraySet((Collection) this.a.b());
            case 11:
                alwo alwoVar2 = utt.a;
                return new CopyOnWriteArraySet((Collection) this.a.b());
            case 12:
                Object obj = this.a;
                akrh e = aktp.e("PhenotypeClientModule#providePhenotypeClientInstanceHolder#supplier");
                try {
                    aaoc aaocVar = acge.a;
                    acgl acglVar = new acgl((Context) obj);
                    e.close();
                    return acglVar;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 13:
                return uvl.g((String) this.a);
            case 14:
                return uvl.h((String) this.a);
            case 15:
                return ((vbu) this.a).m();
            case 16:
                return this.a;
            case 17:
                int i = vhy.a;
                NotificationManager notificationManager = (NotificationManager) ((Context) this.a).getSystemService("notification");
                hwr.i(notificationManager);
                return notificationManager;
            case 18:
                alwo alwoVar3 = vic.a;
                NotificationManager notificationManager2 = (NotificationManager) ((Context) this.a).getSystemService("notification");
                hwr.i(notificationManager2);
                return notificationManager2;
            case 19:
                alwo alwoVar4 = vic.a;
                Resources resources = ((Context) this.a).getResources();
                int dimension = (int) resources.getDimension(R.dimen.notification_large_icon_height);
                return new vhz(new Size(720, 720), new Size((int) resources.getDimension(R.dimen.notification_large_icon_width), dimension));
            default:
                alwo alwoVar5 = viq.a;
                znj znjVar = (znj) this.a.b();
                aiwl a = wus.a();
                a.i(wuk.NOTIFICATION_METRICS_COUNTERS);
                a.k(amwk.a);
                return znjVar.ab(a.f());
        }
    }
}
