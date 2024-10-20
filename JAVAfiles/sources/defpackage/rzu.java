package defpackage;

import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rzu implements agns {
    public final /* synthetic */ OnDeviceDatabaseUpgradeHandler a;
    private final alog b;
    private final boolean c;
    private int d;

    public rzu(OnDeviceDatabaseUpgradeHandler onDeviceDatabaseUpgradeHandler, boolean z, List list) {
        this.a = onDeviceDatabaseUpgradeHandler;
        this.c = z;
        alob alobVar = new alob();
        if (list != null) {
            alobVar.j(list);
        }
        this.b = alobVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agns
    public final int a() {
        int versionForMethod;
        alog alogVar = this.b;
        int i = ((alsx) alogVar).c;
        int i2 = this.d;
        if (i2 < i) {
            versionForMethod = OnDeviceDatabaseUpgradeHandler.versionForMethod((Method) alogVar.get(i2));
            return versionForMethod;
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.agns
    public final int b() {
        if (this.c) {
            return 3;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agns
    public final agnr c(agnw agnwVar) {
        Annotation annotationOrThrow;
        Method method = (Method) this.b.get(this.d);
        this.d++;
        rvz rvzVar = new rvz((Object) this, (Object) method, (Object) agnwVar, 7, (short[]) null);
        annotationOrThrow = OnDeviceDatabaseUpgradeHandler.getAnnotationOrThrow(method, rzo.class);
        return new rzt(rvzVar, ((rzo) annotationOrThrow).b());
    }

    @Override // defpackage.agns
    public final String d() {
        return "?";
    }

    @Override // defpackage.agns
    public final boolean e() {
        if (this.d < ((alsx) this.b).c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agns
    public final boolean f() {
        if (!this.c) {
            return true;
        }
        return false;
    }
}
