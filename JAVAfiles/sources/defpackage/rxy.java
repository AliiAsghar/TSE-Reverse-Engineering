package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rxy {
    public final String a;
    public final ParticipantsTable.BindData b;
    public final ParticipantsTable.BindData c;

    public rxy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rxy) {
            rxy rxyVar = (rxy) obj;
            if (this.a.equals(rxyVar.a) && this.b.equals(rxyVar.b) && this.c.equals(rxyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ParticipantsTable.BindData bindData = this.c;
        return "ParticipantInformation{foundOrCreatedParticipantId=" + this.a + ", idealParticipantBindData=" + this.b.toString() + ", existingParticipantBindData=" + bindData.toString() + "}";
    }

    public rxy(String str, ParticipantsTable.BindData bindData, ParticipantsTable.BindData bindData2) {
        if (str == null) {
            throw new NullPointerException("Null foundOrCreatedParticipantId");
        }
        this.a = str;
        if (bindData != null) {
            this.b = bindData;
            if (bindData2 != null) {
                this.c = bindData2;
                return;
            }
            throw new NullPointerException("Null existingParticipantBindData");
        }
        throw new NullPointerException("Null idealParticipantBindData");
    }
}
