package defpackage;

import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwb implements aiuw {
    public ajur[] a;
    private final apbt b;

    public aiwb(apbt apbtVar) {
        this.b = apbtVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [aiwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [aiwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [aiwd, java.lang.Object] */
    @Override // defpackage.aiuw
    public final /* synthetic */ Object a(aogy aogyVar) {
        String str = ".mobstore_tmp-" + Process.myPid() + "-" + Thread.currentThread().getId() + "-" + System.currentTimeMillis() + "-" + aiwa.a.getAndIncrement();
        Uri uri = (Uri) aogyVar.f;
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
        List y = aogyVar.y(aogyVar.a.h(build));
        ajur[] ajurVarArr = this.a;
        if (ajurVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                ajurVarArr[i].y(y);
            }
        }
        try {
            OutputStream outputStream = (OutputStream) y.get(0);
            try {
                this.b.writeTo(outputStream);
                ajur[] ajurVarArr2 = this.a;
                if (ajurVarArr2 != null) {
                    for (int i2 = 0; i2 <= 0; i2++) {
                        ajurVarArr2[i2].z();
                    }
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                aogyVar.a.j(build, (Uri) aogyVar.f);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                aogyVar.a.i(build);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
