package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vop implements ndn {
    public static final String a = new String();
    public final voq b;
    public final vor c;
    private final String d;
    private final ResolvedRecipient e;
    private final ProfilesTable.BindData f;
    private final anen g;
    private final boolean h;
    private final Optional i;
    private final arwe j;
    private final armf k;
    private final armf l;

    public vop(voq voqVar, vor vorVar, String str, ResolvedRecipient resolvedRecipient, ProfilesTable.BindData bindData, anen anenVar, boolean z, Optional optional, arwe arweVar, armf armfVar, armf armfVar2) {
        this.b = voqVar;
        this.c = vorVar;
        this.d = str;
        this.e = resolvedRecipient;
        this.f = bindData;
        this.g = anenVar;
        this.h = z;
        this.i = optional;
        this.j = arweVar;
        this.k = armfVar;
        this.l = armfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vop)) {
            return false;
        }
        vop vopVar = (vop) obj;
        if (d.F(this.b, vopVar.b) && d.F(this.c, vopVar.c) && d.F(this.d, vopVar.d) && d.F(this.e, vopVar.e) && d.F(this.f, vopVar.f) && d.F(this.g, vopVar.g) && this.h == vopVar.h && d.F(this.i, vopVar.i) && d.F(this.j, vopVar.j) && d.F(this.k, vopVar.k) && d.F(this.l, vopVar.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() * 31) + this.c.hashCode();
        String str = this.d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = ((((hashCode2 * 31) + hashCode) * 31) + this.e.hashCode()) * 31;
        ProfilesTable.BindData bindData = this.f;
        if (bindData != null) {
            i = bindData.hashCode();
        }
        return ((((((((((((hashCode3 + i) * 31) + this.g.hashCode()) * 31) + a.v(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    public final String toString() {
        return "DefaultPeopleProfileV2(name=" + this.b + ", photo=" + this.c + ", personId=" + this.d + ", resolvedRecipient=" + this.e + ", profileBindData=" + this.f + ", lightweightExecutor=" + this.g + ", enableLastUpdatedProfileOptimization=" + this.h + ", recipientsProfileCache=" + this.i + ", lightweightScope=" + this.j + ", forceRefreshProfileIntervalHours=" + this.k + ", shouldOnlyUseConversationRefresh=" + this.l + ")";
    }
}
