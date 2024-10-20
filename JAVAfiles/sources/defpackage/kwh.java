package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.home.SpamFolderActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwh extends kwi implements kuz, ajyk {
    public final SpamFolderActivity a;
    public final via b;
    public final armf c;
    public final zai d;
    public final aabr e;
    private final armf g;
    private final armf h;

    public kwh(SpamFolderActivity spamFolderActivity, aabr aabrVar, via viaVar, zai zaiVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, Optional optional, armf armfVar5, armf armfVar6) {
        this.a = spamFolderActivity;
        this.e = aabrVar;
        this.b = viaVar;
        this.d = zaiVar;
        this.g = armfVar3;
        this.h = armfVar5;
        this.c = armfVar6;
        if (!uyh.a() && !kpt.a()) {
            ajxd ajxdVar = (ajxd) armfVar.b();
            ajyt b = ajyu.b(spamFolderActivity);
            b.b(ibc.class);
            ajxdVar.c(this);
            ajxdVar.d(b.a());
            optional.ifPresent(new ixe(18));
            return;
        }
        ajxd ajxdVar2 = (ajxd) armfVar.b();
        ajyt b2 = ajyu.b(spamFolderActivity);
        b2.b(akag.class);
        ajxdVar2.c(new akaf((akag) armfVar2.b(), 0));
        b2.b(akaa.class);
        ajxdVar2.c(this);
        ajxdVar2.c((ajyk) armfVar4.b());
        ajxdVar2.d(b2.a());
    }

    @Override // defpackage.ajyk
    public final void b(ajxt ajxtVar) {
        ((kpw) this.g.b()).a(ajxtVar);
    }

    @Override // defpackage.ajyk
    public final void c() {
        ((lfl) this.h.b()).w(this.a, 195361);
    }

    @Override // defpackage.ajyk
    public final void d(agxw agxwVar) {
        lga.S(this.a, agxwVar, "spam_folder_fragment_tag", uye.SPAM_FOLDER);
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
