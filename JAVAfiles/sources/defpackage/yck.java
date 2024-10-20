package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yck {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils");
    public static final uuf b = uuh.i(uuh.b, "enable_debug_values_from_settings_store", false);
    public final armf c;
    public final armf d;
    public final armf e;
    public final apwt f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile int l;
    public volatile int m;
    public volatile boolean n;
    public volatile boolean o;
    public volatile boolean p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile boolean t;
    private final arwe u;

    public yck(armf armfVar, armf armfVar2, armf armfVar3, apwt apwtVar, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        apwtVar.getClass();
        arweVar.getClass();
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = apwtVar;
        this.u = arweVar;
        this.l = -1;
        this.m = -2;
        if (((Boolean) b.e()).booleanValue()) {
            qjh.l(arweVar, null, new wio(this, (arpe) null, 6), 3);
        }
    }

    public final File a(String str, boolean z, Context context) {
        context.getClass();
        File file = new File(b(context), str);
        if (z && file.exists()) {
            file.delete();
        }
        return file;
    }

    public final File b(Context context) {
        context.getClass();
        File file = new File(context.getCacheDir() + File.separator + "Debug");
        if (!file.exists() && !file.isDirectory() && !file.mkdirs()) {
            alvw h = a.h();
            h.X(alwp.a, "Bugle");
            ((alvg) h.h("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils", "getDebugFilesDir", 162, "DebugFileUtils.kt")).t("getDebugFilesDir: couldn't create dir: %s", file.getPath());
        }
        return file;
    }

    public final void c() {
        k(-1);
    }

    public final void d() {
        l(-2);
    }

    public final void e(boolean z) {
        if (this.g != z && ((Boolean) b.e()).booleanValue()) {
            qjh.l(this.u, null, new jmw((arpe) null, this, z, 2), 3);
        }
        this.g = z;
    }

    public final void f(boolean z) {
        if (this.o != z && ((Boolean) b.e()).booleanValue()) {
            qjh.l(this.u, null, new jmw((arpe) null, this, z, 8, (float[]) null), 3);
        }
        this.o = z;
    }

    public final void g(boolean z) {
        if (this.k != z && ((Boolean) b.e()).booleanValue()) {
            qjh.l(this.u, null, new jmw((arpe) null, this, z, 6, (int[]) null), 3);
        }
        this.k = z;
    }

    public final void h(boolean z) {
        if (this.j != z && ((Boolean) b.e()).booleanValue()) {
            qjh.l(this.u, null, new jmw((arpe) null, this, z, 5, (short[]) null), 3);
        }
        this.j = z;
    }

    public final void i(boolean z) {
        if (this.n != z && ((Boolean) b.e()).booleanValue()) {
            qjh.l(this.u, null, new jmw((arpe) null, this, z, 7, (boolean[]) null), 3);
        }
        this.n = z;
    }

    public final void j(boolean z) {
        if (this.i != z && ((Boolean) b.e()).booleanValue()) {
            qjh.l(this.u, null, new jmw((arpe) null, this, z, 4, (char[]) null), 3);
        }
        this.i = z;
    }

    public final void k(int i) {
        if (this.l != i && ((Boolean) b.e()).booleanValue()) {
            qjh.l(this.u, null, new uxn((arpe) null, this, i, 4), 3);
        }
        this.l = i;
    }

    public final void l(int i) {
        if (this.m != i && ((Boolean) b.e()).booleanValue()) {
            qjh.l(this.u, null, new uxn(null, this, i, 5, null), 3);
        }
        this.m = i;
    }

    public final void m(boolean z) {
        if (this.h != z && ((Boolean) b.e()).booleanValue()) {
            qjh.l(this.u, null, new jmw((arpe) null, this, z, 3, (byte[]) null), 3);
        }
        this.h = z;
    }

    public final void n() {
        e(!this.g);
    }

    public final void o() {
        m(!this.h);
        if (this.h) {
            wnf.b.k(0L);
        } else {
            wnf.b.m();
        }
    }

    public final boolean p() {
        if (this.l != -1) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        return ((yyt) this.c.b()).z();
    }

    public final boolean r() {
        return ((yyt) this.c.b()).A();
    }

    public final byte[] s(String str, Context context) {
        str.getClass();
        context.getClass();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(a(str, false, context)));
            try {
                byte[] b2 = amcp.b(bufferedInputStream);
                b2.getClass();
                if (b2.length == 0) {
                    alvw h = a.h();
                    h.X(alwp.a, "Bugle");
                    ((alvg) h.h("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils", "receiveFromDumpFile", 197, "DebugFileUtils.kt")).q("receiveFromDumpFile: empty data");
                }
                armd.i(bufferedInputStream, null);
                return b2;
            } finally {
            }
        } catch (IOException e) {
            alvw h2 = a.h();
            h2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) h2).g(e).h("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils", "receiveFromDumpFile", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "DebugFileUtils.kt")).q("receiveFromDumpFile:");
            return null;
        }
    }
}
