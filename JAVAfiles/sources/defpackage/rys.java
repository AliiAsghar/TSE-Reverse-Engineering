package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class rys {
    public final Context a;
    public final armf b;
    private final yjr c;
    private final yjy d;
    private final xbf e;
    private final armf f;
    private final armf g;
    private final xwr h;

    public rys(Context context, yjr yjrVar, yjy yjyVar, xbf xbfVar, armf armfVar, armf armfVar2, armf armfVar3, xwr xwrVar) {
        this.a = context;
        this.c = yjrVar;
        this.d = yjyVar;
        this.e = xbfVar;
        this.b = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = xwrVar;
    }

    public final void a() {
        d(R.string.conversation_deletion_failed);
    }

    public final void b(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, MessageCoreData messageCoreData) {
        String n;
        String ag;
        int j;
        if (xwr.h(this.a) && ((ubl) this.b.b()).c(conversationIdType)) {
            Resources resources = this.a.getResources();
            if (bindData == null) {
                n = resources.getString(R.string.unknown_sender);
            } else {
                n = ((iew) this.g.b()).n(bindData, false);
            }
            String str = "";
            if (messageCoreData == null) {
                ag = "";
            } else {
                ag = albo.ag(messageCoreData.ap());
            }
            if (messageCoreData != null) {
                str = albo.ag(messageCoreData.am());
            }
            if (messageCoreData == null) {
                j = 100;
            } else {
                j = messageCoreData.j();
            }
            if (d.z(j)) {
                e(str);
                return;
            }
            boolean bZ = messageCoreData.bZ();
            xwr xwrVar = this.h;
            xwp a = xwq.a();
            a.d(resources);
            a.e(j);
            a.c(false);
            a.g(false);
            a.a = n;
            a.b(bZ ? 1 : 0);
            a.c = ag;
            a.d = str;
            e(xwrVar.c(a.a()));
        }
    }

    public final void c(ConversationIdType conversationIdType, boolean z, int i, int i2, int i3, boolean z2) {
        int i4;
        int i5;
        if (!z) {
            if (i == 3) {
                if (d.A(i2)) {
                    if (z2) {
                        if (!this.e.a(i3).r()) {
                            d(R.string.mms_failure_outgoing_disabled);
                            return;
                        } else if (((vag) this.f.b()).b()) {
                            z2 = true;
                        } else {
                            d(R.string.toast_mms_failure_outgoing_disabled_by_device_admin);
                            return;
                        }
                    } else {
                        z2 = false;
                    }
                }
            } else if (i == 2) {
                if (this.c.w()) {
                    if (z2) {
                        d(R.string.send_message_failure_airplane_mode);
                        return;
                    } else {
                        d(R.string.download_message_failure_airplane_mode);
                        return;
                    }
                }
                if (!this.d.q()) {
                    if (z2) {
                        d(R.string.send_message_failure_no_sim);
                        return;
                    } else {
                        d(R.string.download_message_failure_no_sim);
                        return;
                    }
                }
                if (d.A(i2) && !this.d.i().E()) {
                    if (z2) {
                        d(R.string.send_message_failure_no_data);
                        return;
                    } else {
                        d(R.string.download_message_failure_no_data);
                        return;
                    }
                }
            }
        }
        if (xwr.h(this.a)) {
            if (((ubl) this.b.b()).c(conversationIdType) && z) {
                if (true != z2) {
                    i5 = R.string.download_message_success;
                } else {
                    i5 = R.string.send_message_success;
                }
                d(i5);
                return;
            }
            if (((ubl) this.b.b()).c(conversationIdType) && !z) {
                if (true != z2) {
                    i4 = R.string.download_message_failure;
                } else {
                    i4 = R.string.send_message_failure;
                }
                d(i4);
            }
        }
    }

    public final void d(int i) {
        aiut.a().post(new ebm(this, i, 8));
    }

    public final void e(String str) {
        aiut.a().post(new ryv(this, str, 1));
    }
}
