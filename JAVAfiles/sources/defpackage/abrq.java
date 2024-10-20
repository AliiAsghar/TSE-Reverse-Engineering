package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrq extends abru {
    protected final abry a;

    public abrq(int i, abry abryVar) {
        super(i);
        this.a = abryVar;
    }

    @Override // defpackage.abru
    public final void d(Status status) {
        try {
            this.a.g(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.abru
    public final void e(Exception exc) {
        try {
            this.a.g(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.abru
    public final void f(absl abslVar) {
        try {
            this.a.f(abslVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.abru
    public final void g(znp znpVar, boolean z) {
        abry abryVar = this.a;
        znpVar.a.put(abryVar, Boolean.valueOf(z));
        abryVar.d(new absg(znpVar, abryVar));
    }
}
