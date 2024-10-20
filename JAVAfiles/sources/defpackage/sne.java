package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sne extends agoz<sna, sne, snf, smr, smv> {
    public sne(agpf agpfVar) {
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
        return new sna(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this);
    }

    public final alog f() {
        sna snaVar = (sna) m(sni.c.a);
        try {
            alob alobVar = new alob();
            while (snaVar.moveToNext()) {
                snaVar.C();
                alobVar.h(snaVar.C());
            }
            alog g = alobVar.g();
            snaVar.close();
            return g;
        } catch (Throwable th) {
            try {
                snaVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
