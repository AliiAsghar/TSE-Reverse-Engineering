package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvr {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final Context c;
    public final alhr d;
    public final alhr e;
    public final alhr f;
    public final alhr g;
    public final Uri h;
    public volatile ahuj i;
    public final Uri j;
    public volatile ahuk k;
    private final alhr l;

    public ahvr(Context context, alhr alhrVar, alhr alhrVar2, alhr alhrVar3) {
        this.c = context;
        this.e = alhrVar;
        this.d = alhrVar3;
        this.f = alhrVar2;
        aiuz aiuzVar = new aiuz(context);
        aiuzVar.c("phenotype_storage_info");
        aiuzVar.d("storage-info.pb");
        this.h = aiuzVar.a();
        aiuz aiuzVar2 = new aiuz(context);
        aiuzVar2.c("phenotype_storage_info");
        aiuzVar2.d("device-encrypted-storage-info.pb");
        int i = agqa.a;
        aiuzVar2.b();
        this.j = aiuzVar2.a();
        this.g = albo.D(new ahsz(this, 6));
        this.l = albo.D(new ahsz(alhrVar, 7));
    }

    public final ahuj a() {
        ahuj ahujVar = this.i;
        if (ahujVar == null) {
            synchronized (a) {
                ahujVar = this.i;
                if (ahujVar == null) {
                    ahujVar = ahuj.b;
                    aivz b2 = aivz.b(ahujVar);
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        try {
                            ahuj ahujVar2 = (ahuj) ((agcp) this.f.get()).s(this.h, b2);
                            StrictMode.setThreadPolicy(threadPolicy);
                            ahujVar = ahujVar2;
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                    } catch (IOException unused) {
                    }
                    this.i = ahujVar;
                }
            }
        }
        return ahujVar;
    }

    public final ahuk b() {
        ahuk ahukVar = this.k;
        if (ahukVar == null) {
            synchronized (b) {
                ahukVar = this.k;
                if (ahukVar == null) {
                    ahukVar = ahuk.b;
                    aivz b2 = aivz.b(ahukVar);
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        try {
                            ahuk ahukVar2 = (ahuk) ((agcp) this.f.get()).s(this.j, b2);
                            StrictMode.setThreadPolicy(threadPolicy);
                            ahukVar = ahukVar2;
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                    } catch (IOException unused) {
                    }
                    this.k = ahukVar;
                }
            }
        }
        return ahukVar;
    }

    public final ListenableFuture c(boolean z) {
        ListenableFuture listenableFuture;
        aneo aneoVar = (aneo) this.e.get();
        aneoVar.getClass();
        if (z) {
            listenableFuture = albo.bJ((ListenableFuture) this.l.get());
        } else {
            listenableFuture = aneh.a;
        }
        return ancj.g(anee.o(listenableFuture), new ahce(this, 7), aneoVar);
    }

    public final boolean d() {
        if ((b().c & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if ((a().c & 1) != 0) {
            return true;
        }
        return false;
    }
}
