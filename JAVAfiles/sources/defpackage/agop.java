package defpackage;

import android.content.ContentValues;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agop extends agpy {
    private final agpw[] a;

    public agop(agpx... agpxVarArr) {
        int length = agpxVarArr.length;
        this.a = new agpw[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            this.a[i2] = agpxVarArr[i].a();
            i++;
            i2++;
        }
    }

    @Override // defpackage.agpy
    public final void a(agpo agpoVar, StringBuilder sb, List list) {
        sb.append("(");
        sb.append((String) DesugarArrays.stream(this.a).map(new agpp(agpoVar, list, 1, null)).collect(Collectors.joining(" OR ")));
        sb.append(")");
    }

    @Override // defpackage.agpy
    public final void b(agpo agpoVar, StringBuilder sb) {
        sb.append("(");
        sb.append((String) DesugarArrays.stream(this.a).map(new admk(agpoVar, 20)).collect(Collectors.joining(" OR ")));
        sb.append(")");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agpy
    public final boolean c(String str, ContentValues contentValues) {
        int i = 0;
        while (true) {
            agpw[] agpwVarArr = this.a;
            if (i < agpwVarArr.length) {
                if (!agpwVarArr[i].c(str, contentValues)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agpy
    public final boolean d(agxw agxwVar, agpy agpyVar) {
        int i = 0;
        while (true) {
            agpw[] agpwVarArr = this.a;
            if (i < agpwVarArr.length) {
                if (!agpwVarArr[i].e(agxwVar, agpyVar)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // defpackage.agpy
    public final void e(adwp adwpVar) {
        int i = 0;
        while (true) {
            agpw[] agpwVarArr = this.a;
            if (i < agpwVarArr.length) {
                agpwVarArr[i].f(adwpVar);
                i++;
            } else {
                return;
            }
        }
    }
}
