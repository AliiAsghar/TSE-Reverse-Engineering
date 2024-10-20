package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.system.Os;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akiz implements akkj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akiz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.akkj
    public final ListenableFuture a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.a;
                try {
                    PackageInfo packageInfo = ((Context) obj).getPackageManager().getPackageInfo(((Context) obj).getPackageName(), 0);
                    if (packageInfo.applicationInfo.targetSdkVersion < 24) {
                        try {
                            Os.chmod(packageInfo.applicationInfo.dataDir, 448);
                        } catch (Exception e) {
                            throw new IOException(e);
                        }
                    }
                } catch (PackageManager.NameNotFoundException | IOException unused) {
                }
                return aneh.a;
            }
            akat.c(((ajzg) this.a).a(), "Failed account invalidation.", new Object[0]);
            return aneh.a;
        }
        akat.c(((akyr) this.a).j(true), "Failed to obtain initial snapshot", new Object[0]);
        return aneh.a;
    }
}
