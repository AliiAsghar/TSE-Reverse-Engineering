package defpackage;

import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abtu {
    public Object d;
    public boolean e = false;
    final /* synthetic */ BaseGmsClient f;

    public abtu(BaseGmsClient baseGmsClient, Object obj) {
        this.f = baseGmsClient;
        this.d = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d();

    public final void e() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void f() {
        e();
        synchronized (this.f.i) {
            this.f.i.remove(this);
        }
    }
}
