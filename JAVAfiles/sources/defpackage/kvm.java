package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class kvm implements akbp<SelectedConversation, ParticipantsTable.BindData> {
    final /* synthetic */ kvw a;

    public kvm(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        xyo e = kuy.a.e();
        e.H("Error getting local blocked users for migrating blocked");
        e.b(((SelectedConversation) obj).a);
        e.q();
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void c(Object obj, Object obj2) {
        ihd j;
        SelectedConversation selectedConversation = (SelectedConversation) obj;
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj2;
        if (bindData == null && (!uyh.a() || selectedConversation.o != 4)) {
            xyo e = kuy.a.e();
            e.H("HomeFragmentPeer#getBlockCallback#onSuccess: participant is null and it's not a Lighter conversation");
            e.b(selectedConversation.a);
            e.q();
            return;
        }
        kvw kvwVar = this.a;
        if (selectedConversation.o == 4) {
            String str = selectedConversation.r;
            str.getClass();
            j = new igg(new ihf(str, selectedConversation.q));
        } else {
            bindData.getClass();
            j = hld.j(bindData);
        }
        ihe iheVar = ihe.BLOCK;
        ihc igdVar = new igd(5);
        if (selectedConversation.h) {
            iheVar = ihe.RBM_BLOCK;
            igdVar = new ige(4);
        }
        igz igzVar = (igz) kvwVar.E.b();
        ihb a = ihg.a();
        a.d(iheVar);
        a.e = 1;
        a.c(selectedConversation.a);
        a.b(R.id.start_chat_fab);
        a.b = bindData;
        a.c = igdVar;
        a.a = new kut(kvwVar, 4);
        a.d = j;
        a.e();
        a.f = 3;
        igzVar.d(a.a());
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
