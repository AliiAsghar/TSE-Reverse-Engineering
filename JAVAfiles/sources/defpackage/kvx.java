package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class kvx implements akgh<List<stc>> {
    final /* synthetic */ kvw a;

    public kvx(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        kuy.a.r("Loading all message annotations failed", th);
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            alvw g = kvw.a.g();
            g.X(alwp.a, "HomeFragmentFlogger");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/HomeFragmentPeer$3", "onNewData", 1420, "HomeFragmentPeer.java")).q("Data is empty");
            return;
        }
        alvw g2 = kvw.a.g();
        g2.X(alwp.a, "HomeFragmentFlogger");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/home/HomeFragmentPeer$3", "onNewData", 1423, "HomeFragmentPeer.java")).q("Set annotations will be called trigger data reload.");
        kyf D = this.a.D();
        kxx kxxVar = D.f;
        if (kxxVar == null) {
            D.g = list;
        } else {
            kxxVar.l(list);
        }
    }

    @Override // defpackage.akgh
    public final void b() {
    }
}
