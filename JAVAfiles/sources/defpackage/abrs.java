package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrs extends abro {
    private final abtl a;
    private final acit b;
    private final abth d;

    public abrs(int i, abtl abtlVar, acit acitVar, abth abthVar) {
        super(i);
        this.b = acitVar;
        this.a = abtlVar;
        this.d = abthVar;
        if (i == 2 && abtlVar.c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.abro
    public final boolean a(absl abslVar) {
        return this.a.c;
    }

    @Override // defpackage.abro
    public final Feature[] b(absl abslVar) {
        return this.a.b;
    }

    @Override // defpackage.abru
    public final void d(Status status) {
        this.b.c(this.d.a(status));
    }

    @Override // defpackage.abru
    public final void e(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.abru
    public final void f(absl abslVar) {
        try {
            this.a.a(abslVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(abru.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.abru
    public final void g(znp znpVar, boolean z) {
        ?? r0 = znpVar.b;
        acit acitVar = this.b;
        r0.put(acitVar, Boolean.valueOf(z));
        ((acir) acitVar.a).q(new absh(znpVar, acitVar));
    }
}
