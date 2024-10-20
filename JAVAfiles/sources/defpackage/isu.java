package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class isu implements akbp<Void, Boolean> {
    final /* synthetic */ itb a;

    public isu(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        if (!(th instanceof CancellationException)) {
            xzb.p("Bugle", th, "Error: scrolling to bottom. ".concat(String.valueOf(String.valueOf(this.a.af))));
        }
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.a.t(0);
        this.a.ao.as();
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
