package defpackage;

import android.content.Context;
import android.util.SparseArray;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yjy {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils");
    public final Lock b = new ReentrantLock();
    public final SparseArray c = new SparseArray();
    protected final Context d;
    protected final armf e;
    protected final alhr f;
    protected final armf g;
    protected final armf h;
    protected volatile armf i;

    public yjy(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.d = context;
        this.e = armfVar;
        this.g = armfVar3;
        this.h = armfVar4;
        this.f = albo.D(new yim(context, 9));
        this.i = armfVar2;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public final yjr g() {
        return (yjr) this.h.b();
    }

    public ykb h(int i) {
        throw null;
    }

    public final ykb i() {
        return h(b());
    }

    public final ykb j() {
        return h(c());
    }

    public final ykb k() {
        return h(f());
    }

    public abstract List l();

    public abstract void m();

    public final void n(yjx yjxVar) {
        Iterator it = l().iterator();
        while (it.hasNext() && yjxVar.a(((ykb) it.next()).a())) {
        }
    }

    public final boolean o(int i) {
        if (((yjw) this.e.b()).a() && e() >= 2) {
            int b = b();
            if (i != -1 && i != b) {
                alvw g = a.g();
                g.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils", "canSendOrReceiveMms", 283, "SubscriptionMetadataUtils.java")).q("SubscriptionMetadataUtils canSendOrReceiveMms: returning false");
                return false;
            }
        }
        alvw g2 = a.g();
        g2.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionMetadataUtils", "canSendOrReceiveMms", 288, "SubscriptionMetadataUtils.java")).q("SubscriptionMetadataUtils canSendOrReceiveMms: returning true by default");
        return true;
    }

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract void s(int i, String str, int i2, String str2, String str3, msh mshVar, int i3, Optional optional);
}
