package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qio extends arrp implements arqr {
    final /* synthetic */ arxm a;
    final /* synthetic */ arvv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qio(arxm arxmVar, arvv arvvVar) {
        super(1);
        this.a = arxmVar;
        this.b = arvvVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((ahmn) obj);
        return arnb.a;
    }

    public final void b(ahmn ahmnVar) {
        this.a.s(new qin(ahmnVar, 0));
        try {
            arvv arvvVar = this.b;
            Object v = ahmnVar.v();
            if (v != null) {
                arvvVar.T(v);
                return;
            }
            throw new IllegalArgumentException("Null value is not supported");
        } catch (CancellationException e) {
            this.b.b(e);
        } catch (ExecutionException e2) {
            e = e2;
            arvv arvvVar2 = this.b;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            arvvVar2.b(e);
        }
    }
}
