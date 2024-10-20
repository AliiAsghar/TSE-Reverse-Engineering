package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.home.ArchivedActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kup extends kuq implements kuz, ajyk {
    public final ArchivedActivity a;
    public final armf b;
    public final aabr c;
    private final armf e;
    private final armf f;

    public kup(ArchivedActivity archivedActivity, aabr aabrVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.a = archivedActivity;
        this.c = aabrVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.b = armfVar4;
        ajxd ajxdVar = (ajxd) armfVar.b();
        albo.U(ajya.d(archivedActivity.getIntent()), "Account missing");
        ajxdVar.d(ajyu.a().a());
        ajxdVar.c(this);
    }

    @Override // defpackage.ajyk
    public final void b(ajxt ajxtVar) {
        ((kpw) this.e.b()).a(ajxtVar);
    }

    @Override // defpackage.ajyk
    public final void c() {
        ((lfl) this.f.b()).w(this.a, 195359);
    }

    @Override // defpackage.ajyk
    public final void d(agxw agxwVar) {
        lga.S(this.a, agxwVar, "archived_fragment_tag", uye.ARCHIVED);
    }

    @Override // defpackage.kuz
    public final Optional e() {
        return this.a.R();
    }

    @Override // defpackage.kuz
    public final void f() {
        this.a.S();
    }

    @Override // defpackage.kuz
    public final void g() {
        this.a.U();
    }

    @Override // defpackage.kuz
    public final void i(ActionMode.Callback callback, View view, String str) {
        this.a.W(callback, view, null);
    }

    @Override // defpackage.kuz
    public final /* synthetic */ void k(ConversationId conversationId, lrf lrfVar, boolean z) {
        lga.R(this, conversationId, lrfVar, z);
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.kuz
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.kuz
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.kuz
    public final /* synthetic */ void l(ConversationId conversationId, MessageIdType messageIdType, lrf lrfVar, boolean z) {
    }
}
