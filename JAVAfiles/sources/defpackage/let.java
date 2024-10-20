package defpackage;

import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class let implements ajyk {
    final /* synthetic */ lex a;

    public let(lex lexVar) {
        this.a = lexVar;
    }

    private final void e(int i) {
        int i2 = i - 1;
        ((lag) this.a.p.b()).k.set(i2);
        ((iqt) this.a.q.b()).a.set(i2);
    }

    @Override // defpackage.ajyk
    public final void a() {
        this.a.A.o("onAccountLoading called");
        e(4);
    }

    @Override // defpackage.ajyk
    public final void b(ajxt ajxtVar) {
        this.a.A.o("onAccountError called");
        e(3);
        ((kpw) this.a.i.b()).a(ajxtVar);
    }

    @Override // defpackage.ajyk
    public final void c() {
        ((lfl) this.a.w.b()).w(this.a.b, 184226);
    }

    @Override // defpackage.ajyk
    public final void d(agxw agxwVar) {
        cg b;
        this.a.A.o("onAccountChanged called");
        qiu.h(((qjk) this.a.s.b()).a("MainActivityPeerAccountUiCallbacks#onAccountChanged"));
        this.a.m.b = null;
        e(2);
        ((lag) this.a.p.b()).j.compareAndSet(false, true);
        if (this.a.d().e()) {
            ((mgv) this.a.f.b()).f(mgv.y);
        }
        this.a.A.o("Attaching newConversationListRootFragment");
        lex lexVar = this.a;
        ajwt n = agxwVar.n();
        n.getClass();
        kum kumVar = new kum();
        apxh.e(kumVar);
        aklw.b(kumVar, n);
        bd bdVar = new bd(lexVar.b.a());
        bdVar.v(R.id.conversation_list_root_container, kumVar, "conversation_list_root_fragment_tag");
        bdVar.b();
        this.a.A.o("Attaching newConversationRootFragment");
        lex lexVar2 = this.a;
        ajwt n2 = agxwVar.n();
        n2.getClass();
        lexVar2.v(n2);
        if (!((yjv) this.a.o.b()).d() && this.a.d().c()) {
            this.a.d().b = 0;
        }
        this.a.U();
        if (xxy.a() && d.F(agxwVar.o(), "pseudonymous") && (b = this.a.b()) != null) {
            ((Optional) ((apxx) ((kvw) akec.z(b)).am).a).ifPresent(new ixe(6));
        }
        ((apvo) this.a.u.b()).a = true;
    }
}
