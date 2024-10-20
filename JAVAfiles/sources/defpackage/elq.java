package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class elq extends dyp implements Runnable {
    private final Reference a;

    public elq(EditText editText) {
        super(null);
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.dyp
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.a.get();
        if (editText != null && (handler = editText.getHandler()) != null) {
            handler.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        elr.a((EditText) this.a.get(), 1);
    }
}
