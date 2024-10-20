package defpackage;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.wearable.internal.WearableListenerStubImpl;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uyb implements acik {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public uyb(arvo arvoVar, int i) {
        this.b = i;
        this.a = arvoVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [acgo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r0v6, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.wearable.internal.IRpcResponseCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.wearable.internal.IRpcResponseCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r7v45, types: [arvo, java.lang.Object] */
    @Override // defpackage.acik
    public final void a(acir acirVar) {
        switch (this.b) {
            case 0:
                alvw g = uyc.a.g();
                g.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.M, "TrustedContactsSyncManager");
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/kids/sync/TrustedContactsSyncManager$registerListener$1", "invokeSuspend$lambda$0", 86, "TrustedContactsSyncManager.kt")).q("Successfully registered the listener.");
                ((mbl) ((uyc) this.a).g.b()).c("Bugle.Kids.AllowlistUpdate.Listener.Registered");
                return;
            case 1:
                this.a.apply(acirVar);
                return;
            case 2:
                xyo a = yld.a.a();
                a.z("Unregister package", this.a);
                a.A("success", acirVar.l());
                a.q();
                return;
            case 3:
                xze xzeVar = yld.a;
                this.a.a(acirVar.l());
                return;
            case 4:
                ((CountDownLatch) this.a).countDown();
                return;
            case 5:
                if (!acirVar.l()) {
                    Object obj = this.a;
                    Exception g2 = acirVar.g();
                    g2.getClass();
                    ((acit) obj).c(g2);
                    return;
                }
                return;
            case 6:
                boolean l = acirVar.l();
                ?? r4 = this.a;
                if (l) {
                    ackn.a(r4, true, (byte[]) acirVar.h());
                    return;
                } else {
                    Log.e("WearableLS", "Failed to resolve future, sending null response", acirVar.g());
                    ackn.a(r4, false, null);
                    return;
                }
            case 7:
                boolean l2 = acirVar.l();
                ?? r3 = this.a;
                if (l2) {
                    WearableListenerStubImpl.m206$$Nest$smsendResponse(r3, true, (byte[]) acirVar.h());
                    return;
                } else {
                    Log.e("WearableListenerStub", "Failed to resolve future, sending null response", acirVar.g());
                    WearableListenerStubImpl.m205$$Nest$smsendNullResponse(r3);
                    return;
                }
            case 8:
                if (acirVar.l()) {
                    this.a.w(acirVar.h());
                    return;
                }
                ?? r0 = this.a;
                Exception g3 = acirVar.g();
                g3.getClass();
                r0.w(aqil.O(g3));
                return;
            case 9:
                boolean z = ((aciv) acirVar).c;
                Object obj2 = this.a;
                if (z) {
                    ((ance) obj2).cancel(false);
                    return;
                }
                if (acirVar.l()) {
                    ((ance) obj2).set(acirVar.h());
                    return;
                } else {
                    Exception g4 = acirVar.g();
                    if (g4 != null) {
                        ((ance) obj2).setException(g4);
                        return;
                    }
                    throw new IllegalStateException();
                }
            case 10:
                boolean l3 = acirVar.l();
                Object obj3 = this.a;
                if (l3) {
                    ((alvg) ((alvg) aict.a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/clearcut/ClearcutUploader", "upload", 71, "ClearcutUploader.java")).t("Mobalt: successfully finished uploading logs to Clearcut log_source = %s", ((aict) obj3).c.h);
                    return;
                }
                alvg alvgVar2 = (alvg) ((alvg) aict.a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/clearcut/ClearcutUploader", "upload", 75, "ClearcutUploader.java");
                abnr abnrVar = ((aict) obj3).c;
                alvgVar2.D("Mobalt: finished uploading logs to Clearcut log_source = %s with status: %s", abnrVar.h, acirVar.g());
                return;
            case 11:
                asqe asqeVar = FirebaseInstanceId.g;
                ((CountDownLatch) this.a).countDown();
                return;
            case 12:
                aoja.b((Intent) this.a);
                return;
            case 13:
                ((asmb) this.a).u();
                return;
            case 14:
                this.a.cancel(false);
                return;
            default:
                Exception g5 = acirVar.g();
                if (g5 == null) {
                    if (((aciv) acirVar).c) {
                        this.a.h(null);
                        return;
                    } else {
                        this.a.w(acirVar.h());
                        return;
                    }
                }
                this.a.w(aqil.O(g5));
                return;
        }
    }

    public /* synthetic */ uyb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
