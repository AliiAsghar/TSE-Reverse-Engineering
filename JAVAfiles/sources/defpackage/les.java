package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class les extends rg {
    final /* synthetic */ lex a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public les(lex lexVar) {
        super(false);
        this.a = lexVar;
    }

    @Override // defpackage.rg
    public final void b() {
        ixd n;
        this.a.A.o("handleBackPressed");
        cg a = this.a.a();
        if (a != null && a.aw()) {
            boolean c = this.a.d().c();
            boolean d = this.a.d().d();
            if (!c && !d) {
                throw new IllegalArgumentException("expecting either the contact picker or the conversation fragment to be shown");
            }
            if (c && d && ((n = this.a.n()) == null || (n.aS() && lga.p(n)))) {
                this.a.A.o("handled back press by delegating to conversation fragment");
                return;
            }
            this.a.P();
            if (!c && !this.a.T() && lga.p(this.a.n())) {
                this.a.A.o("handled back press by delegating to conversation fragment");
                return;
            }
            lex lexVar = this.a;
            if (lexVar.J || lexVar.b.getIntent().getBooleanExtra("should_launch_home_on_back", false)) {
                this.a.O = 2;
            }
            if (d || c) {
                lex lexVar2 = this.a;
                if (!lga.q(lexVar2.b, lexVar2.P.a) && !this.a.d().b()) {
                    this.a.C();
                    this.a.A.o("handled back press by finishing conversation");
                    return;
                }
            }
            try {
                h(false);
                this.a.b.c().d();
                return;
            } catch (IllegalStateException e) {
                alvw h = lex.a.h();
                h.X(alwp.a, "Bugle");
                ((alvg) ((alvg) h).g(e).h("com/google/android/apps/messaging/main/MainActivityPeer$LegacyDelegatingBackPressedCallback", "handleOnBackPressed", 2567, "MainActivityPeer.kt")).q("MainActivity: FragmentActivity.OnBackPressed threw IllegalStateException - continuing");
                return;
            }
        }
        this.a.A.l("Conversation Root fragment is not attached; ignoring back press.");
    }
}
