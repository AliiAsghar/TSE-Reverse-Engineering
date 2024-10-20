package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dam extends arrp implements arqg<arnb> {
    final /* synthetic */ dai a;
    final /* synthetic */ drx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dam(dai daiVar, drx drxVar) {
        super(0);
        this.a = daiVar;
        this.b = drxVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        this.a.D().removeViewInLayout(this.b);
        this.a.D().b.remove(this.a.D().a.remove(this.b));
        this.b.setImportantForAccessibility(0);
        return arnb.a;
    }
}
