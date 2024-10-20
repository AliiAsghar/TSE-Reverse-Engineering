package defpackage;

import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class kvo implements akbp<SelectedConversation, ParticipantsTable.BindData> {
    final /* synthetic */ kvw a;

    public kvo(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        kuy.a.q("Error getting reportable participant for group conversation");
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void c(Object obj, Object obj2) {
        SelectedConversation selectedConversation = (SelectedConversation) obj;
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj2;
        if (bindData != null) {
            igz igzVar = (igz) this.a.E.b();
            ihb a = ihg.a();
            a.d(ihe.GROUP_SPAM);
            a.e = 1;
            a.c(selectedConversation.a);
            a.b = bindData;
            a.a = new Runnable() { // from class: kvn
                @Override // java.lang.Runnable
                public final void run() {
                    kvo.this.a.o();
                }
            };
            a.c = new igd(5);
            a.d = hld.j(bindData);
            a.e();
            a.f = 3;
            igzVar.d(a.a());
            return;
        }
        xyo b = kuy.a.b();
        b.H("reportGroupCallback: Failed to find any reportable Participant for");
        b.b(selectedConversation.a);
        b.q();
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
