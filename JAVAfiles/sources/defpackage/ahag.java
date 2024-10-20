package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahag implements ahah {
    private final ahaf a;

    public ahag(Context context) {
        ahaf ahafVar = new ahaf(context);
        this.a = ahafVar;
        ahafVar.c();
    }

    @Override // defpackage.ahah
    public final SharedPreferences.Editor a() {
        this.a.c();
        return this.a.b;
    }

    @Override // defpackage.ahah
    public final void b(ahjj ahjjVar) {
        ahjjVar.a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }

    @Override // defpackage.alhr
    public final /* bridge */ /* synthetic */ Object get() {
        this.a.c();
        return this.a;
    }
}
