package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class isq implements akgh<alog> {
    final /* synthetic */ itb a;

    public isq(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        xzb.p("Bugle", th, "Error: getting scheduled messages within conversation. ".concat(String.valueOf(String.valueOf(this.a.af))));
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.aq.a.ifPresent(new ile(14));
    }

    @Override // defpackage.akgh
    public final void b() {
    }
}
