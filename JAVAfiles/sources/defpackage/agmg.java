package defpackage;

import android.content.ContentValues;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agmg extends agml {
    private final int a;

    public agmg(String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // defpackage.agpy
    public final void a(agpo agpoVar, StringBuilder sb, List list) {
        b(agpoVar, sb);
    }

    @Override // defpackage.agpy
    public final void b(agpo agpoVar, StringBuilder sb) {
        sb.append('(');
        sb.append(f(agpoVar.a()));
        sb.append(' ');
        sb.append(g(this.a));
        sb.append(')');
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agpy
    public final boolean c(String str, ContentValues contentValues) {
        if (this.a - 1 != 4) {
            if (contentValues.get(this.f) == null) {
                return true;
            }
            return false;
        }
        if (contentValues.get(this.f) != null) {
            return true;
        }
        return false;
    }
}
