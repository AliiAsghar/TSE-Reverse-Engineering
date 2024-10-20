package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uix {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public uix(uiy uiyVar, ujd ujdVar, Uri uri, Uri uri2, long j) {
        this.b = uiyVar;
        this.e = ujdVar;
        this.c = uri;
        this.d = uri2;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, gth] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final void a(hgi hgiVar) {
        Runnable runnable;
        hgiVar.getClass();
        synchronized (this.b) {
            runnable = (Runnable) this.e.remove(hgiVar);
        }
        if (runnable != null) {
            this.d.a(runnable);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, gth] */
    public final void b(hgi hgiVar) {
        fhh fhhVar = new fhh((Object) this, (Object) hgiVar, 12, (byte[]) null);
        synchronized (this.b) {
        }
        this.d.b(this.a, fhhVar);
    }

    public uix(gth gthVar, ico icoVar) {
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.d = gthVar;
        this.c = icoVar;
        this.a = millis;
        this.b = new Object();
        this.e = new LinkedHashMap();
    }
}
