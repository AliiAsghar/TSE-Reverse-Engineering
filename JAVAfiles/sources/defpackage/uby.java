package defpackage;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uby implements uce {
    public final /* synthetic */ String a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ uby(uci uciVar, String str, String str2, String[] strArr, int i) {
        this.e = i;
        this.d = uciVar;
        this.c = str;
        this.a = str2;
        this.b = strArr;
    }

    @Override // defpackage.uce
    public final Object a() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                SQLiteDatabase k = ((uci) this.d).k();
                String[] strArr = this.b;
                return Integer.valueOf(k.delete((String) this.c, this.a, strArr));
            }
            SQLiteDatabase k2 = ((uci) this.d).k();
            String[] strArr2 = this.b;
            return Long.valueOf(DatabaseUtils.queryNumEntries(k2, (String) this.c, this.a, strArr2));
        }
        SQLiteDatabase k3 = ((uci) this.c).k();
        Object obj = this.d;
        return k3.rawQuery(this.a, this.b, (CancellationSignal) obj);
    }

    public /* synthetic */ uby(uci uciVar, String str, String[] strArr, CancellationSignal cancellationSignal, int i) {
        this.e = i;
        this.c = uciVar;
        this.a = str;
        this.b = strArr;
        this.d = cancellationSignal;
    }
}
