package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihg {
    public final ihe a;
    public final Runnable b;
    public final ConversationIdType c;
    public final ParticipantsTable.BindData d;
    public final ihc e;
    public final ihd f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public ihg() {
        throw null;
    }

    public static ihb a() {
        ihb ihbVar = new ihb();
        ihbVar.a = new eyg(2);
        ihbVar.b(0);
        return ihbVar;
    }

    public final boolean equals(Object obj) {
        ParticipantsTable.BindData bindData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ihg) {
            ihg ihgVar = (ihg) obj;
            if (this.a.equals(ihgVar.a)) {
                int i = this.h;
                int i2 = ihgVar.h;
                if (i != 0) {
                    if (i == i2 && this.b.equals(ihgVar.b) && this.c.equals(ihgVar.c) && ((bindData = this.d) != null ? bindData.equals(ihgVar.d) : ihgVar.d == null)) {
                        int i3 = this.i;
                        int i4 = ihgVar.i;
                        if (i3 != 0) {
                            if (i3 == i4) {
                                int i5 = this.j;
                                int i6 = ihgVar.j;
                                if (i5 != 0) {
                                    if (i5 == i6 && this.e.equals(ihgVar.e) && this.f.equals(ihgVar.f) && this.g == ihgVar.g) {
                                        return true;
                                    }
                                } else {
                                    throw null;
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        int i = this.h;
        a.aS(i);
        int hashCode3 = (((((hashCode2 * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        ParticipantsTable.BindData bindData = this.d;
        if (bindData == null) {
            hashCode = 0;
        } else {
            hashCode = bindData.hashCode();
        }
        int i2 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        int i3 = this.i;
        a.bm(i3);
        int i4 = (i2 ^ i3) * 1000003;
        int i5 = this.j;
        a.bm(i5);
        return ((((((i4 ^ i5) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g;
    }

    public final String toString() {
        String str;
        String str2;
        int i = this.h;
        String valueOf = String.valueOf(this.a);
        String str3 = "null";
        if (i != 1) {
            if (i != 2) {
                str = "null";
            } else {
                str = "EXIT_TO_HOME";
            }
        } else {
            str = "SHOW_UNDO_UX";
        }
        Runnable runnable = this.b;
        ConversationIdType conversationIdType = this.c;
        ParticipantsTable.BindData bindData = this.d;
        int i2 = this.i;
        int i3 = this.j;
        ihc ihcVar = this.e;
        ihd ihdVar = this.f;
        int i4 = this.g;
        String valueOf2 = String.valueOf(runnable);
        String valueOf3 = String.valueOf(conversationIdType);
        String valueOf4 = String.valueOf(bindData);
        if (i2 == 0) {
            str2 = "null";
        } else {
            str2 = aktp.au(i2);
        }
        if (i3 != 0) {
            str3 = aktp.av(i3);
        }
        return "DialogRequest{dialogType=" + valueOf + ", dialogDoneBehavior=" + str + ", onPositiveAction=" + valueOf2 + ", conversationId=" + valueOf3 + ", targetParticipant=" + valueOf4 + ", scope=" + str2 + ", entryPoint=" + str3 + ", dialogLoggingSource=" + String.valueOf(ihcVar) + ", dialogTarget=" + String.valueOf(ihdVar) + ", anchorViewId=" + i4 + "}";
    }

    public ihg(ihe iheVar, int i, Runnable runnable, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, int i2, int i3, ihc ihcVar, ihd ihdVar, int i4) {
        this.a = iheVar;
        this.h = i;
        this.b = runnable;
        this.c = conversationIdType;
        this.d = bindData;
        this.i = i2;
        this.j = i3;
        this.e = ihcVar;
        this.f = ihdVar;
        this.g = i4;
    }
}
