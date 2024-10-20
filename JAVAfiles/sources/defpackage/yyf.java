package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyf {
    public final tqc a;
    public final boolean b;
    private final ParticipantsTable.BindData c;

    public yyf(ParticipantsTable.BindData bindData, tqc tqcVar) {
        this.c = bindData;
        this.a = tqcVar;
        boolean z = false;
        if (bindData != null && yyb.G(bindData.m()).b()) {
            z = true;
        }
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyf)) {
            return false;
        }
        yyf yyfVar = (yyf) obj;
        if (d.F(this.c, yyfVar.c) && this.a == yyfVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ParticipantsTable.BindData bindData = this.c;
        int i = 0;
        if (bindData == null) {
            hashCode = 0;
        } else {
            hashCode = bindData.hashCode();
        }
        tqc tqcVar = this.a;
        if (tqcVar != null) {
            i = tqcVar.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "ParticipantAndArchiveStatus(participant=" + this.c + ", archiveStatus=" + this.a + ")";
    }
}
