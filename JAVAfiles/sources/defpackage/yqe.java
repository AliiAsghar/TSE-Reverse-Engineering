package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yqe {
    public final you a;
    public final ypi b;
    public final amzf c;
    public final Integer d;
    public final MessageIdType e;
    public final ConversationIdType f;
    public final int g;
    public final boolean h;
    public final String i;
    public final amzp j;
    public final ypk k;
    public final String l;
    private final ype m;

    public yqe(you youVar, ype ypeVar, ypi ypiVar, amzf amzfVar, Integer num) {
        youVar.getClass();
        ypeVar.getClass();
        ypiVar.getClass();
        amzfVar.getClass();
        this.a = youVar;
        this.m = ypeVar;
        this.b = ypiVar;
        this.c = amzfVar;
        this.d = num;
        if (ypiVar == ypi.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (amzfVar != amzf.UNKNOWN_DETECTION_TRIGGER_TYPE) {
            if (amzfVar == amzf.RECLASSIFICATION) {
                if (num == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else if (num != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.e = youVar.f;
            this.f = youVar.g;
            this.g = youVar.i;
            this.h = youVar.j;
            this.i = youVar.k;
            this.j = ypeVar.a;
            this.k = ypeVar.b;
            this.l = ypeVar.c;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqe)) {
            return false;
        }
        yqe yqeVar = (yqe) obj;
        if (d.F(this.a, yqeVar.a) && d.F(this.m, yqeVar.m) && this.b == yqeVar.b && this.c == yqeVar.c && d.F(this.d, yqeVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.a.hashCode() * 31) + this.m.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "VerdictEnforcementParams(incomingParams=" + this.a + ", checkResult=" + this.m + ", classificationSource=" + this.b + ", trigger=" + this.c + ", reclassificationIndex=" + this.d + ")";
    }

    public /* synthetic */ yqe(you youVar, ype ypeVar, ypi ypiVar, amzf amzfVar) {
        this(youVar, ypeVar, ypiVar, amzfVar, null);
    }
}
