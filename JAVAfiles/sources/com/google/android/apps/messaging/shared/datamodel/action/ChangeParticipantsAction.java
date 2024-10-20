package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ChangeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.amku;
import defpackage.armf;
import defpackage.ltv;
import defpackage.mho;
import defpackage.qyu;
import defpackage.rtz;
import defpackage.rxn;
import defpackage.ryg;
import defpackage.tap;
import defpackage.uhg;
import defpackage.ujv;
import defpackage.vsh;
import defpackage.vsi;
import defpackage.vsj;
import defpackage.xnv;
import defpackage.xze;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChangeParticipantsAction extends Action<Void> implements Parcelable {
    public final armf b;
    public final armf c;
    public final uhg d;
    public final ujv e;
    public final ryg f;
    public final mho g;
    public final armf h;
    private final xnv i;
    private final agnq j;
    private final vsh k;
    public static final xze a = xze.g("BugleAction", "ChangeParticipantsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ltv(19);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qyu Nb();
    }

    public ChangeParticipantsAction(armf armfVar, armf armfVar2, uhg uhgVar, ujv ujvVar, ryg rygVar, xnv xnvVar, mho mhoVar, agnq agnqVar, vsh vshVar, armf armfVar3, Bundle bundle) {
        super(bundle, amdy.CHANGE_PARTICIPANTS_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.d = uhgVar;
        this.e = ujvVar;
        this.f = rygVar;
        this.i = xnvVar;
        this.g = mhoVar;
        this.j = agnqVar;
        this.k = vshVar;
        this.h = armfVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ChangeParticipantsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        akrh akrhVar;
        Throwable th;
        final String str;
        int i;
        final int i2;
        akrh e = aktp.e("ChangeParticipantsAction.executeAction");
        try {
            String l = this.u.l(RcsIntents.EXTRA_USER_ID);
            final long e2 = this.u.e("rcs.intent.extra.sessionid", -1L);
            String l2 = this.u.l(RcsIntents.EXTRA_REFERRER);
            if (l2 == null) {
                str = l;
            } else {
                str = l2;
            }
            final int b = this.u.b(RcsIntents.EXTRA_EVENT, -1);
            GroupInfo groupInfo = (GroupInfo) this.u.h(RcsIntents.EXTRA_GROUP_INFO);
            vsi a2 = vsj.a();
            a2.b(false);
            a2.g(false);
            a2.h(true);
            a2.n(amku.GROUP_NOTIFICATION_VANILLA_RCS);
            a2.p(e2);
            if (groupInfo != null) {
                try {
                    a2.l(groupInfo);
                } catch (Throwable th2) {
                    th = th2;
                    akrhVar = e;
                    try {
                        akrhVar.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th;
                    }
                }
            }
            final ConversationIdType a3 = this.k.a(a2.a());
            if (a3.b()) {
                a.q("No conversation found for incoming participant change.");
                akrhVar = e;
            } else {
                final int d = ((rtz) this.c.b()).d(a3);
                final tap g = rxn.g(l);
                switch (b) {
                    case 50020:
                        i = BasePaymentResult.ERROR_REQUEST_FAILED;
                        i2 = i;
                        break;
                    case 50021:
                        i = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
                        i2 = i;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                final long epochMilli = this.i.f().toEpochMilli();
                akrhVar = e;
                try {
                    this.j.e("ChangeParticipantsAction#executeAction", new Runnable() { // from class: qyt
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean ak;
                            int i3;
                            String str2 = str;
                            ChangeParticipantsAction changeParticipantsAction = ChangeParticipantsAction.this;
                            qwm d2 = changeParticipantsAction.f.d();
                            tap g2 = rxn.g(str2);
                            g2.v(((rxq) changeParticipantsAction.b.b()).h(g2));
                            changeParticipantsAction.d.g(g2, 2);
                            uhg uhgVar = changeParticipantsAction.d;
                            tap tapVar = g;
                            uhgVar.g(tapVar, 2);
                            int i4 = b;
                            ParticipantsTable.BindData a4 = tapVar.a();
                            ConversationIdType conversationIdType = a3;
                            if (i4 == 50021) {
                                ak = ((rtz) changeParticipantsAction.c.b()).ag(a4, conversationIdType, true);
                                if (ak) {
                                    xyo c = ChangeParticipantsAction.a.c();
                                    c.i(((iew) changeParticipantsAction.h.b()).n(a4, true));
                                    c.H("left");
                                    c.b(conversationIdType);
                                    c.q();
                                } else {
                                    xyo b2 = ChangeParticipantsAction.a.b();
                                    b2.H("Failed to remove");
                                    b2.i(((iew) changeParticipantsAction.h.b()).n(a4, true));
                                    b2.H("from");
                                    b2.b(conversationIdType);
                                    b2.q();
                                }
                            } else {
                                ak = ((rtz) changeParticipantsAction.c.b()).ak(a4, conversationIdType);
                                if (ak) {
                                    xyo c2 = ChangeParticipantsAction.a.c();
                                    c2.i(((iew) changeParticipantsAction.h.b()).n(g2.a(), true));
                                    c2.H("added");
                                    c2.i(((iew) changeParticipantsAction.h.b()).n(a4, true));
                                    c2.H("to");
                                    c2.b(conversationIdType);
                                    c2.q();
                                } else {
                                    xyo b3 = ChangeParticipantsAction.a.b();
                                    b3.H("Failed to add");
                                    b3.i(((iew) changeParticipantsAction.h.b()).n(a4, true));
                                    b3.H("referred by");
                                    b3.i(((iew) changeParticipantsAction.h.b()).n(g2.a(), true));
                                    b3.H("to");
                                    b3.b(conversationIdType);
                                    b3.q();
                                }
                            }
                            if (ak) {
                                int i5 = d;
                                if (i4 == 50021) {
                                    i3 = i5 - 1;
                                } else {
                                    i3 = i5 + 1;
                                }
                                aozy createBuilder = amfu.a.createBuilder();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                apag apagVar = createBuilder.b;
                                amfu amfuVar = (amfu) apagVar;
                                amfuVar.b = 2 | amfuVar.b;
                                amfuVar.d = i3;
                                if (!apagVar.isMutable()) {
                                    createBuilder.u();
                                }
                                long j = e2;
                                long j2 = epochMilli;
                                int i6 = i2;
                                amfu amfuVar2 = (amfu) createBuilder.b;
                                amfuVar2.b = 1 | amfuVar2.b;
                                amfuVar2.c = i5;
                                changeParticipantsAction.g.y(conversationIdType, (amfu) createBuilder.s());
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(a4);
                                changeParticipantsAction.e.h(Optional.empty(), conversationIdType, d2, g2.a(), arrayList, i6, j2, j);
                                return;
                            }
                            xyo b4 = ChangeParticipantsAction.a.b();
                            b4.H("Not inserting tombstone because of unsuccessful add/remove of participant.");
                            b4.q();
                        }
                    });
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    akrhVar.close();
                    throw th;
                }
            }
            akrhVar.close();
            return null;
        } catch (Throwable th5) {
            th = th5;
            akrhVar = e;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ChangeParticipants.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ChangeParticipantsAction(armf armfVar, armf armfVar2, uhg uhgVar, ujv ujvVar, ryg rygVar, xnv xnvVar, mho mhoVar, agnq agnqVar, vsh vshVar, armf armfVar3, Parcel parcel) {
        super(parcel, amdy.CHANGE_PARTICIPANTS_ACTION);
        this.b = armfVar;
        this.c = armfVar2;
        this.d = uhgVar;
        this.e = ujvVar;
        this.f = rygVar;
        this.i = xnvVar;
        this.g = mhoVar;
        this.j = agnqVar;
        this.k = vshVar;
        this.h = armfVar3;
    }
}
