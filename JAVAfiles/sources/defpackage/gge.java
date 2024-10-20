package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gge {
    public final AssetManager a;
    public final ggj b;
    public final byte[] c;
    public final File d;
    public final String e;
    public ggf[] i;
    public byte[] j;
    private final Executor k;
    public boolean h = false;
    public final String f = "dexopt/baseline.prof";
    public final String g = "dexopt/baseline.profm";

    public gge(AssetManager assetManager, Executor executor, ggj ggjVar, String str, File file) {
        byte[] bArr;
        this.a = assetManager;
        this.k = executor;
        this.b = ggjVar;
        this.e = str;
        this.d = file;
        if (Build.VERSION.SDK_INT >= 31) {
            bArr = ggo.a;
        } else {
            switch (Build.VERSION.SDK_INT) {
                case 26:
                    bArr = ggo.d;
                    break;
                case 27:
                    bArr = ggo.c;
                    break;
                case 28:
                case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                case 30:
                    bArr = ggo.b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.c = bArr;
    }

    public final InputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.b();
            return null;
        }
    }

    public final void b() {
        if (this.h) {
        } else {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public final void c(int i, Object obj) {
        this.k.execute(new qq(this, i, obj, 7, (byte[]) null));
    }
}
