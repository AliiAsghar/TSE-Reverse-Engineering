package defpackage;

import android.app.Application;
import android.os.SystemClock;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class prc implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ prc(Object obj, Object obj2, Object obj3, long j, int i) {
        this.e = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, aneo] */
    /* JADX WARN: Type inference failed for: r1v21, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (((AtomicBoolean) this.d).get()) {
                                    ((Application) this.c).unregisterActivityLifecycleCallbacks(this.b);
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    ahkc a = ahkc.a();
                                    a.a.h(new ahka("ColdLaunchBackground"), this.a, elapsedRealtime);
                                    ahkc.a().e(new ahka("ColdLaunchBackgroundMemory"));
                                    return;
                                }
                                return;
                            }
                            this.c.run();
                            ahmc.C(this.b.schedule(this, this.a, (TimeUnit) this.d));
                            return;
                        }
                        xyl.h();
                        long j = this.a;
                        Object obj = this.d;
                        Object obj2 = this.c;
                        ((ruq) this.b).e((ConversationIdType) obj2, rvc.a, null, (tqc) obj, j, 0);
                        return;
                    }
                    xyo c = prd.a.c();
                    c.H("Beginning validation of all business info data fields...");
                    Object obj3 = this.c;
                    BusinessInfoData businessInfoData = (BusinessInfoData) obj3;
                    c.z("RBM bot id", yyb.bh(businessInfoData.getRbmBotId()));
                    Object obj4 = this.d;
                    c.z("RBM bot info version", obj4);
                    long j2 = this.a;
                    c.y("RBM bot info expiry milliseconds", j2);
                    c.q();
                    prd.c(businessInfoData, j2);
                    prd.d(businessInfoData);
                    xyo c2 = prd.a.c();
                    c2.H("Beginning storage of all business info data fields...");
                    c2.z("RBM bot id", yyb.bh(businessInfoData.getRbmBotId()));
                    c2.q();
                    Object obj5 = this.b;
                    ((prd) obj5).c.e("RbmBusinessInfoDataService#insertOrReplaceRbmBusinessInfoData", new prc(obj5, obj3, obj4, j2, 0));
                    return;
                }
                long j3 = this.a;
                ((prd) this.b).c.e("update_business_info_metadata", new maa(this.c, this.d, j3, 4));
                return;
            }
            abog e = ((mat) this.b).c.e((String) this.d);
            abob abobVar = e.f;
            e.a(this.a, 1L, abod.a(this.c));
            return;
        }
        prd.a.o("Attempting storage of RBM business info...");
        long j4 = this.a;
        Object obj6 = this.d;
        Object obj7 = this.c;
        maa maaVar = new maa(obj7, obj6, j4, 5);
        prd prdVar = (prd) this.b;
        prdVar.c.e("RbmBusinessInfoDataService#insertOrReplaceCoreRbmBusinessInfoData", maaVar);
        prd.a.o("Successful storage of RBM business info...");
        prd.a.o("Attempting storage of RBM business verifier info...");
        prdVar.c.e("RbmBusinessInfoDataService#insertOrReplaceRbmBusinessVerifierInfoData", new nau(obj7, i3));
        prd.a.o("Successful storage of RBM business verifier info...");
        xyo c3 = prd.a.c();
        c3.H("Removing RBM business info properties for rbmBotId...");
        BusinessInfoData businessInfoData2 = (BusinessInfoData) obj7;
        c3.z("RBM bot id", yyb.bh(businessInfoData2.getRbmBotId()));
        c3.q();
        prdVar.c.e("RbmBusinessInfoDataService#removeAllRbmBusinessInfoPropertiesForBotId", new nau(businessInfoData2.getRbmBotId(), i4));
        xyo c4 = prd.a.c();
        c4.H("Removed RBM business info properties for rbmBotId...");
        c4.z("RBM bot id", yyb.bh(businessInfoData2.getRbmBotId()));
        c4.q();
        alog<BusinessInfoProperty> properties = businessInfoData2.getProperties();
        if (properties.isEmpty()) {
            prd.a.o("Skipping storage of nonexistent RBM business info properties...");
            return;
        }
        xyo c5 = prd.a.c();
        c5.H("Attempting storage of RBM business info properties...");
        c5.x("amount", properties.size());
        c5.q();
        int size = properties.size();
        for (int i5 = 0; i5 < size; i5++) {
            BusinessInfoProperty businessInfoProperty = properties.get(i5);
            prdVar.c.e("RbmBusinessInfoDataService#insertRbmBusinessInfoProperty", new nan(businessInfoData2.getRbmBotId(), businessInfoProperty, i2, null));
        }
        prd.a.o("Successful storage of RBM business info properties...");
    }

    public prc(Runnable runnable, aneo aneoVar, long j, TimeUnit timeUnit, int i) {
        this.e = i;
        this.c = runnable;
        this.b = aneoVar;
        this.a = j;
        this.d = timeUnit;
    }

    public prc(AtomicBoolean atomicBoolean, Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, long j, int i) {
        this.e = i;
        this.d = atomicBoolean;
        this.c = application;
        this.b = activityLifecycleCallbacks;
        this.a = j;
    }

    public /* synthetic */ prc(mat matVar, String str, long j, amfk amfkVar, int i) {
        this.e = i;
        this.b = matVar;
        this.d = str;
        this.a = j;
        this.c = amfkVar;
    }
}
