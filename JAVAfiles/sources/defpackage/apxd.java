package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apxd implements apxq {
    public final eoz a;
    public final Context b;
    private final Object c = new Object();
    private volatile kqk d;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        ngu SD();
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface b {
        apxa a();
    }

    public apxd(re reVar) {
        this.a = reVar;
        this.b = reVar;
    }

    public static final eoy a(eoz eozVar, Context context) {
        return new eoy(eozVar, new apxc(context, 0));
    }

    @Override // defpackage.apxq
    public final /* bridge */ /* synthetic */ Object aS() {
        if (this.d == null) {
            synchronized (this.c) {
                if (this.d == null) {
                    this.d = ((apxe) a(this.a, this.b).a(apxe.class)).b;
                }
            }
        }
        return this.d;
    }
}
