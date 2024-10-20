package defpackage;

import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zlw implements akgh<List<zlo>> {
    final /* synthetic */ ProgressBar a;
    final /* synthetic */ TextView b;
    final /* synthetic */ zly c;

    public zlw(zly zlyVar, ProgressBar progressBar, TextView textView) {
        this.a = progressBar;
        this.b = textView;
        this.c = zlyVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        ((alwl) ((alwl) ((alwl) zly.a.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/SimMessagesV2FragmentPeer$3", "onError", (char) 236, "SimMessagesV2FragmentPeer.java")).q("SimMessagesActivity: subscription failure");
        this.a.setVisibility(8);
    }

    @Override // defpackage.akgh
    public final void b() {
        ((alwl) zly.a.m().h("com/google/android/apps/messaging/ui/appsettings/SimMessagesV2FragmentPeer$3", "onPending", 242, "SimMessagesV2FragmentPeer.java")).q("SimMessagesActivity: data onPending");
        this.a.setVisibility(0);
        this.b.setVisibility(8);
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        List list = (List) obj;
        int i = 8;
        this.a.setVisibility(8);
        if (true == list.isEmpty()) {
            i = 0;
        }
        this.b.setVisibility(i);
        akhu akhuVar = this.c.l;
        aiut.c();
        List list2 = akhuVar.e;
        akhuVar.e = list;
        if (list2 == null && list != null) {
            akhuVar.w(0, list.size());
            return;
        }
        if (list2 != null && list == null) {
            akhuVar.x(0, list2.size());
            return;
        }
        if (list2 != null) {
            algj algjVar = akhuVar.c;
            akhs akhsVar = akhuVar.d;
            if (akqj.u()) {
                akrh e = aktp.e("RecyclerView Data Diff");
                try {
                    akhuVar.d.a(list2, list, akhuVar.c, akhuVar);
                    e.close();
                    return;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            akhuVar.d.a(list2, list, akhuVar.c, akhuVar);
            return;
        }
        akhuVar.p();
    }
}
