package defpackage;

import android.app.Activity;
import j$.util.Optional;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibp {
    public Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ibp(String str, String str2, String str3) {
        this.b = str;
        this.d = str2;
        this.c = str3;
    }

    public final void a(ged gedVar, arqv arqvVar) {
        Object obj = this.c;
        try {
            ((ReentrantLock) obj).lock();
            if (gedVar != null) {
                this.a = gedVar;
            }
            arqvVar.a(this.d, this.b);
        } finally {
            ((ReentrantLock) obj).unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ila] */
    public final synchronized gpx b() {
        if (((Optional) this.a).isEmpty()) {
            Object obj = this.d;
            Object obj2 = this.b;
            ?? r2 = this.c;
            tqx tqxVar = (tqx) ((ibi) obj).a.b();
            tqxVar.getClass();
            this.a = Optional.of(new gpx(tqxVar, (Activity) obj2, (ila) r2));
        }
        return (gpx) ((Optional) this.a).get();
    }

    public ibp() {
        this.d = new iba();
        this.b = new iba();
        this.c = new ReentrantLock();
    }

    public ibp(ibi ibiVar, Activity activity, ila ilaVar) {
        this.a = Optional.empty();
        this.d = ibiVar;
        this.b = activity;
        this.c = ilaVar;
    }
}
