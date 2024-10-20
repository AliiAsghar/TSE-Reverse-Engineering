package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjr extends agoz {
    public sjr(agpf agpfVar) {
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
        return new sjp(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this);
    }

    public final alog f() {
        sjp sjpVar = (sjp) m((agmh) sjv.d.e);
        try {
            alob alobVar = new alob();
            while (sjpVar.moveToNext()) {
                sjpVar.i();
                alobVar.h(sjpVar.i());
            }
            alog g = alobVar.g();
            sjpVar.close();
            return g;
        } catch (Throwable th) {
            try {
                sjpVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
