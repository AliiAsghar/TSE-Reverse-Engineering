package defpackage;

import android.content.ContentValues;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agpy {
    /* JADX INFO: Access modifiers changed from: protected */
    public static final String g(int i) {
        switch (i - 1) {
            case 0:
                return "=";
            case 1:
                return "<>";
            case 2:
                return "IN";
            case 3:
                return "NOT IN";
            case 4:
                return "ISNULL";
            case 5:
                return "NOTNULL";
            case 6:
                return ">";
            case 7:
                return "<";
            case 8:
                return ">=";
            case 9:
                return "<=";
            default:
                return "LIKE";
        }
    }

    public abstract void a(agpo agpoVar, StringBuilder sb, List list);

    public abstract void b(agpo agpoVar, StringBuilder sb);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(String str, ContentValues contentValues) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d(agxw agxwVar, agpy agpyVar) {
        return false;
    }

    public abstract void e(adwp adwpVar);
}
