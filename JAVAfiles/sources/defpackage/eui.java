package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eui implements etu {
    public static final List a = new ArrayList(50);
    public final Handler b;

    public eui(Handler handler) {
        this.b = handler;
    }

    private static mka k() {
        mka mkaVar;
        List list = a;
        synchronized (list) {
            if (list.isEmpty()) {
                mkaVar = new mka();
            } else {
                mkaVar = (mka) list.remove(list.size() - 1);
            }
        }
        return mkaVar;
    }

    @Override // defpackage.etu
    public final void a(int i) {
        d.s(true);
        this.b.removeMessages(i);
    }

    @Override // defpackage.etu
    public final boolean b(Runnable runnable) {
        return this.b.post(runnable);
    }

    @Override // defpackage.etu
    public final boolean c() {
        d.s(true);
        return this.b.hasMessages(1);
    }

    @Override // defpackage.etu
    public final void d() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.etu
    public final void e(int i) {
        this.b.sendEmptyMessage(i);
    }

    @Override // defpackage.etu
    public final mka f(int i) {
        mka k = k();
        k.a = this.b.obtainMessage(i);
        return k;
    }

    @Override // defpackage.etu
    public final mka g(int i, Object obj) {
        mka k = k();
        k.a = this.b.obtainMessage(i, obj);
        return k;
    }

    @Override // defpackage.etu
    public final mka h(int i, int i2, int i3) {
        mka k = k();
        k.a = this.b.obtainMessage(i, i2, i3);
        return k;
    }

    @Override // defpackage.etu
    public final mka i(int i, Object obj) {
        Handler handler = this.b;
        mka k = k();
        k.a = handler.obtainMessage(4, i, 0, obj);
        return k;
    }

    @Override // defpackage.etu
    public final void j(mka mkaVar) {
        Object obj = mkaVar.a;
        dzg.g(obj);
        this.b.sendMessageAtFrontOfQueue((Message) obj);
        mkaVar.e();
    }
}
