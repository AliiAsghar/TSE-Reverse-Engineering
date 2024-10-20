package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class jap implements akgh<List<ParticipantsTable.BindData>> {
    final /* synthetic */ jar a;

    public jap(jar jarVar) {
        this.a = jarVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        this.a.h.r("Failed to load SIM data for SimPickerFragmentPeer: ", th);
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        List list = (List) obj;
        if (((okf) this.a.m.b()).a()) {
            return;
        }
        akrh e = aktp.e("SimPickerFragmentPeer::onNewData selfParticipants");
        try {
            this.a.d.i(list);
            jar jarVar = this.a;
            jarVar.l = jarVar.q.o(jarVar.d.g());
            jar jarVar2 = this.a;
            jarVar2.a(jarVar2.l);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akgh
    public final void b() {
    }
}
