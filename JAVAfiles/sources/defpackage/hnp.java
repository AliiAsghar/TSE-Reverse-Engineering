package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hnp implements hns {
    private final String a;
    private final AssetManager b;
    private Object c;

    public hnp(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    protected abstract Object b(AssetManager assetManager, String str);

    @Override // defpackage.hns
    public final void d() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            e(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void e(Object obj);

    @Override // defpackage.hns
    public final void f(hlh hlhVar, hnr hnrVar) {
        try {
            Object b = b(this.b, this.a);
            this.c = b;
            hnrVar.b(b);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            hnrVar.e(e);
        }
    }

    @Override // defpackage.hns
    public final int g() {
        return 1;
    }

    @Override // defpackage.hns
    public final void eX() {
    }
}
