package defpackage;

import android.os.PowerManager;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.RecurringTelemetryUploaderAction;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.firebase.iid.FirebaseInstanceId;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rbg implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rbg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [rvm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        List list;
        String concat;
        IOException e;
        String str;
        String str2;
        int i = 19;
        int i2 = 6;
        int i3 = 0;
        switch (this.b) {
            case 0:
                PauseRcsFileTransferAction pauseRcsFileTransferAction = (PauseRcsFileTransferAction) this.a;
                MessageIdType b = rvc.b(pauseRcsFileTransferAction.u.l("rcs_ft_message_id"));
                return ((rwd) pauseRcsFileTransferAction.c.b()).u(b);
            case 1:
                rbk.f(3, (wng) this.a);
                return null;
            case 2:
                return Integer.valueOf(((Long) ((RecurringTelemetryUploaderAction) this.a).i.b()).intValue());
            case 3:
                xpc c = xpf.c();
                c.w("resumeFileTransferAsyncForChatApi");
                ahmv ahmvVar = xpf.d;
                c.c((xoy) ahmvVar.b, (xoy) ahmvVar.d, (xoy) ahmvVar.f);
                xpe xpeVar = new xpe();
                xpeVar.b(this.a.B());
                c.d(xpeVar);
                return (xow) ((xoz) c.b().n()).cO();
            case 4:
                ((SendMessageAction) this.a).j();
                return null;
            case 5:
                return ((Action) this.a).b();
            case 6:
                return ((Action) this.a).fw();
            case 7:
                Object obj = this.a;
                try {
                    PowerManager powerManager = (PowerManager) ((ActionExecutorImpl) ((rhv) obj).c).c.getSystemService("power");
                    if (powerManager == null) {
                        return null;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, ((rhv) obj).f.getClass().getName());
                    newWakeLock.acquire(TimeUnit.SECONDS.toMillis(3L));
                    return newWakeLock;
                } catch (RuntimeException e2) {
                    alvw i4 = rhv.a.i();
                    i4.X(alwp.a, "BugleDataModel");
                    ((alvg) ((alvg) ((alvg) i4).g(e2)).h("com/google/android/apps/messaging/shared/datamodel/action/execution/ActionRunnable", "acquireWakeLock", 157, "ActionRunnable.java")).t("failed to grab wakelock for %s", ((rhv) obj).f);
                    return null;
                }
            case 8:
                return Optional.ofNullable(snz.a(this.a.a()));
            case 9:
                soo a = sor.a();
                a.w("isDesktopPairedOverGaia");
                a.d(new tkg(this.a, 13));
                return Boolean.valueOf(a.b().K());
            case 10:
                return ((trn) this.a).c();
            case 11:
                return ((qei) this.a).d;
            case 12:
                Object obj2 = this.a;
                synchronized (((ucv) obj2).d) {
                    list = (List) Collection.EL.stream(((ucv) obj2).c).collect(Collectors.toCollection(new tyr(4)));
                }
                Collections.reverse(list);
                String str3 = String.format(Locale.US, "D26r history of %d items", Integer.valueOf(list.size())) + "tag=logging tag; op=operation category; tid=thread id; inflt=is inflight; et=elapsed time millis; tt=thread time millis; rows=row count returned; plan=query plan\n" + ((String) Collection.EL.stream(list).map(new tyl(obj2, 8)).collect(Collectors.joining("\n")));
                try {
                    tly tlyVar = new tly(tma.a);
                    tlyVar.q();
                    concat = (String) Collection.EL.stream(tlyVar.b().t()).map(new tvq(i)).collect(Collectors.joining("\n"));
                } catch (Throwable th) {
                    concat = "unable to read sqlite_stat1 table: ".concat(String.valueOf(th.getClass().getSimpleName()));
                }
                return a.co(concat, str3, "\n");
            case 13:
                Object obj3 = this.a;
                return (Boolean) ((ujh) obj3).b.c("RichCardMessagePartMediaDownloadHandler#onStart", new udn(obj3, i2));
            case 14:
                Object obj4 = this.a;
                return (Boolean) ((ujh) obj4).b.c("RichCardMessagePartMediaDownloadHandler#onFailure", new udn(obj4, 7));
            case 15:
                Object obj5 = this.a;
                rui ruiVar = new rui(obj5, i);
                ulu uluVar = (ulu) obj5;
                uluVar.b.e("ClearSessionIdsAction.executeAction", ruiVar);
                uluVar.a.l("Finished transaction and notify change");
                return upm.b();
            case 16:
                return Long.valueOf(((usk) this.a).f());
            case 17:
                ((agnw) ((ump) this.a).a.b()).z("ANALYZE");
                return upm.b();
            case 18:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new FileTeleporter(((lpg) ((xap) this.a).b.b()).B().getBytes(), "Phenotypes"));
                return arrayList;
            case 19:
                return ((utx) this.a).h();
            default:
                Object obj6 = this.a;
                try {
                    String string = ((uur) obj6).c.getResources().getString(R.string.firebase_authorized_entity);
                    Optional ofNullable = Optional.ofNullable(FirebaseInstanceId.b().h(string, ""));
                    if (ofNullable.isPresent()) {
                        str = (String) ofNullable.get();
                    } else {
                        str = null;
                    }
                } catch (IOException e3) {
                    e = e3;
                    str = null;
                }
                try {
                    uur.a.l("Received firebase instance token.");
                } catch (IOException e4) {
                    e = e4;
                    ((alwl) ((alwl) ((alwl) uur.b.i()).g(e)).h("com/google/android/apps/messaging/shared/fcm/impl/BugleFirebaseInstanceIDManagerImpl", "logFirebaseRefreshIIDError", 98, "BugleFirebaseInstanceIDManagerImpl.java")).t("Failed to refresh firebase instance ID %s", e.getCause());
                    int[] G = a.G();
                    while (true) {
                        if (i3 < 6) {
                            int i5 = G[i3];
                            String ag = albo.ag(e.getMessage());
                            switch (i5) {
                                case 1:
                                    str2 = "UNKNOWN";
                                    break;
                                case 2:
                                    str2 = "SERVICE_NOT_AVAILABLE";
                                    break;
                                case 3:
                                    str2 = "INTERNAL_SERVER_ERROR";
                                    break;
                                case 4:
                                    str2 = "MISSING_INSTANCEID_SERVICE";
                                    break;
                                case 5:
                                    str2 = "TIMEOUT";
                                    break;
                                case 6:
                                    str2 = "MAIN_THREAD";
                                    break;
                                default:
                                    str2 = "null";
                                    break;
                            }
                            if (i5 != 0) {
                                if (albo.ar(ag, str2)) {
                                    ((mbl) ((uur) obj6).e.b()).e("Bugle.Fcm.Failure.IIDRefresh.Counts", uvl.e(i5));
                                } else {
                                    i3++;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            ((mbl) ((uur) obj6).e.b()).e("Bugle.Fcm.Failure.IIDRefresh.Counts", uvl.e(1));
                        }
                    }
                    return str;
                }
                return str;
        }
    }
}
