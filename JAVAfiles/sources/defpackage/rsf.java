package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rsf {
    public final smr a;
    public final rsa b;
    public final ParticipantsTable.BindData c;
    public final boolean d;
    public final tqc e;
    public final Optional f;
    private final Optional g;
    private final ParticipantsTable.BindData h;

    public rsf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        ParticipantsTable.BindData bindData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rsf) {
            rsf rsfVar = (rsf) obj;
            if (this.a.equals(rsfVar.a) && this.b.equals(rsfVar.b) && this.g.equals(rsfVar.g) && this.h.equals(rsfVar.h) && ((bindData = this.c) != null ? bindData.equals(rsfVar.c) : rsfVar.c == null) && this.d == rsfVar.d && this.e.equals(rsfVar.e) && this.f.equals(rsfVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
        ParticipantsTable.BindData bindData = this.c;
        if (bindData == null) {
            hashCode = 0;
        } else {
            hashCode = bindData.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((i2 ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        tqc tqcVar = this.e;
        ParticipantsTable.BindData bindData = this.c;
        ParticipantsTable.BindData bindData2 = this.h;
        Optional optional2 = this.g;
        rsa rsaVar = this.b;
        return "OptionsListData{conversationBindData=" + this.a.toString() + ", conversationParticipantData=" + rsaVar.toString() + ", e2eeInfoResult=" + optional2.toString() + ", firstSender=" + bindData2.toString() + ", reportableParticipant=" + String.valueOf(bindData) + ", etouffeeCapable=" + this.d + ", archiveStatus=" + tqcVar.toString() + ", ringtoneTitle=" + optional.toString() + "}";
    }

    public rsf(smr smrVar, rsa rsaVar, Optional optional, ParticipantsTable.BindData bindData, ParticipantsTable.BindData bindData2, boolean z, tqc tqcVar, Optional optional2) {
        if (smrVar == null) {
            throw new NullPointerException("Null conversationBindData");
        }
        this.a = smrVar;
        if (rsaVar != null) {
            this.b = rsaVar;
            if (optional != null) {
                this.g = optional;
                if (bindData != null) {
                    this.h = bindData;
                    this.c = bindData2;
                    this.d = z;
                    if (tqcVar != null) {
                        this.e = tqcVar;
                        if (optional2 != null) {
                            this.f = optional2;
                            return;
                        }
                        throw new NullPointerException("Null ringtoneTitle");
                    }
                    throw new NullPointerException("Null archiveStatus");
                }
                throw new NullPointerException("Null firstSender");
            }
            throw new NullPointerException("Null e2eeInfoResult");
        }
        throw new NullPointerException("Null conversationParticipantData");
    }
}
