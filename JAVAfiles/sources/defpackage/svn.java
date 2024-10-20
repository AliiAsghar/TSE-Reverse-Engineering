package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class svn extends agoz {
    public svn(agpf agpfVar) {
        super(agpfVar);
    }

    @Override // defpackage.agoz
    protected final Map a() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final boolean b() {
        return false;
    }

    @Override // defpackage.agoz
    protected final String[] c() {
        return d.aN();
    }

    @Override // defpackage.agoz
    protected final String[] d() {
        return d.aN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agoz
    public final /* synthetic */ agmq e(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar) {
        return new svl(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this);
    }

    public final alog f() {
        svl svlVar = (svl) m((agmh) svq.d.c);
        try {
            alob alobVar = new alob();
            while (svlVar.moveToNext()) {
                svlVar.e();
                alobVar.h(svlVar.e());
            }
            alog g = alobVar.g();
            svlVar.close();
            return g;
        } catch (Throwable th) {
            try {
                svlVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
