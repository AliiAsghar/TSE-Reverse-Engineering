package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.media.webrtc.common.StatusOr;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tsz implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tsz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.function.Function] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        switch (this.b) {
            case 0:
                return aktp.af((Throwable) this.a);
            case 1:
                return trn.g((List) obj, this.a);
            case 2:
                return ((ttb) ((ttl) this.a).d.b()).b((String) obj);
            case 3:
                return ((iji) this.a).j((String) obj);
            case 4:
                return ((iji) this.a).j((String) obj);
            case 5:
                return ((ttb) ((ttv) this.a).d.b()).b((String) obj);
            case 6:
                return ((iji) this.a).j((String) obj);
            case 7:
                return ((ttj) ((tum) this.a).e.b()).b((String) obj);
            case 8:
                return ((ttb) ((tvg) this.a).b.b()).b((String) obj);
            case 9:
                return ((iji) this.a).j((String) obj);
            case 10:
                return ((ttb) ((tvg) this.a).b.b()).b((String) obj);
            case 11:
                return ((ttb) ((tvg) this.a).b.b()).b((String) obj);
            case 12:
                ArrayList arrayList = (ArrayList) obj;
                xze xzeVar = tvt.a;
                if (arrayList.isEmpty()) {
                    return aktp.ag(StatusOr.fromValue(new ArrayList()));
                }
                return akul.g(((twc) this.a).c(arrayList));
            case 13:
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    Object obj2 = this.a;
                    txg txgVar = (txg) obj2;
                    return txgVar.g.b(((qei) optional.get()).d).h(new ttg(optional, 13), txgVar.c);
                }
                return aktp.ag(Optional.empty());
            case 14:
                uiq uiqVar = (uiq) obj;
                int aU = a.aU(uiqVar.c);
                if (aU != 0 && aU == 3) {
                    Object obj3 = this.a;
                    uhl.j(((uin) obj3).b, Uri.parse(uiqVar.d));
                }
                return aneh.a;
            case 15:
                return aktp.ag(this.a);
            case 16:
                return ((ukh) this.a).g.h(-1L);
            case 17:
                return ((ukh) this.a).g.h(-1L);
            case 18:
                Long l = (Long) obj;
                if (l != null && l.longValue() > 0) {
                    Object obj4 = this.a;
                    ukh.a.q("Key rotation work was present and cancellation was requested. Cancelling..");
                    return akul.g(((gte) gvf.ar(((ukh) obj4).b).b("verified_sms_key_rotation_unique_work_name")).c).i(new tsz(obj4, 17), andi.a);
                }
                ukh.a.l("Key rotation work is not present. Nothing to do.");
                return aktp.ag(null);
            case 19:
                ytw.a.o("Starting key rotation...");
                ytw ytwVar = ((uki) this.a).d;
                return ytwVar.b.e().i(new xfn(ytwVar, 20), ytwVar.j);
            default:
                alwo alwoVar = uvk.d;
                if (((Boolean) obj).booleanValue()) {
                    return uvi.c.b();
                }
                ((alwl) ((alwl) uvk.d.m().g((Throwable) this.a)).h("com/google/android/apps/messaging/shared/feedback/SilentFeedbackManagerImpl", "postIssueNotification", 95, "SilentFeedbackManagerImpl.java")).q("SilentFeedbackManager: Issue notification is disabled. Not notifying");
                return aktp.ag(null);
        }
    }
}
