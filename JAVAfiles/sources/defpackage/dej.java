package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dej extends arrp implements arqg<arnb> {
    final /* synthetic */ czt a;
    final /* synthetic */ del b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dej(czt cztVar, del delVar) {
        super(0);
        this.a = cztVar;
        this.b = delVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        this.a.removeOnAttachStateChangeListener(this.b);
        return arnb.a;
    }
}
