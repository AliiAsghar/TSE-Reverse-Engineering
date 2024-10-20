package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uhf extends ContentObserver {
    public final Context a;
    public final AtomicBoolean b;
    public final AtomicBoolean c;
    public volatile ahqq d;
    private final armf e;

    public uhf(Context context, armf armfVar) {
        super(null);
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.a = context;
        this.e = armfVar;
        uhg.c.o("ContactContentObserver created");
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        uhg.c.o("Contacts changed");
        if (this.b.compareAndSet(false, true)) {
            this.d = ((mgv) this.e.b()).a();
        }
    }
}
