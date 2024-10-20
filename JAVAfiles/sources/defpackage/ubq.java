package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ubq implements uce {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ubq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.uce
    public final Object a() {
        ucg ucgVar;
        uch uchVar;
        switch (this.b) {
            case 0:
                alvi alviVar = uci.a;
                return Boolean.valueOf(((agmp) this.a).dd());
            case 1:
                return Integer.valueOf(((SQLiteStatement) this.a).executeUpdateDelete());
            case 2:
                alvi alviVar2 = uci.a;
                return Boolean.valueOf(((agmp) this.a).df());
            case 3:
                return ((uci) this.a).v(false);
            case 4:
                alvi alviVar3 = uci.a;
                return Boolean.valueOf(((agmp) this.a).dh());
            case 5:
                alvi alviVar4 = uci.a;
                return Boolean.valueOf(((agmp) this.a).de());
            case 6:
                alvi alviVar5 = uci.a;
                this.a.run();
                return "";
            case 7:
                alvi alviVar6 = uci.a;
                return Integer.valueOf(((SQLiteStatement) this.a).executeUpdateDelete());
            case 8:
                return ((uci) this.a).v(true);
            case 9:
                alvi alviVar7 = uci.a;
                return Integer.valueOf(((agmp) this.a).cJ());
            default:
                uci uciVar = (uci) this.a;
                if (uciVar.h.getHoldCount() == 1 && (uchVar = (ucgVar = uciVar.i).a) != null) {
                    ucgVar.a = null;
                    ucgVar.a(uchVar.b, false);
                }
                uciVar.h.unlock();
                return null;
        }
    }
}
