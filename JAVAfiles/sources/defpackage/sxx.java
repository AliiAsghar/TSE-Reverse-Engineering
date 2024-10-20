package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sxx extends agoz<sxt, sxx, sxy, MessagesTable.BindData, sxp> {
    public sxx(agpf agpfVar) {
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
        return new sxt(agnwVar, cursor, strArr, agpjVarArr, agoxVar, akkwVar, this);
    }

    public final alog f() {
        sxt sxtVar = (sxt) m(MessagesTable.c.b);
        try {
            alob alobVar = new alob();
            while (sxtVar.moveToNext()) {
                sxtVar.C();
                alobVar.h(sxtVar.C());
            }
            alog g = alobVar.g();
            sxtVar.close();
            return g;
        } catch (Throwable th) {
            try {
                sxtVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog g() {
        sxt sxtVar = (sxt) m(MessagesTable.c.a);
        try {
            alog P = sxtVar.P();
            sxtVar.close();
            return P;
        } catch (Throwable th) {
            try {
                sxtVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog h() {
        sxt sxtVar = (sxt) m(MessagesTable.c.C);
        try {
            alob alobVar = new alob();
            while (sxtVar.moveToNext()) {
                sxtVar.H();
                alobVar.h(sxtVar.H());
            }
            alog g = alobVar.g();
            sxtVar.close();
            return g;
        } catch (Throwable th) {
            try {
                sxtVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
