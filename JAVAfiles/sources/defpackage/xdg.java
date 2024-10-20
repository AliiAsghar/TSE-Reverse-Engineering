package defpackage;

import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingMessagesAction;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xdg implements ancs {
    private final /* synthetic */ int a;

    public /* synthetic */ xdg(int i) {
        this.a = i;
    }

    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        switch (this.a) {
            case 0:
                vbq vbqVar = (vbq) obj;
                akrh e = aktp.e("TachygramAuthTokenProvider#getTachyonRegistration");
                try {
                    akul q = vbqVar.q();
                    e.b(q);
                    e.close();
                    return q;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 1:
                return ((vbq) obj).k();
            case 2:
                ankx ankxVar = (ankx) obj;
                return aktp.af(new psx("[Tachygram] Failed to fetch RCS capabilities from Tachyon", ankxVar, anis.b.equals(ankxVar.a.c)));
            case 3:
                return ((vbq) obj).s();
            case 4:
                ankx ankxVar2 = (ankx) obj;
                return aktp.af(new psx("[Tachygram] Failed to fetch batched RCS capabilities from Tachyon", ankxVar2, ankxVar2.a.c.equals(anis.b)));
            case 5:
                return aktp.af(new pvi("[Tachygram] Failed to fetch online status from Tachyon", (ankx) obj));
            case 6:
                return aktp.af(new pvi("[Tachygram] Failed to get an auth token during online status request", (aniq) obj));
            case 7:
                return ((unz) obj).b();
            case 8:
                alwo alwoVar = xfw.a;
                return ((vbq) obj).l(vaz.REFRESH_WITHOUT_REREGISTER);
            case 9:
                return ((unz) obj).b();
            case 10:
                return xpt.c("Exception occurred during pause download IPC to RCS Engine.", (ajny) obj);
            case 11:
                return xpt.c("Exception occurred during resume download IPC to RCS Engine.", (ajny) obj);
            case 12:
                return new ProcessPendingMessagesAction(3).q();
            case 13:
                return aktp.ag(Optional.ofNullable(((aibm) obj).a));
            case 14:
                utz utzVar = ylr.a;
                return aktp.af(((amdk) obj).getCause());
            case 15:
                ytp.b.r("Error while creating/saving diagnostic report.", (Throwable) obj);
                return aktp.ag(null);
            case 16:
                Throwable th3 = (Throwable) obj;
                ytw.a.r("Vsms registration failed", th3);
                return aktp.af(th3);
            case 17:
                Optional optional = (Optional) obj;
                alwo alwoVar2 = yya.b;
                optional.getClass();
                if (optional.isEmpty()) {
                    ((alwl) yya.b.m().h("com/google/android/apps/messaging/signature/dataservice/StatelessSignatureDataService", "loadSignatureFromFeatureIfPresent", 55, "StatelessSignatureDataService.java")).q("The signature feature was not available.");
                    return aktp.ag(Optional.empty());
                }
                return ((yxy) optional.get()).b();
            case 18:
                xze xzeVar = aalt.c;
                return ((vbq) obj).l(vaz.FORCE_REFRESH);
            case 19:
                abra abraVar = (abra) obj;
                int a = abraVar.a();
                if (a != 17 && a != 31003) {
                    throw abraVar;
                }
                if (Log.isLoggable("Logging.Clearcut", 3)) {
                    Log.d("Logging.Clearcut", "Could not log data.", abraVar);
                }
                return aneh.a;
            default:
                abra abraVar2 = (abra) obj;
                throw new ahty(abraVar2.a(), abraVar2.getMessage(), abraVar2);
        }
    }
}
