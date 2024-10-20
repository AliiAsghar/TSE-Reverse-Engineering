package defpackage;

import android.content.SharedPreferences;
import android.location.Location;
import android.os.Looper;
import com.google.android.apps.messaging.wearable.action.CheckWearableAppVersionAction;
import com.google.android.gms.location.LocationRequest;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kos implements acim {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kos(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.acim
    public final void e(Object obj) {
        int p;
        int i = 1;
        switch (this.b) {
            case 0:
                this.a.run();
                return;
            case 1:
                this.a.a(obj);
                return;
            case 2:
                this.a.run();
                return;
            case 3:
                this.a.a(obj);
                return;
            case 4:
                List list = (List) obj;
                Object obj2 = this.a;
                if (list == null) {
                    yby.a.q("Constellation returned unexpected null, treating as an empty list.");
                    int i2 = alog.d;
                    ((dtq) obj2).b(alsx.a);
                    return;
                }
                xyo a = yby.a.a();
                a.H("Constellation returned phone number(s)");
                Stream map = Collection.EL.stream(list).map(new ybe(2));
                int i3 = alog.d;
                a.M("PhoneNumbers", map.collect(alls.a));
                a.q();
                ((dtq) obj2).b(alog.n(list));
                return;
            case 5:
                Object obj3 = this.a;
                aaue aaueVar = (aaue) obj3;
                aaueVar.a((Location) obj);
                Object obj4 = aaueVar.b;
                LocationRequest a2 = new acdf(102, TimeUnit.SECONDS.toMillis(30L)).a();
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null) {
                    mainLooper = Looper.myLooper();
                    d.aC(mainLooper, "invalid null looper");
                }
                absy g = abhb.g(obj3, mainLooper, acde.class.getSimpleName());
                acdn acdnVar = new acdn((acdo) obj4, g);
                acdk acdkVar = new acdk(acdnVar, a2, i);
                abte abteVar = new abte();
                abteVar.a = acdkVar;
                abteVar.b = acdnVar;
                abteVar.c = g;
                abteVar.e = 2435;
                ((abrc) obj4).v(abteVar.b());
                return;
            case 6:
                acke ackeVar = (acke) obj;
                Object obj5 = this.a;
                if (ackeVar != null) {
                    try {
                        if (ackeVar.b.c()) {
                            alvw m = CheckWearableAppVersionAction.a.m();
                            m.X(ydl.M, "CheckWearableAppVersionAction");
                            ((alwl) m.h("com/google/android/apps/messaging/wearable/action/CheckWearableAppVersionAction", "doBackgroundWork", 92, "CheckWearableAppVersionAction.java")).q("Successfully retrieved watch's RPC version from DataClient");
                            atda atdaVar = new atda(ackeVar, 1);
                            int i4 = 0;
                            while (atdaVar.hasNext()) {
                                ackc ackcVar = (ackc) atdaVar.next();
                                if (ackcVar != null && (p = ((ackf) adae.h(ackcVar).a).p("1")) > i4) {
                                    i4 = p;
                                }
                            }
                            alvw m2 = CheckWearableAppVersionAction.a.m();
                            m2.X(ydl.M, "CheckWearableAppVersionAction");
                            ((alwl) m2.h("com/google/android/apps/messaging/wearable/action/CheckWearableAppVersionAction", "saveWearableApiLevel", 117, "CheckWearableAppVersionAction.java")).r("Wearable RPC version is %d", i4);
                            SharedPreferences.Editor edit = ((CheckWearableAppVersionAction) obj5).c.getSharedPreferences("watch_protocol_version_file", 0).edit();
                            if (i4 > 0) {
                                edit.putInt("watch_protocol_version_key", i4);
                            }
                            edit.apply();
                        }
                    } finally {
                        ackeVar.b();
                    }
                }
                if (ackeVar != null) {
                    return;
                } else {
                    return;
                }
            case 7:
                ((acit) this.a).b((abwv) obj);
                return;
            case 8:
                ((acit) this.a).d((abzt) obj);
                return;
            default:
                aoix aoixVar = (aoix) obj;
                if (((FirebaseMessaging) this.a).h() && aoixVar.d.b() != null && !aoixVar.f()) {
                    aoixVar.d(0L);
                    return;
                }
                return;
        }
    }
}
