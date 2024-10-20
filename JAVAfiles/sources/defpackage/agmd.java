package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agmd extends agml {
    public final String a;
    public final int b;

    public agmd(String str, int i, Object obj) {
        super(str);
        String obj2;
        this.b = i;
        if (obj == null) {
            obj2 = null;
        } else {
            obj2 = obj.toString();
        }
        this.a = obj2;
    }

    private final boolean h(StringBuilder sb, agox agoxVar) {
        int i = this.b - 1;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            sb.append('(');
            sb.append(f(agoxVar));
            sb.append(" IS NOT NULL)");
            return true;
        }
        sb.append('(');
        sb.append(f(agoxVar));
        sb.append(" IS NULL)");
        return true;
    }

    @Override // defpackage.agpy
    public final void a(agpo agpoVar, StringBuilder sb, List list) {
        if (this.a == null && h(sb, agpoVar.a())) {
            return;
        }
        sb.append('(');
        sb.append(f(agpoVar.a()));
        sb.append(' ');
        sb.append(g(this.b));
        sb.append(" ?)");
        list.add(this.a);
    }

    @Override // defpackage.agpy
    public final void b(agpo agpoVar, StringBuilder sb) {
        String str = this.a;
        agox a = agpoVar.a();
        if (str == null && h(sb, a)) {
            return;
        }
        sb.append('(');
        sb.append(f(a));
        sb.append(' ');
        sb.append(g(this.b));
        sb.append(' ');
        sb.append(DatabaseUtils.sqlEscapeString(this.a));
        sb.append(')');
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agpy
    public final boolean c(String str, ContentValues contentValues) {
        String str2;
        String str3 = this.e;
        String asString = contentValues.getAsString(this.f);
        if (!TextUtils.equals(str, str3)) {
            return false;
        }
        int i = this.b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                switch (i) {
                    case 1:
                        str2 = "EQUALS";
                        break;
                    case 2:
                        str2 = "NOT_EQUALS";
                        break;
                    case 3:
                        str2 = "IN";
                        break;
                    case 4:
                        str2 = "NOT_IN";
                        break;
                    case 5:
                        str2 = "IS_NULL";
                        break;
                    case 6:
                        str2 = "IS_NOT_NULL";
                        break;
                    case 7:
                        str2 = "IS_GREATER_THAN";
                        break;
                    case 8:
                        str2 = "IS_LESS_THAN";
                        break;
                    case 9:
                        str2 = "IS_GREATER_THAN_OR_EQUAL_TO";
                        break;
                    case 10:
                        str2 = "IS_LESS_THAN_OR_EQUAL_TO";
                        break;
                    default:
                        str2 = "LIKE";
                        break;
                }
                throw new IllegalStateException("doesn't handle ".concat(str2));
            }
            if (asString == null) {
                return true;
            }
            return TextUtils.equals(asString, this.a);
        }
        if (asString != null && TextUtils.equals(asString, this.a)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agpy
    public final boolean d(agxw agxwVar, agpy agpyVar) {
        if (!(agpyVar instanceof agmd) || this.a == null) {
            return false;
        }
        agmd agmdVar = (agmd) agpyVar;
        if (!agxwVar.b(this.d).equals(agmdVar.d)) {
            return false;
        }
        boolean equals = TextUtils.equals(this.a, agmdVar.a);
        int i = this.b - 1;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            int i2 = agmdVar.b;
            if (i2 == 1) {
                if (!equals) {
                    equals = false;
                }
            }
            if (i2 != 2 || equals) {
                return false;
            }
        } else {
            int i3 = agmdVar.b;
            if (i3 == 1) {
                if (equals) {
                    equals = true;
                }
            }
            if (i3 != 2 || !equals) {
                return false;
            }
        }
        return true;
    }
}
