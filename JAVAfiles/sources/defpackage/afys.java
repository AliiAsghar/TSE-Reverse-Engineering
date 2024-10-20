package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afys implements afll {
    static final /* synthetic */ artm[] a;
    public static final alvi b;
    private final arsn d = new afyr(this);
    public final arnr c = new arnr();

    static {
        arrr arrrVar = new arrr(afys.class, "delegate", "getDelegate()Lcom/google/android/libraries/compose/draft/text/ObservableEmojiDraftTextController;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
        b = alvi.m("com/google/android/libraries/compose/ui/composable/text/DelegatingEmojiDraftTextController");
    }

    private final void o(arqr arqrVar) {
        afll m = m();
        if (m != null) {
            arqrVar.a(m);
        } else {
            this.c.addLast(arqrVar);
        }
    }

    @Override // defpackage.aflb
    public final CharSequence a() {
        CharSequence a2;
        afll m = m();
        if (m != null && (a2 = m.a()) != null) {
            return a2;
        }
        return "";
    }

    @Override // defpackage.aflb
    public final void b(CharSequence charSequence) {
        o(new afyq(charSequence, 1));
    }

    @Override // defpackage.aflb
    public final void c(CharSequence charSequence) {
        o(new afyq(charSequence, 0));
    }

    @Override // defpackage.aflb
    public final void d() {
        o(afob.p);
    }

    @Override // defpackage.aflb
    public final void e() {
        o(afob.q);
    }

    @Override // defpackage.aflb
    public final void f(afnr afnrVar) {
        o(new afyq(afnrVar, 2));
    }

    @Override // defpackage.aflb
    public final void g() {
        o(afob.r);
    }

    @Override // defpackage.aflb
    public final void h(CharSequence charSequence) {
        o(new afyq(charSequence, 5));
    }

    @Override // defpackage.afle
    public final void i(afkr afkrVar) {
        o(new afmo(afkrVar, 19));
    }

    @Override // defpackage.aflk
    public final void j(aflj afljVar) {
        o(new afmo(afljVar, 20));
    }

    @Override // defpackage.aflk
    public final void k(aflj afljVar) {
        o(new afyq(afljVar, 4));
    }

    @Override // defpackage.afle
    public final void l(afkr afkrVar) {
        o(new afyq(afkrVar, 3));
    }

    public final afll m() {
        return (afll) this.d.c(a[0]);
    }

    public final void n(afll afllVar) {
        this.d.d(a[0], afllVar);
    }
}
