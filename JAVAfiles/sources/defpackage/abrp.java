package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abrp extends abro {
    protected final acit a;

    public abrp(int i, acit acitVar) {
        super(i);
        this.a = acitVar;
    }

    protected abstract void c(absl abslVar);

    @Override // defpackage.abru
    public final void d(Status status) {
        this.a.c(new abra(status));
    }

    @Override // defpackage.abru
    public final void e(Exception exc) {
        this.a.c(exc);
    }

    @Override // defpackage.abru
    public final void f(absl abslVar) {
        try {
            c(abslVar);
        } catch (DeadObjectException e) {
            d(abru.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(abru.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.abru
    public void g(znp znpVar, boolean z) {
    }
}
