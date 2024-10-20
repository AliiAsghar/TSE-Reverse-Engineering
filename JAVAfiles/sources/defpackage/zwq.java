package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwq {
    public final ParticipantsTable.BindData a;
    public final tqc b;
    public final int c;

    public zwq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zwq) {
            zwq zwqVar = (zwq) obj;
            ParticipantsTable.BindData bindData = this.a;
            if (bindData != null ? bindData.equals(zwqVar.a) : zwqVar.a == null) {
                if (this.c == zwqVar.c && this.b.equals(zwqVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ParticipantsTable.BindData bindData = this.a;
        if (bindData == null) {
            hashCode = 0;
        } else {
            hashCode = bindData.hashCode();
        }
        int i = this.c;
        a.aS(i);
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        tqc tqcVar = this.b;
        return "UnblockUnspamBannerLoadedData{targetParticipant=" + String.valueOf(this.a) + ", bannerType=" + aabr.aA(this.c) + ", archiveStatus=" + tqcVar.toString() + "}";
    }

    public zwq(ParticipantsTable.BindData bindData, int i, tqc tqcVar) {
        this.a = bindData;
        this.c = i;
        if (tqcVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.b = tqcVar;
    }
}
