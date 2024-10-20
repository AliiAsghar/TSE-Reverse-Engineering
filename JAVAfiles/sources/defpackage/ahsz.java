package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import com.google.apps.tiktok.concurrent.InternalForegroundService;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahsz implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahsz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                Object obj = ((ajqe) this.a).d;
                Object obj2 = ahta.a;
                try {
                    return algw.i(((Context) obj).getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                } catch (PackageManager.NameNotFoundException unused) {
                    return alfd.a;
                }
            case 1:
                return algw.i(new ahva(((ajqe) this.a).a));
            case 2:
                return (aneo) this.a.b();
            case 3:
                return (algw) this.a.b();
            case 4:
                int i = ahtp.e;
                return ahsw.a((Context) this.a);
            case 5:
                return ((ahut) this.a).a();
            case 6:
                Object obj3 = this.a;
                ahvr ahvrVar = (ahvr) obj3;
                aneo aneoVar = (aneo) ahvrVar.e.get();
                aneoVar.getClass();
                ahtx ahtxVar = (ahtx) ahvrVar.d.get();
                ahtxVar.getClass();
                int i2 = 8;
                ListenableFuture f = ancj.f(ancd.f(anee.o(ahtxVar.e()), ahty.class, new ahnx(i2), aneoVar), new agui(obj3, 9), aneoVar);
                f.c(new ahsa(f, i2), aneoVar);
                return f;
            case 7:
                aneo aneoVar2 = (aneo) this.a.get();
                aneoVar2.getClass();
                return aneoVar2.schedule(new agug(7), 10000L, TimeUnit.MILLISECONDS);
            case 8:
                aixy d = ((aiya) ((aogy) this.a).b).d("/client_streamz/tq_cobalt/worker/log_writer/error_count", new aixw("customer_id", Integer.class), new aixw("project_id", Integer.class), new aixw("error_type", String.class));
                d.a();
                return d;
            case 9:
                aixy d2 = ((aiya) ((aogy) this.a).b).d("/client_streamz/tq_cobalt/worker/log_uploader/error_count", new aixw("customer_id", Integer.class), new aixw("project_id", Integer.class), new aixw("error_type", String.class));
                d2.a();
                return d2;
            case 10:
                aixy d3 = ((aiya) ((aogy) this.a).b).d("/client_streamz/tq_cobalt/worker/log_uploader/start", new aixw("customer_id", Integer.class), new aixw("project_id", Integer.class));
                d3.a();
                return d3;
            case 11:
                aixy d4 = ((aiya) ((aogy) this.a).b).d("/client_streamz/tq_cobalt/worker/log_uploader/finish", new aixw("customer_id", Integer.class), new aixw("project_id", Integer.class), new aixw("result", String.class));
                d4.a();
                return d4;
            case 12:
                long j = aizr.a;
                return (UiModeManager) ((Context) this.a).getSystemService("uimode");
            case 13:
                akat akatVar = (akat) this.a;
                Map map = akatVar.d;
                String a = akatVar.a();
                albo.X(map.containsKey(a), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", a);
                return new Intent(akatVar.c, (Class<?>) ((armf) akatVar.d.get(a)).b());
            case 14:
                akat akatVar2 = (akat) this.a;
                armf armfVar = (armf) akatVar2.e.get(akatVar2.a());
                if (armfVar == null) {
                    ((alvg) ((alvg) akat.a.i()).h("com/google/apps/tiktok/concurrent/AndroidFutures", "getForegroundService", 322, "AndroidFutures.java")).q("Calling attachForegroundService from non-main-process opens the main process which might be unintentional. Instead load and call the generated_android_futures_services macro for this process.");
                    return InternalForegroundService.class;
                }
                return (Class) armfVar.b();
            case 15:
                return (aneo) this.a.b();
            case 16:
                return (agcp) this.a.b();
            case 17:
                return (ahtx) this.a.b();
            case 18:
                Object obj4 = this.a;
                return ((LayoutInflater) ((aklm) obj4).getBaseContext().getSystemService("layout_inflater")).cloneInContext((Context) obj4);
            case 19:
                akmj akmjVar = (akmj) this.a;
                return new File(akmjVar.c.getDir(akmjVar.b.e(), 0), akmjVar.b.f());
            default:
                return String.format("Node %s that was used to generate this set is no longer in the graph.", this.a);
        }
    }
}
