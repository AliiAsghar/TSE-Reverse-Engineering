package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igh extends igi {
    private final ParticipantsTable.BindData a;

    public igh(ParticipantsTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // defpackage.ihd
    public final int b() {
        return 1;
    }

    @Override // defpackage.igi, defpackage.ihd
    public final ParticipantsTable.BindData c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ihd) {
            ihd ihdVar = (ihd) obj;
            if (ihdVar.b() == 1 && this.a.equals(ihdVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DialogTarget{participant=" + this.a.toString() + "}";
    }
}
