package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahap implements ahah {
    public final Context a;
    public volatile boolean b;
    public agzs c;
    public volatile ahjj d;
    private volatile boolean e;
    private final AtomicReference f = new AtomicReference();
    private volatile SharedPreferences.Editor g;

    public ahap(Context context) {
        this.a = context;
    }

    @Override // defpackage.ahah
    public final SharedPreferences.Editor a() {
        return this.g;
    }

    @Override // defpackage.ahah
    public final void b(ahjj ahjjVar) {
        this.d = ahjjVar;
        if (this.b) {
            d();
        }
    }

    public final SharedPreferences c(SharedPreferences sharedPreferences, boolean z) {
        this.e = z;
        SharedPreferences sharedPreferences2 = (SharedPreferences) this.f.getAndSet(sharedPreferences);
        this.g = sharedPreferences.edit();
        return sharedPreferences2;
    }

    public final void d() {
        ahjj ahjjVar = this.d;
        if (ahjjVar != null) {
            ahjjVar.a();
        }
    }

    @Override // defpackage.alhr
    public final /* bridge */ /* synthetic */ Object get() {
        return (SharedPreferences) this.f.get();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
