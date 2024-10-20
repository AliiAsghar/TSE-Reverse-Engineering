package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aixk extends aixm implements CancellationSignal.OnCancelListener {
    private final CancellationSignal b;

    public aixk(aixl aixlVar) {
        super(aixlVar);
        this.b = new CancellationSignal();
    }

    @Override // defpackage.ance, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.cancel();
        return super.cancel(z);
    }

    @Override // defpackage.aixm
    protected final void d(aixl aixlVar) {
        try {
            this.b.setOnCancelListener(this);
            Cursor a = aixlVar.a(this.b);
            try {
                if (!isCancelled() && a != null) {
                    a.getCount();
                }
            } catch (Throwable th) {
                try {
                    setException(th);
                    if (!set(a)) {
                        d.q(a);
                    }
                } finally {
                    if (!set(a)) {
                        d.q(a);
                    }
                }
            }
        } catch (OperationCanceledException unused) {
            super.cancel(true);
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        super.cancel(true);
    }
}
