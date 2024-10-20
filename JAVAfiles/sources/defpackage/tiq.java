package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tiq extends aglz implements agma {
    public long a;
    public long b;
    public lwq c;
    public tja d;
    public tiz e;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowFilesTable [_id: %s,\n  workflow_execution_id: %s,\n  backup_file: %s,\n  file_type: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.q(contentValues, "workflow_execution_id", this.b);
        lwq lwqVar = this.c;
        if (lwqVar == null) {
            contentValues.putNull("backup_file");
        } else {
            contentValues.put("backup_file", lwqVar.toByteArray());
        }
        tja tjaVar = this.d;
        if (tjaVar == null) {
            contentValues.putNull("file_type");
        } else {
            contentValues.put("file_type", Integer.valueOf(tjaVar.ordinal()));
        }
        tiz tizVar = this.e;
        if (tizVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(tizVar.ordinal()));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tis tisVar = (tis) agmqVar;
        aq();
        this.cJ = tisVar.dx();
        if (tisVar.db(0)) {
            this.a = tisVar.c();
            fE(0);
        }
        if (tisVar.db(1)) {
            this.b = tisVar.e();
            fE(1);
        }
        if (tisVar.db(2)) {
            this.c = tisVar.f();
            fE(2);
        }
        if (tisVar.db(3)) {
            this.d = tisVar.h();
            fE(3);
        }
        if (tisVar.db(4)) {
            this.e = tisVar.g();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tiq)) {
            return false;
        }
        tiq tiqVar = (tiq) obj;
        if (super.aC(tiqVar.cJ) && this.a == tiqVar.a && this.b == tiqVar.b && Objects.equals(this.c, tiqVar.c) && this.d == tiqVar.d && this.e == tiqVar.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_files", agnc.j(new String[]{"workflow_execution_id", "backup_file", "file_type", "status"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final long h() {
        ao(0, "_id");
        return this.a;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        int ordinal2;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        Long valueOf = Long.valueOf(this.a);
        Long valueOf2 = Long.valueOf(this.b);
        lwq lwqVar = this.c;
        tja tjaVar = this.d;
        if (tjaVar == null) {
            ordinal = 0;
        } else {
            ordinal = tjaVar.ordinal();
        }
        Integer valueOf3 = Integer.valueOf(ordinal);
        tiz tizVar = this.e;
        if (tizVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = tizVar.ordinal();
        }
        return Objects.hash(adayVar, valueOf, valueOf2, lwqVar, valueOf3, Integer.valueOf(ordinal2), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "restore_workflow_files";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        byte[] byteArray;
        Object valueOf;
        Object valueOf2;
        Long valueOf3 = Long.valueOf(this.b);
        lwq lwqVar = this.c;
        if (lwqVar == null) {
            byteArray = null;
        } else {
            byteArray = lwqVar.toByteArray();
        }
        tja tjaVar = this.d;
        if (tjaVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tjaVar.ordinal());
        }
        tiz tizVar = this.e;
        if (tizVar == null) {
            valueOf2 = 0;
        } else {
            valueOf2 = String.valueOf(tizVar.ordinal());
        }
        Object[] objArr = {valueOf3, byteArray, valueOf, valueOf2};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj);
                sb.append('?');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final lwq k() {
        ao(2, "backup_file");
        return this.c;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "RestoreWorkflowFilesTable -- REDACTED");
        }
        return a();
    }
}
