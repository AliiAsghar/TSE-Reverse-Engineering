package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbr {
    private final MessageIdType a;
    private final SuperSortLabel b;
    private final String c;
    private final svb d;
    private final sva e;
    private final String f;

    public lbr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lbr) {
            lbr lbrVar = (lbr) obj;
            if (this.a.equals(lbrVar.a) && this.b.equals(lbrVar.b) && this.c.equals(lbrVar.c) && this.d.equals(lbrVar.d) && this.e.equals(lbrVar.e) && this.f.equals(lbrVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        sva svaVar = this.e;
        svb svbVar = this.d;
        SuperSortLabel superSortLabel = this.b;
        return "SetLabelParams{messageId=" + this.a.toString() + ", label=" + superSortLabel.toString() + ", intent=" + this.c + ", source=" + svbVar.toString() + ", confidence=" + svaVar.toString() + ", modelId=" + this.f + ", triggeredByNewMessage=false}";
    }

    public lbr(MessageIdType messageIdType, SuperSortLabel superSortLabel, svb svbVar, sva svaVar) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        if (superSortLabel != null) {
            this.b = superSortLabel;
            this.c = "";
            if (svbVar != null) {
                this.d = svbVar;
                if (svaVar != null) {
                    this.e = svaVar;
                    this.f = "";
                    return;
                }
                throw new NullPointerException("Null confidence");
            }
            throw new NullPointerException("Null source");
        }
        throw new NullPointerException("Null label");
    }
}
